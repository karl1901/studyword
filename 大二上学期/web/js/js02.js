console.log('in js01.js...');
// 字符串 字面量用单(双)引号界定
let str01 = '蝙蝠侠';
let txt01 = document.getElementById('txt01');

// keyup 按键松开
txt01.addEventListener('keyup', function () {
  // 也可以是页面元素获取到的值
  let str02 = txt01.value;
  console.log('去掉头尾空格后的输入值', str02.trim());
  console.log('长度', str01.length);
  console.log('查找字符串ab所在位置', str02.indexOf('ab'));
  console.log('截取', str02.substr(1, 3));
});
// 日期类型
let now = new Date();
// 日期和世界戳(数)转换
let time = now.getTime();
console.log('日期和世界戳', time, now);
time = time + 2000;
now.setTime(time);
console.log('日期和时间戳', time, now);
//  分部获取时间信息
console.log(
  '时间信息',
  now.getFullYear(),
  now.getMonth() + 1,
  now.getDate(),
  now.getHours(),
  now.getMinutes(),
  now.getSeconds()
);

// 数值
let strNum = '123.4567';
console.log('字符串获取数值'
  ,parseFloat(strNum),parseInt(strNum));
let num = 1234.5678;
console.log('数转换成保留小数位的字符串',num.toFixed(2));