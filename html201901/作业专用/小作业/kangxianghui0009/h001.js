// 检查，备注
console.log('执行h001.js');
console.log('karl.2020.03.25');

// 获取id
var divInfo=document.getElementById('divInfo');
var divInfo01=document.getElementById('divInfo01');
var divInfo02=document.getElementById('divInfo02');
var divInfo03=document.getElementById('divInfo03');
var ts=document.getElementById('ts');
var ts01=document.getElementById('ts01');
var ts02=document.getElementById('ts02');
var ts03=document.getElementById('ts03');
var zhuce=document.getElementById('zhuce');
var Info=document.getElementById('Info');
var Info01=document.getElementById('Info01');
var Info02=document.getElementById('Info02');
var Info03=document.getElementById('Info03');
var zc01=document.getElementById('zc01');
// 检验是否获取正确
console.log(zhuce,ts,ts01,ts02,ts03,divInfo,divInfo01,divInfo02,divInfo03,Info,Info01,Info02,Info03,zc01);

var curIndex = 0;
  //时间间隔(单位毫秒)，每秒钟显示一张，数组共有3张图片，互联网获取
  var timeInterval = 2000;
  //定义一个存放照片位置的数组，可以放任意个，在这里放3个
  var arr = new Array();
  arr[0] = "https://up.enterdesk.com/edpic/f3/e8/78/f3e87818d91f0b3d3b3e513fdc441da4.jpg";
  arr[1] = "http://www.91zhuti.com/uploads/131224/6-131224105150D8.jpg";
  arr[2] = "https://images3.alphacoders.com/815/815212.jpg";
  arr[3] = "https://gss0.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/zhidao/pic/item/2e2eb9389b504fc2dbceeae8eddde71191ef6d4d.jpg";
  setInterval(changeImg, timeInterval);
  function changeImg() {
  if (curIndex == arr.length - 1) {
  curIndex = 0;
  } else {
  curIndex += 1;
  }
  //设置body的背景图片
  document.body.style.backgroundImage = "URL("+arr[curIndex]+")"; 
  //显示对应的图片
  }

zhuce.addEventListener('click',function(){
  // 检验点击按键
  console.log('注册点击');
  // 去除空白，并赋id
  dh=Info.value.replace(/\s/g,'');
  dh01=Info01.value.replace(/\s/g,'');
  dh02=Info02.value.replace(/\s/g,'');
  dh03=Info03.value.replace(/\s/g,'');
  // 电话号码长度判断
  if(dh.length<11){
    // 弹框固定，边框和输入框
    divInfo.focus();
    Info.focus();
    // 边框提示颜色
    divInfo.setAttribute('class','bk flbk');
    // 提示输出字符
    ts.innerHTML='电话号码必须填写且是11位长度';
    // 提示字符颜色
    ts.setAttribute('style','color: red;');
    // 注册成功提示为空(防止注册成功后再次清空导致显示的问题)
    zc01.innerHTML='';
    return;
  }
    // 边框恢复原色
    divInfo.setAttribute('class','bk');
    // 提示字符消失
    ts.innerHTML='';
  // 密码长度判断
  if(dh01.length<6||dh01.length>16 ){
    divInfo01.focus();
    Info01.focus();
    divInfo01.setAttribute('class','bk flbk');
    ts01.innerHTML='密码长度必须是6-16位';
    ts01.setAttribute('style','color: red;');
    zc01.innerHTML='';
    return;
  }
    divInfo01.setAttribute('class','bk');
    ts01.innerHTML='';
  // 判断密码是否与上面输入密码一致
  // 先判断输入不能为空
  if(dh02.length<=0){
    divInfo02.focus();
    Info02.focus();
    divInfo02.setAttribute('class','bk flbk');
    ts02.innerHTML='密码必须与上面一致';
    ts02.setAttribute('style','color: red;');
    zc01.innerHTML='';
    return;
  }
  // 再判断输入是否与上面一样 
  if(Info01.value!=Info02.value){
    divInfo02.focus();
    Info02.focus();
    divInfo02.setAttribute('class','bk flbk');
    ts02.innerHTML='密码必须与上面一致';
    ts02.setAttribute('style','color: red;');
    zc01.innerHTML='';
    return;
  }
    divInfo02.setAttribute('class','bk');
    ts02.innerHTML='';
  // 昵称长度判断
  if(dh03.length<=0){
    divInfo03.focus();
    Info03.focus();
    divInfo03.setAttribute('class','bk flbk');
    ts03.innerHTML='昵称不能为空';
    ts03.setAttribute('style','color: red;');
    zc01.innerHTML='';
    return;
  }
    divInfo03.setAttribute('class','bk');
    ts03.innerHTML='';
    zc01.innerHTML='恭喜您，注册成功!';
    zc01.setAttribute('style','color: red;');
});