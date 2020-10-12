console.log('执行demo002.js')
console.log('karl-小灰')

// 获取当前时间
// var 变量名=变量值;new Date()就是获取当前的日期时间
var now=new Date();
console.log(now);
// 获取时间的某一个部分
// 小时.分钟，秒
var hour = now.getHours();
var minute = now.getMinutes();
var second = now.getSeconds();
console.log('小时；',hour);
console.log('分钟；',minute);
console.log('秒；',second);
// 年月日,月份是0-11，表示1-12月
var year = now.getUTCFullYear();
var month = now.getUTCMonth() + 1;
var day = now.getDate();
console.log(year,month,day);

// 反复间隔时间执行代码
// 第一个参数是要执行的代码，第二个参数是间隔的毫秒值，1000就是一秒
setInterval(function(){
  // console.log(new Date());
  now = new Date();
  hour = now.getHours();
  minute = now.getMinutes();
  second = now.getSeconds();
  document.getElementById('spTime').innerHTML = 
   hour + '时' + minute + '分' + second + '秒';
},1000);

setInterval(function(){
  // console.log(new Date());
  now = new Date();
  year = now.getUTCFullYear();
  month = now.getUTCMonth() + 1;
  day = now.getDate();
  document.getElementById('a1').innerHTML = 
   year + '年' + month + '月' + day + '日';
},);

setInterval(function(){
  // console.log(new Date());
  now = new Date();
  hour = now.getHours();
  minute = now.getMinutes();
  second = now.getSeconds();
  document.getElementById('spTime01').innerHTML = 
   hour + '时' + minute + '分';
},1000);

setInterval(function(){
  // console.log(new Date());
  now = new Date();
  year = now.getUTCFullYear();
  month = now.getUTCMonth() + 1;
  day = now.getDate();
  document.getElementById('a2').innerHTML = 
   year + '年' + month + '月' + day + '日';
},);
