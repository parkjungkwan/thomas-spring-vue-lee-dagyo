<template>
<div>
    <Header></Header>
    <div id="container">
        <div id="board" class="cf">
            <dl class="cf">
                <dt>{{this.$store.state.title}} <i>by {{this.$store.state.writer}}</i></dt>
                <dt class="date">{{this.$store.state.regdate.substr(0,10)}}</dt>
            </dl>
            <div id="viewContent" class="cf">{{this.$store.state.contents}}</div>
            <div id="btnL" class="cf">
                <button><router-link to="/board_list">목록</router-link></button>
            </div>
            <div id="btnR" class="cf">
                <button><router-link to="/board_mod">수정</router-link></button>
                <button @click="del">삭제</button>
            </div>
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
    name: 'BoardView',
    data(){
        return{
            context:'http://localhost:9000/bbs',
            bbsnum : this.$store.state.bbsnum
        }
    },
    components: {
        Header, Footer
    },
    methods: {
        del(){
            let con = confirm("정말 삭제하시겠습니까?")
            if(con==true){
                axios.delete(`${this.context}/${this.$store.state.bbsnum}`)
                .then(res=>{
                    store.state.list = res.data
                    this.$router.push("/board_list")
                })
                .catch(e=>{
                    alert('ERROR')
                })
            }
        }
    },

    created() {
        axios.get(`${this.context}`).then((response)=>{
            console.log(response);
           this.list = response.data;

        })
        //this.list = this.$store.state.list
    }
}
</script>
<style scoped>
    dl { border: 1px solid #000; padding: 15px; margin-bottom: 20px;}
    dl dt { float: left;}
    dl dt.date {float: right;}
    #viewContent { line-height: 2em;}

    #btnL, #btnR { margin-top: 20px;}
    #btnL { float: left;}
    #btnR { float: right;}
    button { background: #000; color:#fff; border: 0; width: 70px; height: 33px;}
    button a { color: #fff;}
    i { font-size: 12px;}
</style>