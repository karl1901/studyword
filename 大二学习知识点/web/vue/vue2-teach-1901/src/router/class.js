// 班级和学生信息管理路由配置
const routes = [
  {
    path: '/class/class',
    name: 'ClassClass',
    component: () => import('../views/class/Class.vue')
  },
  {
    path: '/class/stu',
    name: 'ClassStu',
    component: () => import('../views/class/Stu.vue')
  }
];

export default routes;
