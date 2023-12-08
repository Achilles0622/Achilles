// 路由模块
import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/components/Home.vue'
import Movie from '@/components/Movie.vue'
import About from '@/components/About.vue'
import tab1 from '@/components/tabs/tab1.vue'
import tab2 from '@/components/tabs/tab2.vue'

Vue.use(VueRouter)

const router = new VueRouter({
  routes: [
    { path: '/', redirect: '/home' },
    { path: '/home', component: Home },
    { path: '/movie', component: Movie },
    {
      path: '/about', component: About,
      children: [{ path: 'tab1', component: tab1 }, { path: 'tab2', component: tab2 }]
    }
  ]
})

export default router
