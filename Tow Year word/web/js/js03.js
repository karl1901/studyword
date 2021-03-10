console.log('in js03.js...');

// 数组（就是一组数据）
// 特征，有大小和通过下标（索引）访问数据
// 声明数组并给出初始值
let arr01 = [1, '学习委员', 123.456];
// 获取一组页面元素
let arr02 = document.querySelectorAll('.test');
console.log('数组信息', arr01, arr02, arr02.length);
console.log('下标访问', arr01[1], arr02[2]);
// 特殊字符串和数组转换
let arr03 = [1, 22, 333];
console.log('数组拼接字符串', arr03.join('##'), arr03.join(''));
let info = '1##22##333';
let arr04 = info.split('##');
console.log('特定字符串分割成数组', arr04);
info = 'a b c d';
console.log('奇怪的方法', info.split(' ').join(''));
// json 复合的数据结构
// 格式是{key:value},key是字符串，value可以是任意类型
// 一个简单的json
let json01 = { son: 20190101, name: '蝙蝠侠' };
// 通过key获取value
console.log(json01.name);
// 复杂的json
let json02 = {
  code: 200,
  message: '应答正确',
  resultData: {
    time:190017866434,
    list: [1,22,33]
  }
};

// 不论多复杂都是一样的规则，通过 json对象.key访问
// 多层级就多个.链接
console.log('多层级获取value',json02.resultData.time);
let list = json02.resultData.list;
console.log('json的数据类型不限',list.join('-'));

// json和字符串类型转换
console.log('转到字符串格式',JSON.stringify(json02));
let strJson = '{"son":100,"name":"蝙蝠侠"}';
let json03 = JSON.parse(strJson);
console.log('字符串转json',json03.name);
