let app = new Vue({
  el: '#app',
  data: {
    title: 'vue和ajax',
    //请求参数
    echo: '',
    //ajax请求结果
    result: {},
  },
  methods: {
    test: function () {
      //ajax请求必须按照后端api接口的文档提交地址和对应的参数
      //url就是后端文档中的Path
      //请求参数对应Parameters小节说明
      //method就是文档最开头提示的，一般都是POST
      //应答结果的数据格式在Responses小节定义
      huhuiyu.ajax('/', { echo: app.echo }, function (data) {
        app.result = data;
      });
    },
  },
});
