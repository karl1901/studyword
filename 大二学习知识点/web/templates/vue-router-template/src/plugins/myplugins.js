import tools from '../js/tools';
let myplugins = {};

myplugins.install = function(Vue) {
  Vue.prototype.$md5 = function(info) {
    return tools.md5(info);
  };
};

export default myplugins;
