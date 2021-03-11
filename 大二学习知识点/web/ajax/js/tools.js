// tools.js 工具和ajax相关公用js
//依赖axios和qs
(function () {
  let huhuiyu = {
    //后端api服务根地址
    server: 'https://huhuiyu.cn/teach-ajax-demo',
    //本地保存token信息的key值
    serverToKenKey: 'huhuiyu.cn.token.key',
    //保存服务器应答信息中token到本地储存
    saveToken: function (data) {
      if (data && data.token) {
        localStorage.setItem(huhuiyu.serverToKenKey, data.token);
      }
    },
    //获取本地储存的token
    loadToken: function () {
      let token = localStorage.getItem(huhuiyu.serverToKenKey);
      return token ? token : '';
    },
    //ajax请求
    //url,服务器api接口地址
    //params,传递给服务器的参数(json格式,没有就空的{})
    //cb,服务器应答回来后的处理function,需要一个应答结果参数
    //method,请求的method类型，可以不传，默认为post
    ajax: function (url, params, cb, method) {
      axios({
        //地址需要补全根地址信息
        url: huhuiyu.server + url,
        //json数据通过Qs转换成查询参数格式
        data: Qs.stringify(params, { allowDots: true }),
        //method参数存在就使用method,否则就是post
        method: method ? method : 'post',
        //需要将token信息通过header传递到服务器认证
        headers: {
          token: huhuiyu.loadToken(),
        },
      })
        .then(function (resp) {
          //正确请求应答回来的结果
          //保存应答的token信息
          huhuiyu.saveToken(resp.data);
          //将数据传递给回调的函数处理
          cb(resp.data);
        })
        .catch(function (err) {
          //请求错误的情况
          //直接用一个伪造的结果json回调
          cb({code:500,message:'请求失败',error: err })
        });
    },
  };

  window.huhuiyu = huhuiyu;
})();
