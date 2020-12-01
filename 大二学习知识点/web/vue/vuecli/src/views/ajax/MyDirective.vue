<template>
  <div>
    <div>
      {{ title }}
    </div>
    <div>
      <!-- 第三步：通过添加属性 v-指令名称 调用指令功能 -->
      <input v-focus="focusInfo.username" v-model="user.name" /><br />
      <input v-model="user.pwd" /><br />
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
        username: false
      }
    };
  },
  methods: {
    login() {
      if (this.user.name.trim() == '') {
        this.focusInfo.username = true;
        return;
      }
    }
  }
};
</script>
