<template>
  <div class="left-container">
    <h3>Left组件</h3>
    <button @click="getInof">GET</button>
    <button @click="btnGetBooks">获取图书列表数据</button>

  </div>
</template>
<script>
// import axios from 'axios'

export default {
  methods: {
    async getInofr() {
      const { data: res } = await this.$http.get('/api/get')
      console.log(res)
    },
    async btnGetBooks() {
      const { data: res } = await this.$http.get('/api.getbooks')
      console.log(res)
    }
  }
}
</script>

<style lang="less" scoped>
.left-container {
  background-color: orange;
  min-height: 200px;
  flex: 1;

}
</style>
