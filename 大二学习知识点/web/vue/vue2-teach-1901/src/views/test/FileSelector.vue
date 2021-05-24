<template>
  <div>
    <div>文件选择组件测试</div>
    <div>
      <el-button @click="fileVisible = true">浏览文件</el-button>
      {{ file }}
    </div>
    <div>
      <el-dialog :close-on-click-modal="false" :visible.sync="fileVisible" title="文件选择对话框">
        <div>
          <file-choose @file-selected="fileSelected"></file-choose>
        </div>
      </el-dialog>
    </div>
  </div>
</template>

<script>
import FileChoose from '../../components/FileChoose.vue';
export default {
  components: { FileChoose },
  name: 'TestFileSelector',
  data() {
    return {
      fileVisible: false,
      file: {}
    };
  },
  methods: {
    fileSelected(file) {
      this.file = file;
      this.fileVisible = false;
    }
  }
};
</script>
