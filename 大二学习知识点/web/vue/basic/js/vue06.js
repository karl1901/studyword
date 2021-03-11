let app = new Vue({
  el: '#app',
  data: {
    title: 'v-for指令',
    list: [
      { id: 100, name: '蝙蝠侠', sex: 'f' },
      { id: 101, name: '钢铁侠', sex: 'm' },
      { id: 102, name: '蜘蛛侠', sex: 'm' }
    ],
    //被点击的项
    clickInfo:{},
    //控制区块显示的变量
    showIndex:1
  },
  methods: {
    //带参数的事件处理function
    //可以配合页面传递数据进来处理
    showInfo: function (info) {
      console.log('循环的事件处理',info);
      //记录点击到vue的数据
      app.clickInfo=info;
    },
    //带参数的事件处二，切换显示的区块值
    changeIndex:function(index){
      app.showIndex=index;
    }
  }
});
