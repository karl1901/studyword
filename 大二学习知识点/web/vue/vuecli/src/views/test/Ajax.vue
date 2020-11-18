<template>
  <div>
    <div>{{ title }}</div>
    <div>
      <input type="text" v-model="echo" />
      <button @click="send">发送ajax请求</button>
      <pre>{{ result }}</pre>
    </div>
  </div>
</template>

<script>
import tools from '../../js/tools';
export default {
  name: 'TestAjax',
  data() {
    return {
      title: 'ajax测试',
      echo: '',
      result: {}
    };
  },
  methods: {
    send() {
      // js的this默认指向都是当前function
      // 而vue的api里面的function的this会被替换成vue当前实例
      // 所以下面this指向就是当前vue实例
      console.log('在vue方法中的this：', this);
      // 在正确的地方记录vue实例对象
      let app = this;
      tools.ajax('/', { echo: this.echo }, function(data) {
        // 回调的function会将this指向自己，所以下面的this指向是回调的function
        console.log('ajax回调方法中的this：', this);
        // 用正确的app变量方法vue实例对象
        app.result = data;
      });
    }
  }
};
</script>
