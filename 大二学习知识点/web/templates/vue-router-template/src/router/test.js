// 测试用路由配置文件
const routes = [
  {
    path: '/test',
    name: 'TestHome',
    component: () => import('../views/test/Home.vue')
  },
  {
    path: '/test/tools',
    name: 'TestTools',
    component: () => import('../views/test/Tools.vue')
  },
  {
    path: '/test/myapi',
    name: 'TestMyApi',
    component: () => import('../views/test/MyApi.vue')
  }
];

export default routes;
