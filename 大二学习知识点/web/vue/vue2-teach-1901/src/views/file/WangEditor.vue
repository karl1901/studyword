<template>
  <div>
    <div class="title">WangEditor富文本编辑器演示</div>
    <!-- 富文本编辑器区域 -->
    <div class="wang-editor-container">
      <div></div>
    </div>
    <!-- 值显示 -->
    <textarea cols="80" rows="8" v-model="data" readonly></textarea>
  </div>
</template>

<script>
import wangEditor from 'wangeditor';
let app;

export default {
  name: 'WangEditor',
  data() {
    return {
      editor: null,
      data: ''
    };
  },
  created() {
    app = this;
  },
  beforeDestroy() {
    if (app.editor) {
      app.editor.distroy();
      app.editor = null;
    }
  },
  mounted() {
    let editor = new wangEditor('.wang-editor-container>div');
    editor.config.onchange = function(data) {
      app.data = data;
    };
    editor.config.excludeMenus = ['video', 'table'];
    editor.create();
    app.editor = editor;
  }
};
</script>

<style scoped>
.title {
  text-align: center;
  font-size: 1.2rem;
  font-weight: bold;
}

.wang-editor-container {
  padding: 1.5rem;
}
</style>
