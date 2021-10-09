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

<title>购物系统-用户注册</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet"
	href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
<style type="text/css">
/* 注册表单样式 */
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
/* 注册表单按钮样式 */
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
			</el-form-item> <el-form-item> <!-- 			用户昵称输入框 --> <el-input
				placeholder="用户昵称" v-model="name"></el-form-item> <el-form-item>
			<!-- 			账号输入框 --> <el-input placeholder="账号" v-model="zh"></el-form-item>
			<el-form-item> <!-- 				密码输入框 --> <el-input
				placeholder="密码" v-model="pwd" show-password></el-form-item> <el-form-item>
			<!-- 				确认密码输入框 --> <el-input placeholder="确认密码" v-model="pwd2"
				show-password></el-form-item> <el-form-item> <!-- 				出生日期选择器 -->
			<el-date-picker v-model="date" type="date" placeholder="选择出生日日期"
				format="yyyy 年 MM 月 dd 日" value-format="yyyy-MM-dd">
			</el-date-picker> </el-form-item> <el-form-item> <!-- 				性别选择器 --> <el-select
				v-model="sex" placeholder="请选择性别"> <el-option
				v-for="s in sexs" :key="s.value" :label="s.value" :value="s.value">
			</el-option> </el-select> </el-form-item> <el-form-item> <!-- 				电话号码输入框 --> <el-input
				placeholder="电话号码" v-model="tel"></el-form-item> <el-form-item>
			<!-- 				收获地址输入框 --> <el-input placeholder="收货地址" v-model="addres"></el-form-item>
			<el-form-item>
			<div class="btns">
				<!-- 			登录表单按钮 -->
				<el-button type="success" @click="reg">注册</el-button>
				<el-button type="warning" @click="reset">重填</el-button>
			</div>
			</el-form-item> <el-form-item>
			<div class="btns">
				<!-- 			登录页面跳转按钮 -->
				<a href="index.jsp">已有账号？去登录</a>
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
				title : '用户注册',
				// 				昵称
				name : '',
				// 				账号
				zh : '',
				// 				密码
				pwd : '',
				// 				确认密码
				pwd2 : '',
				// 				出生日期
				date : '',
				// 				性别
				sex : '',
				// 				性别集合
				sexs : [
					{
						value : '男'
					},
					{
						value : '女'
					}
				],
				// 				电话号码
				tel : '',
				// 				收货地址
				addres : ''
			}
		},
		methods : {
			// 		登录的方法
			reg () {
				// 			校验表单填写不能为空
				if (this.name == '') {
					this.$message({
						showClose : true,
						message : '用户昵称不能为空!',
						type : 'warning'
					})
					return;
				}
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
				if (this.pwd2 == '') {
					this.$message({
						showClose : true,
						message : '确认密码必须填写!',
						type : 'warning'
					})
					return;
				}
				if (this.date == '') {
					this.$message({
						showClose : true,
						message : '出生日期必须选择!',
						type : 'warning'
					})
					return;
				}
				if (this.sex == '') {
					this.$message({
						showClose : true,
						message : '性别必须选择!',
						type : 'warning'
					})
					return;
				}
				if (this.tel == '') {
					this.$message({
						showClose : true,
						message : '电话号码必须填写!',
						type : 'warning'
					})
					return;
				}
				if (this.addres == '') {
					this.$message({
						showClose : true,
						message : '收货地址必须填写!',
						type : 'warning'
					})
					return;
				}
				if (this.pwd != this.pwd2) {
					this.$message({
						showClose : true,
						message : '两次输入的密码不一致!',
						type : 'warning'
					})
					return;
				}
				// 				把用户选择的出生日期转化成年龄
				// 				获取当前日期
				var nowTime = new Date();
				var nowYear = nowTime.getFullYear();
				var nowMonth = nowTime.getMonth() + 1;
				var nowDate = nowTime.getDate();
				// 				切割获取选择的年月日
				var strs = [];
				strs = this.date.split("-");
				// 				声明年龄
				var age = 0;
				// 				通过判断获取年龄
				if (strs[0] > nowYear) {
					this.date = '';
					this.$message({
						showClose : true,
						message : '出生年份不能大于当前年份，请重新选择!',
						type : 'warning'
					})
					return;
				}
				if (strs[0] >= nowYear && strs[1] > nowMonth) {
					this.date = '';
					this.$message({
						showClose : true,
						message : '出生月份不能大于当前月份，请重新选择!',
						type : 'warning'
					})
					return;
				}
				if (strs[0] >= nowYear && strs[1] >= nowMonth && strs[2] > nowDate) {
					this.date = '';
					this.$message({
						showClose : true,
						message : '出生日期不能大于当前日期，请重新选择!',
						type : 'warning'
					})
					return;
				}
				if (strs[0] == nowYear) {
					age = 0;
				} else {
					if (strs[1] < nowMonth && strs[2] < nowDate) {
						age = nowYear - strs[0] - 1;
					} else {
						if (strs[1] >= nowMonth && strs[2] > nowDate) {
							age = nowYear - strs[0] - 1;
						} else {
							age = nowYear - strs[0];
						}
					}
				}
				// 				跳转注册处理页面(带参)
				location.href = "reg.do?name=" + this.name + "&zh=" + this.zh + "&pwd=" + this.pwd + "&age=" + age
				+ "&sex=" + this.sex + "&tel=" + this.tel + "&addres=" + this.addres;
				// 				清空表单
				this.reset();
			},
			// 			重填的方法
			reset () {
				this.name = ''
				this.zh = '';
				this.pwd = '';
				this.pwd2 = '';
				this.date = '';
				this.sex
				this.tel = '';
				this.addres = '';
			}
		}
	})
</script>

</html>
