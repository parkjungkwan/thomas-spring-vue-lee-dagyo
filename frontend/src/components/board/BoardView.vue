<template>
<div>
    <Header></Header>
    <div id="container">
        <div id="board" class="cf">
            <dl class="cf">
                <dt>안녕하세요 <i>by 홍길동</i></dt>
                <dt class="date">2019.01.01</dt>
            </dl>
            <div id="viewContent" class="cf">
                <p>국회는 선전포고, 국군의 외국에의 파견 또는 외국군대의 대한민국 영역안에서의 주류에 대한 동의권을 가진다. 대통령은 필요하다고 인정할 때에는 외교·국방·통일 기타 국가안위에 관한 중요정책을 국민투표에 붙일 수 있다.</p>
                <p>대법원장은 국회의 동의를 얻어 대통령이 임명한다. 공무원의 신분과 정치적 중립성은 법률이 정하는 바에 의하여 보장된다. 대통령은 전시·사변 또는 이에 준하는 국가비상사태에 있어서 병력으로써 군사상의 필요에 응하거나 공공의 안녕질서를 유지할 필요가 있을 때에는 법률이 정하는 바에 의하여 계엄을 선포할 수 있다.</p>
                <p>헌법개정은 국회재적의원 과반수 또는 대통령의 발의로 제안된다. 모든 국민은 법률이 정하는 바에 의하여 납세의 의무를 진다. 비상계엄하의 군사재판은 군인·군무원의 범죄나 군사에 관한 간첩죄의 경우와 초병·초소·유독음식물공급·포로에 관한 죄중 법률이 정한 경우에 한하여 단심으로 할 수 있다. 다만, 사형을 선고한 경우에는 그러하지 아니하다.</p>
                <p>누구든지 체포 또는 구속을 당한 때에는 즉시 변호인의 조력을 받을 권리를 가진다. 다만, 형사피고인이 스스로 변호인을 구할 수 없을 때에는 법률이 정하는 바에 의하여 국가가 변호인을 붙인다.</p>
                <p>이 헌법에 의한 최초의 대통령의 임기는 이 헌법시행일로부터 개시한다. 모든 국민은 사생활의 비밀과 자유를 침해받지 아니한다. 위원은 탄핵 또는 금고 이상의 형의 선고에 의하지 아니하고는 파면되지 아니한다.</p>
                <p>이 헌법은 1988년 2월 25일부터 시행한다. 다만, 이 헌법을 시행하기 위하여 필요한 법률의 제정·개정과 이 헌법에 의한 대통령 및 국회의원의 선거 기타 이 헌법시행에 관한 준비는 이 헌법시행 전에 할 수 있다.</p>
                <p>국가는 전통문화의 계승·발전과 민족문화의 창달에 노력하여야 한다. 군사재판을 관할하기 위하여 특별법원으로서 군사법원을 둘 수 있다. 대통령의 임기는 5년으로 하며, 중임할 수 없다.</p>
                <p>선거에 관한 경비는 법률이 정하는 경우를 제외하고는 정당 또는 후보자에게 부담시킬 수 없다. 국방상 또는 국민경제상 긴절한 필요로 인하여 법률이 정하는 경우를 제외하고는, 사영기업을 국유 또는 공유로 이전하거나 그 경영을 통제 또는 관리할 수 없다.</p>
                <p>국가는 주택개발정책등을 통하여 모든 국민이 쾌적한 주거생활을 할 수 있도록 노력하여야 한다. 군인은 현역을 면한 후가 아니면 국무위원으로 임명될 수 없다.</p>
                <p>헌법재판소의 장은 국회의 동의를 얻어 재판관중에서 대통령이 임명한다. 모든 국민은 법률이 정하는 바에 의하여 선거권을 가진다. 환경권의 내용과 행사에 관하여는 법률로 정한다.</p>
            </div>
            <div id="btnL" class="cf">
                <button><router-link to="/board_list">목록</router-link></button>
            </div>
            <div id="btnR" class="cf">
                <button><router-link to="/board_mod">수정</router-link></button>
                <button><router-link to="/board_del">삭제</router-link></button>
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
    name: 'BoardView',
    components: {
        Header, Footer
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