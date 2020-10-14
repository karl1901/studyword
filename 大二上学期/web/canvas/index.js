//获取canvas元素
let canvas = document.getElementById('main-canvas');
//获取canvas特有的属性，绘图上下文对象
let context = canvas.getContext('2d');
//获取画布的大小

//获取屏幕高宽
// document.body.clientWidth;
// document.body.clientHeight;
let width = canvas.clientWidth;
let height = canvas.clientHeight;
//基本信息
console.log('canvas基本信息', width, height, canvas, context);
//使用颜色填充区域
context.fillStyle = 'rgba(0,0,0,0.5)'; //填充的颜色
//参数1：left坐标，参数2：top坐标，参数3：宽，参数4：高
context.fillRect(0, 0, width, height); //区域填充
context.fillStyle = 'rgb(255,0,0)';
context.fillRect(10, 10, 50, 50);

context.fillRect(62, 10, 50, 50);
//清除区域
context.clearRect(64, 12, 46, 46);
//通过颜色形成边框效果
context.fillStyle = 'rgb(0,255,0)';
context.fillRect(115, 10, 50, 50);
context.fillStyle = 'rgb(255,0,0)';
context.fillRect(117, 12, 46, 46);
//绘制路径
//开始绘制路径
context.beginPath();
//移动到坐标点
context.moveTo(170, 10);
//画线条到坐标点
context.lineTo(200, 35);
context.lineTo(185, 55);
context.lineTo(170, 10);
context.fillStyle = 'rgb(255,0,0)';
//将线条链接的区域填充
context.fill();

context.beginPath();
context.moveTo(100,100);
context.lineTo(50,140);
context.lineTo(150,140);
context.fill();

//绘制文字
context.font='40px cascadia';
context.textBaseline='top';
context.fillText('Dark Knight',160,100);

