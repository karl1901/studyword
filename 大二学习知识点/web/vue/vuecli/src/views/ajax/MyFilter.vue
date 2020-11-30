<template>
  <div>
    <div>
      <div>{{ title }}</div>
    </div>
    <div>
      <input v-model="echo" />
      <button @click="sendEcho">发送</button>
      <!-- echo成功就显示应答的时间信息 -->
      <div v-if="echoResult.success">
        {{ echoResult.resultData.time }}
        <!-- 计算属性和data中一样的访问方式 -->
        {{ echoTime }}
        <!-- 通过filter来格式化时间,如果有2-n个参数，需要括号传入 -->
        {{ echoResult.resultData.time | formatDate('yyyy年MM月dd日') }}
      </div>
      <button @click="queryProvince">获取省份信息</button>
      <table>
        <tr v-for="p in plist" :key="p.pid">
          <td>{{ p.pid }}</td>
          <td>{{ p.province }}</td>
          <!-- 第三步：通过 | 过滤器名称使用过滤器功能 -->
          <td>{{ p.lastupdate | formatDate }}</td>
        </tr>
      </table>

      <pre>
        {{ plist }}
      </pre>
      <pre>
    {{ echoResult }}
  </pre
      >
    </div>
  </div>
</template>

<script>
import tools from '../../js/tools';
export default {
  name: 'MyFilter',
  data() {
    return {
      title: 'filter入门',
      echo: '',
      echoResult: {},
      plist: []
    };
  },
  methods: {
    sendEcho() {
      let app = this;
      tools.ajax('/', { echo: this.echo }, function(data) {
        app.echoResult = data;
      });
    },
    queryProvince() {
      let app = this;
      tools.ajax('/linkinfo/queryAllProvince', {}, function(data) {
        if (data.success) {
          app.plist = data.resultData.list;
          return;
        }
        alert(data.message);
      });
    }
  },
  // 计算属性，可以对data中的数据进行运算
  computed: {
    echoTime() {
      // 格式化日期信息
      return tools.formatDate(this.echoResult.resultData.time);
    }
  }
};
</script>
