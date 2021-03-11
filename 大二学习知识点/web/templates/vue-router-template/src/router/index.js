import Vue from 'vue';
import VueRouter from 'vue-router';
// 导入测试路由配置
import test from './test';
// 导入错误路由配置
import error from './error';
// 员工管理路由配置
import employee from './employee';
// 用户管理路由配置
import user from './user';

Vue.use(VueRouter);

// 错误处理的路由一定要最后加入
const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('../views/Home.vue')
  }
]
  .concat(user)
  .concat(employee)
  .concat(test)
  .concat(error)
  .concat([
    // path位*表示匹配任意路径，所以一定要在最后
    // redirect表示匹配后转向到对应的路由路径
    {
      path: '*',
      redirect: '/error/404'
    }
  ]);

const router = new VueRouter({
  routes
});

export default router;
