<template>
  <div class="left-container">
    <h1>App根组件</h1>
    <button @click="btnGetBooks">获取图书列表数据</button>

    <hr>
    <div class="box">
      <Left></Left>
      <Right></Right>
    </div>
  </div>
</template>

<script>
import Left from '@/components/Left.vue'
import Right from '@/components/Right.vue'

export default {
  methods: {
    async btnGetBooks() {
      const { data: res } = await this.$http.get('/api.getbooks')
      console.log(res)
    }
  },
  components: {
    Left,
    Right
  }
}
</script>

<style lang="less" scoped>
.box {
  display: flex;
}

/* 样式规则 */
</style>
