//公用js文件，一种解决名称冲突的方法
//json的特征是符合类型的数据
//可以通过key来声明多个不同的变量，且限定在单一json变量名滞销
//所以可以简单的解决变量名称冲突的问题

let huhuiyu = {
  abc: '黑暗骑士',
  isInt: function (str) {
    if (!str || isNaN(str)) {
      return false;
    }
    let numi = parseInt(str);
    let numf = parseFloat(str);
    if (numf == numi) {
      return numi;
    }
    return false;
  },
};

console.log(huhuiyu.isInt('abc'));
console.log(huhuiyu.isInt('123'));
console.log(huhuiyu.isInt('123.45'));

//自运行函数加let完美限定变量范围
(function () {
  console.log('自运行函数');
  //这里面let声明的变量只在自运行函数中有效!!
  let funv = '哈哈哈';
  console.log(funv);
})();

(function () {
  let funv = '嘻嘻嘻';
  console.log(funv);
  //可以通过window这个顶级对象，将局部的变量提升到全局
  window.gvalue={abc:'呵呵呵'};
})();

//不会超出范围，下面只会显示未定义
//console.log(funv);
//范围自运行函数中定义的全局变量
console.log(gvalue.abc);
