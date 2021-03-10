<template>
  <div>
    <div>{{ title }}</div>
    <div>
      <input v-model="tbUser.username" placeholder="登录名" />
      <input type="password" v-model="tbUser.password" placeholder="密码" />
      <input v-model="tbUser.nickname" placeholder="昵称" />
      <button @click="resetUser">重置</button>
      <button @click="reg">注册</button>
      <a href="javascript:void(0)" @click="toLogin">返回登陆</a>
    </div>
    <pre>
      {{ tbUser }}
    </pre>
  </div>
</template>

<script>
import tools from '../../js/tools';

export default {
  name: 'UserReg',
  data() {
    return {
      title: '用户注册',
      tbUser: {
        username: '',
        password: '',
        nickname: ''
      }
    };
  },
  methods: {
    toLogin() {
      // 通过事件跳转路由，只需要path信息，不需要加#符号
      this.$router.push('/user/login');
    },
    resetUser() {
      this.tbUser = {
        username: '',
        password: '',
        nickname: ''
      };
    },
    reg() {
      // 密码需要md5加密
      this.tbUser.password = tools.md5(this.tbUser.password);

      let app = this;
      tools.ajax(
        '/user/reg',
        {
          tbUser: this.tbUser
        },
        function(data) {
          alert(data.message);
          app.resetUser();
        }
      );
    }
  }
};
</script>
