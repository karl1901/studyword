//ajax请求封装,公用js
let huhuiyu = {};

//后端api接口文档地址
//https://huhuiyu.top/teach-demo-service/docs.html

//后端api接口基础地址
huhuiyu.serverBaseUrl = 'https://huhuiyu.top/teach-demo-service';

//后端接口需要token验证，需要保存到本地
huhuiyu.tokenKey = 'huhuiyu.server.token';
huhuiyu.saveToken = function (data) {
  //如果应答信息存在token值就保存到本地储存中
  if (data && data.token) {
    localStorage.setItem(huhuiyu.tokenKey, data.token);
  }
};

huhuiyu.loadToken = function () {
  //加载本地储存中的token信息
  let token = localStorage.getItem(huhuiyu.tokenKey);
  return token ? token : '';
};

//使用axios+qs封装ajax请求
//akax的核心，通过四个参数体现
//url：后端api服务地址，params：发送到服务器的参数
//cb：应答回来后的处理function(回调)
//method：http请求模式(post,get)
huhuiyu.ajax = function (url, params, cb, method) {
  let promise = axios({
    //需要补全完整的后端api服务地址
    url: huhuiyu.serverBaseUrl + url,
    //将json格式的参数通过qs工具转换成http查询字符
    data: Qs.stringify(params, { allowDots: true }),
    //method默认为post
    method: method ? method : 'post',
    //通过头信息传递token
    headers: {
      token: huhuiyu.loadToken(),
    },
  });
  //axios的请求是js的Promise
  promise
    .then(function (resp) {
      //Promise在正常应答的时候会调用then方法
      console.log('服务器应答结果:', resp);
      //保存token信息
      huhuiyu.saveToken(resp.data);
      //应答结果中data小节是服务器返回的信息
      cb(resp.data);
    })
    .catch(function (err) {
      //Promise在错误应答的时候会调用catch方法
      cb({ code: 500, message: '请求错误', success: false, error: err });
    });
};
