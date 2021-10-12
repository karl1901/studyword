<template>
  <div>
    <div>{{ title }}</div>
    <div>
      vuex的变量： {{ count }}
      <button @click="changeCount">修改vuex变量</button>
      <button @click="toOther">跳转页面</button>
    </div>
    <hr />
    <div>
      <vue-comp></vue-comp>
    </div>
  </div>
</template>

<script>
import VueComp from '../components/VueComp.vue';
export default {
  components: { VueComp },
  name: 'Vuex',
  data() {
    return {
      title: 'Vuex的测试首页'
    };
  },
  computed: {
    count() {
      return this.$store.state.count;
    }
  },
  methods: {
    changeCount() {
      this.$store.commit('addCount');
    },
    toOther() {
      this.$router.push('/vuexother');
    }
  }
};
</script>
