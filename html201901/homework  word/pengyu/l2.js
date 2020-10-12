console.log('进入l2.js');
console.log(huhuiyu.serviceBaseUrl);
var btnEcho = document.getElementById('btnEcho');
var imgcode = document.getElementById('imgcode');
// Qs的作用，js里面很容易得到json的对象,Qs可以将json对象转换成axios发送的请求参数(查询字符串) 格式
var param = { echo: '黑暗骑士' };
console.log(Qs.stringify(param));
btnEcho.addEventListener('click', function () {
  param = { user: { username: '黑暗骑士', password: 'abc123456' } };
  // {allowDots:true}表示支持多级的json对象
  console.log(Qs.stringify(param, { allowDots: true }));
  // 简化版本的ajax请求
  huhuiyu.ajax('get', '/test/imageCode', { echo: '黑暗骑士abc' }, function (
    resp
  ) {
    console.log(resp);
    imgcode.setAttribute('src', resp.message);
  });
});
