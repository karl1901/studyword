console.log('执行demo01js===>');
console.log('karl-小灰');

// 模式切换
var qh = document.getElementById('qh');
var a = document.getElementById('a');

var mode = 1;

qh.addEventListener('click', function() {
  mode = mode + 1;
  if (mode % 2 == 0) {
    a.setAttribute('class', 'body02');
    return;
  }
  a.setAttribute('class', 'body01');
});

// 右上方时间
setInterval(function(){
  now = new Date();
  hour = now.getHours();
  minute = now.getMinutes();
  second = now.getSeconds();
  document.getElementById('sj').innerHTML = 
   hour + ':' + minute + ':' + second;
},1000);

setInterval(function(){
  now = new Date();
  year = now.getUTCFullYear();
  month = now.getUTCMonth() + 1;
  day = now.getDate();
  document.getElementById('rq').innerHTML = 
   year + '年' + month + '月' + day + '日';
},);

// 底部点赞
var sl = 6666;
var sl01 = 99;

document.getElementById('zan').innerHTML = sl;
document.getElementById('an').addEventListener('click',function(){
  sl = sl + 1
  document.getElementById('zan').innerHTML = sl
});

document.getElementById('nozan').innerHTML = sl01;
document.getElementById('an01').addEventListener('click',function(){
  sl01 = sl01 + 1
  document.getElementById('nozan').innerHTML = sl01
});

// 点赞动画
var an=document.getElementById('an');
var an01=document.getElementById('an01');

an.addEventListener('click',function(){
    an.setAttribute('class','iconfont animated flash')
    setTimeout(function() {
      an.setAttribute('class','iconfont');
    },1000);
})

an01.addEventListener('click',function(){
    an01.setAttribute('class','iconfont animated flash')
    setTimeout(function() {
      an01.setAttribute('class','iconfont');
    },1000);
})

// 签名和正文动画效果
var info = 'I know it seems that only love what you are trained to live up to what extent.';
var qianming=document.getElementById('qianming');
var index = 0;

var infozw = '有人说，“努力”与“拥有”是人生一左一右的两道风景。但我以为，人生最美最不能逊色的风景应该是努力。努力是人生的一种精神状态，是对生命的一种赤子之情。努力是拥有之母，拥有是努力之子。一心努力可谓条条大路通罗马，只想获取可谓道路逼仄，天地窄小。所以，与其规定自己一定要成为一个什么样的人物，获得什么东西，不如磨练自己做一个努力的人。志向再高，没有努力，志向终难坚守；没有远大目标，因为努力，终会找到奋斗的方向。做一个努力的人，可以说是人生最切实际的目标，是人生最大的境界。许多人因为给自己定的目标太高太功利，因为难以成功而变得灰头土脸，最终灰心失望。究其原因，往往就是因为太关注拥有，而忽略做一个努力的人。对于今天的孩子们，如果只关注他们将来该做个什么样的人物，不把意志品质作为一个做人的目标提出来，最终我们只能培养出狭隘、自私、脆弱和境界不高的人。遗憾的是，我们在这方面做得并不尽如人意。';
var zhengwen=document.getElementById('zhengwen');
var indexzw = 0;

setInterval(function() {
  qianming.innerHTML = qianming.innerHTML + info.charAt(index);
  index = index + 1;
}, 200);

setInterval(function() {
  zhengwen.innerHTML = zhengwen.innerHTML + infozw.charAt(indexzw);
  indexzw = indexzw + 1;
}, 200);