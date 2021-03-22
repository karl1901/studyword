// 员工信息相关路由配置
const routes = [
  {
    path: '/employee/dept',
    name: 'Dept',
    component: () => import('../views/employee/Dept.vue')
  },
  {
    path: '/employee/employee',
    name: 'Dept',
    component: () => import('../views/employee/Employee.vue')
  }
];

export default routes;
