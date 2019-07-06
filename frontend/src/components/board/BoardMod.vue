<template>
<div>
    <Header></Header>
    <div id="container">
        <div id="board" class="cf">
            <form>
                <dl class="cf">
                    <dd><input type="text" id="name" placeholder="이름" v-model="writer"></dd>
                    <dd><input type="password" id="pass" placeholder="비밀번호" v-model="password"></dd>
                </dl>
                <dl class="cf">
                    <dd><input type="text" id="title" placeholder="제목" v-model="title"></dd>
                </dl>
                <textarea id="contents" v-model="contents"></textarea>
                <div id="btn" class="cf">
                    <input type="submit" value="확인" @click.prevent="mod">
                    <input type="reset" value="취소">
                </div>
            </form>
        </div>
    </div>
    <Footer></Footer>
</div>
</template>
<script>
import Header from '@/components/common/Header.vue'
import Footer from '@/components/common/Footer.vue'
import axios from 'axios'
import {store} from '../../store'

export default {
    name: 'BoardMod',
    data(){
        return{
            context: 'http://localhost:9000/bbs',
            writer: store.state.writer,
            password: store.state.password,
            title: store.state.title,
            contents: store.state.contents
        }
    },
    components: {
        Header, Footer
    },
    methods: {
        mod(){
            let data = {
                writer: this.writer,
                password: this.password,
                title: this.title,
                contents: this.contents
            }
            let headers = {
                'Content-Type': 'application/json',
                'Authorization' : 'JWT fefege..'
            }
            axios.put(`${this.context}/${this.$store.state.bbsnum}`, JSON.stringify(data), {headers:headers})
            .then(res=>{
                console.log('+',res.data)
                this.$store.state.title=res.data.result.title;
                this.$store.state.writer = res.data.result.writer;
                this.$store.state.password = res.data.result.password;
                this.$store.state.contents = res.data.result.contents;
                this.$router.push("/board_view")
            })
            .catch(e=>{
                alert("ERROR")
                this.$router.link(-1)
            })
        }
    }
}
</script>
<style scoped>
    dl { margin-bottom: 10px; width: 100%;}
    #name, #pass {float: left; margin-right: 10px; width: 15%;}
    #title { width: 100%;}
</style>