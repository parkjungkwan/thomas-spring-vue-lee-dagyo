<template>
<div>
    <Header></Header>
    <div id="container">
        <div id="r1" class="cf">
            <div class="box">
                <h3>ADDRESS</h3>
                <p>서울시 ○○구 ○○동</p>
            </div>
            <div class="box">
                <h3>MAIL</h3>
                <p>dagyoyi@gmail.com</p>
            </div>
            <div class="box">
                <h3>PHONE NUMBER</h3>
                <p>010-1234-5678</p>
            </div>
        </div>
        <div id="r2">
            <h3>CONTACT</h3>
            <form>
                <input type="text" id="name" name="name" placeholder="성함">
                <input type="email" id="email" name="email" placeholder="이메일주소">
                <input type="text" id="phone" name="phone" placeholder="전화번호">
                <textarea id="comment" name="comment" placeholder="남기실 말"></textarea>
            </form>
        </div>
    </div>
    <Footer></Footer>
</div>
</template>
<script>
import Header from '@/components/common/Header.vue'
import Footer from '@/components/common/Footer.vue'
export default {
    name: 'Contact',
    components: {
        Header, Footer
    }
}
</script>
<style scoped>
    #container { text-align: center;}
    #r1 { margin: 0 auto 60px auto; width: 60%;}
    .box { float: left; margin-right: 5%; width: 30%;}
    .box:last-child { margin-right: 0;}
    #r1 h3, #r2 h3 { font-size: 22px; margin-bottom: 15px;}
    #r1 p, #r2 p { font-size: 16px;}

    input { display: block; width: 50%; margin: 0 auto 5px auto;}
    #comment { width: 50%; height: 150px; margin-bottom: 10px; resize: none;}
</style>