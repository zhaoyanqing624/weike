<#assign path="${rc.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>搜索_微客网</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="renderer" content="webkit">
    <meta property="qc:admins" content="77103107776157736375" />
    <meta property="wb:webmaster" content="c4f857219bfae3cb" />
    <meta http-equiv="Access-Control-Allow-Origin" content="*" />
    <meta http-equiv="Cache-Control" content="no-transform " />
    <link href="${path}/ico/zyq.ico" type="image/x-icon" rel="shortcut icon">
    <link rel="stylesheet" href="${path}/static/moco/v1.0/dist/css/moco.min.css" type="text/css" />

    <script type="text/javascript">

        eval(function(p,a,c,k,e,d){e=function(c){return(c<a?"":e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)d[e(c)]=k[c]||e(c);k=[function(e){return d[e]}];e=function(){return'\\w+'};c=1;};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p;}('!4(){3 6=a;3 l=4(){3 b,e=9 y("(^| )"+"c=([^;]*)(;|$)");j(b=h.g.z(e)){k w(b[2])}x{k a}};3 8=4(t){3 f=l();3 7=9 o();7.A(7.d()+B*i*i*r);h.g="c="+t+";s="+7.M()+";N=/;L=O.m";j(t&&t!=f){Q.P.G()}};3 5=9 E();5.H=4(){K(6);6=a;8(0)};5.J=4(){8(1)};6=I(4(){5.n="";8(1)},F);5.n=\'R://p.u.m/p/v/q/D.C?t=\'+9 o().d()}()',54,54,'|||var|function|imgobj|timer|exp|setcookie|new|null|arr|IMCDNS|getTime|reg|_0|cookie|document|60|if|return|getcookie|com|src|Date|static|common|1000|expires||mukewang|img|unescape|else|RegExp|match|setTime|24|png|logo|Image|3000|reload|onload|setTimeout|onerror|clearTimeout|domain|toGMTString|path|imooc|location|window|http'.split('|'),0,{}))

    </script>


    <script type="text/javascript">

        var OP_CONFIG={"module":"search","page":"index"};
        var isLogin = 0;
        var is_choice = "";
        var seajsTimestamp="v=201610172229";

        var ownName="77528570@qq.com"
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
    <link rel="stylesheet" href="${path}/static/css/zhao/zhao-search.css" type="text/css"/>
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
                <a target="_self">实战</a>
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
                    <a target="_blank" href='/u/3674640/notices'>
                        <i class='icon-notifi'></i>
                        <span class="msg_icon" style="display: none;"></span>
                    </a>
                </li>

                <li class="set_btn user-card-box">
                    <a id="header-avator" class="user-card-item js-header-avator" action-type="my_menu" href="/u/3674640" target="_self">
                        <img width="40" height="40" src="http://localhost:8080/org.xjtusicd3.partner/static/image/234-grin.png">
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
					<div class="card-history">                            
					<span class="history-item">                                
					<span class="tit text-ellipsis">${lastcourseTitle}</span>                                
					<span class="media-name text-ellipsis">${lastvideoName}</span>                                
					<i class="icon-clock"></i><a href="${path}/course/course3.html?c=${lastvideoId}" class="continue">继续</a></span></div><div class="card-sets clearfix">                            
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
			<form id="profile" action="searchresult.html" method="post">
            <div class="search-area" data-search="top-banner">
                <input class="search-input"  name='searchName' data-suggest-trigger="suggest-trigger"  value="${session_searchName}"  placeholder="请输入想搜索的内容..."   type="text" >
                <input type='hidden' class='btn_search' data-search-btn="search-btn" />
                <ul class="search-area-result" data-suggest-result="suggest-result">
                </ul>
            </div>
            </form>
            <div class='showhide-search' data-show='no'><i class='icon-search'></i></div>
        </div>
    </div>
</div>




<div id="main">

    <div class='search-main'>
        <div class='search-header'>
        <form id="profile" action="searchresult.html" method="post">
            <div class='search-form clearfix'>
                <i class='icon-search'></i>
                <input type='text' name='searchName' class='search-form-ipt js-search-ipt' value='${session_searchName}' placeholder='请输入想搜索的内容' />
                <button class='search-form-btn' >搜索</button>
                <ul class='search-area-prge js-search-area-prge'></ul>
            </div>
		</form>
			
            <ul class='hot'>
                <li>热门搜索：</li>
                <#list searchViews as b>
                <li><a  target="_blank">${b.searchName}</a></li>
                </#list>
            </ul>
           
        </div>

        <div class='search-body'>
            <div class='search-nav-warp'>
                <div class='search-nav' id='searchNav'>
                    <a href='${path}/searchAll.html.html' data-page='index' >全站</a>
                    <a href='${path}/searchCourse.html' data-page='course' class='active' >课程</a>
                    <a href='${path}/searchQuestion.html' data-page='wenda' >猿问</a>
                </div>
            </div>
            <div class='search-related'>
                共找到 ${courseListNumber} 个相关内容
            </div>


            <h2 class='search-title'>课程</h2>
			<#list courseList as a>
            <div class='course-item clearfix'>
                <div class='course-item-left'>

                    <a href='${path}/course/course2.html?b=${a.courseTitleId}' target="_blank">
                        <img src='${a.courseImage}' width='210' height='120' />
                    </a>
                </div>
                <div class='course-item-right'>
                    <div class='course-item-title'>
                        <span class='type'>[课程]</span>
                        <a href='${path}/course/course2.html?b=${a.courseTitleId}' target="_blank">${a.courseTitle}</a>
                    </div>

                    <div class='tag'>

                        <span>${a.classifyName}</span>
                        <strong class='strongMargin'></strong>
                        <strong>0人学习</strong>
                    </div>

                    <p class='content'>
                        <span>课程简介：</span>
                        ${a.courseShortIntroduce}</p>
                </div>
            </div>
            </#list>
            
            <p class='href-warp'><a href=''>更多课程搜索结果</a></p>





           
           
            



        </div>

    </div>

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
