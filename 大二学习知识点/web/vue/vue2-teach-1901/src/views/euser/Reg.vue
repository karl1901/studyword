<template>
  <div class="login-form">
    <el-card class="box-card ys">
      <div slot="header">
        用户注册
      </div>
      <div>
        <el-form>
          <el-form-item>
            <el-input v-model="tbUser.username" placeholder="登录名"> </el-input>
          </el-form-item>

          <el-form-item>
            <el-input type="password" show-password v-model="tbUser.password" placeholder="密码"> </el-input>
          </el-form-item>

          <el-form-item>
            <el-input placeholder="昵称" v-model="tbUser.nickname"></el-input>
          </el-form-item>

          <el-form-item class="jz">
            <el-button type="primary" @click="reg">注册</el-button>
            <el-button type="danger" @click="reset">重填</el-button>
          </el-form-item>

          <el-form-item class="jz">
            <span>已有账号？<a href="javascript:void(0)" @click="logins">立即登录</a></span>
          </el-form-item>
        </el-form>
      </div>
    </el-card>
  </div>
</template>

<script>
export default {
  name: 'EleUserReg',
  data() {
    return {
      tbUser: {
        nickname: '',
        password: '',
        username: ''
      }
    };
  },
  methods: {
    logins() {
      this.$router.push('/euser/login');
    },
    reset() {
      this.tbUser = {
        nickname: '',
        password: '',
        username: ''
      };
    },
    reg() {
      if (this.tbUser.username.trim() == '') {
        this.$message('登录名必须填写');
      } else if (this.tbUser.password.trim() == '') {
        this.$message('密码必须填写');
      } else if (this.tbUser.nickname.trim() == '') {
        this.$message('昵称必须填写');
      } else {
        this.tbUser.password = this.$md5(this.tbUser.password);
        this.$ajax(
          '/user/reg',
          {
            tbUser: this.tbUser
          },
          function(data) {
            if (data.success) {
              this.$message(data.message);
              this.tbUser.nickname = '';
              this.tbUser.password = '';
              this.tbUser.username = '';
            } else {
              this.$message.error(data.message);
            }
          }
        );
      }
    }
  }
};
</script>

<style scoped>
.login-form {
  background-image: url('https://file.moyublog.com/d/file/2021-02-21/cef834efb32c802ea86a38821dd22e6c.jpg');
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
}

.jz {
  display: flex;
  width: 100%;
  justify-content: center;
}
</style>
