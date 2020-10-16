// 检验js是否引入成功
console.log('执行demo01.js======>');
// 备注
console.log('karl.xh');
console.log('2020.3.19');

// ======================================================
// 获取id
var bg=document.getElementById('bg');
var bq=document.getElementById('bq');
var bq01=document.getElementById('bq01');
var bq02=document.getElementById('bq02');
var bq03=document.getElementById('bq03');
var bq04=document.getElementById('bq04');
var bq1=document.getElementById('bq1');
var bq2=document.getElementById('bq2');
var bq3=document.getElementById('bq3');
var bq4=document.getElementById('bq4');
var bq5=document.getElementById('bq5');
var bq001=document.getElementById('bq001');
var bq002=document.getElementById('bq002');
var bq003=document.getElementById('bq003');
var bq004=document.getElementById('bq004');
var bq005=document.getElementById('bq005');
var bg01=document.getElementById('bg01');
var bg02=document.getElementById('bg02');
var bg03=document.getElementById('bg03');
var bg04=document.getElementById('bg04');
var bg05=document.getElementById('bg05');
var xian=document.getElementById('xian');
var dhl=document.getElementById('dhl');
var bs=document.getElementById('bs');

console.log(bq,bq01,bq03,bq04,bq02,bq001,bq002,bq003,bq004,bq005);

// =============================================================
// 记住当前显示的是哪个页面
//页面开始时候是页面一
var nowpage = bq;

// 修改导航栏按钮属性
bg01.addEventListener('click',function(){
  // 下横线移动效果
  xian.setAttribute('class','hx');
  // 导航栏按钮字体颜色
  dhl.setAttribute('style','color: #FFB6C1');
  // 页面来回切换的判定
  var nowpageid=nowpage.getAttribute('id');
  var pd=nowpageid>'bq';
  if(pd){
    nowpage.setAttribute('class', 'move-out-right'); 
    bq.setAttribute('class', 'move-in-right'); 
  }else{
    nowpage.setAttribute('class', 'move-out'); 
    bq.setAttribute('class', 'move-in'); 
  }
  //当前页变成第一页
  nowpage = bq; 
});

bg02.addEventListener('click',function(){
   xian.setAttribute('class','hx01');
   dhl.setAttribute('style','color:	#FFFF00');
   var nowpageid=nowpage.getAttribute('id');
   var pd=nowpageid>'bq01';
   if(pd){
    nowpage.setAttribute('class', 'move-out-right'); 
    bq01.setAttribute('class', 'move-in-right'); 
  }else{
    nowpage.setAttribute('class', 'move-out'); 
    bq01.setAttribute('class', 'move-in'); 
  }
   nowpage = bq01;
});

bg03.addEventListener('click',function(){
  xian.setAttribute('class','hx02');
  dhl.setAttribute('style','color: #00FF7F');
  var nowpageid=nowpage.getAttribute('id');
  var pd=nowpageid>'bq02';
  if(pd){
    nowpage.setAttribute('class', 'move-out-right'); 
    bq02.setAttribute('class', 'move-in-right'); 
  }else{
    nowpage.setAttribute('class', 'move-out'); 
    bq02.setAttribute('class', 'move-in'); 
  }
  nowpage = bq02;
});

bg04.addEventListener('click',function(){
  xian.setAttribute('class','hx03');
  dhl.setAttribute('style','color: #FFA500');
  var nowpageid=nowpage.getAttribute('id');
  var pd=nowpageid>'bq03';
  if(pd){
    nowpage.setAttribute('class', 'move-out-right'); 
    bq03.setAttribute('class', 'move-in-right'); 
  }else{
    nowpage.setAttribute('class', 'move-out'); 
    bq03.setAttribute('class', 'move-in'); 
  }
  nowpage = bq03;
});

bg05.addEventListener('click',function(){
  xian.setAttribute('class','hx04');
  dhl.setAttribute('style','color: #00FFFF');
  var nowpageid=nowpage.getAttribute('id');
  var pd=nowpageid>'bq04';
  if(pd){
    nowpage.setAttribute('class', 'move-out-right'); 
    bq04.setAttribute('class', 'move-in-right'); 
  }else{
    nowpage.setAttribute('class', 'move-out'); 
    bq04.setAttribute('class', 'move-in'); 
  }
  nowpage = bq04;
});

// ============================================
// 获取时间日期id
var sj=document.getElementById('sj');
var rq=document.getElementById('rq');
// 检验时间日期id
console.log(sj,rq);

setInterval(function(){
  now = new Date();
  hour = now.getHours();
  minute = now.getMinutes();
  second = now.getSeconds();
  document.getElementById('sj').innerHTML = 
   hour + '时' + minute + '分' + second + '秒';
},1000);

setInterval(function(){
  now = new Date();
  year = now.getUTCFullYear();
  month = now.getUTCMonth() + 1;
  day = now.getDate();
  document.getElementById('rq').innerHTML = 
   year + '年' + month + '月' + day + '日';
},);

// ==================================================
var nowpage01=bq1
bq001.addEventListener('click',function(){
  bq01.setAttribute('id','bq1');
  var nowpageid01=nowpage01.getAttribute('id');
  var bd=nowpageid01>'bq1';
  if(bd){
    nowpage01.setAttribute('class', 'move-out-top'); 
    bq1.setAttribute('class', 'move-in-top'); 
  }else{
    nowpage01.setAttribute('class', 'move-out01'); 
    bq1.setAttribute('class', 'move-in01'); 
  }
  //当前页变成第一页
  nowpage01 = bq1; 
});

bq002.addEventListener('click',function(){
  var nowpageid01=nowpage01.getAttribute('id');
  var bd=nowpageid01>'bq2';
  if(bd){
    nowpage01.setAttribute('class', 'move-out-top'); 
    bq2.setAttribute('class', 'move-in-top'); 
  }else{
    nowpage01.setAttribute('class', 'move-out01'); 
    bq2.setAttribute('class', 'move-in01'); 
  }
  //当前页变成第一页
  nowpage01 = bq2; 
});

bq003.addEventListener('click',function(){
  var nowpageid01=nowpage01.getAttribute('id');
  var bd=nowpageid01>'bq3';
  if(bd){
    nowpage01.setAttribute('class', 'move-out-top'); 
    bq3.setAttribute('class', 'move-in-top'); 
  }else{
    nowpage01.setAttribute('class', 'move-out01'); 
    bq3.setAttribute('class', 'move-in01'); 
  }
  //当前页变成第一页
  nowpage01 = bq3; 
});

bq004.addEventListener('click',function(){
  var nowpageid01=nowpage01.getAttribute('id');
  var bd=nowpageid01>'bq4';
  if(bd){
    nowpage01.setAttribute('class', 'move-out-top'); 
    bq4.setAttribute('class', 'move-in-top'); 
  }else{
    nowpage01.setAttribute('class', 'move-out01'); 
    bq4.setAttribute('class', 'move-in01'); 
  }
  //当前页变成第一页
  nowpage01 = bq4; 
});

bq005.addEventListener('click',function(){
  var nowpageid01=nowpage01.getAttribute('id');
  var bd=nowpageid01>'bq5';
  if(bd){
    nowpage01.setAttribute('class', 'move-out-top'); 
    bq5.setAttribute('class', 'move-in-top'); 
  }else{
    nowpage01.setAttribute('class', 'move-out01'); 
    bq5.setAttribute('class', 'move-in01'); 
  }
  //当前页变成第一页
  nowpage01 = bq5; 
});