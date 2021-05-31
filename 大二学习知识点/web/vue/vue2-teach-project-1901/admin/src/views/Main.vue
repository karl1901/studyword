<template>
  <div>
    <div class="title">用户首页</div>
    <!-- 跳转菜单 -->
    <div>
      <span v-for="m in menus" :key="m.path" @click="toPage(m.path)">
        <span>{{ m.text }}</span>
      </span>
    </div>
    <hr />
    <!-- 页面切换 -->
    <div>
      <span v-for="m in menus" :key="m.path" @click="changePage(m.path)">
        <span>{{ m.text }}</span>
      </span>
    </div>
    <hr />
    <div v-if="menu == '/manage/one'">
      <manage-one></manage-one>
    </div>
    <div v-if="menu == '/manage/two'">
      <manage-two></manage-two>
    </div>
    <div v-if="menu == '/manage/portable'">
      <manage-portable></manage-portable>
    </div>
  </div>
</template>

<script>
import ManageOne from './manage/One';
import ManageTwo from './manage/Two';
import ManagePortable from './manage/Portable';
export default {
  name: 'Test',
  components: { ManageOne, ManageTwo, ManagePortable },
  data() {
    return {
      menu: '',
      menus: [
        {
          path: '/manage/portable',
          text: '门户信息管理'
        },
        {
          path: '/manage/one',
          text: '管理页面一'
        },
        {
          path: '/manage/two',
          text: '管理页面二'
        }
      ]
    };
  },
  methods: {
    changePage(path) {
      this.menu = path;
    },
    toPage(path) {
      this.$router.push(path);
    }
  }
};
</script>
<style scoped>
.title {
  text-align: center;
  font-size: 1.4rem;
  margin-top: 1rem;
}
</style>
