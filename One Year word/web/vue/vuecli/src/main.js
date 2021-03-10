import Vue from 'vue';
import App from './App.vue';
import router from './router';
// 第二步：main.js导入filter文件，供vue页面使用
import './filters/myfliters';
// 第二步：mian.js导入directive文件，供vue页面使用
import './directives/mydirectives';
// 第二步：导入自定义插件
import myplugins from './plugins/myplugins';

Vue.config.productionTip = false;

// 第三步：使用插件
Vue.use(myplugins);

new Vue({
  router,
  render: h => h(App)
}).$mount('#app');
