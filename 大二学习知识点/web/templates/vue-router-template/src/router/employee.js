// 员工管理路由配置文件
const routes = [
  {
    path: '/employee/dept',
    name: 'Dept',
    component: () => import('../views/employee/Dept.vue')
  },
  {
    path: '/employee/emp',
    name: 'Emp',
    component: () => import('../views/employee/Emp.vue')
  }
];

export default routes;
