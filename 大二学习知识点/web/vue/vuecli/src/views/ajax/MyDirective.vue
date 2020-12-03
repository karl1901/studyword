<template>
  <div>
    <div>
      {{ title }}
    </div>
    <div>
      <!-- 第三步：通过添加属性 v-指令名称 调用指令功能 -->
      <input v-focus="focusInfo.username" v-model="user.name" /><br />
      <input v-model="user.pwd" v-focus="focusInfo.pwd" /><br />
      <button @click="login">登陆</button><br />
      {{ user }}
      {{ focusInfo }}
    </div>
  </div>
</template>

<script>
export default {
  name: 'MyDirective',
  data() {
    return {
      title: '自定义指令',
      user: {
        name: '',
        pwd: ''
      },
      focusInfo: {
        username: false,
        pwd: false
      }
    };
  },
  methods: {
    login() {
      // 重置焦点状态
      this.focusInfo.username = false;
      this.focusInfo.pwd = false;
      // 用户名必须填
      if (this.user.name.trim() == '') {
        this.focusInfo.username = true;
        return;
      }
      // 密码必填
      if (this.user.pwd.trim() == '') {
        this.focusInfo.pwd = true;
        return;
      }
      alert('输入完成');
    }
  }
};
</script>
