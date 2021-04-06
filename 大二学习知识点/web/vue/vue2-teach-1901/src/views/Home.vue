<template>
  <div>
    <div>
      {{ title }}
    </div>
    <hr />
    ==user==
    <button @click="userlogin">登录</button>
    ==
    <button @click="userreg">注册</button>
    <hr />
    ==test==
    <button @click="testajax">ajax</button>
    ==
    <button @click="testele">element</button>
    ==
    <button @click="testtools">tools</button>
    ==
    <button @click="testmycomp">mycomp</button>
    ==
    <button @click="testmyothercomp">myothercomp</button>
    <hr />
    ==link==
    <button @click="linklinks">links</button>
    <hr />
    ==euser==
    <button @click="euserlogin">登录</button>
    ==
    <button @click="euserreg">注册</button>
    <hr />
    ==employee==
    <button @click="employeedept">部门管理</button>
    ==
    <button @click="employeeemp">员工管理</button>
    <hr />
    ==class==
    <button @click="classcla">班级管理</button>
    ==
    <button @click="classstu">学生管理</button>
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
    }
  }
};
</script>
