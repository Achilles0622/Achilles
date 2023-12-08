<template>
  <div class="About-container">
    <h3>About组件</h3>
    <hr>
    <router-link to="/about">tab1</router-link>
    <router-link to="/about/tab2">tab2</router-link>

    <router-view></router-view>

  </div>
</template>

<script>
// import router from '@/router';
</script>
<style lang="less" scoped>
.About-container {
  background-color: rgb(227, 235, 135);
  min-height: 200px;
  // flex: 1;
}
</style>
