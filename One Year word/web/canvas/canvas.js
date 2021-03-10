let mycanvas=document.getElementById('mycanvas');
let context=mycanvas.getContext('2d');
//浏览器显示区域宽高
let maxWidth=document.body.clientWidth;
let maxHeight=document.body.clientHeight;
console.log(mycanvas,maxWidth,maxHeight);
//让canvas全屏
mycanvas.setAttribute('width',maxWidth);
mycanvas.setAttribute('height',maxHeight);
//背景
context.fillStyle='rgba(0,0,0,0.5)';
context.fillRect(0,0,maxWidth,maxHeight);
//线条图形
context.beginPath()
context.moveTo(10,10);
context.lineTo(10,30);
context.lineTo(20,30);
context.lineTo(20,10);
context.closePath();
context.stroke();

//绘制字符
context.font='24px Cascadia';
context.textBaseline='top';
context.fillText('Dark Knight',20,10);
context.font='40px Cascadia';
//缕空字
context.strokeText('奥特曼',300,10);

//通过js加载图片到绘图
//创建图片对象
let img=new Image();
// 监听图片加载是否完成
img.addEventListener('load',function(){
  console.log('加载图片完成');
  //绘制图片
  context.drawImage(img,10,100,240,100);
});
//加载图片
console.log('加载图片')
img.setAttribute('src','../image/205856-1581166736a416.jpg');