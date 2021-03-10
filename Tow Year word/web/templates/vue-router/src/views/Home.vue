<template>
  <div class="home">
    我的首页{{ welcome }}
    <!-- 通过路由跳转页面 -->
    <a href="#/about">关于</a>
    <img src="../assets/logo.png" alt="" />
  </div>
</template>
<script>
export default {
  name: 'Home',
  // vue组件的data必须是function
  data() {
    return { welcome: '你好,vuecli' };
  }
};
</script>

<style scoped>
.home {
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 2rem;
}
</style>
