<template>
  <div>
    <!-- 带名称的slot -->
    <slot name="top"></slot>
    <div>其他组件</div>
    <!-- 
      slot：表示将调用组件的标记里面的内容显示出来 
      ，位置由当前组件决定
      -->
    <slot></slot>
    <slot name="buttom"></slot>
  </div>
</template>

<script>
export default {
  name: 'MyOtherComp',
  data() {
    return {};
  }
};
</script>
