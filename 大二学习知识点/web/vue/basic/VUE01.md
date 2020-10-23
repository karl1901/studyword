# vue入门

- [vue官方网站](https://cn.vuejs.org/)
- [中文cdn网站](https://www.bootcdn.cn/)

---

- 查找vue的cdn地址

---

打开上面的中文cdn网站

---

![img](/basic/image/微信截图_20201023092934.png)

- vue初始构建流程

---

html中导入vue的js：`<script src="js/vue.min.js"></script>`

---

页面的js添加vue初始化代码

```javascript
new Vue({
  el:'#app',
  data:{
    welcome:'哈哈哈'
  }
})
```

---

页面代码

```html
   <div id="app">{{welcome}}<\div>
```

---

![img](/basic/image/微信截图_20201023094139.png)