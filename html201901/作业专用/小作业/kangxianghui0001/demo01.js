document.getElementById('a').innerHTML = 'karl—小灰';
document.getElementById('b').innerHTML = '男';
document.getElementById('c').innerHTML = '10086';

document.getElementById('a').addEventListener('click'
,function(){
  console.log('靓仔，点我名字干啥？');
});
document.getElementById('b').addEventListener('click'
,function(){
  console.log('别点了，我是小哥哥！');
});
document.getElementById('c').addEventListener('click'
,function(){
  console.log('哈哈，这都被你发现了，中国移动客服');
});