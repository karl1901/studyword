let txtEcho = document.getElementById('txtEcho');
let btnEcho = document.getElementById('btnEcho');
let preEcho = document.getElementById('preEcho');

let ws = new WebSocket('wss://huhuiyu.top/teach-demo-service/ws/echo');

ws.addEventListener('open', function (event) {
  console.log('服务器已经连接', event);
});

ws.addEventListener('close', function (event) {
  console.log('服务器已经断开', event);
});

ws.addEventListener('message', function (event) {
  console.log('收到服务器消息：', event);
  // 收到的消息转换成json
  let info = JSON.parse(event.data);
  console.log('服务器应答格式', info);
  // JSON.stringify(格式化内容，空格(null)，2个空格(null))
  preEcho.innerHTML = JSON.stringify(info, null, 2);
});

// 发送消息
btnEcho.addEventListener('click', function () {
  ws.send(txtEcho.value);
});
