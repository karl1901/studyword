console.log('执行demo001.js');
console.log('karl小灰');

jisuan.addEventListener('click',function(){
  // 用shuzi01+shuzi02的输入值做到jieguo里面去
  // 注意！！！文本框输入的值都是字符
  // 而计算机中字符的加法是拼接字符
  // js提供了转换字符成为数值的方法,parseFloat(字符)
  jieguo.innerHTML = parseFloat(shuzi01.value) + parseFloat(shuzi02.value);
  jieguo01.innerHTML = parseFloat(shuzi03.value) - parseFloat(shuzi04.value);
  jieguo02.innerHTML = parseFloat(shuzi05.value) * parseFloat(shuzi06.value);
  jieguo03.innerHTML = parseFloat(shuzi07.value) / parseFloat(shuzi08.value);
});

// 点击动画效果
var donghua=document.getElementById('donghua');
var dh=document.getElementById('dh');

donghua.addEventListener('click',function(){
  dh.setAttribute('class','animated bounce');
  // 等动画完成(比如动画是1秒)之后，去掉class的值，恢复到默认的状态
  // setTimeout是延时执行代码，和setInterval不一样的是，只会执行一次
  // 第一个参数是要延时执行的代码，第二个参数是延时的毫秒数
  setTimeout(function() {
    // 清空class的值，还原成默认状态
    dh.setAttribute('class','');
  },1000);
});