console.log('执行demo01.js===>');
console.log('karl小灰');

var count = 0;
var xl01 = 9999999;
var dj = 0;

document.getElementById('rs').innerHTML = count;
document.getElementById('zd').addEventListener('click',function(){
  count = count + 1
  document.getElementById('rs').innerHTML = count
});

zd.addEventListener('click',function(){
  dj = dj + 1;
});

setInterval(function(){
  xl01=xl01 - dj * 488888;
  xl.innerHTML = xl01;
  if(xl01<0){
    xl.innerHTML = '恭喜，魔童已被击杀，您获得了无尽战神称号';
  }
  if(xl01<=3333333){
    xl.style.color='#ff0000';
  }
  if(xl01<=0){
    xl.style.color='#FFFF00';
  }
},1000);