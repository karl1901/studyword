// 公用的工具类js

let tools = {
  name: '蝙蝠侠的工具类',
  // 格式化日期的方法，date为日期信息，可以是时间戳(数值)或者是Date类型
  // format为格式，不给默认为yyyy-MM-dd hh:mm:ss(年-月-日 时-分-秒)
  formatDate(date, format) {
    // 日期参数必须填写
    if (!date) {
      return '';
    }
    format = format ? format : 'yyyy-MM-dd hh:mm:ss';
    // typeof 对象,获取对象的类型名称
    // 对象 instanceof 类型：判断对象是否为指定类型
    console.log('js类型判断操作符', typeof date, date instanceof Date);
    // 日期类型的校验
    if (typeof date != 'number' && !(date instanceof Date)) {
      console.log(date + '的类型不匹配');
      return '';
    }
    // 统一转换成Date
    if (typeof date == 'number') {
      let time = new Date();
      time.setTime(date);
      date = time;
    }
    // 处理格式化
    let result = format.replace('yyyy', date.getFullYear());
    result = result.replace('MM', date.getMonth() + 1);
    result = result.replace('dd', date.getDate());
    result = result.replace('hh', date.getHours());
    result = result.replace('mm', date.getMinutes());
    result = result.replace('ss', date.getSeconds());
    return result;
  }
};

// 新版js的模块导出
export default tools;
