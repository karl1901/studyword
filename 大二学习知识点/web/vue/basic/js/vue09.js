let app = new Vue({
  el: '#app',
  data: {
    title: 'vue联动bootstrap样式',
    //校验表单部分
    user: {
      name: '',
      pwd: '',
    },
    error: {
      name: false,
      pwd: false,
    },
    success: false,
    //数据呈现部分
    list: [
      { id: 100, name: '蝙蝠侠', sex: 'm' },
      { id: 101, name: '神奇女侠', sex: 'f' },
      { id: 102, name: '蜘蛛侠', sex: 'm' },
    ],
  },
  methods: {
    login: function () {
      //重置错误信息
      this.error.name = false;
      this.error.pwd = false;
      this.success = false;
      //姓名判断
      if (this.user.name.trim() == '') {
        this.error.name = true;
        return;
      }
      //密码判断
      if (this.user.pwd.trim() == '') {
        this.error.pwd = true;
        return;
      }
    },
  },
});
