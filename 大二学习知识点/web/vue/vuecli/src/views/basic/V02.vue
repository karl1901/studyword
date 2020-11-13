<template>
  <div>
    <div>
      <a href="/#/">返回</a>
    </div>
    {{ title }}
  </div>
</template>

<script>
// vue组件使用新版本js的export管理，不需要创建vue实例
export default {
  // 实例绑定给template里面元素，不再需要el
  name: 'V02',
  // data必须是function模式，返回值就是json格式数据
  data() {
    return { title: 'vue基础复习二' };
  }
};
</script>
