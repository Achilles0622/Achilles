import Vue from 'vue'
import App from './App.vue'
import axios from 'axios'

Vue.config.productionTip = false

// 全局配置

axios.defaults.baseURL = 'http://www.liulongbin.top:3006'

// axios挂到Vue.prototype上直接使用

Vue.prototype.$http = axios

// vue ->$http

new Vue({
  render: h => h(App)
}).$mount('#app')
