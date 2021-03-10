<template>
  <div>
    <div>{{ title }}</div>
  </div>
</template>

<script>
import test from '../../js/test/index';

export default {
  name: 'Test',
  data() {
    return {
      title: '测试首页'
    };
  },
  created() {
    test.show();
  }
};
</script>
