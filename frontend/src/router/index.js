import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Introduce from '@/components/page/Introduce'
import Contact from '@/components/page/Contact'
import BoardList from '@/components/board/BoardList'
import BoardForm from '@/components/board/BoardForm'
import BoardView from '@/components/board/BoardView'
import BoardMod from '@/components/board/BoardMod'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {path: '/', name: 'Home', component: Home},
    {path: '/introduce', name: 'Introduce', component: Introduce},
    {path: '/contact', name: 'Contact', component: Contact},
    {path: '/board_list', name: 'BoardList', component: BoardList},
    {path: '/board_form', name: 'BoardForm', component: BoardForm},
    {path: '/board_view', name: 'BoardView', component: BoardView},
    {path: '/board_mod', name: 'BoardMod', component: BoardMod}
  ]
})
