console.log('执行index.js==========karl');

// =========================
// 获取页面id
var bg=document.getElementById('bg');
var qh=document.getElementById('qh');
var lj=document.getElementById('lj');
var lj01=document.getElementById('lj01');
var zt=document.getElementById('zt');
// 输出检验id是否引入正确
console.log(lj,bg,qh,lj01,zt);

// ====================================
// 背景切换和超链接颜色改变
var mode= 1;
qh.addEventListener('click', function() {
  mode = mode + 1;
  if (mode % 2 == 0) {
    // 背景切换
    bg.setAttribute('class', 'body02');
    lj.setAttribute('class','ys002');
    lj01.setAttribute('class','ys002');
    // 切换彩云背景显示字样
    zt.innerHTML = '彩云';
    return;
  }
  // 背景切换
  bg.setAttribute('class', 'body01');
  lj.setAttribute('class','ys001');
  lj01.setAttribute('class','ys001');
  // 切换星云背景显示字样
  zt.innerHTML = '星云';
});

// ================================
// 主体文字动画效果
var info = 'karl';
var zt01=document.getElementById('zt01');
var index = 0;

var info01 = '合作加盟官网';
var zt02=document.getElementById('zt02');
var index01 = 0;

var info02 = '公司合作官方合作人：马云'
var zt03=document.getElementById('zt03');
var index02 = 0;

console.log(zt01,zt01,zt03);

setInterval(function() {
  zt01.innerHTML = zt01.innerHTML + info.charAt(index);
  index = index + 1;
}, 300);

setInterval(function() {
  zt02.innerHTML = zt02.innerHTML + info01.charAt(index01);
  index01 = index01 + 1;
}, 300);

setInterval(function() {
  zt03.innerHTML = zt03.innerHTML + info02.charAt(index02);
  index02 = index02 + 1;
}, 200);