console.log('执行other0001.js');
var btn01 = document.getElementById('btn01');
var sp01 = document.getElementById('sp01');
var btn02 = document.getElementById('btn02');
var sp02 = document.getElementById('sp02');

//通过字符串内容完成切换模式判断
var mode01 = 'day';
btn01.addEventListener('click', function() {
  if (mode01 == 'day') {
    mode01 = 'night';
    sp01.setAttribute('class', 'style02');
    return;
  }
  mode01 = 'day';
  sp01.setAttribute('class', 'style01');
});
// 通过取模运行完成切换模式判断
var mode02 = 1;

btn02.addEventListener('click', function() {
  mode02 = mode02 + 1;
  if (mode02 % 2 == 0) {
    sp02.setAttribute('class', 'style02');
    return;
  }
  sp02.setAttribute('class', 'style01');
});
