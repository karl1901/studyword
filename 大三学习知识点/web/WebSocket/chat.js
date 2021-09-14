(function () {
  // WebWocket
  let ws;
  // 连接凭证
  isOpen = false;

  new Vue({
    el: '#app',

    data() {
      return {
        // 标题
        title: '在线聊天室',
        // 昵称
        name: '',
        // 信息内容
        txt: ''
      };
    },
    methods: {
      // 发送消息的方法
      Send() {
        // 校验表单内容
        if (this.name == '') {
          this.$message({
            showClose: true,
            message: '昵称不能为空!!',
            type: 'warning'
          });
          return;
        }
        if (this.txt == '') {
          this.$message({
            showClose: true,
            message: '信息内容必须填写!!',
            type: 'warning'
          });
          return;
        }
        // 校验ws是否存在和连接凭证是否正确
        if (ws && isOPen) {
          let info = {
            name: this.name,
            info: this.txt
          };
          // 发送消息(字符串)
          ws.send(JSON.stringify(info));
          // 信息内容清空
          this.txt = '';
        }
      },
      // 重填表单内容
      Reset() {
        // 表单内容清空
        this.name = '';
        this.txt = '';
      }
    },
    mounted() {
      // 调用ws连接框架方法
      connect();
      // 给标题
      document.getElementById('title').innerHTML = this.title;
    }
  });

  // ws连接框架方法
  function connect() {
    // 声明WebSocket
    ws = new WebSocket('wss://huhuiyu.top/teach-demo-service/ws/chat');

    console.log('开始连接...');

    // 连接成功
    ws.onopen = function () {
      isOPen = true;
      console.log('已经连接');
    };

    // 连接断开
    ws.onclose = function () {
      isOPen = false;
      // 赋空
      ws = null;
      console.log('服务已经断开，2秒后重连');
      // 两秒后调用方法本身
      setTimeout(connect(), 2000);
    };

    // 获取连接的信息
    ws.onmessage = function (event) {
      // 获取到的信息格式转换(json)
      let info = JSON.parse(event.data);
      if (info.type == 'chat') {
        // 如果是聊天信息，输出内容：
        document.getElementById('infos').innerHTML =
          info.message.name +
          '说：' +
          info.message.info +
          '<br>' +
          document.getElementById('infos').innerHTML;
      } else {
        // 其他消息(控制台显示)
        console.log('其他消息：', info);
      }
    };
  }
})();
