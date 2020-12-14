// 处理错误用路由配置文件
const routes = [
  {
    path: '/error/404',
    name: 'Error404',
    component: () => import('../views/error/Error404.vue')
  }
];

export default routes;
