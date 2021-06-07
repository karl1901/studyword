<template>
  <div class="login-form" v-loading="loading">
    <el-card class="box-card ys">
      <div slot="header">
        用户登录
      </div>
      <div>
        <el-form :model="formdata" :rules="rules" ref="myform">
          <el-form-item prop="tbUser.username">
            <el-input v-model="formdata.tbUser.username" placeholder="登录名">
              <i slot="prefix" class="el-input__icon el-icon-user"></i>
            </el-input>
          </el-form-item>

          <el-form-item prop="tbUser.password">
            <el-input type="password" show-password v-model="formdata.tbUser.password" placeholder="密码">
              <i slot="prefix" class="el-input__icon el-icon-lock"></i>
            </el-input>
          </el-form-item>

          <el-form-item v-loading="imgLoading" prop="imgcode">
            <el-input v-model="formdata.imgcode" placeholder="图片校验码">
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
let app = null;
export default {
  name: 'Home',
  data() {
    return {
      loading: '',
      imgLoading: '',
      imgSrc: '',
      formdata: {
        imgcode: '',
        tbUser: {
          username: '',
          password: ''
        }
      },
      rules: {
        imgcode: [
          {
            required: true,
            message: '图片校验码必须填写'
          },
          {
            len: 5,
            message: '图片校验码长度是5个'
          }
        ],
        'tbUser.username': [
          {
            required: true,
            message: '用户名必须填写'
          },
          {
            min: 3,
            max: 15,
            message: '用户名长度是3-15'
          }
        ],
        'tbUser.password': {
          validator: function(rule, value, cb) {
            app.$regValidate(rule, value, cb, /^[A-Za-z0-9]{5,14}$/, '密码是长度为3-14的字符数字');
          }
        }
      }
    };
  },
  methods: {
    logreg() {
      this.$router.push('/euser/reg');
    },
    loadkong() {
      this.formdata.tbUser = {
        username: '',
        password: ''
      };
      this.formdata.imgcode = '';
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
      this.loading = true;
      this.formdata.tbUser.password = this.$md5(this.formdata.tbUser.password);
      this.$ajax(
        '/user/login',
        {
          imgcode: this.formdata.imgcode,
          tbUser: this.formdata.tbUser
        },
        function(data) {
          this.loading = false;
          this.formdata.tbUser.password = '';
          if (data.success) {
            this.$router.push('/main');
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
    app = this;
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
  width: 20rem;
  height: 28rem;
}

.jz {
  display: flex;
  width: 100%;
  justify-content: center;
}
</style>
