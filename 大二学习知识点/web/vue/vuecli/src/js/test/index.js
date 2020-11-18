// 导入npm安装的第三方库qs
import qs from 'qs';
// 导入npm安装的第三方库qs
import axios from 'axios';
import tools from '../tools';

// 测试用js

let test = {
  show() {
    console.log('测试用js', qs.stringify({ info: '袁洪涛手残' }), axios);
    // 测试ajax
    tools.ajax('/', { echo: new Date().getTime() }, function(data) {
      console.log('应答结果：', data);
    });
    // 测试动态参数
    test.args('袁洪涛', 100);
    test.args({ name: 'abc', id: 100 });
    test.args();
  },
  // 新知识点，动态参数
  args() {
    console.log('js获取动态参数信息：', arguments.length, arguments);
    // json信息获取
    let params = { id: 100, name: '黑暗骑士', info: function() {} };
    console.log('获取json信息');
    // json的 json.id的等同语句json['id']
    for (let key in params) {
      console.log(key, params[key]);
    }
  }
};

export default test;
