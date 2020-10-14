console.log('执行注册.js==========karl');

// =============================
// 获取页面id
var info01=document.getElementById('info01');
var info02=document.getElementById('info02');
var info03=document.getElementById('info03');
var info04=document.getElementById('info04');
var ts01=document.getElementById('ts01');
var ts02=document.getElementById('ts02');
var ts03=document.getElementById('ts03');
var ts04=document.getElementById('ts04');
var zc=document.getElementById('zc');
var zj=document.getElementById('zj');

console.log(info01,info02,info03,info04,ts01,ts02,ts03,ts04,zc,zj);

zc.addEventListener('click',function(){
  // 检验点击按键
  console.log('注册点击');
  // 去除空白，并赋id
  dh01=info01.value.replace(/\s/g,'');
  dh02=info02.value.replace(/\s/g,'');
  dh03=info03.value.replace(/\s/g,'');
  dh04=info04.value.replace(/\s/g,'');
  // 先判断是否输入会员名
  if(dh01==''){
    // 弹框固定
    info01.focus();
    // 弹出提示字样和颜色
    ts01.innerHTML= '会员名不能为空';
    ts01.setAttribute('style','color: red;');
    return;
  }
  // 再判断会员名长度是否正确
  if(dh01.length<8||dh01.length>12){
    // 弹框固定，边框和输入框
    info01.focus();
    // 提示输出字符
    ts01.innerHTML='会员名长度必须是8-12位';
    // 提示字符颜色
    ts01.setAttribute('style','color: red;');
    return;
  }
    // 提示字符消失
    ts01.innerHTML='';

    // 先判断密码是否为空
  if(dh02==''){
    info02.focus();
    ts02.innerHTML='密码不能为空';
    ts02.setAttribute('style','color: red;');
    return;
  }
  // 再判断密码长度
  if(dh02.length<6||dh02.length>10 ){
    info02.focus();
    ts02.innerHTML='密码长度必须是6-10位';
    ts02.setAttribute('style','color: red;');
    return;
  }
    ts02.innerHTML='';
  // 判断密码是否与上面输入密码一致
  // 先判断输入不能为空
  if(dh04==''){
    info04.focus();
    ts04.innerHTML='请再次输入密码';
    ts04.setAttribute('style','color: red;');
    return;
  }
  // 再判断输入是否与上面一样 
  if(info02.value!=info04.value){
    info04.focus();
    ts04.innerHTML='密码必须与上面一致';
    ts04.setAttribute('style','color: red;');
    return;
  }
    ts04.innerHTML=''; 
  // 昵称长度判断
  if(dh03.length<=0){
    info03.focus();
    ts03.innerHTML='昵称不能为空';
    ts03.setAttribute('style','color: red;');
    return;
  }
    ts03.innerHTML='';
    // 注册成功后跳转到登录页面效果
    zj.setAttribute('href','denglu.html');
});