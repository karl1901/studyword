let app = new Vue({
  el: '#app',
  data: {
    title: '计算和监听',
    numa: 0,
    numb: 0,
    message: ''
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
    rev: function(){
      //为了复习for循环，使用麻烦的版本完成任务
      if(this.message == ''){
        return '';
      }
      let result='';
      for(let i=this.message.length -1;i>= 0; i--){
        let charinfo=this.message.substr(i,1);
        console.log(charinfo);
        result+=charinfo;
      }
      return result;
    }
  },
});
