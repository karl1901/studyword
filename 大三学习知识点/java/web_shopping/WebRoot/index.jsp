<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>购物系统-用户登录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet"
	href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
<style type="text/css">
/* 登录表单样式 */
.login-form {
	display: flex;
	justify-content: center;
}
/* 标题样式 */
.titles {
	display: flex;
	justify-content: center;
	font-size: 1.3rem;
}
/* 登录表单按钮样式 */
.btns {
	display: flex;
	justify-content: center;
}
</style>
</head>

<body>

	<div id="app">

		<!-- 登录表单 -->
		<div class="login-form">
			<el-form> <el-form-item> <!-- 			标题 -->
			<div class="titles">
				<div>{{title}}</div>
			</div>
			</el-form-item> <el-form-item> <!-- 			账号输入框 --> <el-input
				placeholder="账号" v-model="zh"></el-form-item> <el-form-item>
			<!-- 				密码输入框 --> <el-input placeholder="密码" v-model="pwd"
				show-password></el-form-item> <el-form-item>
			<div class="btns">
				<!-- 			登录表单按钮 -->
				<el-button type="success" @click="login">登录</el-button>
				<el-button type="warning" @click="reset">重填</el-button>
			</div>
			</el-form-item> <el-form-item>
			<div class="btns">
				<!-- 			注册页面跳转按钮 -->
				<a href="reg.jsp">没有账号？去注册</a>
			</div>
			</el-form-item> </el-form>
		</div>

	</div>

</body>

<script src="https://unpkg.com/vue/dist/vue.js"></script>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
	new Vue({
		el : '#app',
		data : function() {
			return {
				// 			标题
				title : '用户登录',
				// 				账号
				zh : '',
				// 				密码
				pwd : ''
			}
		},
		methods : {
			// 		登录的方法
			login () {
				// 			校验表单填写不能为空
				if (this.zh == '') {
					this.$message({
						showClose : true,
						message : '账号不能为空!',
						type : 'warning'
					})
					return;
				}
				if (this.pwd == '') {
					this.$message({
						showClose : true,
						message : '密码必须填写!',
						type : 'warning'
					})
					return;
				}
				// 				跳转登录处理页面(带参)
				location.href = "login.do?zh=" + this.zh + "&pwd=" + this.pwd;
				// 				清空表单
				this.reset();
			},
			// 			重填的方法
			reset () {
				this.zh = '';
				this.pwd = '';
			}
		}
	})
</script>

</html>
