console.log('in js05.js...');

let selNian = document.getElementById('selNian');
let selYue = document.getElementById('selYue');
let selRi = document.getElementById('selRi');
console.log(selNian, selYue, selRi);

// 动态创建年份下拉列表值
for (let i = 1970; i <= new Date().getFullYear(); i++) {
  let op = document.createElement('option');
  op.setAttribute('value', i);
  op.append(i + '年');
  selNian.append(op);
}

// selectedIndex是select元素特有属性，表示选中的索引值(第几页)
// options是select中所有的option (数组)
selNian.selectedIndex = selNian.options.length / 2;

// for(变量初始化;是否执行循环的逻辑表达式;)
// {//要反复执行的代码}
// 其实这三段都是可以不写的，但是要留下分号

// 月列表
for (let i = 1; i < 13; i++) {
  let op = document.createElement('option');
  op.setAttribute('value', i);
  op.append(i + '月');
  selYue.append(op);
}

selYue.selectedIndex = 5;

// 带名称的function
function changeInfo() {
  // 获取年月的输入值
  let nian = selNian.value;
  let yue = selYue.value;
  console.log('输入的年月:', nian, yue);
  // 计算日期
  let run = nian % 400 == 0 || (nian % 4 == 0 && nian % 100 != 0);
  let days = 31;
  if (yue == 4 || yue == 6 || yue == 9 || yue == 11) {
    days = 30;
  } else if (run && yue == 2) {
    days = 29;
  } else if (yue == 2) {
    days = 28;
  }
  // 日期列表
  for (let i = 1; i <= days; i++) {
    let op = document.createElement('option');
    op.setAttribute('value', i);
    op.append(i + '日');
    selRi.append(op);
  }
  selRi.selectedIndex = selRi.options.length / 2;
}

// 年月变化引发日期列表变化
selNian.addEventListener('change', changeInfo);

selYue.addEventListener('change', changeInfo);

// 直接调用function,注意不要掉了()
changeInfo();

// 九九乘法表
let tb99 = document.getElementById('tb99');
for (let i = 1; i < 10; i++) {
  // 行
  let tr = document.createElement('tr');
  tb99.append(tr);
  for (let j = 1; j <= i; j++) {
    //列
    let td = document.createElement('td');
    tr.append(td);
    td.append(j + '*' + i + '=' + j * i);
  }
}

// 流程控制if for可以任意嵌套使用! ! !
