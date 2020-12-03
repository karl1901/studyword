<template>
  <div>
    <div>{{ title }}</div>
    <div>插件测试信息：{{ plugInfo }}</div>
  </div>
</template>

<script>
export default {
  name: 'MyPlugin',
  data() {
    return {
      title: 'vue自定义插件',
      plugInfo: ''
    };
  },
  created() {
    // 第四步：通过vue实例对象可以访问插件定义的原型
    this.plugInfo = this.$testInfo;
    this.$testMethod('传入插件的信息');
    this.$testCallBack('回调信息', function(info) {
      console.log('回调结果：', this, info);
    });
  }
};
</script>
