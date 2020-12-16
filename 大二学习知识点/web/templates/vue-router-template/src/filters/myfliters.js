// 自定义filter(过滤器)
// 导入vue核心api
import Vue from 'vue';
import tools from '../js/tools';
// 第一步：定义filter
Vue.filter('formatDate', function(value, format) {
  // 过滤器的第一个参数，就是vue页面传入的值(也就是 | formatDate前面的对象值)
  // 记住：在页面上调用时，只需要传入2-n位置的参数，因为第一个固定为值
  console.log('filter formatDate:', value);
  return tools.formatDate(value, format);
});

// 部门id换算成部门名称的过滤器，必须传入部门列表
Vue.filter('deptInfo', function(value, deptList) {
  let deptName = '';
  // 通过循环查找部门id对应的部门名称
  for (let i = 0; i < deptList.length; i++) {
    let dept = deptList[i];
    if (dept.deptId == value) {
      deptName = dept.deptName;
      break;
    }
  }
  return deptName;
});
