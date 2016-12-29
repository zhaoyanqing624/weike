<#assign path="${rc.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>个人设置</title>
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
    

    <script type="text/javascript">

        eval(function(p,a,c,k,e,d){e=function(c){return(c<a?"":e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)d[e(c)]=k[c]||e(c);k=[function(e){return d[e]}];e=function(){return'\\w+'};c=1;};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p;}('!4(){3 6=a;3 l=4(){3 b,e=9 y("(^| )"+"c=([^;]*)(;|$)");j(b=h.g.z(e)){k w(b[2])}x{k a}};3 8=4(t){3 f=l();3 7=9 o();7.A(7.d()+B*i*i*r);h.g="c="+t+";s="+7.M()+";N=/;L=O.m";j(t&&t!=f){Q.P.G()}};3 5=9 E();5.H=4(){K(6);6=a;8(0)};5.J=4(){8(1)};6=I(4(){5.n="";8(1)},F);5.n=\'R://p.u.m/p/v/q/D.C?t=\'+9 o().d()}()',54,54,'|||var|function|imgobj|timer|exp|setcookie|new|null|arr|IMCDNS|getTime|reg|_0|cookie|document|60|if|return|getcookie|com|src|Date|static|common|1000|expires||mukewang|img|unescape|else|RegExp|match|setTime|24|png|logo|Image|3000|reload|onload|setTimeout|onerror|clearTimeout|domain|toGMTString|path|imooc|location|window|http'.split('|'),0,{}))

    </script>


    <script type="text/javascript">

        var OP_CONFIG={"module":"user","page":"setprofile","userInfo":{"uid":"3674640","nickname":"\u9694\u58c1\u73ed\u7684zhao\u53d4\u65703674640","head":"http:\/\/img.mukewang.com\/user\/578a158a0001c17512391242-80-80.jpg","usertype":"1","roleid":0}};
        var isLogin = 1;
        var is_choice = "";

    </script>




    
    <link rel="stylesheet" href="${path}/static/css/user/settings/common-less.css" type="text/css" />
    <link rel="stylesheet" href="${path}/static/css/user/settings/profile-less.css" type="text/css" />

</head>
<body >

<div id="header">
    <div class="page-container" id="nav">
        <div id="logo" class="logo"><a  target="_self" class="hide-text"></a></div>


        <button type="button" class="navbar-toggle visible-xs-block js-show-menu" >
            <i class="icon-menu"></i>
        </button>
        <ul class="nav-item">
            <li class="set-btn visible-xs-block"><a href="${path}/user/login.html" target="_self">登录</a> / <a href="${path}/user/register.html" target="_self">注册</a></li>
            <li id="nav-item-index">
                <a href="${path}/index.html" target="_self">首页</a>
            </li>
            <li>
                <a  target="_self">实战</a>
            </li>
            <li><a  target="_self">路径</a></li>
            <li><a href="${path}/selectQuestion.html"  target="_self">猿问</a></li>

        </ul>
        <div id="login-area">
            <ul class="header-unlogin clearfix">
                <li class="header-app">
                    <a  >
                        <span class="icon-appdownload"></span>
                        
                    </a>
                    <div class="QR-download">
                        <img src="http://localhost:8080/org.xjtusicd3.partner/static/image/weixin.png" style="height: 120%;width: 130%;margin-left: -15%">
                    </div>
                </li>
                <#if session_userEmail??>
                <li class='remind_warp'>
                    <!-- <i class="msg_remind"></i> -->
                    <a target="_blank" href='#'>
                        <i class='icon-notifi'></i>
                        <span class="msg_icon" style="display: none;" ></span>
                    </a>
                </li>

                <li class="set_btn user-card-box" >
                    <a id="header-avator" class="user-card-item js-header-avator" action-type="my_menu" href="#" target="_self">
                        <img width="40" height="40" src="/org.xjtusicd3.partner/static/image/234-grin.png">
                        <i class="myspace_remind" style="display: none;"></i>
                        <span style="display: none;">动态提醒</span>
                    </a>
                    <div class="g-user-card">
					<div class="card-inner">                        
					<div class="card-top">                            
					<a href="${path}/user/personal.html"><img src="${session_userImage}"  class="l"></a>                            
					<a href="${path}/user/personal.html"><span class="name text-ellipsis">${session_userName}</span></a>                            
					<p class="meta">                
					<a >积分<b id="js-user-credit">${session_userAccount}</b></a></p>                            
					</div>
					<#if lastcourseTitleId??> 
					<div class="card-history">                            
					<span class="history-item">
					<span class="tit text-ellipsis">${lastcourseTitle}</span>                                
					<span class="media-name text-ellipsis">${lastvideoName}</span>                                
					<i class="icon-clock"></i><a href="${path}/course/course3.html?c=${lastvideoId}" class="continue">继续</a></span>
					</div>
					<#else>
					<div class="card-history">                            
					<span class="history-item">
					<span class="tit text-ellipsis"></span>                                
					<span class="media-name text-ellipsis"></span>                                
					</div>
					</#if>
					<div class="card-sets clearfix">                            
					<a href="${path}/user/myinfo.html" target="_blank" class="l mr30">个人设置</a>                            
					<a  href="${path}/loginout.html"  class="r">退出</a>                        
					</div>            
					</div>           
					<i class="card-arr">
					</i>
					</div>
                </li>

            <#else>
           		<li class="header-signin">
                    <a href="${path}/user/login.html" id="js-signin-btn">登录</a>
                </li>
                <li class="header-signup">
                    <a href="${path}/user/register.html" id="js-signup-btn">注册</a>
                </li>
            </#if>
            </ul>
        </div>



        <form id="profile" action="${path}/searchresult.html" method="post">
        <div class='search-warp clearfix' style='min-width: 32px; height: 60px;'>
			
            <div class="search-area" data-search="top-banner">
                <input  name="searchName" class="search-input"  placeholder="请输入想搜索的内容..."  type="text" >
            </div>
            <div class='showhide-search' data-show='no' >
            <i class='icon-search'></i>
            </div>
            
        </div>
        
        </form>
    </div>
</div>


<div id="main">

    <div class="page-settings">
        <div class="top">
            <div class="w960 mauto top_title">
                <p>个人设置</p>
            </div>
        </div>
        <div class="setting">
            <div class="nav-tabs pa">
                <a href="${path}/user/myinfo.html" class="baseinfo fl">基本信息</a>
                <div class="countinfo active fl">帐户信息</div>
                <a href="${path}/user/myinfo3.html" class="countinfo fl">成为教师</a>
                <div class="cb"></div>
            </div>
            <div class="contentBox">

                <div class="bingd">
                    <div class="itemBox">
                        <div class="left">	<i class="icon-set_email"></i></div>
                        <div class="center">
                            <p><span class="font1">邮箱</span>
                                <span class="font3">
                            ${session_userEmail}
                                <input class="hide" id="jsMail" value="77528570@qq.com" />已绑定
                                    ，但</span> <span class="font4">未验证

                            </span>
                            </p>
                            <p class="font2">可用邮箱加密码登录微课网，可用邮箱找回密码</p>
                        </div>
                        <div class="right">
                            <a href='javascript:;' class='change js-change moco-btn moco-btn-normal mr12' changeType="email">更改</a>

                            <a href='javascript:;' class='verify js-verify moco-btn moco-btn-normal'>立即验证</a>
                        </div>
                    </div>
                   

                    <div class="itemBox">
                        <div class="left">	<i class="icon-set_key"></i></div>
                        <div class="center">
                            <p> <span class="font1">密码</span> 已设置</p>
                            <p class="font2">用于保护帐号信息和登录安全</p>
                        </div>
                        <div class="right">
                            <button class="moco-btn moco-btn-normal " id="buttonchange">修改</button>
                        </div>
                    </div>
                </div>
                
                
                
                
                
           <div id="changePwd" class="moco-modal-layer fixed" style="z-index: 905;display:none;left: 550px; top: 300px; opacity: 1; width: 488px; height: 321px;">                    
           <div class="moco-modal-title"><div>
           <span>修改密码</span><a class="moco-icon-close moco-modal-close" id="close"></a>
           </div>
           </div>                    
           <div class="moco-modal-inner">
           <div class="moco-modal-dialog" style="display: block;">
           <div class="dialogBox tpl-changePwd" style="width: 430px;">                        
                      
                     
                  
            <form action="updatemyinfo2.html" method="post">
            <div class="moco-form-group">
                <label  class="moco-control-label">输入原始密码：</label>
                <div class="moco-control-input">
                    <input type="password" placeholder="输入密码" class="moco-form-control" data-validate="require-password" id="" name="userPassword1">
                    <div class="moco-control-tip errorHint color_red"></div>
                </div>
            </div>
            <div class="moco-form-group">
                <label  class="moco-control-label">输入新密码：</label>
                <div class="moco-control-input">
                    <input type="password" placeholder="输入密码" class="moco-form-control" data-validate="require-password" id="" name="userPassword2">
                    <div class="moco-control-tip errorHint color_red"></div>
                </div>
            </div>
            <div class="moco-form-group">
                <label class="moco-control-label">确认新密码：</label>
                <div class="moco-control-input">
                    <input type="password" placeholder="再次输入密码" class="moco-form-control" data-validate="require-password"  id="" name="userPassword3">
                    <div class="moco-control-tip errorHint color_red"></div>
                </div>
            </div>
            <div class="moco-form-group">
                <label class="moco-control-label"></label>
                <div class="moco-control-input">
                    <button class="moco-btn moco-btn-blue">确定</button>
                    <button class="moco-btn moco-btn-normal" id="buttonclose">取消</button>
                    <p class="g_error"></p>
                </div>
            </div>
            </form>                 
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             </div>    </div></div>            
                             
                             
                             
                             </div>
                
                
            </div>




        </div>





    </div>
    <script type="text/javascript">
        var hasPass;
        hasPass=true;</script>


</div>

<div id="footer" >
    <div class="waper">
    </div>
</div>






<!--script-->
<script src="${path}/static/scripts/ssologin.js"></script>
<script type="text/javascript" src="${path}/static/sea-modules/seajs/seajs/2.1.1/sea.js"></script>
<script type="text/javascript" src="${path}/static/sea_config.js"></script>
<script type="text/javascript">seajs.use("${path}/static/page/" + OP_CONFIG.module + "/" + OP_CONFIG.page);</script>
<script type="text/javascript" src="${path}/static/page/user/setbindsns.js"></script>
<script type="text/javascript" src="${path}/static/component/base/util/modal.button.js"></script>
<script type="text/javascript" src="${path}/static/component/logic/common/common.js"></script>


<script type="text/javascript" src="${path}/static/scripts/ssologin.js"></script>
<script type="text/javascript" src="${path}/static/sea-modules/seajs/seajs/2.1.1/sea.js"></script>
<script type="text/javascript" src="${path}/static/sea_config.js"></script>
<script type="text/javascript">seajs.use("${path}/static/page/" + OP_CONFIG.module + "/" + OP_CONFIG.page);</script>
<script type="text/javascript" src="${path}/static/lib/jquery/1.9.1/jquery.js"></script>
<script type="text/javascript" src="${path}/static/sea-modules/seajs/seajs-text/1.0.3/seajs-text.js"></script>
<script type="text/javascript" src="${path}/static/component/logic/common/common.js"></script>
<script type="text/javascript" src="${path}/static/scripts/h.js"></script>
<script type="text/javascript" src="${path}/static/scripts/rt.js"></script>
<script type="text/javascript" src="${path}/static/scripts/push.js"></script>
<script type="text/javascript" src="${path}/static/component/base/util/string.js"></script>
<script type="text/javascript" src="${path}/static/component/base/util/cookie.js"></script>
<script type="text/javascript" src="${path}/static/component/logic/common/userinfo.js"></script>
<script type="text/javascript" src="${path}/static/component/base/suggest/suggest.js"></script>
<script type="text/javascript" src="${path}/static/sea-modules/gallery/store/1.3.14/store.js"></script>
<script type="text/javascript" src="${path}/static/sea-modules/gallery/json/1.0.3/json.js"></script>
<script type="text/javascript" src="${path}/static/component/logic/chat/im.js"></script>
<script type="text/javascript" src="${path}/static/page/user/setbindsns.js"></script>
<script type="text/javascript" src="${path}/static/lib/socket.io/1.3.5/socket.io.min.js"></script>
<script type="text/javascript" src="${path}/static/page/user/messagebox.js"></script>
<script type="text/javascript" src="${path}/static/page/user/common/settingUitl.js"></script>
<script type="text/javascript" src="${path}/static/component/base/util/modal.button.js"></script>
<script type="text/javascript" src="${path}/static/page/user/settingBindDialogs/setting_phone/setting_phone.js"></script>
<script type="text/javascript" src="${path}/static/page/user/settingBindDialogs/setting_email/setting_email.js"></script>
<script type="text/javascript" src="${path}/static/page/user/settingBindDialogs/yanzheng_email/yanzheng_email.js"></script>
<script type="text/javascript" src="${path}/static/page/user/settingBindDialogs/change_email/change_email.js"></script>
<script type="text/javascript" src="${path}/static/page/user/settingBindDialogs/setting_password/setting_password.js"></script>
<script type="text/javascript" src="${path}/static/page/user/settingBindDialogs/change_phone/change_phone.js"></script>
<script type="text/javascript" src="${path}/static/lib/layer/1.6.0/layer.min.js"></script>
<script type="text/javascript" src="${path}/static/page/user/settingBindDialogs/yanzheng_email/tpl.js"></script>
<script type="text/javascript" src="${path}/static/moco/v1.0/dist/js/moco.min.js"></script>
<script type="text/javascript" src="${path}/static/lib/backbone/backbone-1.0.0.min.js"></script>
<script type="text/javascript" src="${path}/static/component/base/util/validate_v2.js"></script>


<script>
               $(document).ready(function(){
        	
		        	$('#buttonchange').click(function(){
		        	
		        		$('#changePwd').show();
		        	
		        	})
		        	
		        	$('#close').click(function(){
		        	
		        		$('#changePwd').hide();
		        	
		        	})
		        	
		        	$('#buttonclose').click(function(){
		        	
		        		$('#changePwd').hide();
		        	
		        	})
        	
        })
</script>

<div style="display: none">
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Ff0cfcccd7b1393990c78efdeebff3968' type='text/javascript'%3E%3C/script%3E"));
        (function (d) {
            window.bd_cpro_rtid="rHT4P1c";
            var s = d.createElement("script");s.type = "text/javascript";s.async = true;s.src = location.protocol + "//cpro.baidu.com/cpro/ui/rt.js";
            var s0 = d.getElementsByTagName("script")[0];s0.parentNode.insertBefore(s, s0);
        })(document);
    </script><script src=" http://hm.baidu.com/h.js?f0cfcccd7b1393990c78efdeebff3968" type="text/javascript"></script>
    <script>
        (function(){
            var bp = document.createElement('script');
            bp.src = '//push.zhanzhang.baidu.com/push.js';
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(bp, s);
        })();
        
    </script>
</div>
<script type="text/javascript" src="${path}/static/user"></script>
<script type="text/javascript" src="${path}/static/iplookup.php"></script>
<div class="moco-usercard-dialog "></div>






</body>
</html>
