<template>
  <div class="app-container">
    <h1 ref="myh1">App根组件</h1>
    <button @click="showThis">打印this</button>
    <button @click="onReset">重置0</button>
    <hr/>
    <button @click="comName='Left'">展示 Left</button>
    <button @click="comName='Right'">展示 Right</button>

    <div class="box">
      
      <keep-alive>
        <component :is="comName" :key="comName"></component>
      </keep-alive>
    </div>
  </div>
</template>

<script>
import Left from '@/components/Left.vue'
import Right from '@/components/Right.vue'

export default {
  data() {
    return {
      comName: 'Left'
    };
  },
  methods: {
    showThis() {
      console.log(this.$refs.myh1);
      this.$refs.myh1.style.color = 'red';
    },
    onReset() {
      // 如果 Left 组件具有 resetCount 方法，可以调用
      // this.$refs.comLeft.resetCount();
    },
    created(){
      console.log('Left---ok')
    },
    destroyed(){
      console.log('left---no')
    }
  },
 
  components: {
    Left,
    Right
  }
}
</script>

<style lang="less">
.app-container {
  padding: 1px 20px 20px;
  background-color: #954848;
}

.box {

}
</style>
