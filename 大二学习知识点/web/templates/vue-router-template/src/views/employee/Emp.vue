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
        <td>{{ d.deptId }}</td>
        <td>{{ d.employeeName }}</td>
        <td>{{ d.phone }}</td>
        <td>{{ d.lastupdate | formatDate }}</td>
        <td>
          <button>修改</button>
          <button>删除</button>
        </td>
      </tr>
    </table>

    <pre>
      <!-- {{deptList}} -->
      <!-- {{ queryInfo }} -->
      {{ list }}
      {{ page }}
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
      }
    };
  },
  methods: {
    resetQuery() {
      this.page = { pageNumber: 1, pageSize: 5 };
      this.queryInfo = {
        deptId: -1,
        employeeName: '',
        phone: ''
      };
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
        }
      );
    }
  },
  created() {
    this.query();
  }
};
</script>
