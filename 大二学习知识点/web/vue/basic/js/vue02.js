let app = new Vue({
  el: '#app',
  data: {
    //欢迎词
    welcome: '欢迎使用vue',
    //标题
    title: '蜘蛛侠',
    //复杂json对象
    user: {
      username: '',
      passwrod: '',
    },
    //带有html内容的信息
    htmlinfo: '<h1>abc<br>123</h1>',
  },
  methods: {
    login: function () {
      //获取data中的用户信息(复杂对象)
      console.log(this.user, app.user);
      //上面this和app效果是一样的
      //考据到this关键字受回调影响会变化
      //所以建议统一使用app这种vue实例变量
    },
    reset: function () {
      //重置数据
      this.user = { username: '', passwrod: '' };
      //等效代码
      this.user.username = '';
      this.user.passwrod = '';
    },
  },
});
