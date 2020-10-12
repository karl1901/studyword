console.log('进入l1.js');
console.log('axios:', axios);
console.log('qs:', Qs);
var serviceBaseUrl = 'https://huhuiyu.cn/teach-ajax-demo';
var serviceTokenKey = 'service.token';

var txtEcho = document.getElementById('txtEcho');
var btnEcho = document.getElementById('btnEcho');
var spEcho = document.getElementById('spEcho');

btnEcho.addEventListener('click', function () {
  promise = axios({
    method: 'GET',
    url: serviceBaseUrl + '/test/imageCode',
    headers: {
      token: localStorage.getItem(serviceTokenKey),
    },
    data: 'echo=' + txtEcho.value,
  });
  promise.then(function (resp) {
    if (resp.data.token) {
      localStorage.setItem(serviceTokenKey, resp.data.token);
    }
    spEcho.innerHTML = JSON.stringify(resp.data);
    document.getElementById('imgcode').setAttribute('src', resp.data.message);
  });
});
