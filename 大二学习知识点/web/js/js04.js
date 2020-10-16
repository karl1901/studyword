console.log('in jso4.js...');

let btn01 = document.getElementById('btn01');
let txt01 = document.getElementById('txt01');
let sp01 = document.getElementById('sp01');

console.log(txt01, btn01, sp01);
btn01.addEventListener('click', function () {
  let vtxt01 = txt01.value.trim();
  console.log('输入值: ', vtxt01);
  //  单if判断
  // if(逻辑表达式) {
  // 逻辑表达式为真才会执行大括号之间的代码
  // return表示中断所在的function的执行
  // }
  sp01.innerHTML = '';
  if (vtxt01 == '') {
    sp01.innerHTML = '输入值不能为空';
    txt01.focus();
    return;
  }
  // 6-16位长度判断
  // || 表示逻辑或运算，
  // || 前后的逻辑表达式只要一个为真就返回真
  if (vtxt01.length < 6 || vtxt01.length > 16) {
    sp01.innerHTML = '长度必须是6-16';
    txt01.focus();
    return;
  }
});

// 输入年月,判断有多少天
let txt02 = document.getElementById('txt02'); //年
let txt03 = document.getElementById('txt03'); //月
let btn02 = document.getElementById('btn02'); //计算按钮
let sp02 = document.getElementById('sp02'); //结果显示

console.log(txt02, txt03, btn02, sp02);
btn02.addEventListener('click', function () {
  let year = parseInt(txt02.value);
  let month = parseInt(txt03.value);
  // 是否为闰年
  // && 表示逻辑语，表示前后的表达式都为真才会返回真
  // ！ 表示逻辑，取反结果
  let run = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  sp02.innerHTML = '';
  if (
    month == 1 ||
    month == 3 ||
    month == 5 ||
    month == 7 ||
    month == 8 ||
    month == 10 ||
    month == 12
  ) {
    sp02.innerHTML = '31';
  } else if (month == 4 || month == 6 || month == 9 || month == 11) {
    sp02.innerHTML = '30';
  } else if (run && month == 2) {
    sp02.innerHTML = '29';
  } else {
    sp02.innerHTML = '28';
  }
  // 阶梯式if
  // if(逻辑表达式1){//表达式1为真执行这里面的代码}
  // lese if(逻辑表达式2){//表达式2为真执行这里面的代码}
  // .....
  //lese if(逻辑表达式n){//表达式n为真执行这里面的代码}
  // else {//上面的表达式全部为假就会执行这里面的代码}
  // 判断的次序是从上到下,任意一级为真就不会继续向下判断
  // 也就是最多只会有一块里面的代码会执行
  // 除了第一个if以外，其它块都不是必须的
  // if(){}
  // if(){} else{}
  // if(){} else if(){}
  
});
