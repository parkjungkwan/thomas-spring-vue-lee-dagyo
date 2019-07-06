<template>
<div>
    <Header></Header>
    <div id="container">
        <div id="board" class="cf">
            <div id="search">
                <input type="text" name="searchBox" id="searchBox" placeholder="Search">
                <input type="submit" name="searchBtn" id="searchBtn" value="검색">
            </div>
            <div id="boardList">
                <dl id="top" class="cf">
                    <dt class="dt1">번호</dt>
                    <dt class="dt2">제목</dt>
                    <dt class="dt3">작성자</dt>
                    <dt class="dt4">날짜</dt>
                </dl>
                <dl class="cf" v-for="(item,index) in list" v-bind:key="index" @click="view(item)">
                        <dd class="dt1">{{item.bbsNum}}</dd>
                        <dd class="dt2 tal">{{item.title}}</dd>
                        <dd class="dt3">{{item.writer}}</dd>
                        <dd class="dt4">{{item.regdate.substr(0,10)}}</dd>
                </dl> 
            </div>
            <div id="paging">
                <span>&lt;</span>
                <span class="active">1</span>
                <span>2</span>
                <span>3</span>
                <span>4</span>
                <span>5</span>
                <span>&gt;</span>
            </div>
            <div id="write">
                <button><router-link to="/board_form">글쓰기</router-link></button>
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
    
    data() {
        return {
            context: 'http://localhost:9000/bbs',
            list : []
        }
    },
    name: 'BoardList',
    components: {
        Header, Footer
    },
    methods: {


        view(item) {
            store.state.bbsnum = item.bbsNum;
            store.state.writer = item.writer;
            store.state.title = item.title;
            store.state.contents = item.contents;
            store.state.regdate = item.regdate;
            store.state.password = item.password;
            this.$router.push('/board_view')
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
    
    dl { float: none; width: 100%; border-bottom: 1px solid #000;}
    dt, dd {float: left; padding: 10px 0; text-align: center;}
    dl#top { border: 1px solid #000;}
    .dt1 { width:10%;}
    .dt2 { width: 55%;}
    .dt3 { width: 20%;}
    .dt4 { width: 15%;}
    .tal { text-align: left;}
    #search { margin-bottom: 10px;}
    input { vertical-align: middle;}
    input[type=text] { background: transparent; border: 1px solid #000; width: 180px; height: 28px; font-size: 16px; color: #777; padding: 0 5px;}
    input[type=submit] { width: 50px; }
    #paging { float: left; margin-top: 10px;}
    #paging span { width: 30px; height: 30px; line-height: 30px; display: inline-block;  text-align: center; border: 1px solid #000; box-sizing: border-box;}
    #paging span.active { background: #000; color: #fff;}
    #write { float: right; margin-top: 10px;}
</style>