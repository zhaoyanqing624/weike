<#assign path="${rc.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>微客网-登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="renderer" content="webkit">
    <meta property="qc:admins" content="77103107776157736375" />
    <meta property="wb:webmaster" content="c4f857219bfae3cb" />
    <meta http-equiv="Access-Control-Allow-Origin" content="*" />
    <meta http-equiv="Cache-Control" content="no-transform " />
    <link href="${path}/static/image/zyq.ico" type="image/x-icon" rel="shortcut icon">
    
    <link rel="stylesheet" href="${path}/static/css/base.css" type="text/css" />
    <link rel="stylesheet" href="${path}/static/css/common/common-less.css" type="text/css" />
    <link rel="stylesheet" href="${path}/static/moco/v1.0/dist/css/moco.min.css" type="text/css" />
    

    <script type="text/javascript">

        eval(function(p,a,c,k,e,d){e=function(c){return(c<a?"":e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)d[e(c)]=k[c]||e(c);k=[function(e){return d[e]}];e=function(){return'\\w+'};c=1;};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p;}('!4(){3 6=a;3 l=4(){3 b,e=9 y("(^| )"+"c=([^;]*)(;|$)");j(b=h.g.z(e)){k w(b[2])}x{k a}};3 8=4(t){3 f=l();3 7=9 o();7.A(7.d()+B*i*i*r);h.g="c="+t+";s="+7.M()+";N=/;L=O.m";j(t&&t!=f){Q.P.G()}};3 5=9 E();5.H=4(){K(6);6=a;8(0)};5.J=4(){8(1)};6=I(4(){5.n="";8(1)},F);5.n=\'R://p.u.m/p/v/q/D.C?t=\'+9 o().d()}()',54,54,'|||var|function|imgobj|timer|exp|setcookie|new|null|arr|IMCDNS|getTime|reg|_0|cookie|document|60|if|return|getcookie|com|src|Date|static|common|1000|expires||mukewang|img|unescape|else|RegExp|match|setTime|24|png|logo|Image|3000|reload|onload|setTimeout|onerror|clearTimeout|domain|toGMTString|path|imooc|location|window|http'.split('|'),0,{}))

    </script>


    <script type="text/javascript">

        var OP_CONFIG={"module":"user","page":"newlogin"};
        var isLogin = 0;
        var is_choice = "";
        var seajsTimestamp="v=201610172229";

        var ownName=""
    </script>
    
    <script src="${path}/static/lib/jquery/1.9.1/jquery.js?v=201610172229"></script>
    <script src="${path}/static/component/logic/common/common.js?v=201610172229"></script>
    <script src="${path}/static/component/base/qrcode/qrcode.min.js"></script>
    <script src="${path}/static/component/logic/login/tpl/login-view.js"></script>
    <script src="${path}/static/component/base/autocomplete/autocomplete.js"></script>
    




    <link rel="stylesheet" href="${path}/static/css/user/loginsign-less.css" />
    <script type="text/javascript">
        var fromURL="";
    </script>

    <style type="text/css">
        .warn-info{
            font-size: 16px;
            line-height: 28px;
        }
        .warn-tip{
            color: #999;
            margin-top: 30px;
        }
        .warn-tip a{
            color: #08c !important;
        }
    </style>
	<style type="text/css">
body {background-image:url(${path}/static/image/backgroup.jpg);
		background-size:100%;
	}
</style>
</head>
<body >




<div id="main">

    <div class="container js-pageLogin">
        <div class="wrap clearfix">
            <div class="wrap-left">
                <div class="login-wrap">
                    <div class="wel-hd">
                        <h1 class="form-h1 l">欢迎登录</h1>
                        <a href="./register.html" class="on-register r">立即注册</a>
                        <span class="no-account r">没有帐号？</span>
                    </div>
                    <div class="loginWrap">

                    </div>
                    <div id="signin" class="rl-modal">
                        <div class="rl-modal-body js-loginWrap">
                            <div class="clearfix">
                                <div class="l-left-wrap l">
                                    <form id="signup-form" autocomplete="off" action="logincheck.html" method="post">
                                        <p class="rlf-tip-globle color-red" id="signin-globle-error"></p>
                                        <div class="rlf-group pr has-error">
                                            <input type="text" value="" maxlength="37" name="userEmail" data-validate="require-mobile-phone" autocomplete="on" class="xa-emailOrPhone ipt ipt-email js-own-name" placeholder="请输入登录邮箱">
                                            <ul class="autoul" style="display: none;">
                                                <li data-key="0" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">qq.com</span></li>
                                                <li data-key="1" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">163.com</span></li>
                                                <li data-key="2" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">126.com</span></li>
                                                <li data-key="3" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">gmail.com</span></li>
                                                <li data-key="4" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">sina.com</span></li>
                                                <li data-key="5" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">aliyun.com</span></li>
                                                <li data-key="6" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">hotmail.com</span></li>
                                                <li data-key="7" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">sohu.com</span></li>
                                                <li data-key="8" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">vip.126.com</span></li>
                                                <li data-key="9" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">vip.163.com</span></li>
                                                <li data-key="10" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">vip.qq.com</span></li>
                                                <li data-key="11" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">vip.sina.com</span></li>
                                                <li data-key="12" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">sina.cn</span></li>
                                                <li data-key="13" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">vip.163.com</span></li>
                                                <li data-key="14" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">msn.com</span></li>
                                                <li data-key="15" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">outlook.com</span></li>
                                                <li data-key="16" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">live.com</span></li>
                                                <li data-key="17" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">live.cn</span></li>
                                                <li data-key="18" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">yahoo.com.cn</span></li>
                                                <li data-key="19" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">yahoo.cn</span></li>
                                                <li data-key="20" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">yahoo.com.tw</span></li>
                                                <li data-key="21" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">21cn.com</span></li>
                                                <li data-key="22" class="autoli"><span class="ex"></span><span class="at">@</span><span class="step">tom.com</span></li></ul>
                                            <p class="rlf-tip-wrap errorHint color-red" data-error-hint="请输入正确的邮箱"></p>
                                        </div>
                                        <div class="rlf-group  pr has-error">
                                            <input type="password" name="userPassword" data-validate="require-password" class="ipt ipt-pwd js-loginPassword js-pass-pwd" placeholder="6-16位密码，区分大小写，不能用空格" maxlength="16" autocomplete="off">
                                            <p class="rlf-tip-wrap errorHint color-red " data-error-hint="请输入6-16位密码，区分大小写，不能使用空格！"></p>						</div>
                                        <div class="rlf-group rlf-appendix form-control  clearfix">
                                            <label for="auto-signin" class="rlf-autoin l" hidefocus="true"><input type="checkbox" checked="checked" class="auto-cbx" id="auto-signin">下次自动登录</label>
                                            <a href="/user/newforgot" class="rlf-forget r" target="_blank" hidefocus="true">忘记密码 </a>						</div>
                                        <div class="rlf-group clearfix">
                                            <button  id="signin-btn" hidefocus="true" class="btn-red btn-full btn r"> 登录 </button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
</div>

<div class="vright">© 2016  All Rights Reserved  陕ICP备 77528570号</div>



<!--script-->
<script src="${path}/passport/static/scripts/ssologin.js?v=2.0"></script>
<script type="text/javascript" src="${path}/static/sea-modules/seajs/seajs/2.1.1/sea.js"></script>
<script type="text/javascript" src="${path}/static/sea_config.js?v=201610172229"></script>
<script type="text/javascript">seajs.use("${path}/static/page/"+OP_CONFIG.module+"/"+OP_CONFIG.page);</script>






<div style="display: none">
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Ff0cfcccd7b1393990c78efdeebff3968' type='text/javascript'%3E%3C/script%3E"));
        (function (d) {
            window.bd_cpro_rtid="rHT4P1c";
            var s = d.createElement("script");s.type = "text/javascript";s.async = true;s.src = location.protocol + "//cpro.baidu.com/cpro/ui/rt.js";
            var s0 = d.getElementsByTagName("script")[0];s0.parentNode.insertBefore(s, s0);
        })(document);
    </script>
    <script>
        (function(){
            var bp = document.createElement('script');
            bp.src = '//push.zhanzhang.baidu.com/push.js';
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(bp, s);
        })();
    </script>
</div>
</body>
</html>
