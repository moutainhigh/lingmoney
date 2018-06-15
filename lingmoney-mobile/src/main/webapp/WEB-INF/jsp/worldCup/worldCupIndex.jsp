<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="viewport"
    content="width=device-width,initial-scale=1.0,maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>领钱儿-测测你的“伪球迷”指数</title>
<style type="text/css">
    /*em设置*/
            
html {
    font-size: 100%;
}

ul,ol,li,p {
    list-style: none;
    margin: 0px;
    padding: 0px;
}
            
html,body,.screen {
    position: relative;
    width: 100%;
    height: 100%;
    margin: 0 auto;
}

.main {
    position: absolute;
    width: 100%;
    max-width: 7.5rem;
    left: 50%;
    overflow-y: auto;
    -webkit-overflow-scrolling: touch;
    transform: translate(-50%, 0);
    -webkit-transform: translate(-50%, 0);
    -moz-transform: translate(-50%, 0);
    -o-transform: translate(-50%, 0);
    transform: translate(-50%, 0);
}
            
.world-cup {
    line-height: 0rem;
    font-size: 0rem;
}

.world-cup img {
    width: 100%;            
}           
.begin_testing a {
    position: absolute;
    width: 3.53rem;
    height: 0.59rem;
    top: 11.1rem;
    left: 2.08rem;
    background-size: 100%;
    color: #FFFFFF;
    font-size: 0.25rem;
    text-align: center;
    line-height: 0.6rem;
    text-decoration: none;
}
.begin-huod{
   width: 1rem;
    height: 0.3rem;
    position: absolute;
    left: 50%;
    margin-left: -0.5rem;
    bottom: 0.37rem
}             
.index-Popup-bg {
    width: 100%;
    height: 100%;
    position: fixed;
    opacity: 0.5;
    background: #000;
    z-index: 9999;
    left: 0;
    top: 0;
    display:none    
}
</style>
</head>
<body>
    <div class="screen">
        <div class="main">
            <div class="world-cup">
        <img src="http://static.lingmoney.cn/lingmoneywap/images/a0e0646c-4214-4726-85f3-78d3b9403ccd.jpg" />
        
                <div class="begin_testing">
                    <a href="/worldCup/worldAnswer?token=${token}" id="alink">
                        <img src="http://static.lingmoney.cn/lingmoneywap/images/b18e2491-5248-4703-948f-f82c9585d1b0.png" />
                    
                    </a>
                </div>
                
                
                <div  class="begin-huod"></div>
                
            </div>
        </div>
        <div class="index-Popup-bg" ></div>
        
        <!-- 活动规则 -->
        <div class="huod-tip" style="width:5.52rem;height:7.33rem;display:none; position:fixed; z-index:10000; top:10%;left:50%;margin-left:-2.76rem; background: url('http://static.lingmoney.cn/lingmoneywap/images/a3af3481-8c6e-4a98-a8ca-fb7ee8975a7e.png') no-repeat top center;background-size:100%;">
            <p style="    font-size: 0.24rem;padding-top: 1.5rem;width: 4.2rem;margin: 0 auto;height: 5.8rem;color: #666;line-height: 0.48rem;">
                1.  本测试一共10题，题目随机。<br>
                2.  答题完成后直接显示结果并获得奖励。<br>
                3.  领取现金红包奖励需输入手机号验证联系方式。<br>
                4.  红包为复投红包，第一次投资及新手标皆不可用。<br>
                5.  投资红包规则：6月期及以上产品，投资金额2万元以上；<br>
                6.  红包有效期限：有效期7天；
                
            </p>
            <div style="text-align:center;"><img src="http://static.lingmoney.cn/lingmoneywap/images/8898a2c4-cbfb-488b-8702-ef27ef78eac0.png" class="closed"/></div>
        </div>
        <!-- 活动规则 -->
    </div>
    <input type="hidden" class="token1">
    <div id="jsondata"></div>
    
    <script type="text/javascript" src="/resource/js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="/resource/js/worldCupcommon.js"></script>
    <script>
    
(function(doc, win) {
    
     $('.begin-huod').click(function(){
         $('.index-Popup-bg').show();
         $('.huod-tip').show();
      })
     $('.closed').click(function(){
         $('.index-Popup-bg').hide();
         $('.huod-tip').hide();
      })
      
      
    //获取RUL参数值
      var urlTools = {
          getUrlParam: function(name) { /*?videoId=identification  */
              var params = decodeURI(window.location.search); /* 截取？号后面的部分    index.html?act=doctor,截取后的字符串就是?act=doctor  */
              var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
              var r = params.substr(1).match(reg);
              if (r != null) return unescape(r[2]);
              return null;
          }
      };
      
      var needLogin = urlTools.getUrlParam("needLogin");
      var isLogin = urlTools.getUrlParam("isLogin");
      token = urlTools.getUrlParam("token");
     $('.token1').val(token)
      //ios Android判断
   var u = navigator.userAgent;
      var ua = navigator.userAgent.toLowerCase();
      var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Adr') > -1; //android终端
      var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端



	if(isiOS){
        if(needLogin=='N'){

             $('#alink').attr('href','/gotoLogin')

        }else{
           
        	  $('#alink').attr('href','/worldCup/worldAnswer?token='+$('.token1').val());
            }
        }else if(isAndroid){
            if(isLogin==1){
            	 $('#alink').attr('href','/gotoLogin')
            }else{
            	  $('#alink').attr('href','/worldCup/worldAnswer?token='+$('.token1').val());
                }
 
        }

	

      
      
        
      
      

      
        var docEl = doc.documentElement,
            resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
            recalc = function() {
                var clientWidth = docEl.clientWidth;
                if(!clientWidth) return;
                if(clientWidth >= 750) {
                    docEl.style.fontSize = '100px';
                } else {
                    docEl.style.fontSize = 100 * (clientWidth / 750) + 'px';
                }
            };
        if(!doc.addEventListener) return;
        win.addEventListener(resizeEvt, recalc, false);
        doc.addEventListener('DOMContentLoaded', recalc, false);
    })(document, window);
        
        
</script>
</body>
</html>