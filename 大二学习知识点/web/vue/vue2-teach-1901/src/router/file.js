// 文件管理路由配置
const routes = [
  {
    path: '/file/home',
    name: 'FileManage',
    component: () => import('../views/file/Home.vue')
  }
];

export default routes;
