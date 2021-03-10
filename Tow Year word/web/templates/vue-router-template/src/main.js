import Vue from 'vue';
import App from './App.vue';
import router from './router';
// 自定义过滤器和指令导入
import './directives/mydirectives';
import './filters/myfliters';

// 导入插件
import myplugins from './plugins/myplugins';
Vue.use(myplugins);

Vue.config.productionTip = false;

new Vue({
  router,
  render: h => h(App)
}).$mount('#app');
