// 自定义插件
let myplugins = {};

// 必须实现install方法,该方法会传入Vue原型对象
myplugins.install = function(Vue) {
  // 对vue原型进行扩展
  Vue.prototype.$testInfo = '蜘蛛侠老胡的vue插件';

  Vue.prototype.$testMethod = function(info) {
    console.log('插件中的方法：', info);
    console.log('插件中的this：', this);
  };

  // vue插件解决回调this不再指向vue实例的方法
  Vue.prototype.$testCallBack = function(info, cb) {
    // function对象.call(this对象，参数列表)
    // 也就是说call方法可以置换function对象的this指向
    let app = this;
    cb.call(app, info);
    // cb(info);
  };
};

export default myplugins;
