console.log('执行短信登录.js====karl');

// ======================
// 获取页面id
var info01=document.getElementById('info01');
var info02=document.getElementById('info02');
var ts01=document.getElementById('ts01');
var ts02=document.getElementById('ts02');
var dlu=document.getElementById('dlu');
var zj=document.getElementById('zj');

console.log(info01,info02,ts01,ts02,dlu,zj);

dlu.addEventListener('click',function(){

  // 获取输入字符长度，赋id
  var num01=info02.value;
  var num = info01.value;

  // 去掉头尾空格
  num = num.replace(/(^\s*)|(\s*$)/g, '');
  num01 = num01.replace(/(^\s*)|(\s*$)/g, '');

  // 判断有没有输入
  if (num == '') {
    info01.focus();
    ts01.setAttribute('style','color: red;');
    ts01.innerHTML = '请输入电话号码';
    return;
  }

  // 判断是不是数
  if (isNaN(num)) {
    info01.focus();
    ts01.setAttribute('style','color: red;');
    ts01.innerHTML = '请输入数字';
    return;
  }

  // 判断整数
  var inum = parseInt(num);
  var fnum = parseFloat(num);
  if (inum != fnum) {
    info01.focus();
    ts01.setAttribute('style','color: red;');
    ts01.innerHTML = '请输入整数';
    return;
  }

  // 判断是不是1开头的数
  if (inum < 10000000000 || inum >= 20000000000) {
    info01.focus();
    ts01.setAttribute('style','color: red;');
    ts01.innerHTML = '请输入1开头的11位数';
    return;
  }
    ts01.innerHTML = '';

  // 判断是否输入验证码 
  if (num01 == '') {
    info02.focus();
    ts02.setAttribute('style','color: red;');
    ts02.innerHTML = '请输入验证码';
    return;
  }
   ts02.innerHTML = '';
  //  登陆成功后返回主页效果
   zj.setAttribute('href','index.html');
});