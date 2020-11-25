<template>
  <div>
    <div>{{ title }}</div>
    <div>
      <!-- {{ plist }} -->
      {{ pid }}
      {{ cid }}
      <!-- {{ clist }} -->
      <select v-model="pid" @change="queryCity">
        <option v-for="p in plist" :key="p.pid" :value="p.pid">{{ p.province }}</option>
      </select>
      <select v-model="cid">
        <option v-for="c in clist" :key="c.cid" :value="c.cid">{{ c.city }}</option>
      </select>
    </div>
  </div>
</template>

<script>
import tools from '../../js/tools';
export default {
  name: 'AjaxLink',
  data() {
    return {
      title: 'ajax联动',
      // 省份列表
      plist: [],
      // 选中的省份id
      pid: -1,
      // 城市列表
      clist: [],
      // 选中城市
      cid: -1
    };
  },
  methods: {
    queryAllProvince() {
      // 查询省份信息
      let app = this;
      tools.ajax('/linkinfo/queryAllProvince', {}, function(data) {
        if (data.success) {
          app.plist = data.resultData.list;
          // 默认选中第一项
          app.pid = app.plist[17].pid;
          // 联动查询城市
          app.queryCity();
        } else {
          alert(data.message);
        }
      });
    },
    queryCity() {
      // 按照省份查询对应城市信息
      let app = this;
      tools.ajax(
        '/linkinfo/queryCityByProvince',
        {
          'tbCity.pid': app.pid
        },
        function(data) {
          if (data.success) {
            app.clist = data.resultData.list;
            app.cid = app.clist[6].cid;
          } else {
            alert(data.message);
          }
        }
      );
    }
  },
  created() {
    // 启动就立即查询省份信息
    this.queryAllProvince();
  }
};
</script>
