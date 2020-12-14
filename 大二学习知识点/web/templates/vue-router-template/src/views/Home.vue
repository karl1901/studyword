<template>
  <div class="home">
    <div>
      {{ title }}
    </div>
    <div>
      <a href="/#/employee/dept">部门管理</a>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Home',
  data() {
    return { title: '网站建设中' };
  }
};
</script>
