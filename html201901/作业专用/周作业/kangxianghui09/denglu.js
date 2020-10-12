console.log('执行登录.js=======karl');

// =============================
// 获取页面id
var info01=document.getElementById('info01');
var info02=document.getElementById('info02');
var ts01=document.getElementById('ts01');
var ts02=document.getElementById('ts02');
var dlu=document.getElementById('dlu');
var zj=document.getElementById('zj');

console.log(info01,info02,ts01,ts02,dlu,zj);

dlu.addEventListener('click',function(){
  // 检验点击按键
  console.log('注册点击');
  // 去除空白，并赋id
  dh01=info01.value.replace(/\s/g,'');
  dh02=info02.value.replace(/\s/g,'');

  // 判断会员名是否输入
  if(dh01 == ''){
    // 弹框固定，边框和输入框
    info01.focus();
    // 提示输出字符
    ts01.innerHTML='会员名不能为空';
    // 提示字符颜色
    ts01.setAttribute('style','color: red;');
    return;
  }
    // 提示字符消失
    ts01.innerHTML='';

  // 判断是否输入密码
  if(dh02 == ''){
    info02.focus();
    ts02.innerHTML='密码不能为空';
    ts02.setAttribute('style','color: red;');
    return;
  }
    ts02.innerHTML='';
    zj.setAttribute('href','index.html');
});