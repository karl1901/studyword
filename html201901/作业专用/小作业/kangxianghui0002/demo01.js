var count = 0;

// 将spCount的内容设置成0
document.getElementById('spCount').innerHTML = count;
// 计数按钮的动作
document.getElementById('btnCount').addEventListener('click',function(){
  // 通过 变量=新值;来修改变量的内容
  count = count + 1
  document.getElementById('spCount').innerHTML = count
});