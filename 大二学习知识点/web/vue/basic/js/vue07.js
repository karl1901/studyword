let app = new Vue({
  el: '#app',
  data: {
    title:'vue控制样式',
    class1: 'style1',
    //变量控制样式是否添加
    styleEnable: false,
    style2: true,
    style3: false
  },
  methods: {
    changeStyle: function(){
      app.style2 = !app.style2;
      app.style3 = !app.style3;
    }
  }
});
