const router = [
  {
    path: '/vant',
    name: 'VantHome',
    component: () => import('../views/vant/Home.vue')
  },
  {
    path: '/vant/popup',
    name: 'VantPopup',
    component: () => import('../views/vant/Popup.vue')
  }
];

export default router;
