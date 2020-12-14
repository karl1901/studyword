// 员工管理路由配置文件
const routes = [
  {
    path: '/employee/dept',
    name: 'Dept',
    component: () => import('../views/employee/Dept.vue'),
  },
];

export default routes;
