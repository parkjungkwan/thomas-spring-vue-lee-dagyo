<template>
    <div id="header" class="common">
        <h1><router-link to="/"><img :src="images.logo" alt="logo"></router-link></h1>
        <ul id="nav">
            <li><router-link to="/introduce">INTRODUCE</router-link></li>
            <li><router-link to="/board">BOARD</router-link></li>
            <li><router-link to="/contact">CONTACT</router-link></li>
        </ul>
        <ul id="user">
            <li><router-link to="/">LOGIN</router-link></li>
            <li><router-link to="/">JOIN</router-link></li>
            <li><router-link to="/">BOOKMARK</router-link></li>
        </ul>
    </div>
</template>
<script>
export default {
    data() {
        return {
            images: {
                logo: require('@/assets/logo.png')
            }
        }
    }
    
}
</script>
<style scoped>
    #header { height: 110px; border-bottom: 1px solid #000; clear: both; font-size: 13px;}  
    h1 { margin: 30px 15% 0 0;}
    ul { margin-top: 31px;}
    h1, ul#nav { float: left;}
    ul#user { float: right; padding-right: 15%;}
    ul li { letter-spacing: 1.5px; line-height: 16px;}
    ul li a:hover { background: #000; color: #fff;}
</style>
