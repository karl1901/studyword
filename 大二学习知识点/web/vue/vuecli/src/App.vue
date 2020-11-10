<template>
  <!--
     vue文件中template里面就是html内容
     template中的第一级子元素只能有一个
  -->
  <!-- 主页面，所有页面都在路由视图中切换 -->
  <div class="main-container">
    <div>
      <!-- 路由视图 -->
      <router-view></router-view>
    </div>
  </div>
</template>

<style>
/* vue文件中的样式写在style标记中 */
body {
  margin: 0px;
}

.main-container {
  background-image: url('assets/bg.jpg');
  background-size: cover;
  background-attachment: fixed;
  background-position: center;
}

.main-container > div {
  background-color: rgba(255, 255, 255, 0.5);
  min-height: 100vh;
}
</style>
