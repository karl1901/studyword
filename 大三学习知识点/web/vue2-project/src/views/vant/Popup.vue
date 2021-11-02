<template>
  <div>
    <!-- 标题 -->
    <div class="pd10 tc">{{ title }}</div>

    <!-- 按钮 -->
    <div class="pd10">
      <van-button type="info" @click="showToast">toast</van-button>
      &nbsp;
      <van-button type="warning" @click="showPopup('karl')">popup</van-button>
    </div>

    <!-- 弹出框内容提交表单 -->
    <div>
      <div class="pd10 tc">弹出框提交表单</div>
      <van-field
        label="标题"
        v-model="dialogTitle"
        placeholder="请输入标题"
      ></van-field>
      <van-field
        label="内容"
        v-model="dialogInfo"
        placeholder="请输入内容"
      ></van-field>
      <div class="dia">
        <van-button type="danger" @click="showDialog"
          >dialog-打开弹出框</van-button
        >
      </div>
    </div>

    <!-- popup弹出层 -->
    <div>
      <van-popup v-model="show" closeable round position="right">
        <div class="popup-box">
          <div>
            {{ showInfo }}
          </div>
        </div>
      </van-popup>
    </div>
  </div>
</template>

<script>
export default {
  name: 'VantPopup',
  data() {
    return {
      title: '有赞ui弹出层',
      show: false,
      showInfo: '',
      dialogTitle: '',
      dialogInfo: ''
    };
  },
  methods: {
    showDialog() {
      this.$dialog.alert({
        message: this.dialogInfo,
        title: this.dialogTitle
      });
      this.dialogTitle = '';
      this.dialogInfo = '';
    },
    showPopup(info) {
      this.showInfo = info;
      this.show = true;
    },
    showToast() {
      this.$toast.loading({
        message: '加载中...'
      });
    }
  }
};
</script>
<style lang="less" scoped>
.popup-box {
  height: 100vh;
  width: 60vw;
  display: flex;
  align-items: center;
  // .popup-box > div
  > div {
    width: 100%;
    text-align: center;
    // .popup-box > div:hover
    &:hover {
      color: red;
    }
  }
}

.dia {
  display: flex;
  justify-content: center;
  padding-top: 1rem;
}
</style>
