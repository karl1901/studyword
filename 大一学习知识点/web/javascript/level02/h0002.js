console.log('执行h0002.js==========>');

/*
展示逻辑表达式的计算结果
> < == != >= <=
点击开始判断的按钮就比对两个文本框中输入的信息，结果放在div中
*/

//第一步，获取页面相关元素
var info01=document.getElementById('info01');//第一个输入框
var info02=document.getElementById('info02');//第二个输入框
var btnIf=document.getElementById('btnIf');//判断按钮
var divresult=document.getElementById('divresult');//显示结果的div
console.log(info01,info02,btnIf,divresult);

// 第二步，判断按钮点击动作
btnIf.addEventListener('click',function(){
  console.log('开始判断');
  // 获取输入框中输入的内容
  var val01=info01.value;//第一个输入框的值
  var my=info02.value;//第二个值
  console.log(val01,my,val01.length,my.length);
  // 显示输入的信息
  divresult.innerHTML = '第一个值是：' + val01 + '<br>';
  divresult.innerHTML = divresult.innerHTML + '第二个值是：' + my + '<br>';
  // 要有输入才能继续判断
  // 去掉空白字符再判断输入的情况
  val01=val01.replace(/\s*/g,'');
  my=my.replace(/\s*/g,'');
  console.log('去掉空格之后的值：',val01,my,val01.length,my.length);
  if(val01.length == 0){
    divresult.innerHTML=divresult.innerHTML+"第一个信息没有输入有效内容<br>";
    // 页面元素.focus()表示元素获取焦点
    info01.focus();
    return;
  }
  if(my.length == 0){
    divresult.innerHTML=divresult.innerHTML+"第二个信息没有输入有效内容<br>";
    info02.focus();
    return;
  }
  // 大于的判断 逻辑判断表达式只有两个结果，true,false
  // a=b表示a的值为b a=100表示a变成100
  // a==b表示判断a是否和b相等 a==100表示如果a的值是100返回true，否则false
    divresult.innerHTML=
      divresult.innerHTML + '大于的判断结果：' + (val01>my) + '<br>';
    divresult.innerHTML=
      divresult.innerHTML + '大于或者等于的判断结果：' + (val01>=my) + '<br>';
    // a+=b;就是a=a+b !是not
      divresult.innerHTML += '不相等测试的结果' + (val01!=my) + '<br>';
      divresult.innerHTML += '取反操作不相等测试的结果' + !(val01==my) + '<br>';
    // 作业1 完成剩下的逻辑判断表达式的测试结果
    // >大于 <小于 ==相等 >=大于或者等于 <=小于或者等于
    // 作业2 判断两个文本框中输入的信息的长度哪一个更长
});