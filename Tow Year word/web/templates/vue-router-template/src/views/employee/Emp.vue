<template>
  <div>
    <div>{{ title }}</div>
    <!-- 查询过滤表单 -->
    <div>
      部门：
      <select v-model="queryInfo.deptId">
        <option value="-1">===请选择部门===</option>
        <option v-for="d in deptList" :key="d.deptId" :value="d.deptId">
          {{ d.deptName }}
        </option>
      </select>
      <input v-model="queryInfo.employeeName" placeholder="姓名模糊查询" />
      <input v-model="queryInfo.phone" placeholder="电话模糊查询" />
      <button @click="resetQuery">重置</button>
      <button @click="query">查询</button>
    </div>

    <!-- 添加的表单 -->
    <div>
      部门：
      <select v-model="addInfo.deptId">
        <option v-for="d in deptList" :key="d.deptId" :value="d.deptId">
          {{ d.deptName }}
        </option>
      </select>
      <input placeholder="员工名称" v-model="addInfo.employeeName" />
      <input placeholder="电话" v-model="addInfo.phone" />
      <button @click="resetAdd">重置</button>
      <button @click="add">添加</button>
    </div>

    <!-- 修改的表单 -->
    <div v-if="mvisible">
      <select v-model="modifyInfo.deptId">
        <option v-for="d in deptList" :key="d.deptId" :value="d.deptId">
          {{ d.deptName }}
        </option>
      </select>
      <input v-model="modifyInfo.employeeName" />
      <input v-model="modifyInfo.phone" />
      <button @click="mvisible = false">关闭</button>
      <button @click="modify">保存</button>
    </div>

    <!-- 数据表格 -->
    <table>
      <tr>
        <th>部门</th>
        <th>姓名</th>
        <th>电话</th>
        <th>最后修改时间</th>
        <th>操作</th>
      </tr>
      <tr v-for="d in list" :key="d.employeeId">
        <td>{{ d.deptId | deptInfo(deptList) }}</td>
        <td>{{ d.employeeName }}</td>
        <td>{{ d.phone }}</td>
        <td>{{ d.lastupdate | formatDate }}</td>
        <td>
          <button @click="toModify(d)">修改</button>
          <button @click="del(d)">删除</button>
        </td>
      </tr>
    </table>

    <!-- 分页信息 -->
    <div>
      <button @click="prePage">上一页</button>
      当前页/总页数/记录数
      {{ page.pageNumber }}/{{ page.pageCount }}/{{ page.total }}
      <button @click="nextPage">下一页</button>
    </div>

    <pre>
      {{modifyInfo}}
      <!-- {{deptList}} -->
      <!-- {{ queryInfo }} -->
      <!-- {{ list }} -->
      <!-- {{ page }} -->
    </pre>
  </div>
</template>

<script>
import tools from '../../js/tools';

export default {
  name: 'Emp',
  data() {
    return {
      title: '员工管理',
      deptList: [],
      list: [],
      page: { pageNumber: 1, pageSize: 5 },
      queryInfo: {
        // 查询条件
        deptId: -1,
        employeeName: '',
        phone: ''
      },
      addInfo: {
        // 添加信息
        deptId: -1,
        employeeName: '',
        phone: ''
      },
      // 修改信息
      modifyInfo: {},
      mvisible: false
    };
  },
  methods: {
    del(info) {
      let result = confirm('是否删除员工：' + info.employeeName);
      if (!result) {
        return;
      }
      let app = this;
      tools.ajax(
        '/employee/delete',
        {
          'tbEmployee.employeeId': info.employeeId
        },
        function(data) {
          alert(data.message);
          app.query();
        }
      );
    },
    modify() {
      let app = this;
      tools.ajax(
        '/employee/update',
        {
          tbEmployee: this.modifyInfo
        },
        function(data) {
          alert(data.message);
          app.query();
        }
      );
    },
    toModify(info) {
      // 获取修改的信息并显示
      this.modifyInfo = info;
      this.mvisible = true;
    },
    add() {
      let app = this;
      tools.ajax(
        '/employee/add',
        {
          tbEmployee: this.addInfo
        },
        function(data) {
          alert(data.message);
          if (data.success) {
            app.resetAdd();
          }
          app.query();
        }
      );
    },
    resetAdd() {
      // 添加必须指定部门信息
      let deptId = -1;
      // 如果部门信息存在就指向第一个部门
      if (this.deptList.length > 0) {
        deptId = this.deptList[0].deptId;
      }
      this.addInfo = {
        deptId: deptId,
        employeeName: '',
        phone: ''
      };
    },
    resetQuery() {
      this.page = { pageNumber: 1, pageSize: 5 };
      this.queryInfo = {
        deptId: -1,
        employeeName: '',
        phone: ''
      };
    },
    nextPage() {
      // 下一页
      this.page.pageNumber++;
      this.query();
    },
    prePage() {
      // 上一页
      this.page.pageNumber--;
      this.query();
    },
    query() {
      let app = this;
      tools.ajax(
        '/employee/queryAll',
        {
          page: this.page,
          tbEmployee: this.queryInfo
        },
        function(data) {
          if (!data.success) {
            alert(data.message);
            return;
          }
          app.page = data.resultData.page;
          app.deptList = data.resultData.deptList;
          app.list = data.resultData.list;
          app.resetAdd();
        }
      );
    }
  },
  created() {
    this.query();
  }
};
</script>
