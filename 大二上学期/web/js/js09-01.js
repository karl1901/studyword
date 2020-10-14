console.log('in js09-01.js...');

var abc = 'js09-01===>abc';
//let 不管是多少个js中定义的变量
//只要是一个页面中导入，同级别不允许同名的变量出现
//否则全部的js都将无法执行！！！
//下面这一行必须注释掉
//let letabc= 'js09-01===>letbac';

console.log(abc, letabc);
