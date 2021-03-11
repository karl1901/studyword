# vue带路由模板项目

- 如果存在就删除`node_modules`目录
- 如果存在就删除`dist`目录
- 复制本文件夹到新位置
- 新位置处理流程
  - 修改文件夹为项目名称
  - 修改`package.json`里面的项目名称(name)和版本号(version)
  - 修改`package-lock.json`里面的项目名称(name)和版本号(version)
  - 第一次打开项目需要执行`npm install`初始化项目
    - 如果项目出现非源码错误只要删除`node_modules`目录后再执行`npm install`重新初始化项目
  - 执行`npm run serve`启动开发服务进行开发过程
  - 执行`npm run build`启动发布正式服务器版本的打包过程
    - 打包过程和运维有密切关系，需要配合调整，一般开发人员很少使用
    - 打包后的文件在`dist`目录，不要git管理
