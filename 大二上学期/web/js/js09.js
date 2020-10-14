console.log('in js09.js...');

var abc = 'js09==>abc';
let letabc = 'js09==>letbac';

console.log(abc, letabc);
// window是浏览器顶级对象
// 全局定义的var变量会被提升到浏览器顶级级别
//而let不会，作用域只在定义位置所在级别
console.log(window.abc, window.letabc);

//通过全局json来解决变量名称冲突
console.log('指定全局json下面的变量abc',huhuiyu.abc);