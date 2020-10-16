// 按键事件
document.body.addEventListener('keydown', function (event) {
  console.log('按键的事件信息:', event);
  let keycode = event.code;
  console.log('按键的code信息:', keycode);
  // 通过按方向键修改绘图的坐标来模拟移动图片
  if ('ArrowUp' == keycode) {
    // 上箭头修改top值减少，就是上移
    imgtop = imgtop - 10;
  } else if ('ArrowDown' == keycode) {
    // 下箭头修改top值增加，就是下移
    imgtop = imgtop + 10;
  } else if ('ArrowLeft' == keycode) {
    // 左箭头修改top值减少，就是左移
    imgleft = imgleft - 10;
  } else if ('ArrowRight' == keycode) {
    // 右箭头修改top值增加，就是右移
    imgleft = imgleft + 10;
  }
  drawImg();
});

// 通过按键控制图片绘制
let img = new Image();
// 图片是否已经加载完毕
let imgloaded = false;
// 图片的位置
let imgtop = 10;
let imgleft = 10;

img.addEventListener('load', function () {
  // 切换成已经加载完成的状态
  imgloaded = true;
  // 图片加载完毕就绘制
  drawImg();
});

img.setAttribute('src', '../image/t8908h.jpg');

// 绘制图片的部分
let mycanvas = document.getElementById('mycanvas');
mycanvas.setAttribute('width', document.body.clientWidth);
mycanvas.setAttribute('height', document.body.clientHeight);
let context = mycanvas.getContext('2d');
function drawImg() {
  if (!imgloaded) {
    // 图片如果没有加载就不要绘图
    return;
  }
  // 要有移动效果，需要擦掉原来的内容
  context.fillStyle = 'rgb(255,255,255)';
  context.fillRect(0,0,
    document.body.clientWidth,document.body.clientHeight);
  context.drawImage(img, imgleft, imgtop, 300, 300);
}
