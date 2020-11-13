<template>
  <div class="home">
    <!-- data中的数据可以在页面使用 -->
    {{ welcome }}
    <!-- 事件处理 -->
    <button @click="test">打开黑暗骑士的个人网站</button>
    <!-- 路由跳转 -->
    <!--     
      <a href="/#/basic/v01">vue基础复习一</a>
      <a href="/#/basic/v02">vue基础复习二</a> 
    -->
    <!-- {{ menus }} -->
    <div class="menus">
      <!-- 
        通过menus数据循环生成超链接
        vue为了避免循环产生元素管理出现问题
        强制要求附加一个不能重复的key属性来标识元素
        由于菜单项的link值没有相同的，可以用于key属性
       -->
      <a v-for="m in menus" :key="m.link" :href="m.link">{{ m.text }}</a>
    </div>
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
    return {
      welcome: '黑暗骑士的网站建设中',
      // 通过json数据处理菜单项
      menus: [
        // link就是跳转页面地址，text是链接提示文本
        { link: '/#/basic/v01', text: 'vue基础复习一' },
        { link: '/#/basic/v02', text: 'vue基础复习二' }
      ]
    };
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

.menus > a {
  display: inline-block;
  margin: 5px;
  padding: 5px;
  text-decoration: none;
  border: 2px solid #ff0000;
  border-radius: 5px;
  color: black;
}

.menus > a:hover {
  border-color: transparent;
  text-decoration: underline;
}
</style>
