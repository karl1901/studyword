console.log('in js06.js....');

let divInfo = document.getElementById('divInfo');
let info = '班长是非洲人abcdefghijk';
//延时执行(无限次)
let index = 0;
let timer = setInterval(function () {
  if (index >= info.length) {
    index = 0;
    divInfo.innerHTML = '';
  }

  divInfo.append(info.substr(index, 1));
  index++;
}, 100);

let btnInfo = document.getElementById('btnInfo');
btnInfo.addEventListener('click', function () {
  clearInterval(timer);
  divInfo.innerHTML = info;
});

// 单次延时执行
let btnOpen = document.getElementById('btnOpen');
let spOpen = document.getElementById('spOpen');

btnOpen.addEventListener('click', function () {
  spOpen.innerHTML = '将会在五秒后跳转网站';
  setTimeout(function(){
    location.href='https://cn.bing.com';
  },5000);
});

// setInterval(function(){
// 要反复执行的代码
// },延时执行的毫秒数);
//如果需要中断延时执行，要获取到返回值的计时器对象
// 通过clearInterval(计时器对象)来中断执行
//单次执行的方法也是同样的一套
