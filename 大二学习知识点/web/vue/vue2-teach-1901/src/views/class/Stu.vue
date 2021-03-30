<template>
  <div v-loading="loading" class="body">
    <div class="title">学生信息管理</div>
    <!-- 查询表单 -->
    <div class="selbd">
      <el-form :inline="true">
        <el-form-item>
          <el-select v-model="queryInfo.cid">
            <el-option label="===请选择班级===" :value="-1"></el-option>
            <el-option v-for="d in classList" :key="d.cid" :value="d.cid" :label="d.cname"></el-option>
          </el-select>
        </el-form-item>

        <el-form-item>
          <el-input v-model="queryInfo.sname" placeholder="学生姓名模糊查询"></el-input>
        </el-form-item>

        <el-form-item>
          <el-input v-model="queryInfo.phone" placeholder="电话模糊查询"></el-input>
        </el-form-item>

        <el-form-item>
          <el-button @click="query">查询</el-button>
          <el-button type="success" @click="addVisible = true">添加学生</el-button>
          <el-button type="success" @click="classtz">班级管理</el-button>
        </el-form-item>
      </el-form>
    </div>

    <!-- 添加的表单对话框 -->
    <div>
      <el-dialog title="添加学生" @closed="query" :visible.sync="addVisible" :close-on-click-modal="false">
        <el-form>
          <el-form-item>
            <el-select v-model="addInfo.cid">
              <el-option label="===请选择班级===" :value="-1"></el-option>
              <el-option v-for="d in classList" :key="d.cid" :value="d.cid" :label="d.cname"></el-option>
            </el-select>
          </el-form-item>

          <el-form-item>
            <el-input v-model="addInfo.sname" placeholder="学生姓名"></el-input>
          </el-form-item>

          <el-form-item>
            <el-input v-model="addInfo.address" placeholder="家庭地址"></el-input>
          </el-form-item>

          <el-form-item>
            <el-input v-model="addInfo.phone" placeholder="电话"></el-input>
          </el-form-item>

          <el-form-item>
            <el-input v-model="addInfo.qq" placeholder="QQ"></el-input>
          </el-form-item>

          <el-form-item>
            <el-input v-model="addInfo.wechat" placeholder="微信"></el-input>
          </el-form-item>

          <el-form-item>
            <el-button @click="addVisible = false">关闭</el-button>
            <el-button @click="add">保存</el-button>
          </el-form-item>
        </el-form>
      </el-dialog>
    </div>

    <!-- 员工信息表格和分页 -->
    <div class="bd">
      <el-table :data="list">
        <el-table-column label="所属班级">
          <template slot-scope="scope">
            {{ showDeptName(scope.row.cid) }}
          </template>
        </el-table-column>

        <el-table-column label="过滤器版本班级">
          <template slot-scope="scope">
            <!-- 给过滤器传入当前页面的列表给过滤器班级处理信息 -->
            {{ scope.row.cid | showDeptName(classList) }}
          </template>
        </el-table-column>

        <el-table-column label="姓名" prop="sname"></el-table-column>
        <el-table-column label="家庭地址" prop="address"></el-table-column>
        <el-table-column label="电话" prop="phone"></el-table-column>
        <el-table-column label="QQ" prop="qq"></el-table-column>
        <el-table-column label="微信" prop="wechat"></el-table-column>

        <el-table-column label="最后修改时间">
          <template slot-scope="scope">
            {{ scope.row.lastupdate | formatDate() }}
          </template>
        </el-table-column>

        <el-table-column>
          <template slot-scope="scope">
            <el-button type="danger" @click="del(scope.row)" class="bt" plain>删除</el-button>
            <el-button type="primary" @click="showModify(scope.row)" class="bt01" plain>修改</el-button>
          </template>
        </el-table-column>
      </el-table>

      <nav class="page">
        <el-pagination background layout="prev, pager, next" :total="page.total" :page-size.sync="page.pageSize" :current-page.sync="page.pageNumber" @current-change="query"></el-pagination>
      </nav>
    </div>

    <!-- 修改对话框 -->
    <div>
      <el-dialog title="学生信息修改" :visible.sync="modifyVisible" :close-on-click-modal="false" @closed="query">
        <div>
          <el-form>
            <el-form-item>
              <el-select v-model="modifyInfo.cid">
                <el-option v-for="d in classList" :key="d.cid" :value="d.cid" :label="d.cname"></el-option>
              </el-select>
            </el-form-item>

            <el-form-item>
              <el-input v-model="modifyInfo.sname" placeholder="学生姓名"></el-input>
            </el-form-item>

            <el-form-item>
              <el-input v-model="modifyInfo.address" placeholder="家庭住址"></el-input>
            </el-form-item>

            <el-form-item>
              <el-input v-model="modifyInfo.phone" placeholder="电话"></el-input>
            </el-form-item>

            <el-form-item>
              <el-input v-model="modifyInfo.qq" placeholder="QQ"></el-input>
            </el-form-item>

            <el-form-item>
              <el-input v-model="modifyInfo.wechat" placeholder="微信"></el-input>
            </el-form-item>

            <el-form-item>
              <el-button @click="modifyVisible = false">关闭</el-button>
              <el-button @click="modify">保存</el-button>
            </el-form-item>
          </el-form>
        </div>
      </el-dialog>
    </div>
  </div>
</template>
<script>
export default {
  name: 'Stu',
  data() {
    return {
      modifyVisible: false,
      modifyInfo: {},
      addVisible: false,
      addInfo: {
        cid: -1,
        sname: '',
        address: '',
        phone: '',
        qq: '',
        wechat: ''
      },
      loading: false,
      page: {
        pageNumber: 1,
        pageSize: 5
      },
      queryInfo: {
        cid: -1,
        sname: '',
        phone: ''
      },
      classList: [],
      list: []
    };
  },
  methods: {
    classtz() {
      this.$router.push('/class/class');
    },
    showDeptName(cid) {
      for (let i = 0; i < this.classList.length; i++) {
        let dept = this.classList[i];
        if (dept.cid == cid) {
          return dept.cname;
        }
      }
      return '查无班级';
    },
    del(info) {
      console.log(info);
      let app = this;
      this.$confirm('是否删除学生：' + info.sname, '学生删除', { type: 'warning' })
        .then(function() {
          app.$ajax(
            '/student/delete',
            {
              'tbStudent.sid': info.sid
            },
            function(data) {
              app.$message(data.message);
              this.query();
            }
          );
        })
        .catch(function() {});
    },
    showModify(info) {
      console.log(info);
      this.modifyInfo = JSON.parse(JSON.stringify(info));
      this.modifyVisible = true;
    },
    modify() {
      this.loading = true;
      this.$ajax(
        '/student/update',
        {
          tbStudent: this.modifyInfo
        },
        function(data) {
          this.loading = false;
          this.$message(data.message);
        }
      );
    },
    add() {
      this.loading = true;
      this.$ajax(
        '/student/add',
        {
          tbStudent: this.addInfo
        },
        function(data) {
          this.loading = false;
          this.$message(data.message);
          this.addInfo = {
            cid: -1,
            sname: '',
            address: '',
            phone: '',
            qq: '',
            wechat: ''
          };
          this.query();
        }
      );
    },
    query() {
      this.loading = true;
      this.$ajax(
        '/student/queryAll',
        {
          page: this.page,
          tbStudent: this.queryInfo
        },
        function(data) {
          this.loading = false;
          if (!data.success) {
            this.$message.error(data.message);
            return;
          }
          this.page = data.resultData.page;
          this.classList = data.resultData.classList;
          this.list = data.resultData.list;
        }
      );
    }
  },
  created() {
    this.query();
  }
};
</script>
<style scoped>
.body {
  min-width: 100vw;
  min-height: 100vh;
  background-image: url('https://file.moyublog.com/d/file/2021-03-29/cbbb60ba25e7af3da4be4b88a78dab56.jpg');
  background-size: cover;
}

.title {
  display: flex;
  justify-content: center;
  font-size: 2.3rem;
  font-weight: bold;
  padding-top: 2rem;
  color: rgb(63, 80, 235);
}

.selbd {
  display: flex;
  justify-content: center;
  padding: 1.3rem;
}

.bd {
  padding-left: 15rem;
  width: 75%;
}

.el-table {
  border-radius: 1.2rem;
  border: 0.26rem solid rgb(13, 180, 13);
  box-shadow: 0 0 1.3rem rgb(226, 219, 219);
}

.bt {
  display: block;
  width: 100%;
  margin-left: 0.5rem;
}

.bt01 {
  margin-top: 0.13rem;
  display: block;
  width: 98.5%;
}

.page {
  display: flex;
  justify-content: center;
  padding-top: 1.3rem;
}
</style>
