<template>
  <div>
    <div>{{ title }}</div>
    <div>
      <input type="text" v-model="echo" />
      <button @click="send">发送ajax请求</button>
      <hr />
      <img :src="imgcode" />
      <a @click="loadImg" href="javascript:void(0)">换一张</a>
    </div>
    <pre>{{ result }}</pre>
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
      imgcode:'',
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
    },
    loadImg() {
      // 图片校验码获取
      let app = this;
      tools.ajax(
        '/tools/imageCode',
        {},
        function(data) {
          app.result = data;
          // 应答结果中的message就是图片
          app.imgcode = data.message;
        },
        'get'
      );
    }
  }
};
</script>
