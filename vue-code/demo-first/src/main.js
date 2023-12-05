import Vue from 'vue'
// import App from './App.vue'
import Test from './Test.vue'

Vue.config.productionTip = false

new Vue({
  el:"#app",
  render: h => h(Test),
})
