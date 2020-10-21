let app = new Vue({
  el: '#app',
  data: {
    //信息收集
    user: {
      name: '',
      pwd: '',
    },
    //错误状态
    //为name是表示用户名错误
    //为pwd时表示密码错误
    //为check时表示登陆失败
    error: '',
    //下拉列表的选择值
    //值和option的value匹配就会默认选中
    selectedInfo:'2',
    //checkbox类型的model
    checkedInfo:false,
    taInfo:''
  },
  methods: {
    login: function () {
      app.error = '';
      if (app.user.name == '') {
        app.error = 'name';
        return;
      }
      if (app.user.pwd == '') {
        app.error = 'pwd';
        return;
      }
      if (app.user.name != 'admin' || app.user.pwd != 'laohu') {
        app.error = 'check';
        return;
      }
      alert('登陆成功');
    },
  },
});
