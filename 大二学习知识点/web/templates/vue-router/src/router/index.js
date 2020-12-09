import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);
// vue路由配置
const routes = [
  {
    // path是路由访问url地址，name随意，components是路径对应的真实vue页面
    // 如果路由选中的是hash模式，地址前面要加#，例如：#/,#/about,#/abc/def
    path: '/',
    name: 'Home',
    component: () => import('../views/Home.vue')
  },
  {
    path: '/about',
    name: 'About',
    component: () => import('../views/About.vue')
  }
];

const router = new VueRouter({
  routes
});

export default router;
