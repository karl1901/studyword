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
// 班级和学生信息管理
import class_routes from './class';
// 文件管理路由配置
import file_routes from './file';
// 地图路由配置
import map_basic from './map';
// 门户信息管理配置
import portable_routes from './portable';

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
  .concat(employee_routes)
  .concat(class_routes)
  .concat(file_routes)
  .concat(map_basic)
  .concat(portable_routes);

const router = new VueRouter({
  routes
});

export default router;
