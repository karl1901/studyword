<template>
  <div class="body">
    <div class="title">班级信息管理</div>
    <!-- 添加表单 -->
    <div class="add-from" v-loading="addLoading">
      <el-form :inline="true">
        <el-form-item>
          <el-input v-model="addInfo.cname" placeholder="请输入班级名称"></el-input>
        </el-form-item>

        <el-form-item>
          <el-input v-model="addInfo.cinfo" placeholder="请输入班级描述"></el-input>
        </el-form-item>

        <el-form-item>
          <el-button type="success" @click="add" round>添加</el-button>
          <el-button type="success" @click="query" v-loading="loading" icon="el-icon-refresh-right" circle></el-button>
          <el-button type="success" @click="stutz" round>学生管理</el-button>
        </el-form-item>
      </el-form>
    </div>
    <!-- 数据显示和分页 -->
    <div v-loading="loading" class="bd">
      <el-table :data="list" stripe>
        <el-table-column label="班级名称" prop="cname"></el-table-column>
        <el-table-column label="班级信息" prop="cinfo"></el-table-column>

        <el-table-column label="最后修改时间">
          <template slot-scope="scope">
            {{ scope.row.lastupdate | formatDate }}
          </template>
        </el-table-column>

        <el-table-column label="操作" prop="cname">
          <template slot-scope="scope">
            <el-button type="danger" @click="showDel(scope.row)">删除</el-button>
            <el-button type="primary" @click="showModify(scope.row)">修改</el-button> </template
          >(scope.row)
        </el-table-column>
      </el-table>

      <nav class="page">
        <el-pagination background layout="prev, pager, next" :total="page.total" :page-size.sync="page.pageSize" :current-page.sync="page.pageNumber" @size-change="query" @current-change="query"></el-pagination>
      </nav>
    </div>
    <!-- 修改的对话框 -->
    <div>
      <el-dialog title="修改信息" :close-on-click-modal="false" :visible.sync="modifyVisible" @closed="query">
        <div>
          <el-form>
            <el-form-item>
              <el-input v-model="modifyInfo.cname" placeholder="班级名称"></el-input>
            </el-form-item>
            <el-form-item>
              <el-input v-model="modifyInfo.cinfo" placeholder="描述"></el-input>
            </el-form-item>

            <el-form-item>
              <el-button @click="modifyVisible = false">取消</el-button>
              <el-button type="primary" @click="modify">保存</el-button>
            </el-form-item>
          </el-form>
        </div>
      </el-dialog>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Class',
  data() {
    return {
      loading: false,
      page: {
        pageNumber: 1,
        pageSize: 5
      },
      list: [],
      addInfo: {},
      addLoading: false,
      modifyInfo: {},
      modifyVisible: false
    };
  },
  methods: {
    stutz() {
      this.$router.push('/class/stu');
    },
    modify() {
      this.loading = true;
      this.$ajax(
        '/class/update',
        {
          tbClass: this.modifyInfo
        },
        function(data) {
          this.loading = false;
          this.$message(data.message);
          this.modifyVisible = false;
        }
      );
    },
    showModify(info) {
      this.modifyInfo = JSON.parse(JSON.stringify(info));
      this.modifyVisible = true;
    },
    showDel(info) {
      let app = this;
      this.$confirm('是否删除：' + info.cname, '删除信息', {
        type: 'warning',
        confirmButtonText: '删除'
      })
        .then(function() {
          // 删除动作
          app.loading = false;
          app.$ajax(
            '/class/delete',
            {
              'tbClass.cid': info.cid
            },
            function(data) {
              app.$message({
                message: data.message
              });
              this.query();
            }
          );
        })
        .cath(function() {});
    },
    add() {
      this.addLoading = true;
      this.$ajax(
        '/class/add',
        {
          tbClass: this.addInfo
        },
        function(data) {
          this.addLoading = false;
          if (!data.success) {
            this.$message.error(data.message);
            return;
          }
          this.addInfo = {};
          this.$message({
            showClose: true,
            message: data.message
          });
          this.query();
        }
      );
    },
    query() {
      this.loading = true;
      this.$ajax(
        '/class/queryAll',
        {
          page: this.page
        },
        function(data) {
          this.loading = false;
          if (!data.success) {
            this.$message.error(data.message);
          }
          this.list = data.resultData.list;
          this.page = data.resultData.page;
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
  background-image: url('https://cn.bing.com/th?id=OHR.Ceking_ZH-CN7314711047_1920x1080.jpg&rf=LaDigue_1920x1080.jpg&pid=hp');
  background-size: cover;
}

.title {
  display: flex;
  justify-content: center;
  width: 100%;
  padding-top: 2rem;
  font-size: 2.3rem;
  font-weight: bold;
  color: rgba(0, 255, 255, 0.815);
}

.bd {
  margin-left: 15rem;
  width: 75%;
  /* border-radius: 1.2rem;
  background-color: rgba(255, 255, 255, 0.623);
  border: 0.2rem solid rgb(70, 67, 67);
  box-shadow: 0 0 1.2rem rgb(255, 255, 255); */
}

.el-table {
  /* margin-left: 15rem;
  width: 70%; */
  border-radius: 1.2rem;
  border: 0.2rem solid rgb(35, 238, 52);
  box-shadow: 0 0 1.2rem rgb(255, 255, 255);
}

.page {
  display: flex;
  justify-content: center;
  padding: 1.3rem;
}

.add-from {
  display: flex;
  justify-content: center;
  padding: 1.3rem;
}
</style>
