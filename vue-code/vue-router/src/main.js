import Vue from 'vue'
import App from './App.vue'
import axios from 'axios'
import router from '@/router/index.js'
Vue.config.productionTip = false
axios.defaults.baseURL = 'http://www.liulongbin.top:3006'

Vue.prototype.$http = axios

// vue ->$http

new Vue({
  render: h => h(App), // 修改这里的组件为 App2
  router
}).$mount('#app')
