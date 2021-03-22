import Vue from 'vue';
import VueRouter from 'vue-router';
// 测试页面路由配置
import test_routes from './test';
// 用户页面路由配置
import user_routes from './user';
// 用户页面路由配置
import euser_routes from './euser';
// 数据联动路由配置
import link_routes from './link';
// 员工信息相关路由配置
import employee_routes from './employee';

Vue.use(VueRouter);

// 路由配置信息
const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('../views/Home.vue')
  }
]
  .concat(test_routes)
  .concat(user_routes)
  .concat(euser_routes)
  .concat(link_routes)
  .concat(employee_routes);

const router = new VueRouter({
  routes
});

export default router;
