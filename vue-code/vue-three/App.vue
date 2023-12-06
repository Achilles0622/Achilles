<template>
  <div class="app-container">
    <h1 v-color="color">App根组件</h1>
    <p v-color="'red'">color</p>
    <hr />
    <Aricle>
      <template v-slot:title>
        <h3>一首诗</h3>
      </template>
      <template #content="{ msg }">
        <div>
          <p>啊，大海，全都是水 </p>
          <p>啊，蜈蚣，全都是腿 </p>
          <p>1231231231231231231</p>
          <p>{{ scope.msg }}</p>
          <p>{{ user.name }}</p>
        </div>
      </template>
      <template #author>
        <div>
          作者：缤果果
        </div>
      </template>
    </Aricle>

    <hr>
    <div class="box" style="display: none;">
      <Left>
        <template v-slot:default>
          <p>ppppppppp</p>
        </template>
      </Left>
    </div>
  </div>
</template>
<script>
import Left from '@/components/Left.vue'
import Right from '@/components/Right.vue'
import Aricle from '@/components/Article.vue'
export default {
  data() {
    return {
      color: 'blue'
    }
  },
  components: {
    Left,
    Right,
    Aricle
  },
  directives: {
    color: {
      bind(el, binding) {
        console.log('v-color!!!!!!!!')
        el.style.color = binding.value
        console.log(binding)
      }
    }
  }
}
</script>
<style lang="less">
.app-container {
  padding: 1px 20px 20px;
  background-color: #7e9548;
}

.box {}
</style>
