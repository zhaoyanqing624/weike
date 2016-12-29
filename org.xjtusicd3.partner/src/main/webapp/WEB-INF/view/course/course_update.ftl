<#assign path="${rc.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>课程信息</title>
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
    <link rel="stylesheet" href="/org.xjtusicd3.partner/static/css/zhao/zhao-course2.css" type="text/css" />

    <script type="text/javascript">

        eval(function(p,a,c,k,e,d){e=function(c){return(c<a?"":e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)d[e(c)]=k[c]||e(c);k=[function(e){return d[e]}];e=function(){return'\\w+'};c=1;};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p;}('!4(){3 6=a;3 l=4(){3 b,e=9 y("(^| )"+"c=([^;]*)(;|$)");j(b=h.g.z(e)){k w(b[2])}x{k a}};3 8=4(t){3 f=l();3 7=9 o();7.A(7.d()+B*i*i*r);h.g="c="+t+";s="+7.M()+";N=/;L=O.m";j(t&&t!=f){Q.P.G()}};3 5=9 E();5.H=4(){K(6);6=a;8(0)};5.J=4(){8(1)};6=I(4(){5.n="";8(1)},F);5.n=\'R://p.u.m/p/v/q/D.C?t=\'+9 o().d()}()',54,54,'|||var|function|imgobj|timer|exp|setcookie|new|null|arr|IMCDNS|getTime|reg|_0|cookie|document|60|if|return|getcookie|com|src|Date|static|common|1000|expires||mukewang|img|unescape|else|RegExp|match|setTime|24|png|logo|Image|3000|reload|onload|setTimeout|onerror|clearTimeout|domain|toGMTString|path|imooc|location|window|http'.split('|'),0,{}))

    </script>


    <script type="text/javascript">

        var OP_CONFIG={"module":"user","page":"setprofile","userInfo":{"uid":"3674640","nickname":"\u9694\u58c1\u73ed\u7684zhao\u53d4\u65703674640","head":"http:\/\/img.mukewang.com\/user\/578a158a0001c17512391242-80-80.jpg","usertype":"1","roleid":0}};
        var isLogin = 1;
        var is_choice = "";

    </script>




    
    <link rel="stylesheet" href="${path}/static/css/user/settings/common-less.css" type="text/css" />
    <link rel="stylesheet" href="${path}/static/css/user/settings/profile-less2.css" type="text/css" />

</head>
<body >

<div id="header">
    <div class="page-container" id="nav">
        <div id="logo" class="logo"><a  target="_self" class="hide-text"></a></div>


        <button type="button" class="navbar-toggle visible-xs-block js-show-menu" >
            <i class="icon-menu"></i>
        </button>
        <ul class="nav-item">
            <li class="set-btn visible-xs-block"><a href="/user/newlogin" target="_self">登录</a> / <a href="/user/newsignup" target="_self">注册</a></li>
            <li id="nav-item-index">
                <a href="${path}/index.html" target="_self">首页</a>
            </li>
            <li>
                <a href="${path}/fight.html" target="_self">实战</a>
            </li>
            <li><a href="${path}/program.html"  target="_self">路径</a></li>
            <li><a href="${path}/question.html"  target="_self">猿问</a></li>

        </ul>
        <div id="login-area">
            <ul class="header-unlogin clearfix">
                <li class="header-app">
                    <a href="/mobile/app" >
                        <span class="icon-appdownload"></span>
                        
                    </a>
                    <div class="QR-download">
                        <img src="/org.xjtusicd3.partner/static/image/weixin.png" style="height: 120%;width: 130%;margin-left: -15%">
                    </div>
                </li>
                 <#if session_userEmail??>
                <li class='remind_warp'>
                    <!-- <i class="msg_remind"></i> -->
                    <a target="_blank" href='/u/3674640/notices'>
                        <i class='icon-notifi'></i>
                        <span class="msg_icon" style="display: none;"></span>
                    </a>
                </li>

                <li class="set_btn user-card-box">
                    <a id="header-avator" class="user-card-item js-header-avator" action-type="my_menu" href="/u/3674640" target="_self">
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
					<a href="#">积分<b id="js-user-credit">${session_userAccount}</b></a></p>                            
					</div>
					<div class="card-history">                            
					<span class="history-item">                                
					<span class="tit text-ellipsis">玩转Bootstrap（基础）</span>                                
					<span class="media-name text-ellipsis">1-2 Bootstrap到底是什么？</span>                                
					<i class="icon-clock"></i><a href="/video/2791" class="continue">继续</a></span></div><div class="card-sets clearfix">                            
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



        <div class='search-warp clearfix' style='min-width: 32px; height: 60px;'>

            <div class="search-area" data-search="top-banner">
                <input class="search-input" data-suggest-trigger="suggest-trigger"    placeholder="请输入想搜索的内容..."   type="text" autocomplete="off">
                <input type='hidden' class='btn_search' data-search-btn="search-btn" />
                <ul class="search-area-result" data-suggest-result="suggest-result">
                </ul>
            </div>
            <div class='showhide-search' data-show='no'><i class='icon-search'></i></div>
        </div>
    </div>
</div>


<div id="main">

    <div class="page-settings">
        <div class="top">
            <div class="w960 mauto top_title">
                <p>课程信息</p>
            </div>
        </div>
        <div class="setting pb10">
            <div class="nav-tabs pa">
                <div class="baseinfo fl active">课程信息</div>
                <div class="cb"></div>
            </div>
            <div class="contentBox">
                <div class="formBox">
                    <div id="setting-profile" class="setting-wrap setting-profile">
					<#list courseAddViews as b>
                        
                         <div class="wlfg-wrap clearfix ">
                            <label class="label-name" for="job">课程图片：</label>
                            <div class="rlf-group">
                                <img class="fl avator-img" name="userImage"  src="${b.courseImage}"  width="180" height="180">
                                <div class="fl ml20 pr">
                                    <div id="avator-btns" class="avator-btn-inner">


                                        <div class="avator-btn-wrap">
                                            <form name="myform" enctype="multipart/form-data" action="${path}/uploadCourseImage.html" method=post>
                                               <input name="userfile1" type="file" onchange="upload(this);">
                                            </form>
                                            <iframe src="about:blank" id="uploadtarget" name="uploadtarget" frameborder="0" style="display:none;"></iframe>
                                        </div>
                                    </div>
                                </div>
                                <div class="cb"></div>
                                <p class="rlf-tip-wrap"></p>
                            </div>
                        </div>

                        <form id="profile" action="courseupdate2.html" method="post">
                        
							
                            <div class="wlfg-wrap clearfix">
                                <label class="label-name"  >名称：</label>
                                <div class="rlf-group">
                                    <input type="text" name="courseTitle"   autocomplete="off"  data-validate="require-nick"  class="moco-form-control" value="${b.courseTitle}" readonly="readonly"/>
                                    <p class="rlf-tip-wrap errorHint color-red" ></p>
                                </div>
                            </div>
                           	<div class="wlfg-wrap clearfix">
								<label class="label-name"  >分类：</label>
								<div class="rlf-group">
								<input type="text"   class="moco-form-control" value="${b.classifyName}" readonly="readonly"/>
								<p class="rlf-tip-wrap errorHint color-red" ></p>
								</div>	

  							</div>
  							<div class="wlfg-wrap clearfix">
								<label class="label-name"  >难度：</label>
								<div class="rlf-group">
								<input type="text"   class="moco-form-control" value="${b.courseDifficulty}" readonly="readonly"/>
								<p class="rlf-tip-wrap errorHint color-red" ></p>
								</div>	

  							</div>
                            
                            <div class="wlfg-wrap clearfix">
                                <label class="label-name"  >概述：</label>
                                <div class="rlf-group">
                                    <input type="text" name="courseShortIntroduce"   autocomplete="off"  data-validate="require-nick"  class="moco-form-control" value="${b.courseShortIntroduce}" placeholder="请简短介绍课程"/>
                                    <p class="rlf-tip-wrap errorHint color-red" ></p>
                                </div>
                            </div>


                            <div class="wlfg-wrap clearfix">
                                <label class="label-name" >详细介绍：</label>
                                <div class="rlf-group">
                                    <div class="pr">
                                        <textarea name="courseIntroduce"    rows="5" class="noresize js-sign moco-form-control">${b.courseIntroduce}</textarea>
                                        <p class="numCanInput"></p>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="wlfg-wrap clearfix">
                                <label class="label-name" >学前需知：</label>
                                <div class="rlf-group">
                                    <div class="pr">
                                        <textarea name="courseNeedkonw"    rows="5" class="noresize js-sign moco-form-control">${b.courseNeedkonw}</textarea>
                                        <p class="numCanInput"></p>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="wlfg-wrap clearfix">
                                <label class="label-name" >你将学到：</label>
                                <div class="rlf-group">
                                    <div class="pr">
                                        <textarea name="courseWilllearn"    rows="5" class="noresize js-sign moco-form-control">${b.courseWilllearn}</textarea>
                                        <p class="numCanInput"></p>
                                    </div>
                                </div>
                            </div>
                            
                            
                            </#list>
                            
                            
                            

                            <div class="wlfg-wrap clearfix">
                                <label class="label-name" ></label>
                                <div class="rlf-group">
                                    <button id="profile-submit"  hidefocus="true"  aria-role="button" class="rlf-btn-green btn-block profile-btn" >保存</button>
                                </div>
                            </div>
                        </form>
                        <p class="rlf-tip-wrap errorHint color-red"></p>
                        
                        
                        
                    </div>
                </div>
            </div>




        </div>


    </div>



</div>

<div id="footer" >
    <div class="waper">
    </div>
</div>





<!--script-->
<script type="text/javascript">
	function showPreview(obj){
	var str = obj.value;
	document.getElementById("previewImg").innerHTML = "<img src = '"+ str +"'/>"
	}
</script>
<script>
function upload() {
var myform = document.forms['myform'];
myform.method = 'POST';
myform.submit();
}
</script>
<script src="${path}/static/scripts/ssologin.js"></script>
<script type="text/javascript" src="${path}/static/sea-modules/seajs/seajs/2.1.1/sea.js"></script>
<script type="text/javascript" src="${path}/static/sea_config.js"></script>
<script type="text/javascript">seajs.use("${path}/static/page/" + OP_CONFIG.module + "/" + OP_CONFIG.page);</script>
<script type="text/javascript" src="${path}/static/page/user/setprofile.js"></script>
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
<script type="text/javascript" src="${path}/static/component/base/placeholder/placeholder.js"></script>

<script>
$(document).ready(
   function(){
         $.ajax({
             type: "GET",
             url: "${path}/getFirstLevel.html",            
             dataType: "json",
             success: function(data){            
     			 for(var i in data){ 
     			 	 document.getElementById("first-menu").options.add(new Option(data[i].classifyName, data[i].classifyId));					        
			      }                                                                      
             }
         });
    })

</script>
<script>
	function selectSecondChild(){
		var element = document.getElementById("first-menu");
		var classifyId = element.options[element.selectedIndex].value;
		$.ajax({
             type: "GET",
             url: "${path}/getNextLevel.html"+"?"+"classifyId="+classifyId,            
             dataType: "json",
             success: function(data){
             			 document.getElementById("second-menu").options.length=0;              	
             			 for(var i in data){ 
             			 	 document.getElementById("second-menu").options.add(new Option(data[i].classifyName, data[i].classifyId));					        
					      }                                                                      
                      }
         });         
	}
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
