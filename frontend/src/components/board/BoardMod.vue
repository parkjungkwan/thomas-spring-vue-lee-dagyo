<template>
<div>
    <Header></Header>
    <div id="container">
        <div id="board" class="cf">
            <form>
                <dl class="cf">
                    <dd><input type="text" name="name" id="name" placeholder="이름" value="홍길동"></dd>
                    <dd><input type="password" name="pass" id="pass" placeholder="비밀번호" value="1234"></dd>
                </dl>
                <dl class="cf">
                    <dd><input type="text" name="title" id="title" placeholder="제목" value="안녕하세요"></dd>
                </dl>
                <textarea id="contents" name="contents"> 대법원장은 국회의 동의를 얻어 대통령이 임명한다. 헌법재판소 재판관은 정당에 가입하거나 정치에 관여할 수 없다. 누구든지 병역의무의 이행으로 인하여 불이익한 처우를 받지 아니한다. 헌법에 의하여 체결·공포된 조약과 일반적으로 승인된 국제법규는 국내법과 같은 효력을 가진다. 대통령으로 선거될 수 있는 자는 국회의원의 피선거권이 있고 선거일 현재 40세에 달하여야 한다. 국가는 대외무역을 육성하며, 이를 규제·조정할 수 있다. 모든 국민은 근로의 의무를 진다. 국가는 근로의 의무의 내용과 조건을 민주주의원칙에 따라 법률로 정한다. 모든 국민은 근로의 권리를 가진다. 국가는 사회적·경제적 방법으로 근로자의 고용의 증진과 적정임금의 보장에 노력하여야 하며, 법률이 정하는 바에 의하여 최저임금제를 시행하여야 한다. 법률은 특별한 규정이 없는 한 공포한 날로부터 20일을 경과함으로써 효력을 발생한다. 국가의 세입·세출의 결산, 국가 및 법률이 정한 단체의 회계검사와 행정기관 및 공무원의 직무에 관한 감찰을 하기 위하여 대통령 소속하에 감사원을 둔다. 
                국회의원의 수는 법률로 정하되, 200인 이상으로 한다. 대한민국은 국제평화의 유지에 노력하고 침략적 전쟁을 부인한다. 공무원의 직무상 불법행위로 손해를 받은 국민은 법률이 정하는 바에 의하여 국가 또는 공공단체에 정당한 배상을 청구할 수 있다. 이 경우 공무원 자신의 책임은 면제되지 아니한다. 
                감사원은 세입·세출의 결산을 매년 검사하여 대통령과 차년도국회에 그 결과를 보고하여야 한다. 대한민국의 영토는 한반도와 그 부속도서로 한다. 국가는 평생교육을 진흥하여야 한다. 
                헌법재판소는 법률에 저촉되지 아니하는 범위안에서 심판에 관한 절차, 내부규율과 사무처리에 관한 규칙을 제정할 수 있다. 대통령은 국민의 보통·평등·직접·비밀선거에 의하여 선출한다. 
                국가유공자·상이군경 및 전몰군경의 유가족은 법률이 정하는 바에 의하여 우선적으로 근로의 기회를 부여받는다. 국무위원은 국무총리의 제청으로 대통령이 임명한다. 
                모든 국민은 행위시의 법률에 의하여 범죄를 구성하지 아니하는 행위로 소추되지 아니하며, 동일한 범죄에 대하여 거듭 처벌받지 아니한다. 모든 국민은 직업선택의 자유를 가진다.</textarea>
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
export default {
    name: 'BoardMod',
    components: {
        Header, Footer
    }
}
</script>
<style scoped>
    dl { margin-bottom: 10px; width: 100%;}
    #name, #pass {float: left; margin-right: 10px; width: 15%;}
    #title { width: 100%;}
</style>