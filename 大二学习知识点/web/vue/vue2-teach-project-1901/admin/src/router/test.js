// 测试页面路由配置
const routes = [
  {
    path: '/test/home',
    name: 'TestHome',
    component: () => import('../views/test/Home.vue')
  }
];

export default routes;
