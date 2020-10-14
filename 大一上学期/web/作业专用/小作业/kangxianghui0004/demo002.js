console.log('执行demo002.js');
console.log('karl-小灰')

// 点击动画效果
var sp01=document.getElementById('sp01');
var sp02=document.getElementById('sp02');
var sp03=document.getElementById('sp03');
var sp04=document.getElementById('sp04');
var dh=document.getElementById('dh');

sp01.addEventListener('click',function(){
  dh.setAttribute('class','animated rubberBand');
  setTimeout(function() {
    dh.setAttribute('class','');
  },1000);
});

sp02.addEventListener('click',function(){
  dh.setAttribute('class','animated flash');
  setTimeout(function() {
    dh.setAttribute('class','');
  },1000);
});

sp03.addEventListener('click',function(){
  dh.setAttribute('class','myani');
  setTimeout(function() {
    dh.setAttribute('class','');
  },1000);
});

sp04.addEventListener('click',function(){
  dh.setAttribute('class','myani01');
  setTimeout(function() {
    dh.setAttribute('class','');
  },1000);
});