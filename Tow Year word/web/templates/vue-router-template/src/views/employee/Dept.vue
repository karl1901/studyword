<template>
  <div>
    <div>{{ title }}</div>
    <!-- 添加的表单 -->
    <div>
      <input type="text" v-model="tbDept.deptName" placeholder="部门名称" />
      <input type="text" v-model="tbDept.deptInfo" placeholder="部门信息" />
      <button @click="addInfo">添加</button><button @click="resetAdd">重置</button>
    </div>

    <!-- 修改的表单 -->
    <div v-if="mvisible">
      <input type="text" v-model="mdept.deptName" />
      <input type="text" v-model="mdept.deptInfo" />
      <button @click="modifyInfo">保存</button>
      <button @click="mvisible = false">关闭</button>
    </div>

    <!-- 数据表格 -->
    <table>
      <tr>
        <th>部门名称</th>
        <th>部门信息</th>
        <th>修改时间</th>
        <th>操作</th>
      </tr>
      <tr v-for="d in list" :key="d.deptId">
        <td>{{ d.deptName }}</td>
        <td>{{ d.deptInfo }}</td>
        <td>{{ d.lastupdate | formatDate }}</td>
        <td>
          <button @click="showModify(d)">修改</button>
          <button @click="delInfo(d)">删除</button>
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
      <!-- {{tbDept}} -->
    <!-- {{ page }} -->
    <!-- {{ list }} -->
  </pre>
  </div>
</template>

<script>
import tools from '../../js/tools';
export default {
  name: 'Dept',
  data() {
    return {
      title: '部门管理',
      page: {
        pageNumber: 1,
        pageSize: 10
      },
      list: [],
      // 添加的信息
      tbDept: {
        deptInfo: '',
        deptName: ''
      },
      // 修改的信息
      mdept: {},
      // 是否显示修改的表单
      mvisible: false
    };
  },
  methods: {
    resetAdd() {
      this.tbDept = {
        deptInfo: '',
        deptName: ''
      };
    },
    modifyInfo() {
      let app = this;
      tools.ajax('/dept/update', { tbDept: this.mdept }, function(data) {
        alert(data.message);
        app.query();
      });
    },
    showModify(info) {
      this.mdept = info;
      this.mvisible = true;
    },
    delInfo(info) {
      console.log('要删除的记录：', info);
      // confirm：确认对话框，返回值为用户是否点击的是确认按钮
      let result = confirm('是否删除：' + info.deptName);
      if (result) {
        // 删除记录
        let app = this;
        tools.ajax('/dept/delete', { 'tbDept.deptId': info.deptId }, function(data) {
          alert(data.message);
          app.query();
        });
      }
    },
    query() {
      let app = this;
      tools.ajax('/dept/query', { page: this.page }, function(data) {
        if (!data.success) {
          alert(data.message);
          return;
        }
        // 分页信息以服务器的为准
        app.page = data.resultData.page;
        app.list = data.resultData.list;
      });
    },
    addInfo() {
      let app = this;
      tools.ajax('/dept/add', { tbDept: this.tbDept }, function(data) {
        alert(data.message);
        app.query();
      });
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
    }
  },
  created() {
    this.query();
  }
};
</script>

<style scoped>
table {
  width: 100%;
  border: 1px solid #000000;
}
th,
td {
  border: 1px solid #000000;
}
tr:hover {
  background-color: #dcdcdc;
}
</style>
