let app = new Vue({
  el: '#app',
  data: {
    title: '计算和监听',
    numa: 0,
    numb: 0,
    message: '',
    xing: '',
    ming: '',
    xm: '',
  },
  //计算属性，用于对data中的变量做处理
  //返回处理之后的结果，有点类似于虚拟的data值
  //页面上可以直接{{计算属性方法名}}获取结果值
  computed: {
    addNumb: function () {
      if (isNaN(this.numa)) {
        return 'numa必须是数';
      }
      if (isNaN(this.numb)) {
        return 'numb必须是数';
      }
      return parseFloat(this.numa) + parseFloat(this.numb);
    },
    //反转message显示
    rev: function () {
      //为了复习for循环，使用麻烦的版本完成任务
      if (this.message == '') {
        return '';
      }
      let result = '';
      console.log(this.message.length);
      //for(变量初始化;循环是否继续的逻辑表达式;每次循环完执行)
      //abc==>cba
      //message abc
      //i substr=charinfo result
      //2 (2,1) =  c         c
      //1 (1,1) =  b         cb
      //0 (0,1) =  a         cba
      for (let i = this.message.length - 1; i >= 0; i--) {
        let charinfo = this.message.substr(i, 1);
        console.log(charinfo);
        result += charinfo;
      }
      return result;
    },
  },
  watch: {
    //侦听值变化过程
    //data中值名称:值变化后要执行的function(变化值)
    xing: function (val) {
      console.log('xing' + val);
      //姓名变化
      this.xm = val + this.ming;
    },
    ming: function (val) {
      this.xm = this.xing + val;
    },
  },
});
