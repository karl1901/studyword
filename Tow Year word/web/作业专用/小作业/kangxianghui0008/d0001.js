console.log('执行d0001.js=====>');
console.log('karl.2020.03.23');

// 获取页面id
var info01=document.getElementById('info01');
var info02=document.getElementById('info02');
var panduan=document.getElementById('panduan');
var tishi=document.getElementById('tishi');
var info001=document.getElementById('info001');
var info002=document.getElementById('info002');
var panduan01=document.getElementById('panduan01');
var tishi01=document.getElementById('tishi01');
// 检验id是否引入正确
console.log(info01,info02,panduan,tishi);

panduan.addEventListener('click',function(){
  var a01=info01.value;
  var a02=info02.value;
  a01=a01.replace(/\s*/g,'');
  a02=a02.replace(/\s*/g,'');
  if(a01.length == 0){
    tishi.innerHTML="第一个值没有输入哦！<br>";
    info01.focus();
    return;
  }
  if(a02.length == 0){
    tishi.innerHTML="第二个值没有输入哦！<br>";
    info02.focus();
    return;
  }
    tishi.innerHTML='大于的判断结果：' + (a01>a02) + '<br>';
    tishi.innerHTML=
      tishi.innerHTML + '小于的判断结果：' + (a01<a02) + '<br>';
    tishi.innerHTML=
      tishi.innerHTML + '等于的判断结果：' + (a01==a02) + '<br>';
    tishi.innerHTML=
      tishi.innerHTML + '不等于的判断结果：' + (a01 != a02) + '<br>';
    tishi.innerHTML += '大于或者等于的判断结果：' + (a01>=a02) + '<br>';
    tishi.innerHTML += '小于或者等于的判断结果：' + (a01<=a02) + '<br>';
});

panduan01.addEventListener('click',function(){
  var a001=info001.value;
  var a002=info002.value;
  if(a001.length == 0){
    tishi01.innerHTML="第一个值没有输入哦！<br>";
    info001.focus();
    return;
  }
  if(a002.length == 0){
    tishi01.innerHTML="第二个值没有输入哦！<br>";
    info002.focus();
    return;
  }
  if(a001.length>a002.length){
    tishi01.innerHTML='第一个输入的信息长度大于第二个的长度<br>';
    return;
  }
  if(a001.length==a002.length){
    tishi01.innerHTML='第一个输入的信息长度等于第二个的长度<br>';
    return;
  }
  if(a001.length<a002.length){
    tishi01.innerHTML='第一个输入的信息长度小于第二个的长度<br>';
    return;
  }
});