<template>
  <div>
    <h1>App根组件</h1>
    <a href="#/home">首页</a>
    <a href="#/movie">电影</a>
    <a href="#/about">关于</a>
    <hr>

    <component v-bind:is="comName"></component>
  </div>
</template>

<script>
import Home from '@/components/Home.vue'
import Movie from '@/components/Movie.vue'
import About from '@/components/About.vue'

export default {
  name: 'App',
  data() {
    return {
      comName: 'Home'
    }
  },
  created() {
    window.addEventListener('hashchange', this.handleHashChange);
    this.handleHashChange();
  },
  methods: {
    handleHashChange() {
      const hash = location.hash.slice(1);
      console.log('hash变化', hash);
      switch (location.hash) {
        case '#/home':
          this.comName = 'Home';
          break;
        case '#/about':
          this.comName = 'About';
          break;
        case '#/movie':
          this.comName = 'Movie';
          break;
        default:
          this.comName = 'Home';
          break;
      }
    }
  },
  components: {
    Home,
    About,
    Movie
  }
}
</script>
