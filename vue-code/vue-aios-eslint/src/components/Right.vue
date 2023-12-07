<template>
  <div class="right-container">
    <h3>Right组件</h3>
    <button @click="postInfo">POST</button>
    <button @click="btnGetBooks">获取图书列表数据</button>
  </div>
</template>

<script>
// import axios from 'axios'
export default {
  methods: {
    async postInfo() {
      const { data: res } = await this.$http.post('/api/post', { name: 'zhangsan', age: '20' })
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
.right-container {
  background-color: skyblue;
  min-height: 200px;
  flex: 1;
}
</style>
