<template>
  <div class="login-form" v-loading="loading">
    <el-card class="box-card ys">
      <div slot="header">
        用户登录
      </div>
      <div>
        <el-form>
          <el-form-item>
            <el-input v-model="tbUser.username" placeholder="登录名">
              <i slot="prefix" class="el-input__icon el-icon-user"></i>
            </el-input>
          </el-form-item>

          <el-form-item>
            <el-input type="password" show-password v-model="tbUser.password" placeholder="密码">
              <i slot="prefix" class="el-input__icon el-icon-lock"></i>
            </el-input>
          </el-form-item>

          <el-form-item v-loading="imgLoading">
            <el-input v-model="imgcode" placeholder="图片校验码">
              <i slot="prefix" class="el-input__icon el-icon-picture-outline"></i>
            </el-input>
          </el-form-item>

          <el-form-item class="jz">
            <img :src="imgSrc" title="点击更换图片" @click="changeImg" />
          </el-form-item>

          <el-form-item class="jz">
            <el-button type="primary" @click="login">登录</el-button>
            <el-button type="danger" @click="loadkong">重填</el-button>
          </el-form-item>

          <el-form-item class="jz">
            <span>没有账号？<a href="javascript:void(0)" @click="logreg">立即注册</a></span>
          </el-form-item>
        </el-form>
      </div>
    </el-card>
  </div>
</template>

<script>
export default {
  name: 'EleUserLogin',
  data() {
    return {
      loading: '',
      imgLoading: '',
      imgSrc: '',
      imgcode: '',
      tbUser: {
        username: '',
        password: ''
      }
    };
  },
  methods: {
    logreg() {
      this.$router.push('/euser/reg');
    },
    loadkong() {
      this.tbUser.username = '';
      this.tbUser.password = '';
      this.imgcode = '';
      this.$ajax(
        '/tools/imageCode ',
        {},
        function(data) {
          this.imgLoading = false;
          this.imgSrc = data.message;
        },
        'get'
      );
    },
    login() {
      if (this.tbUser.username.trim() == '') {
        this.$message.error('用户名必须填写');
        return;
      }
      this.loading = true;
      this.tbUser.password = this.$md5(this.tbUser.password);
      this.$ajax(
        '/user/login',
        {
          imgcode: this.imgcode,
          tbUser: this.tbUser
        },
        function(data) {
          this.loading = false;
          this.tbUser.password = '';
          if (data.success) {
            this.$router.push('/euser/main');
          } else {
            this.changeImg();
            this.$message({
              message: data.message,
              type: 'error',
              showClose: true
            });
          }
        }
      );
    },
    changeImg() {
      this.imgLoading = true;
      this.$ajax(
        '/tools/imageCode ',
        {},
        function(data) {
          this.imgLoading = false;
          this.imgSrc = data.message;
        },
        'get'
      );
    }
  },
  created() {
    this.changeImg();
  }
};
</script>

<style scoped>
.login-form {
  background-image: url('https://cn.bing.com/th?id=OHR.WatPhraSiSanphet_ZH-CN5830557189_1920x1080.jpg&rf=LaDigue_1920x1080.jpg&pid=hp');
  background-size: cover;
  min-height: 100vh;
  min-width: 100vw;
  display: flex;
  justify-content: center;
  align-items: center;
}

.ys {
  background-color: rgba(255, 255, 255, 0.658);
  width: 22rem;
}

.jz {
  display: flex;
  width: 100%;
  justify-content: center;
}
</style>
