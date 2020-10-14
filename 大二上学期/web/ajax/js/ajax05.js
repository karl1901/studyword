console.log('in js05.js...');

let txtUsername = document.getElementById('txtUsername');
let txtPassword = document.getElementById('txtPassword');
let txtNickname = document.getElementById('txtNickname');
let btnReg = document.getElementById('btnReg');
let divInfo = document.getElementById('divInfo');

console.log(txtUsername, txtPassword, txtNickname, btnReg, divInfo);
btnReg.addEventListener('click', function () {
  divInfo.innerHTML = '';
  //获取页面输入的信息
  let username = txtUsername.value.trim();
  let password = txtPassword.value.trim();
  let nickname = txtNickname.value.trim();
  console.log('输入得数据：', username, password, nickname);
  if (username == '') {
    divInfo.innerHTML = '用户名必须填写！';
    txtUsername.focus();
    return;
  }
  if (password == '') {
    divInfo.innerHTML = '密码必须填写！';
    txtPassword.focus();
    return;
  }
  if (nickname == '') {
    divInfo.innerHTML = '昵称必须填写！';
    txtNickname.focus();
    return;
  }

  //提交注册数据
  huhuiyu.ajax(
    '/user/reg',
    {
      tbUser: {
        username: username,
        password: password,
        nickname: nickname,
      },
    },
    function (data) {
      divInfo.innerHTML = data.message;
    }
  );
});

// 登陆的部分
let txtName = document.getElementById('txtName');
let txtPwd = document.getElementById('txtPwd');
let btnLogin = document.getElementById('btnLogin');

btnLogin.addEventListener('click', function () {
  let name = txtName.value.trim();
  let pwd = txtPwd.value.trim();
  let user = { uername: name, password: pwd };
  huhuiyu.ajax('/user/login', { tbUser: user }, function (data) {
    divInfo.innerHTML = data.message;
  });
});
