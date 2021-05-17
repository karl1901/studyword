// 门户信息管理页面路由配置
const routes = [
  {
    path: '/portable/home',
    name: 'Home',
    component: () => import('../views/portable/Home.vue')
  }
];

export default routes;
