<template>
  <div>
    <div
      >测试首页
      <i class="iconfont">&#xe64e;</i>
      <el-input v-model="echo"></el-input>
      <el-button type="success" @click="ajaxTest">ajax测试</el-button>
    </div>
    <div>
      {{ result }}
    </div>
  </div>
</template>

<script>
export default {
  name: 'Test',
  data() {
    return {
      echo: '',
      result: {}
    };
  },
  methods: {
    ajaxTest() {
      this.$ajax('/', { echo: this.echo }, function(data) {
        this.result = data;
      });
    }
  }
};
</script>
