// 导入npm安装的第三方库qs
import qs from 'qs';
// 导入npm安装的第三方库qs
import axios from 'axios';

// 测试用js

let test = {
  show() {
    console.log('测试用js', qs.stringify({ info: '万伟手残' }), axios);
  }
};

export default test;
