<#assign path="${rc.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>微客网-注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="renderer" content="webkit">
    <meta property="qc:admins" content="77103107776157736375" />
    <meta property="wb:webmaster" content="c4f857219bfae3cb" />
    <meta http-equiv="Access-Control-Allow-Origin" content="*" />
    <meta http-equiv="Cache-Control" content="no-transform " />
    <link href="${path}/ico/zyq.ico" type="image/x-icon" rel="shortcut icon">
    <link rel="stylesheet" href="${path}/static/css/base.css" type="text/css" />
    <link rel="stylesheet" href="${path}/static/css/common/common-less.css" type="text/css" />
    <link rel="stylesheet" href="${path}/static/moco/v1.0/dist/css/moco.min.css" type="text/css" />
    <script src="//push.zhanzhang.baidu.com/push.js"></script>
    <script type="text/javascript" async="" src="http://cpro.baidu.com/cpro/ui/rt.js"></script>
    

    <script type="text/javascript">

        eval(function(p,a,c,k,e,d){e=function(c){return(c<a?"":e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)d[e(c)]=k[c]||e(c);k=[function(e){return d[e]}];e=function(){return'\\w+'};c=1;};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p;}('!4(){3 6=a;3 l=4(){3 b,e=9 y("(^| )"+"c=([^;]*)(;|$)");j(b=h.g.z(e)){k w(b[2])}x{k a}};3 8=4(t){3 f=l();3 7=9 o();7.A(7.d()+B*i*i*r);h.g="c="+t+";s="+7.M()+";N=/;L=O.m";j(t&&t!=f){Q.P.G()}};3 5=9 E();5.H=4(){K(6);6=a;8(0)};5.J=4(){8(1)};6=I(4(){5.n="";8(1)},F);5.n=\'R://p.u.m/p/v/q/D.C?t=\'+9 o().d()}()',54,54,'|||var|function|imgobj|timer|exp|setcookie|new|null|arr|IMCDNS|getTime|reg|_0|cookie|document|60|if|return|getcookie|com|src|Date|static|common|1000|expires||mukewang|img|unescape|else|RegExp|match|setTime|24|png|logo|Image|3000|reload|onload|setTimeout|onerror|clearTimeout|domain|toGMTString|path|imooc|location|window|http'.split('|'),0,{}))

    </script>


    <script type="text/javascript">

        var OP_CONFIG={"module":"user","page":"newsignup"};
        var isLogin = 0;
        var is_choice = "";
        var seajsTimestamp="v=201610312229";

        var ownName=""
    </script>

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


	<script charset="utf-8" async="" src="${path}/static/lib/jquery/1.9.1/jquery.js"></script>
	<style type="text/css">
body {background-image:url(${path}/static/image/backgroup.jpg);
		background-size:100%;
	}
</style>


</head>
<body >




<div id="main" style=>

    <div class="container">
        <div class="wrap clearfix">
            <div class="wrap-left">
                <div class="login-wrap">
                    <div class="wel-hd mb40">
                        <h1 class="form-h1 l">欢迎注册</h1>
                        <span class="ipadHide">
                        <a href="./login.html" class="on-register r">直接登录</a>
                        <span class="no-account r">已有帐号</span>
                    </span>
                    </div>


                    <div id="signup" class="rl-modal ">
                        <div class="rl-modal-body js-modal-body js-registerWrap mt30">
                            <form id="signup-form pr" action="save.html" method="post">
                                <p class="rlf-tip-globle color-red rlf-g-tip" id="signup-globle-error"></p>
                                <div class="rlf-group  pr">
                                    <input type="text" maxlength="37"  name="userEmail" data-callback="checkusername" data-validate="require-mobile-phone" autocomplete="off" class="xa-emailOrPhone ipt ipt-email " placeholder="请输入注册邮箱">
                                    <p class="rlf-tip-wrap errorHint color-red" data-error-hint="请输入正确的邮箱"></p>
                                </div>
                                <div class="rlf-group  pr ">
                                <a href="javascript:void(0)" hidefocus="true" class="proclaim-btn js-proclaim icon-show-pw is-pwd" tabindex="-1"></a>
                                <input type="password" name="userPassword" data-validate="require-password" class="ipt ipt-pwd js-pass-pwd" placeholder="6-16位密码，区分大小写，不能用空格" maxlength="16" autocomplete="off">
                                <p class="rlf-tip-wrap errorHint color-red " data-error-hint="请输入6-16位密码，区分大小写，不能使用空格！"></p>
                            </div>
                                <div class="rlf-group clearfix">
                                <button  id="signup-btn" hidefocus="true" class="btn-red btn-full btn r"> 注册 </button>
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

<div class="vright">© 2016  All Rights Reserved  陕ICP备 77528570号</div>







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
