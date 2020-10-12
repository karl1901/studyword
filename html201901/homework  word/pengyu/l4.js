console.log('执行l4.js');

var txtname = document.getElementById('txtname');
var txtpwd = document.getElementById('txtpwd');
var btnLogin = document.getElementById('btnLogin');
var divResuit = document.getElementById('divResuit');

var param = { tbUser: { password: '', username: '' } };

btnLogin.addEventListener('click', function () {
  param.tbUser.username = txtname.value;
  param.tbUser.password = txtpwd.value;
  huhuiyu.ajax('POST', '/user/login', param, function (resp) {
    console.log(resp);
    divResuit.innerHTML = JSON.stringify(resp.message);
  });
});
//
