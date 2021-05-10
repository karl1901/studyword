// 文件管理路由配置
const routes = [
  {
    path: '/file/home',
    name: 'FileManage',
    component: () => import('../views/file/Home.vue')
  },
  {
    path: '/file/wangeditor',
    name: 'FileWangEditor',
    component: () => import('../views/file/WangEditor.vue')
  },
  {
    path: '/file/myeditor',
    name: 'FileMyEditor',
    component: () => import('../views/file/MyEditor.vue')
  }
];

export default routes;
