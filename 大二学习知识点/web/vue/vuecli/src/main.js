import Vue from 'vue';
import App from './App.vue';
import router from './router';
// 第二步：main.js导入filter文件，供vue页面使用
import './filters/myfliters';
// 第二步：mian.js导入directive文件，供vue页面使用
import './directives/mydirectives';

Vue.config.productionTip = false;

new Vue({
  router,
  render: h => h(App)
}).$mount('#app');
