<template>
  <div>
    <div>
      <a href="/#/">返回</a>
      <button @click="test">日期格式化</button>
      {{ result01 }}---{{ result02 }}
    </div>
    <span class="title pd10 mr05">{{ title }}</span>
  </div>
</template>

<script>
// 新版本的js导入
// 格式：import 对象别名 from 'js文件'
import tools from '../../js/tools';

// vue组件使用新版本js的export管理，不需要创建vue实例
export default {
  // 实例绑定给template里面元素，不再需要el
  name: 'V02',
  // data必须是function模式，返回值就是json格式数据
  data() {
    return {
      title: 'vue基础复习二—' + tools.name,
      result01: '',
      result02: ''
    };
  },
  methods: {
    test() {
      // 日期不带format参数
      this.result01 = tools.formatDate(new Date());
      // 时间戳带format参数
      this.result02 = tools.formatDate(new Date().getTime(), 'yyyy年MM月dd日 hh:mm:ss');
      // 错误的参数
      tools.formatDate('字符串类型数据');
    }
  }
};
</script>

<style scoped>
/* 导入其他公用css文件 */
@import '../../css/common.css';

.title {
  border: 1px solid red;
  display: inline-block;
}
</style>
