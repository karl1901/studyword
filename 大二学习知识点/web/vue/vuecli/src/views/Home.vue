<template>
  <div class="home">
    <!-- data中的数据可以在页面使用 -->
    {{ welcome }}
    <!-- 事件处理 -->
    <button @click="test">打开黑暗骑士的个人网站</button>
  </div>
</template>
<script>
// vue的js代码放在script标记中
// export为新版本js的模块管理
export default {
  // 不在需要el属性，用name属性标记
  name: 'Home',
  // vue组件的data必须是function
  data() {
    return { welcome: '黑暗骑士的网站建设中' };
  },
  // 事件还是一致的
  methods: {
    test() {
      window.open('https://huhuiyu.top');
    }
  }
};
</script>

<style scoped>
/* scoped属性表示css样式名称只在本页面有效 */
.home {
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 2rem;
}
</style>
