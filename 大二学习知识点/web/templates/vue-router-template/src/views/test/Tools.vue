<template>
  <div>
    <div>{{ title }}</div>
    <div> 格式化日期：{{ date1 }}--{{ date2 }} </div>
    <div>
      md5加密：
      <input type="text" v-model="info" />
      {{ md5info }}
    </div>
    <div>
      ajax请求：
      <input type="text" v-model="echo" />
      <button @click="send">发送</button>
      <pre>
        {{ result }}
      </pre>
    </div>
  </div>
</template>

<script>
import tools from '../../js/tools';
export default {
  name: 'TestTools',
  data() {
    return {
      title: '测试tools.js' + tools.name,
      date1: tools.formatDate(new Date()),
      date2: tools.formatDate(new Date(), 'yyyy年MM月dd日'),
      info: '',
      echo: '',
      result: ''
    };
  },
  methods: {
    send() {
      let app = this;
      tools.ajax('/', { echo: this.echo }, function(data) {
        app.result = data;
      });
    }
  },
  computed: {
    md5info() {
      return tools.md5(this.info);
    }
  }
};
</script>
