<template>
<div>
    <Header></Header>
    <div id="container">
        <div id="board" class="cf">
            <form @submit.prevent="write">
                <dl class="cf">
                    <dd><input type="text" name="name" id="name" placeholder="이름" v-model="writer"></dd>
                    <dd><input type="password" name="pass" id="pass" placeholder="비밀번호" v-model="password"></dd>
                </dl>
                <dl class="cf">
                    <dd><input type="text" name="title" id="title" placeholder="제목" v-model="title"></dd>
                </dl>
                <textarea id="contents" name="contents" v-model="contents">
                    
                </textarea>
                <div id="btn" class="cf">
                    <input type="submit" value="확인">
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
    name: 'BoardForm',
    
    components: {
        Header, Footer
    },
    data() {
        return {
            context: 'http://localhost:9000/bbs',
            hit: 0,
            writer: '', 
            password: '', 
            title: '', 
            contents: ''
        }
    },
    methods: {
        write(){
            alert('write진입');
            let data = {
                hit:this.hit,
                writer:this.writer, 
                password:this.password, 
                title:this.title, 
                contents:this.contents
            }
            let headers = {
                'Content-Type': 'application/json',
                'Authorization': 'JWT fefege..'
            }
            axios.post('http://localhost:9000/bbs',
                JSON.stringify(data),
                {headers: headers})
            .then(res=>{
                alert(`SUCCESS : ${res.data[0].title}`);
                store.state.list = res.data
                this.$router.push("/board_list");
            })
            .catch(e=>{
                alert("ERROR");
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