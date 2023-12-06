<template>
<div class ="article-container">
<div class="header-box">
    <slot name="title"></slot>
</div>
<div class="content-box">
    <slot name="content" msg="hello vue.js" :user="userinfo"></slot>
</div> 
<div class="footer-box">
    <slot name="author"></slot>
     
</div>
</div>
</template>
<script> 
export default{
name:'Article',
data(){
    return{
        userinfo:{
            name:'zhangsan',
            age:20
        }
    }
}
}
</script>
<style lang="less" scoped>
.article-container{
    >div{
        min-height: 150px;
    }
    .header-box{
        background-color: pink;
    }
    .content-box{
        background-color: lightblue;
    }
    .footer-box{
        background-color: lightsalmon;
    }
}

</style>