// ajax.send('/', { echo: 'karl' }, function(data) {
//   console.log(data);
// });

(function() {
  let app;

  new Vue({
    el: '#app',
    data() {
      return {
        title: '个人相册',
        imgcode: '',
        tbUser: {
          username: '',
          password: ''
        },
        result: '',
        // 图片src信息
        imgSrc: '',
        loginUser: ajax.loadUser(),
        images: []
      };
    },
    methods: {
      getImg(fid) {
        return ajax.getFileUrl(fid);
      },
      query() {
        ajax.send(
          '/file/query',
          {
            // 只显示第一页前四个
            page: { pageSize: 4, pageNumber: 1 },
            tbFile: {
              // 只查询图片
              contentType: 'image/'
              // 只查询相册的
              // fileinfo: '相册'
            }
          },
          function(data) {
            console.log(data);
            if (data.success) {
              app.images = data.resultData.list;
            }
          }
        );
      },
      changeImg() {
        ajax.send(
          '/tools/imageCode ',
          {},
          function(data) {
            app.imgSrc = data.message;
          },
          'get'
        );
      },
      login() {
        app.tbUser.password = SparkMD5.hash(app.tbUser.password);
        ajax.send(
          '/user/login',
          {
            imgcode: app.imgcode,
            tbUser: app.tbUser
          },
          function(data) {
            app.result = data.message;
            app.tbUser.password = '';
            app.changeImg();
            // 如果登陆成功就保存用户信息
            if (data.success) {
              app.loginUser = data.resultData.tbUser;
              ajax.saveUser(app.loginUser);
              app.query();
            }
          }
        );
      }
    },
    created() {
      app = this;
      app.changeImg();
      if (app.loginUser) {
        app.query();
      }
    }
  });
})();
