let app = new Vue({
  el: '#app',
  data: {
    //是否显示区块一
    showdiv: true,
    //第二级v-show显示的索引值
    showindex: 1,
    info: '属性绑定值演示',
    btnEnable: false,
    userinfo: {
      name: '',
      pwd: '',
    },
  },
});
