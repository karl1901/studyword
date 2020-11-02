let app = new Vue({
  el:'#app',
  data:{
    title:'省份城市联动',
    //省份列表
    proinceList:[],
    //城市列表
    cityList:[],
    //选中的省份
    provice:{},
    //选中的城市
    city:{}
  }
});