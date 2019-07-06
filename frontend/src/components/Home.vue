<template>
  <div class="hello">
    <Header></Header>
    <Content></Content>
    <Footer></Footer>
  </div>
</template>

<script>
import Header from '@/components/common/Header.vue'
import Footer from '@/components/common/Footer.vue'
import Content from '@/components/common/Content.vue'

export default {
  name: 'Home',
  components: {
    Header, Content, Footer
  }
}
</script>

<style scoped>
</style>
