// 控制台显示信息，确认js已经输入，在控制台显示
console.log('进入zy0002.js');

// 功能说明，如果是数就运算显示结果，如果不是数就不运算且不显示结果

// 第一步，获取页面上计算按钮和输入框，以及提示信息的元素
var jisuan=document.getElementById('jisuan');//计算按钮
console.log(jisuan)
var n01=document.getElementById('n01');
var n02=document.getElementById('n02');
var jieguo01=document.getElementById('jieguo01');
var ts=document.getElementById('ts');

jisuan.addEventListener('click',function(){
   var num01=parseFloat(n01.value);
   var num01=parseFloat(n02.value);
   if(isNaN(num01)){
     ts.innerHTML='输入的不是一个数';
     jieguo01.innerHTML = '';
     return;
   }else{
     ts.innerHTML = '';
     jieguo01.innerHTML = parseFloat(n01.value) + parseFloat(n02.value);
   }
});