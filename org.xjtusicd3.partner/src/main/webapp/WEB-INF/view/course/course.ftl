
<#assign path="${rc.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>微课课程</title>
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

        var OP_CONFIG={"module":"course","page":"list","userInfo":{"uid":3674640}};
        var isLogin = 1;
        var is_choice = "";
        var seajsTimestamp="";

    </script>

<link rel="stylesheet" href="/org.xjtusicd3.partner/static/css/zhao/zhao-course.css" type="text/css" />


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
                <a href="#" target="_self">实战</a>
            </li>
            <li><a href="#"  target="_self">路径</a></li>
            <li><a href="${path}/selectQuestion.html"  target="_self">猿问</a></li>

        </ul>
        <div id="login-area">
            <ul class="header-unlogin clearfix">
                <li class="header-app">
                    <a href="" >
                        <span class="icon-appdownload"></span>
                        
                    </a>
                    <div class="QR-download">
                        <img src="/org.xjtusicd3.partner/static/image/weixin.png" style="height: 120%;width: 130%;margin-left: -15%">
                    </div>
                </li>
                 <#if session_userEmail??>
                <li class='remind_warp'>
                    <!-- <i class="msg_remind"></i> -->
                    <a target="_blank" href='#'>
                        <i class='icon-notifi'></i>
                        <span class="msg_icon" style="display: none;"></span>
                    </a>
                </li>

                <li class="set_btn user-card-box" >
                    <a id="header-avator" class="user-card-item js-header-avator" action-type="my_menu" href="${path}/user/personal.html" target="_self">
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

    <div class="wrap ">
        <div class="top">
            <div class="course-content">
                <div class="course-nav-box">
                    <div class="course-nav-row clearfix">
                        <span class="hd l">方向：</span>
                        <div class="bd">
                            <ul class="">
                                <li class="course-nav-item <#if '${c}'=='all'>on</#if>">
                                    <a href="${path}/course/course.html?c=all">全部</a>
                                </li>
                                <li class="course-nav-item <#if '${c}'=='html'||'${c}'=='javascript'||'${c}'=='html5'||'${c}'=='CSS3'||'${c}'=='jquery'||'${c}'=='nodejs'||'${c}'=='angularjs'||'${c}'=='bootstrap'||'${c}'=='Reactjs'||'${c}'=='vuejs'||'${c}'=='sassless'||'${c}'=='webapp'||'${c}'=='fetool'||'${c}'=='fe'>on</#if>">
                                    <a href="${path}/course/course.html?c=fe" data-ct="fe">前端开发</a>
                                </li>
                                <li class="course-nav-item <#if '${c}'=='php'||'${c}'=='java'||'${c}'=='python'||'${c}'=='C'||'${c}'=='C2'||'${c}'=='Go'||'${c}'=='C3'||'${c}'=='be'>on</#if>">
                                    <a href="${path}/course/course.html?c=be" data-ct="be">后端开发</a>
                                </li>
                                <li class="course-nav-item <#if '${c}'=='android'||'${c}'=='ios'||'${c}'=='Unity3D'||'${c}'=='Cocos2dx'||'${c}'=='mobile'>on</#if>">
                                    <a href="${path}/course/course.html?c=mobile" data-ct="mobile">移动开发</a>
                                </li>
                                <li class="course-nav-item <#if '${c}'=='mysql'||'${c}'=='mongodb'||'${c}'=='Oracle'||'${c}'=='SQLServer'||'${c}'=='data'>on</#if>">
                                    <a href="${path}/course/course.html?c=data" data-ct="data">数据库</a>
                                </li>
                                <li class="course-nav-item <#if '${c}'=='bigdata'||'${c}'=='cloudcomputing'||'${c}'=='cb'>on</#if>">
                                    <a href="${path}/course/course.html?c=cb" data-ct="cb">云计算&大数据</a>
                                </li>
                                <li class="course-nav-item <#if '${c}'=='test'||'${c}'=='linux'||'${c}'=='op'>on</#if>">
                                    <a href="${path}/course/course.html?c=op" data-ct="op">运维&测试</a>
                                </li>
                                <li class="course-nav-item <#if '${c}'=='photoshop'||'${c}'=='maya'||'${c}'=='premiere'||'${c}'=='ZBrush'||'${c}'=='photo'||'${c}'=='all2'>on</#if>">
                                    <a href="${path}/course/course.html?c=photo" data-ct="photo">视觉设计</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="course-nav-row clearfix">
                        <span class="hd l">分类：</span>
                        <div class="bd">
                            <ul class="">
                            	<#if '${c}'=='html'||'${c}'=='javascript'||'${c}'=='html5'||'${c}'=='CSS3'||'${c}'=='jquery'||'${c}'=='nodejs'||'${c}'=='angularjs'||'${c}'=='bootstrap'||'${c}'=='Reactjs'||'${c}'=='vuejs'||'${c}'=='sassless'||'${c}'=='webapp'||'${c}'=='fetool'||'${c}'=='fe'||'${c}'=='all'>
                              	
								
                                <li class="course-nav-item <#if '${c}'=='html'>on</#if>">
                                
                                    <a href="${path}/course/course.html?c=html" data-id=7 data-ct=fe>HTML/CSS</a>
                                </li>

								<li class="course-nav-item <#if '${c}'=='javascript'>on</#if>">
                                    <a href="${path}/course/course.html?c=javascript" data-id=44 data-ct=fe>JavaScript</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='html5'>on</#if>">
                                    <a href="${path}/course/course.html?c=html5" data-id=221 data-ct=fe>Html5</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='CSS3'>on</#if>">
                                    <a href="${path}/course/course.html?c=CSS3" data-id=1262 data-ct=fe>CSS3</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='jquery'>on</#if>">
                                    <a href="${path}/course/course.html?c=jquery" data-id=219 data-ct=fe>jQuery</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='nodejs'>on</#if>">
                                    <a href="${path}/course/course.html?c=nodejs" data-id=222 data-ct=fe>Node.js</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='angularjs'>on</#if>">
                                    <a href="${path}/course/course.html?c=angularjs" data-id=1123 data-ct=fe>AngularJS</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='bootstrap'>on</#if>">
                                    <a href="${path}/course/course.html?c=bootstrap" data-id=1263 data-ct=fe>Bootstrap</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='Reactjs'>on</#if>">
                                    <a href="${path}/course/course.html?c=Reactjs" data-id=1374 data-ct=fe>React.JS</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='vuejs'>on</#if>">
                                    <a href="${path}/course/course.html?c=vuejs" data-id=1423 data-ct=fe>Vue.js</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='sassless'>on</#if>">
                                    <a href="${path}/course/course.html?c=sassless" data-id=1429 data-ct=fe>Sass/Less</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='webapp'>on</#if>">
                                    <a href="${path}/course/course.html?c=webapp" data-id=1260 data-ct=fe>WebApp</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='fetool'>on</#if>">
                                    <a href="${path}/course/course.html?c=fetool" data-id=1261 data-ct=fe>前端工具</a>
                                </li>
								</#if>

								<#if '${c}'=='php'||'${c}'=='java'||'${c}'=='python'||'${c}'=='C'||'${c}'=='C2'||'${c}'=='Go'||'${c}'=='C3'||'${c}'=='be'||'${c}'=='all'>
                                <li class="course-nav-item <#if '${c}'=='php'>on</#if>">
                                    <a href="${path}/course/course.html?c=php" data-id=1 data-ct=be>PHP</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='java'>on</#if>">
                                    <a href="${path}/course/course.html?c=java" data-id=220 data-ct=be>Java</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='python'>on</#if>">
                                    <a href="${path}/course/course.html?c=python" data-id=1118 data-ct=be>Python</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='C'>on</#if>">
                                    <a href="${path}/course/course.html?c=C" data-id=1273 data-ct=be>C</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='C2'>on</#if>">
                                    <a href="${path}/course/course.html?c=C2" data-id=1331 data-ct=be>C++</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='Go'>on</#if>">
                                    <a href="${path}/course/course.html?c=Go" data-id=1358 data-ct=be>Go</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='C3'>on</#if>">
                                    <a href="${path}/course/course.html?c=C3" data-id=1362 data-ct=be>C#</a>
                                </li>

								</#if>
								<#if '${c}'=='android'||'${c}'=='ios'||'${c}'=='Unity3D'||'${c}'=='Cocos2dx'||'${c}'=='mobile'||'${c}'=='all'>
                                <li class="course-nav-item <#if '${c}'=='android'>on</#if>">
                                    <a href="${path}/course/course.html?c=android" data-id=223 data-ct=mobile>Android</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='ios'>on</#if>">
                                    <a href="${path}/course/course.html?c=ios" data-id=955 data-ct=mobile>iOS</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='Unity3D'>on</#if>">
                                    <a href="${path}/course/course.html?c=Unity3D" data-id=1281 data-ct=mobile>Unity 3D</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='Cocos2dx'>on</#if>">
                                    <a href="${path}/course/course.html?c=Cocos2dx" data-id=1361 data-ct=mobile>Cocos2d-x</a>
                                </li>
								</#if>

								<#if '${c}'=='mysql'||'${c}'=='mongodb'||'${c}'=='Oracle'||'${c}'=='SQLServer'||'${c}'=='data'||'${c}'=='all'>
                                <li class="course-nav-item <#if '${c}'=='mysql'>on</#if>">
                                    <a href="${path}/course/course.html?c=mysql" data-id=952 data-ct=data>MySQL</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='mongodb'>on</#if>">
                                    <a href="${path}/course/course.html?c=mongodb" data-id=958 data-ct=data>MongoDB</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='Oracle'>on</#if>">
                                    <a href="${path}/course/course.html?c=Oracle" data-id=1309 data-ct=data>Oracle</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='SQLServer'>on</#if>">
                                    <a href="${path}/course/course.html?c=SQLServer" data-id=1366 data-ct=data>SQL Server</a>
                                </li>


								</#if>
								
								<#if '${c}'=='bigdata'||'${c}'=='cloudcomputing'||'${c}'=='cb'||'${c}'=='all'>
                                <li class="course-nav-item <#if '${c}'=='bigdata'>on</#if>">
                                    <a href="${path}/course/course.html?c=bigdata" data-id=1359 data-ct=cb>大数据</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='cloudcomputing'>on</#if>">
                                    <a href="${path}/course/course.html?c=cloudcomputing" data-id=1122 data-ct=cb>云计算</a>
                                </li>
								</#if>

								<#if '${c}'=='test'||'${c}'=='linux'||'${c}'=='op'||'${c}'=='all'>
                                <li class="course-nav-item <#if '${c}'=='test'>on</#if>">
                                    <a href="${path}/course/course.html?c=test" data-id=1422 data-ct=op>测试</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='linux'>on</#if>">
                                    <a href="${path}/course/course.html?c=linux" data-id=468 data-ct=op>Linux</a>
                                </li>


							   </#if>
							   <#if '${c}'=='photoshop'||'${c}'=='maya'||'${c}'=='premiere'||'${c}'=='ZBrush'||'${c}'=='photo'||'${c}'=='all'>
                               <li class="course-nav-item <#if '${c}'=='photoshop'>on</#if>">
                                    <a href="${path}/course/course.html?c=photoshop" data-id=953 data-ct=photo>Photoshop</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='maya'>on</#if>">
                                    <a href="${path}/course/course.html?c=maya" data-id=956 data-ct=photo>Maya</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='premiere'>on</#if>">
                                    <a href="${path}/course/course.html?c=premiere" data-id=954 data-ct=photo>Premiere</a>
                                </li>



                                <li class="course-nav-item <#if '${c}'=='ZBrush'>on</#if>">
                                    <a href="${path}/course/course.html?c=ZBrush" data-id=1371 data-ct=photo>ZBrush</a>
                                </li>
								</#if>

                            </ul>
                        </div>
                    </div>

                </div>

            </div>
        </div>
    </div>
	
	
    <div class="container">
        <div class="course-tool-bar clearfix">
            <div class="tool-left l">
                <a href="#" class="sort-item active">最新</a>
                <a href="#" class="sort-item">最热</a>
            </div>
            
            <div class="tool-right r">


 
                <span class="tool-item tool-pager">
                            <span class="pager-num">
                                <b class="pager-cur">1</b>/<em class="pager-total">26</em>
                            </span>
              
                
                </span>
            </div>
        </div>
        
        
        <div class="course-list">
        
            <div class="moco-course-list">
                <ul class="clearfix">
                <#list courseList as a>
                    <div class="moco-course-wrap">


                        <a  onclick="_hmt.push(['_trackEvent', '课程列表页', 'click', '列表首行数据'])" href="${path}/course/course2.html?b=${a.courseTitleId}" target="_self">
                            <div class="moco-course-box">
                                <img   src="${a.courseImage}"  height="124" width="100%">
                                <div class="moco-course-intro">
                                    <h3>
                                        <i>${a.courseDifficulty}</i>
                                        ${a.courseTitle}
                                    </h3>
                                    <p>${a.courseShortIntroduce}</p>
                                </div>
                                <div class="moco-course-bottom"><span class="l"> 804人在学</span></div>
                            </div>
                        </a>
                    </div>
                    </#list>
                </ul>
            </div>
            
            <div class="page"><span class="disabled_page">首页</span><span class="disabled_page">上一页</span><a href="javascript:void(0)" class="active text-page-tag">1</a><a class="text-page-tag" href="${path}/course/course.html?page=2">2</a><a class="text-page-tag" href="${path}/course/course.html?page=3">3</a><a class="text-page-tag" href="${path}/course/course.html?page=4">4</a><a class="text-page-tag" href="${path}/course/course.html?page=5">5</a><a class="text-page-tag" href="${path}/course/course.html?page=6">6</a><a class="text-page-tag" href="${path}/course/course.html?page=7">7</a><a href="${path}/course/course.html?page=2">下一页</a><a href="${path}/course/course.html?page=26">尾页</a></div>
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
