console.log('执行demo06.js======>');

// 提示动画==============================================
var mingzi=document.getElementById('mingzi');
var mima=document.getElementById('mima');
var nicheng=document.getElementById('nicheng');
var zhuce=document.getElementById('zhuce');
var tishi=document.getElementById('tishi');

zhuce.addEventListener('click',function(){
  var name = mingzi.value;
  var pw = mima.value;
  var nc = nicheng.value;

  tishi.innerHTML= '';
   if(name.length<=6){
    tishi.innerHTML = '用户名不能小于6个字符！';
    tishi.setAttribute('class','animated flash');
    tishi.style.color = 'red';
    return;
   }
   
   if(pw.length<=6){
    tishi.innerHTML = '密码不能小于6个字符！';
    tishi.style.color = 'red';
    return;
   }

   if(nc.length<=0){
    tishi.innerHTML = '昵称不能为空！';
    tishi.style.color = 'red';
   }
})