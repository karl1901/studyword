console.log('in ajax02.js....');
console.log('第三方库Qs对象：', Qs);

//form提交数据其实是 abc=def
//json {abc:def}
// Qs的作用就是在两者之间转换
let formdata = { echo: '学习委员' };
console.log(formdata);
console.log(JSON.stringify(formdata));
//Qs转换json
console.log(Qs.stringify(formdata));
//多级json
formdata = { user: { name: 'karl', id: 100 } };
console.log(Qs.stringify(formdata));
//多级格式需要指定参数,允许json的.格式
console.log(Qs.stringify(formdata, { allowDots: true }));

//axios配合Qs发起请求
axios({
  method: 'post',
  url: 'https://huhuiyu.cn/teach-ajax-demo/',
  data: Qs.stringify(
    {
      echo: Math.random(),
    },
    { allowDots: true }
  ),
})
  .then(function (resp) {
    console.log(resp);
    document.getElementById('preResult').innerHTML = JSON.stringify(
      resp.data,
      null,
      2
    );
  })
  .catch(function (err) {
    console.log(err);
  });
