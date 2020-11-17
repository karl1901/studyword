<template>
  <div>
    <div>
      <a href="/#/">返回</a>
    </div>
    {{ title }}
    <div>
      <!-- blur丢失焦点触发，focus获取焦点触发 -->
      <input type="text" v-model="user.name" />
      <input type="text" v-model="user.pwd" />
      <button @click="login">确定</button>
      <!-- class属性的注入可以是数组 -->
      <pre :class="[check ? 'success' : 'error']">
         {{ user }}-{{ check }}
      </pre>
      <hr />
      <!-- if和if阶梯 -->
      <div v-if="user.name == ''" class="error">
        请输入用户名
      </div>
      <div v-if="user.pwd == ''" class="error">
        请输入密码
      </div>
      <hr />
      <div v-if="user.name == ''" class="error">
        请输入用户名
      </div>
      <div v-else-if="user.pwd == ''" class="error">
        请输入密码
      </div>
      <div v-else>
        输出正确
      </div>
    </div>
  </div>
</template>

<script>
// vue组件使用新版本js的export管理，不需要创建vue实例
export default {
  // 实例绑定给template里面元素，不再需要el
  name: 'V01',
  // data必须是function模式，返回值就是json格式数据
  data() {
    return {
      title: 'vue基础复习一',
      user: {
        name: '',
        pwd: ''
      },
      check: false
    };
  },
  methods: {
    // 所有的function都可以简写掉function关键字
    login() {
      this.check = this.user.name.trim() != '' && this.user.pwd.trim() != '';
    }
  }
};
</script>
<style scoped>
.success {
  color: #009900;
}
.error {
  color: #ff0000;
}
</style>
