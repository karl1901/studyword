<template>
  <div>
    <div>{{ title }}</div>
    <div>
      md5加密：
      <input type="text" v-model="info" />
      <span>{{ md5info }}</span>
    </div>
  </div>
</template>

<script>
import tools from '../../js/tools';
export default {
  name: 'TestTools',
  data() {
    return {
      title: '工具类测试',
      info: ''
    };
  },
  computed: {
    md5info() {
      return tools.md5(this.info);
    }
  }
};
</script>
