console.log('in js08.js....');

// 两种类型的function
// 第一类，就是执行function中的代码
function fun01() {
  console.log('执行fun01中的内容');
}

//调用就是：function名称();
fun01();
fun01();

// 第二类，带有返回结果值的funcion
function fun02() {
  let now = new Date();
  console.log(now);
  let sec = now.getSeconds();
  // retrun 表示中断当前function的执行
  //如果return后面有值，表示调用function的地方可以获取到该值
  if (sec % 2 == 1) {
    return '是';
  } else {
    return '否';
  }
}

// 可以不关注返回值
fun02();
// 获取function的返回结果
let result = fun02();
console.log('fun02的结果', result);

//任务，传入一个值，判断是否为整数
// 是就返回整数值，否就是返回false

//function function名称(形式参数的名称...){
//通过形式参数的名称获取到实际的参数值
//}
function checkInt(str) {
  console.log('传入的str为：', str);
  //str 不存在的情况
  if (!str) {
    return false;
  }
  //不是数的情况
  if (isNaN(str)) {
    return false;
  }
  let numf = parseFloat(str);
  let numi = parseInt(str);
  //转整数和小数的值相等的就是整数
  if ((numf = numi)) {
    return numi;
  }
  return false;
}

checkInt();
//调用带参数的function是要给定实际的参数值
checkInt('abc');
checkInt(false);

let txt01 = document.getElementById('txt01');
let btn01 = document.getElementById('btn01');
let sp01 = document.getElementById('sp01');

btn01.addEventListener('click', function () {
  let num = txt01.value;
  let result = checkInt(num);
  sp01.innerHTML = '输入的值检测结果' + result;
});

