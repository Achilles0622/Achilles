<template>
  <div>
    <h1>App2根组件</h1>

    <hr>

    <component v-bind:is="comName"></component>
  </div>
</template>

<script>

export default {
  name: 'App'
}

</script>
