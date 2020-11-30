import Vue from 'vue';
import App from './App.vue';
import router from './router';
// 第二步：main.js导入filter文件，供vue页面使用
import './filters/myfliters';

Vue.config.productionTip = false;

new Vue({
  router,
  render: h => h(App)
}).$mount('#app');
