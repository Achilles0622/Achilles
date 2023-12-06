<template>
    <div class="left-container">
      <h3>Left 组件 ---{{ count }}</h3>
      <!-- <button @click="count += 1">+1</button>
      <button @click="resetCount">重置</button> -->
      <hr>
      <slot name="default"> <h6>defaule！！！！！！！！！！！</h6></slot>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        count: 0
      };
    },
    methods: {
      resetCount() {
        this.count = 0;
      }
    }
  };
  </script>
  
  <style lang="less">
  .left-container {
    padding: 0 20px 20px;
    background-color: rgb(95, 95, 144);
    min-height: 250px;
    flex: 1;
  }
  </style>
  