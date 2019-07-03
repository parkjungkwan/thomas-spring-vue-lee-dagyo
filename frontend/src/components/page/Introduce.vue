<template>
<div>
    <Header></Header>
    <div id="container">
        <div id="intro" class="cf">
            <div class="box">
                <img src="https://dummyimage.com/250x300/000/fff" alt="">
                <img src="https://dummyimage.com/250x300/000/fff" alt="">
            </div>
            <div class="box">
                <h5>Web Developer</h5>
                <h2>DAGYO YI</h2>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
            </div>
        </div>
    </div>
    <Footer></Footer>
</div>
</template>
<script>
import Header from '@/components/common/Header.vue'
import Footer from '@/components/common/Footer.vue'
export default {
    name: 'Introduce',
    components: {
        Header, Footer
    }
}
</script>
<style scoped>
    .box { float: left;}
    .box img { width: 45%;}
    .box:first-child { width: 35%; margin: 0 5%;}
    .box:last-child { width: 50%;}
    h5 { font-size: 18px; margin-bottom: 5px;}
    h2 { font-size: 32px; margin-bottom: 5px;}
    p { font-size: 16px; line-height: 1.4em;}
</style>