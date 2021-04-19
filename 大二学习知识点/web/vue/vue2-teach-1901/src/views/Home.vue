<template>
  <div>
    <div class="bt">
      {{ title }}
    </div>
    <hr />
    ==user==
    <button @click="userlogin">login-登录</button>
    ==
    <button @click="userreg">reg-注册</button>
    <hr />
    ==test==
    <button @click="testajax">ajax-ajax请求封装</button>
    ==
    <button @click="testele">element-测试饿了么ui框架</button>
    ==
    <button @click="testtools">tools-工具演示界面</button>
    ==
    <button @click="testmycomp">mycomp-测试组件</button>
    ==
    <button @click="testmyothercomp">myothercomp-动态路由切换</button>
    ==
    <button @click="testfile">file-测试文件上传</button>
    ==
    <button @click="testvalidate">validate-表单校验</button>
    <hr />
    ==link==
    <button @click="linklinks">links</button>
    <hr />
    ==euser==
    <button @click="euserlogin">login-登录</button>
    ==
    <button @click="euserreg">reg-注册</button>
    <hr />
    ==employee==
    <button @click="employeedept">dept-部门管理</button>
    ==
    <button @click="employeeemp">employee-员工管理</button>
    <hr />
    ==class==
    <button @click="classcla">class-班级管理</button>
    ==
    <button @click="classstu">stu-学生管理</button>
    <hr />
    ==file==
    <button @click="filehome">home-文件管理</button>
  </div>
</template>

<script>
export default {
  name: 'Home',
  data() {
    return { title: 'karl模板项目首页' };
  },
  methods: {
    userlogin() {
      this.$router.push('/user/login');
    },
    userreg() {
      this.$router.push('/user/reg');
    },
    testajax() {
      this.$router.push('/test/ajax');
    },
    testele() {
      this.$router.push('/test/elementui');
    },
    testtools() {
      this.$router.push('/test/tools');
    },
    testmycomp() {
      this.$router.push('/test/mycomp');
    },
    testmyothercomp() {
      this.$router.push('/test/myothercomp');
    },
    testfile() {
      this.$router.push('/test/file');
    },
    testvalidate() {
      this.$router.push('/test/validate');
    },
    linklinks() {
      this.$router.push('/link/links');
    },
    euserlogin() {
      this.$router.push('/euser/login');
    },
    euserreg() {
      this.$router.push('/euser/reg');
    },
    employeedept() {
      this.$router.push('/employee/dept');
    },
    employeeemp() {
      this.$router.push('/employee/employee');
    },
    classcla() {
      this.$router.push('/class/class');
    },
    classstu() {
      this.$router.push('/class/stu');
    },
    filehome() {
      this.$router.push('/file/home');
    }
  }
};
</script>

<style scoped>
.bt {
  text-align: center;
  font-size: 1.3rem;
  font-weight: bold;
  margin: 1rem;
}
</style>
