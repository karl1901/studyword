console.log('in ajax01.js...');
console.log('axios对象：', axios);
//后端接口api文档地址
// https://huhuiyu.cn/teach-ajax-demo/docs.html
//后端服务接口访问基础地址
//https://huhuiyu.cn/teach-ajax-demo

let server = 'https://huhuiyu.cn/teach-ajax-demo';
let preResult = document.getElementById('preResult');

//huhuiyu.cn这个后端服务需要保留token认证信息
//可以使用本地储存保存这个信息

let serverTokenKey = 'huhuiyu.server.token';

function saveToken(data) {
  if (data && data.token) {
    localStorage.setItem(serverTokenKey, data.token);
  }
}

//加载本地保存的token
function loadToken() {
  let token = localStorage.getItem(serverTokenKey);
  return token ? token : '';
}

axios.post(server + '/', {}).then(function (resp) {
  console.log('服务器应答结果：', resp);
  //服务器应答的数据是放在date里面
  let result = resp.data;
  //JSON.stringify第二个参数是搜索json中数据(过滤)
  //第三个参数是格式化json，数值表示缩进的空格数
  preResult.innerHTML = JSON.stringify(result, null, 2);
  saveToken(result);
});

console.log('本地保存的token信息', loadToken());
