<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>借款协议</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expires" content="-1">
<link rel="icon" type="image/x-icon" href="/resource/images/ico.ico">
<link rel="stylesheet" href="/resource/css/index.css">
<script type="text/javascript" src="/resource/js/jquery-1.8.3.min.js"></script>
<!--移动端版本兼容 -->
<script type="text/javascript">
	var phoneWidth = parseInt(window.screen.width);
	var phoneScale = phoneWidth / 640;
	var ua = navigator.userAgent;
	if (/Android (\d+\.\d+)/.test(ua)) {
		var version = parseFloat(RegExp.$1);
		if (version > 2.3) {
			console.log('Android version = ' + version + '> 2.3');
			document
					.write('<meta name="viewport" content="width=640,initial-scale=1, minimum-scale = '+phoneScale+', maximum-scale = '+phoneScale+', target-densitydpi=device-dpi">');
		} else {
			console.log('Android version = ' + version + '<= 2.3');
			document
					.write('<meta name="viewport" content="width=640,initial-scale=1, target-densitydpi=device-dpi">');
		}
	} else {
		console.log('iOS');
		document
				.write('<meta name="viewport" content="width=640,initial-scale=1, minimum-scale = '+phoneScale+', maximum-scale = '+phoneScale+', target-densitydpi=device-dpi">');
	};
</script>
<!--移动端版本兼容 end-->
<style type="text/css">
    .loan_page ul{
        margin-left: 15px;
    }
    
    .loan_page table{
        font-size:12px;
        margin-left: 15px;
        border-collapse:collapse;
    }
    
    .loan_page td{
        border:1px #000000 solid;
        height: 20px;
    }
</style>
</head>
<body>
<div class="pro_txt">
    <div class="loan_page">
        <div>
            <div style="float: right; text-align: right; margin-right: 15px;">合同编号:xxxxxxxxxxxxxxx-xxxxxxx  </div>
            <div>居间服务人：北京睿博盈通网络科技有限公司</div>
            <div>鉴于：</div>
            <ul style="list-style-type: none;">
                <li>1、居间服务人是一家在中国北京市合法成立并有效存续的有限公司，运营领钱儿（网址：www.lingmoney.cn
                    ,以下凡提及该网站者，均指居间服务人），向网站注册用户提供咨询、信息展示及委托服务等居间服务。</li>
                <li>2、出借人和借款人均已阅读并同意遵守领钱儿的《注册协议》，注册成为领钱儿的用户，并认可领钱儿通过网站公开发布关于注册用户的各种规则。</li>
                <li>3、出借人和借款人同意通过居间服务人的服务、以电子合同的形式达成本借款协议，本借款协议的内容经双方充分阅读且知晓每一条款的含义，是双方真实意思表示。</li>
            </ul>

            <div>借款人与各出借人，通过领钱儿的居间服务，就有关借款事项达成如下协议：</div>

            <h4>第一条：借款详情如下表所示:</h4>
            <div>
                <table>
                    <tr>
                        <td><strong>出借人姓名</strong></td>
                        <td><strong>借款金额(元)</strong></td>
                        <td><strong>借款期限(天)</strong></td>
                        <td><strong>年利率</strong></td>
                        <td><strong>借款开始日</strong></td>
                        <td><strong>借款到期日</strong></td>
                        <td><strong>月截止还款日</strong></td>
                        <td><strong>总还款本息(元)</strong></td>
                        <td><strong>居间服务费(元)</strong></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
            </div>

            <h4>第二条：还款</h4>
            <ul style="list-style-type: none">
                <li>2.1 借款人承诺按照本协议第一条约定的时间和金额按期足额向出借人还款。</li>
                <li>2.2 借款人的每一期还款的还款金额计算公式为：须还款金额=须还利息+须还本金。</li>
                <li>2.3 借款人的最后一期还款必须包含全部剩余本金、利息及其他根据本协议产生的全部费用。</li>
            </ul>

            <h4>第三条：借款、还款的支付方式</h4>
            <ul style="list-style-type: none">
                <li>3.1
                    出借人在同意向借款人出借相应款项时,已委托领钱儿在本借款协议生效后将该笔借款直接划付至借款人帐户。借款人已委托领钱儿将还款直接划付至出借人帐户。出借人及借款人均授权领钱儿委托银行从出借人或借款人账户中划付应支付或应偿还的借款本息及其他应付费用。
                </li>
                <li>3.2
                    领钱儿网站通过公告或其他各种方式明示出借人应享有的各种收益（包括但不限于利息、奖励等），均已包含在本协议的借款利息中。</li>
                <li>3.3
                    借款人和出借人均同意，领钱儿接受借款人或出借人委托所采取的划付款项行为，所产生的法律后果均由相应借款人或出借人自行承担。</li>
                <li>3.4 本协议中借款和还款的履行地均为领钱儿的公司注册地：北京市朝阳区。</li>
            </ul>

            <h4>第四条：逾期还款</h4>
            <ul style="list-style-type: none">
                <li>4.1 若借款人逾期仍未还款,借款人除向出借人支付正常利息以外,还应每天承担逾期罚息(金额为未偿还本息的千分之一)，且出借人有权提前终止合同并要求借款人偿还全部借款本息。出借人和借款人均同意并认可，领钱儿可通过短信、电话、上门催收或委托第三方等方式对借款人逾期未偿还的本息进行催收,且上述逾期罚息，借款人和出借人均同意作为催收服务费用由借款人直接向领钱儿或债权受让方（如有）支付。</li>
                <li>4.2 借款人同意，其逾期还款造成出借人因此支付的费用(包括但不限于律师费)由借款人承担。</li>
                <li>4.3 借款人同意，如借款人逾期未偿还任何一期还款，出借人及借款人同意并支持领钱儿采取以下措施之一项或几项：</li>
                <li>4.3.1 将借款人的有关身份资料及其他个人信息通过领钱儿“逾期黑名单”等栏目对外公开；</li>
                <li>4.3.2 将借款人的有关身份资料及其他个人信息正式备案在“不良信用记录”,列入全国个人信用评级体系的黑名单(“不良信用记录”数据将为银行、电信、担保公司、人才中心等有关机构提供个人不良信用信息)；</li>
                <li>4.3.3 对借款人采取法律措施,由此所产生的所有法律后果将由借款人来承担；</li>
                <li>4.3.4 无需催告即可要求借款人偿还全部借款本息，并提前解除借款合同。</li>
                <li>4.3.5借款人可根据资金使用情况，进行提前通过领钱儿向出借人提前还款。</li>
            </ul>

            <h4>第五条：借款债权的转让</h4>
            <ul style="list-style-type: none">
                <li>5.1 借款人知晓并同意出借人于本协议履行过程中可能将其因本借款协议而享有的债权的全部或部分转让给不特定的第三人，且转让次数无限定。</li>
                <li>5.2 出借人将其债权全部或部分转让给第三人的，应当通知借款人，可以以信件、电子邮件、短信、电话或当面送达等合法形式。该债权转让自出借人或其委托人之通知送达之日起对借款人发生效力。</li>
                <li>5.3 就债权转让事宜，出借人在此无条件且不可撤销的授予领钱儿如下委托事项及权限：</li>
                <li>5.3.1 在符合本协议 5.7
                    条或本协议其他条款约定或领钱儿公告的债权转让的情形发生时，由领钱儿代表全体出借人与债权受让人（或与债权受让人、借款人一并）签订《债权转让协议》和/或《债权转让确认书》及其他债权转让有关的合同、文件；</li>
                <li>5.3.2 将债权转让事宜（包括债权受让人等）通知借款人；</li>
                <li>5.3.3 代收债权转让对价款项；上述委托的有效期自本协议生效之日起直至本协议项下全部借款本息及清偿费用全部清偿完毕之日止。
            </ul>
            
            <ul style="list-style-type: none">
                <li>5.4
                    借款人在此已明确知晓领钱儿的受托权限，承诺在接到领钱儿的债权转让通知时即对债权受让人负有对应债权的清偿义务，而无须领钱儿再行出具出借人的书面委托。</li>
                <li>5.5
                    出借人将其债权全部或部分转让给第三人的，本借款协议中对应权利及义务一并转让给债权受让人，包括但不限于主张罚息、利息、单方提前解除合同等权利及支付中介服务费用的义务。</li>
                <li>5.6
                    出借人和借款人均同意，为集中维护各出借人权利，如出现领钱儿认为有需要的（包括但不限于借款人未能按期如数清偿任意一期借款本息或领钱儿认为借款人有逾期风险等）情形下，全体出借人一致同意将本协议项下债权转让给领钱儿或领钱儿居间介绍的其他愿意受让该项债权的第三人。出借人在此授权领钱儿：上述情形发生之后，由领钱儿作为全体出借人的代理人，代为选择债权受让人；代为与债权受让人签订债权转让涉及的所有合同、文件；代为向借款人发送债权转让通知；代为决定或进行其他与债权转让有关的事项，包括但不限于视实际情况独立决定债权转让的价格、支付债权转让对价的时间和方式等。自债权转让通知送达至借款人时，债权受让人取代出借人成为本借款协议新的债权人，取得与债权有关的所有权利。领钱儿可以依据本金保障计划，为债权受让人垫付债权转让对价。</li>
            </ul>

            <h4>第六条：领钱儿的居间服务费等收费</h4>
            <ul style="list-style-type: none">
                <li>6.1
                    居间服务费是指因居间服务人（即领钱儿）为借款人与出借人提供交易信息、信用咨询、信用评估、还款提醒、账户管理、还款特殊情况沟通、债权转让各项委托等系列相关服务而由借款人与出借人分别支付给领钱儿的报酬。</li>
                <li>6.2
                    借款人同意在借款成功时根据借款类型的不同向领钱儿支付居间服务费、履约保证金等费用，此笔费用借款人委托领钱儿在借款成功时从借款本金中直接扣除。</li>
                <li>6.3
                    借款人同意在借款成功后按月向领钱儿支付账户管理费用，此笔费用借款人应当按月主动向领钱儿指定账户支付，同时借款人同意由领钱儿在借款到账时直接扣除。</li>
                <li>6.4
                    出借人同意在借款成功后按月向领钱儿支付本次借款所得利息的一定比例作为居间服务费，此笔费用出借人与借款人一致同意领钱儿在借款人支付借款本息时直接扣除。</li>
                <li>6.5
                    如借款人通过其他第三方提供的中介服务而签订本借款协议的，或借款人与第三方签订了与本借款协议有关的领钱儿认可的其他协议的，借款人委托领钱儿在借款成功时从借款本金中直接扣除借款人应支付给第三方的相关费用，由领钱儿代为扣除并直接和第三方结算。</li>
            </ul>

            <h4>第七条：违约责任</h4>
            <ul style="list-style-type: none">
                <li>7.1
                    本协议各方均应严格履行协议义务，任何一方违约，违约方应承担因违约使其他各方产生的费用和损失，包括但不限于调查费、诉讼费、律师费等。</li>
                <li>7.2
                    出借人和借款人双方同意,若借款人出现如下任何一种情况,则本协议项下的全部借款自动提前到期,借款人在收到领钱儿发出的借款提前到期或解除合同等通知后，应立即清偿全部本金、利息、逾期利息及根据本协议产生的其他全部费用：</li>
                <li>7.2.1 借款人因任何原因逾期支付任何一期还款超过 3 天的；</li>
                <li>7.2.2 借款人的工作单位、职务或住所变更后，未在 30 天内通知领钱儿；</li>
                <li>7.2.3 借款人发生影响其清偿本协议项下借款的其他不利变化，未在 7 天内通知领钱儿。</li>
                <li>7.3 若借款人逾期 60 天支付任何一期还款的，借款人应当按照借款余额的 20%支付违约金。</li>
                <li>7.4 借款人的每期还款均应按照如下顺序清偿：</li>
                <li>7.4.1 根据本协议产生的除本款 7.4.2--7.4.6 项之外的其他全部费用；</li>
                <li>7.4.2 罚息；</li>
                <li>7.4.3 拖欠的利息；</li>
                <li>7.4.4 拖欠的本金；</li>
                <li>7.4.5 正常的利息；</li>
                <li>7.4.6 正常的本金。</li>
                <li>7.5 双方同意,借款人有权提前清偿全部或者部分借款而不承担任何的违约责任(借款超过 1 日不足 1个月者利息按足月计算)。</li>
            </ul>
            <h4>第八条：法律适用和管辖</h4>
            <ul style="list-style-type: none">
                <li>8.1 本协议的签订、履行、终止、解释均适用中华人民共和国法律,并由领钱儿注册地北京市朝阳区人民法院管辖。</li>
            </ul>

            <h4>第九条：特别条款</h4>
            <ul style="list-style-type: none">
                <li>9.1 出借人保证，用于出借的资金是合法取得的资金。同时借款人保证，借款人将借款用于合法用途，不将所借款项用于任何违法活动(包括但不限于赌博、吸毒、贩毒、卖淫嫖娼等)及一切高风险投资(如证券期货、彩票等)。如借款人违反前述保证或有违反前述保证的嫌疑，则出借人有权采取下列措施：</li>
                <li>9.1.1 宣布提前收回全部借款；</li>
                <li>9.1.2 出借人向公安等有关行政机关举报,追回此款并追究借款人的刑事责任，出借人和借款人均同意并授权领钱儿采取前述措施。</li>
                <li>9.2
                    借款人和出借人均不得利用领钱儿平台进行信用卡套现和其他洗钱等不正当交易行为,若有发现，领钱儿有权向公安等有关行政机关举报,追究其相关法律责任。</li>
                <li>9.3 借款人以各种方式提供的如下联络通讯方式以供接收与本协议有关的各项通知（包括但不限于还款通知、债权转让通知等）： </li>
                <li>9.3.1 移动电话（如有），其中短信方式发送的短信成功发出即为有效送达；</li>
                <li>9.3.2 QQ（如有），QQ 消息发送成功时即为有效送达；</li>
                <li>9.3.3 电子邮箱（如有），邮件发送成功时即为有效送达；</li>
                <li>9.3.4 领钱儿提供的借款人站内短信，站内短信发送成功时即为有效送达；</li>
                <li>9.3.5 邮件快递：以借款人身份证（或营业执照）地址为准，收寄后三个工作日或邮件签收两者之间先到者即为有效送达；</li>
                <li>9.3.6 当面送达的，以借款人签收的书面文件中落款标明的日期为有效送达日期。借款人认可上述联络通讯方式中任意一种接收到通知即对借款人产生法律效力。</li>
            </ul>
            <h4>第十条：其他</h4>
            <ul style="list-style-type: none">
                <li>10.1 本协议采用电子文本形式制成,以网络点击的方式在领钱儿签订，出借人、借款人均委托领钱儿保管本协议。</li>
                <li>10.2 本协议自借款人在领钱儿发布的借款标的审核成功之日即本协议题头标明的签订日起生效。</li>
                <li>10.3 借款人、出借人在履行本协议过程中，应遵守领钱儿在网站上公开发布的在法律允许范围内的各项规则规定。</li>
                <li>10.4 出借人、借款人一致同意、授权或认可，领钱儿作为网络借款的中间平台根据本协议的规定、委托和领钱儿的其他规定行使各项权利、发出各项通知或采取各项措施，一切法律后果和风险均由借款人或出借人承担。</li>
            </ul>
        </div>
        <div style="padding: 30px 0px 0px 30px;">
            <div style="padding-bottom: 50px;">借款人：xxxx</div>
            <div style="padding-bottom: 50px;">出借人：xxxx</div>
            <div style="padding-bottom: 50px;">居间服务方：北京睿博盈通网络科技有限公司</div>
        </div>
    </div>
    <p class="MsoNormal" style="text-align: justify; text-indent: 2em;">&nbsp;</p>
    <p class="MsoNormal">
        <span></span>
    </p>
</div>
</body>
</html>