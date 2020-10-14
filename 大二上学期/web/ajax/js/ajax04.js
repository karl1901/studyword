console.log('in ajax04.js...');

//通过ajax查询后端数据并添加到table中
//查询带有分页的参数
let page = {
  pageNumber: 1,
  pageSize: 5,
};

let tbData = document.getElementById('tbData');

function query() {
  huhuiyu.ajax(
    '/exam/goods/queryAll',
    {
      page: page,
    },
    function (data) {
      console.log('服务器查询的应答结果', data);
      //如果没有正确应答就不要继续处理信息
      if (!data.success) {
        alert(data.message);
        return;
      }
      //清理掉原有的信息
      tbData.innerHTML = '';
      //后端数据处理
      //商品信息是在应答的data.resultData.list字段
      console.log('商品信息', data.resultData.list);
      let list = data.resultData.list;
      //循环处理商品信息
      for (let i = 0; i < list.length; i++) {
        let goods = list[i];
        console.log('单一的商品信息', goods);
        //一个商品就是一行信息
        let tr = document.createElement('tr');
        let td = document.createElement('td');
        td.append(goods.gname);
        tr.append(td);

        td = document.createElement('td');
        td.append(goods.ginfo);
        tr.append(td);

        td = document.createElement('td');
        td.append(goods.price);
        tr.append(td);

        td = document.createElement('td');
        td.append(goods.amount);
        tr.append(td);

        td = document.createElement('td');
        let button = document.createElement('button');
        button.append('修改');
        td.append(button);
        tr.append(td);

        tbData.append(tr);
        // <tr>
        //   <td>可口可乐</td>
        //   <td>好喝的可乐</td>
        //   <td>1.9</td>
        //   <td>12345</td>
        //   <td>
        //     <button>修改</button>
        //   </td>
        // </tr>;
      }
    }
  );
}

let selPageSize = document.getElementById('selPageSize');

//当分页下拉值变化的时候修改分页的大小并查询
selPageSize.addEventListener('change', function () {
  page.pageSize = selPageSize.value;
  page.pageNumber = 1;
  query();
});

//利用json的数组来初始化分页大小信息
let pageSizeList = [
  { value: 5, text: '每页5笔' },
  { value: 10, text: '每页10笔' },
];

let selJson=document.getElementById('selJson');
for (let a=0;a<pageSizeList.length;a++){
  let jsonData=pageSizeList[a];
  let op=document.createElement('option');
  op.setAttribute('value',jsonData.value);
  op.append(jsonData.text);
  selJson.append(op);
}

query();
