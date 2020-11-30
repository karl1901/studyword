import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);
// vue路由配置
const routes = [
  {
    // path是路由访问url地址，name随意，components是路径对应的真实vue页面
    // 如果路由选中的是hash模式，地址前面要加#，例如：#/,#/about,#/abc/def
    // http://localhost:8080/#/
    path: '/',
    name: 'Home',
    component: () => import('../views/Home.vue')
  },
  {
    // http://localhost:8080/#/basic/v01
    path: '/basic/v01',
    name: 'BasicV01',
    component: () => import('../views/basic/V01.vue')
  },
  {
    // http://localhost:8080/#/basic/v02
    path: '/basic/v02',
    name: 'BasicV02',
    component: () => import('../views/basic/V02.vue')
  },
  {
    // http://localhost:8080/#/test
    path: '/test',
    name: 'Test',
    component: () => import('../views/test/Home.vue')
  },
  {
    // http://localhost:8080/#/test/ajax
    path: '/test/ajax',
    name: 'TestAjax',
    component: () => import('../views/test/Ajax.vue')
  },
  {
    // http://localhost:8080/#/ajax/Link
    path: '/ajax/link',
    name: 'AjaxLink',
    component: () => import('../views/ajax/Link.vue')
  },
  {
    // http://localhost:8080/#/ajax/Link
    path: '/ajax/filter',
    name: 'MyFilter',
    component: () => import('../views/ajax/MyFilter.vue')
  }
];

const router = new VueRouter({
  routes
});

export default router;
