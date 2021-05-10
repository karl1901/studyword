<template>
  <div>
    <div>富文本编辑器组件封装</div>
    <my-editor-comp @data-change="editorChange"></my-editor-comp>
    <div v-html="editorData"> </div>
  </div>
</template>

<script>
import MyEditorComp from '../../components/MyEditor';
export default {
  name: 'MyEditor',
  components: {
    MyEditorComp
  },
  data() {
    return {
      editorData: ''
    };
  },
  methods: {
    editorChange(data) {
      this.editorData = data;
    }
  }
};
</script>
