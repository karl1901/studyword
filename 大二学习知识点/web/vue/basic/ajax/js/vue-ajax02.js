let app = new Vue({
  el: '#app',
  data: {
    title: '省份城市联动',
    //省份列表
    proinceList: [],
    //城市列表
    cityList: [],
    //选中的省份
    province: { pid: -1 },
    //选中的城市
    city: { cid: 1 },
    //应答结果
    result: {},
  },
  methods: {
    //查询省份信息
    queryProvince: function () {
      huhuiyu.ajax('/linkinfo/queryAllProvince', {}, function (data) {
        app.result = data;
        if (!data.success) {
          alert('查询出错:' + data.message);
          return;
        }
        //省份信息
        app.proinceList = data.resultData.list;
        //默认选中第一项
        //就是将选中的省份(province)的pid
        //设置成省份列表中的第一个值的pid
        app.province.pid = app.proinceList[17].pid;
        //选中的省份的信息确认后查询城市
        app.queryCity();
      });
    },
    //查询城市
    queryCity: function () {
      huhuiyu.ajax(
        '/linkinfo/queryCityByProvince',
        {
          //联动的关键！城市的查询需要选中省份编号
          tbCity: { pid: app.province.pid },
          //'tbCity.pid':app.province.pid
        },
        function (data) {
          app.result = data;
          if (!data.success) {
            alert('查询出错:' + data.message);
            return;
          }
          app.cityList = data.resultData.list;
          //默认选中中间值
          let index = parseInt(app.cityList.length / 2);
          app.city.cid = app.cityList[index].cid;
        }
      );
    },
  },
  //声明周期方法，当vue实例被创建后调用
  created: function () {
    console.log('vue实例创建完毕');
    //创建成功后就调用省份查询
    this.queryProvince();
  },
});
