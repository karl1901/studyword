<template>
  <div>
    <div>{{ title }}</div>
    <div>
      <input v-model="tbUser.username" placeholder="登陆名" />
      <input type="password" v-model="tbUser.password" placeholder="密码" />
      <img :src="imgcodeSrc" @click="getImgCode" />
      <input v-model="imgcode" placeholder="输入图片验证码" />
      <button @click="resetUser">重置</button>
      <button @click="login">登陆</button>
    </div>
  </div>
</template>

<script>
import tools from '../../js/tools';

export default {
  name: 'UserLogin',
  data() {
    return {
      title: '用户登陆',
      imgcodeSrc: '',
      imgcode: '',
      tbUser: {
        username: '',
        password: ''
      }
    };
  },
  methods: {
    getImgCode() {
      let app = this;
      tools.ajax(
        '/tools/imageCode',
        {
          // 假参数，时间戳，避免浏览器缓存
          ts: new Date().getTime()
        },
        function(data) {
          app.imgcodeSrc = data.message;
        },
        'get'
      );
    },
    resetUser() {
      this.imgcode = '';
      this.tbUser = {
        username: '',
        password: ''
      };
    },
    login() {
      let app = this;
      this.tbUser.password = tools.md5(this.tbUser.password);
      tools.ajax(
        '/user/login',
        {
          imgcode: this.imgcode,
          tbUser: this.tbUser
        },
        function(data) {
          alert(data.message);
          app.resetUser();
        }
      );
    }
  },
  created() {
    this.getImgCode();
  }
};
</script>
