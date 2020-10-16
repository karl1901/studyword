let mycanvas = document.getElementById('mycanvas');
let context = mycanvas.getContext('2d');
let imgloaded = false;
let imgtop = 10;
let imgleft = 10;
// 自动移动方向，默认down向下
let dir = 'ArrowDown';

let maxWidth = document.body.clientWidth;
let maxHeight = document.body.clientHeight;
mycanvas.setAttribute('width', maxWidth);
mycanvas.setAttribute('height', maxHeight);

let img = new Image();

img.addEventListener('load', function () {
  imgloaded = true;
  // 启动定时任务绘图
  setInterval(function () {
    drawImg();
  }, 500);
});

img.setAttribute('src', '../image/t8908h.jpg');

function drawImg() {
  if (!imgloaded) {
    return;
  }
  context.fillStyle = 'rgb(255,255,255)';
  context.fillRect(0, 0, maxWidth, maxHeight);
  context.drawImage(img, imgleft, imgtop, 50, 50);
  // 所谓自动移动就是根据方向反复的修改坐标
  if ('ArrowDown' == dir) {
    imgtop += 10;
  } else if ('ArrowUp' == dir) {
    imgtop -= 10;
  } else if ('ArrowLeft' == dir) {
    imgleft -= 10;
  } else if ('ArrowRight' == dir) {
    imgleft += 10;
  }
}

//按键控制方向
document.body.addEventListener('keydown', function (event) {
  dir = event.code;
});
