let jsondata = {
  title: '一个数据表格',
  list: [
    { id: 100, name: '蜘蛛侠', sex: 'm' },
    { id: 101, name: '蝙蝠侠', sex: 'f' },
    { id: 102, name: '钢铁侠', sex: 'm' },
  ],
};

let title = document.getElementById('title');
let tbData = document.getElementById('tbData');

title.innerHTML = jsondata.title;

let list =jsondata.list;
for(let i=0;i<list.length;i++){
  let data =list[i];
  console.log(data);
  //生成表格
  let tr =document.createElement('tr');
  let td;
  //编号
  td =document.createElement('td');
  td.append(data.id);
  tr.append(td);
  //姓名
  td =document.createElement('td');
  td.append(data.name);
  tr.append(td);
  //性别要转换
  td = document.createElement('td');
  td.append(data.sex == 'm' ? '男' : '女');
  tr.append(td)

  tbData.append(tr);
}
