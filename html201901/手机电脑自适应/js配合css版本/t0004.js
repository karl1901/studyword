console.log('执行t00004.js');
console.log('是否是手机浏览器模式：', huhuiyu.isMobile());
console.log('浏览器完整信息：', huhuiyu.getBrowserInfo());

var divWait = document.getElementById('divWait');
var divDesktop = document.getElementById('divDesktop');
var divPhone = document.getElementById('divPhone');
//隐藏等待信息
divWait.style.display = 'none';
if (huhuiyu.isMobile()) {
  // 手机模式显示divPhone里面的内容
  divPhone.style.display = 'block';
} else {
  // 电脑模式显示divDesktop里面的内容
  divDesktop.style.display = 'block';
}
