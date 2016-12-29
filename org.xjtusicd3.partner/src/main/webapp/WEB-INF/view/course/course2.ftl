
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

<link rel="stylesheet" href="/org.xjtusicd3.partner/static/css/zhao/zhao-course2.css" type="text/css" />


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
                <a href="http://coding.imooc.com" target="_self">实战</a>
            </li>
            <li><a href="/course/program"  target="_self">路径</a></li>
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


<#list course as a>
<div id="main">

    <div class="course-infos">
        <div class="w pr">
        	<#list firstclassify as aa>
            <div class="path">
                <a >课程</a>
                <i class="path-split">\</i><a >${aa.classifyName}</a>
                <i class="path-split">\</i><a href="${path}/course/course.html?c=${a.classifyDuo}">${a.classifyName}</a>
                <i class="path-split">\</i><a href="${path}/course/course2.html?b=${a.courseTitleId}"><span>${a.courseTitle}</a></span>
            </div>
            </#list>
            <div class="hd clearfix">
                <h2 class="l">${a.courseTitle}</h2>
            </div>

            <div class="statics clearfix">


                <div class="moco-btn l learn-btn green-btn">
                    <a  class="learn-btn-box">开始学习</a>
                    <em></em>
                    <i class="follow-action js-follow-action"></i>
                </div>



                <div class="static-item l">
                    <span class="meta">上次学到</span>
                    <span class="meta-value smale-value" >${lastvideoName1}</span>
                </div>

                <div class="static-item l">
                    <span class="meta">学习人数</span>
                    <span class="meta-value js-learn-num"></span>
                    <em></em>            </div>
                <div class="static-item l">
                    <span class="meta">难度级别</span>
                    <span class="meta-value">${a.courseDifficulty}级</span>
                    <em></em>
                </div>
                <div class="static-item l">
                    <span class="meta">课程时长</span>
                    <span class="meta-value">
                    <#if (courseTotalTime/60<=1) >${courseTotalTime}分</#if>
                    <#if (courseTotalTime/60>=1) >${(courseTotalTime-courseTotalTime%60)/60}时${courseTotalTime%60}分</#if>
                    </span>
                    <em></em>
                </div>
                <div class="static-item l score-btn">
                    <span class="meta">综合评分</span>
                    <span class="meta-value">${a.courseScore}</span>
                    <em></em>


                    

                </div>

            </div>
        
        </div>
        
        
        
   <div class="info-bg" id="js-info-bg">
        <div class="cover-img-wrap">
        <img data-src="http://img.mukewang.com/57fc918800012d1106000338.jpg" alt="" style="display: " id="js-cover-img">
        </div>
        <div class="cover-mask"></div>
    </div>


       

    </div>


    <div class="course-info-main clearfix w">
        <div class="content-wrap">
            <div class="content">
                <!-- 课程简介 -->
                <div class="course-brief">
                    <p class="auto-wrap">简介：${a.courseIntroduce}</p>
                </div>
                <!-- 课程简介 end -->
                <div class="mod-tab-menu green-box">
                    <ul class="course-menu clearfix">
                        <li><a class="ui-tabs-active active"  ><span>章节</span></a></li>
                        
                    </ul>
				
                </div><!-- 课程面板 -->
                <!-- 课程章节 -->
                <#list secondtitle as b>
                <div class="mod-chapters">
                    <div class="chapter chapter-active">
                        <!-- 章节标题 -->
                        <h3>
                            <span class="icon-drop_down js-open"></span>
                            <strong>
                                <i class="icon-chapter"></i>
                                ${b.courseTitle}
                                <div class="icon-info chapter-info">
                                    <i class="icon-drop_up triangle">
                                        <div class="chapter-introubox">
                                            <div class="chapter-content">介绍sqlite数据库基础知识</div>
                                        </div>
                                    </i>
                                </div>
                            </strong>

                        </h3>
                        <!-- 章节标题 end -->
                        <!-- 章节小节 -->
                        <#list b.videocontent as c>
                        <ul class="video">
                            <li data-media-id="13062">
                                <a href="${path}/course/course3.html?c=${c.videoId}" class="J-media-item">
                                    <i class="icon-video type"></i>
                                    ${c.videoName}(<#if (c.videoTime/60<=1) >00:${c.videoTime}</#if>
                                                   <#if (c.videoTime/60>=1) >${(c.videoTime-c.videoTime%60)/60}:${c.videoTime%60}</#if>)
                            </li>
                        </ul>
                        </#list>
                        <!-- 章节小节 end -->
                    </div>
                </div>
              
                
                
                </#list>
                 </div>
                 
                <!-- 课程章节 end -->
            <!--content end-->
            <div class="aside r">
                <div class="bd">

					<#list userViews as fff>
                    <div class="box mb40 js-usercard-box">
                        <h4>讲师提示</h4>
                        <div class="teacher-info">
                            <a href="/u/3771512/courses?sort=publish" target="_blank" >
                                <img data-userid="3771512" class="js-usercard-dialog" src="${fff.userImage}" width="80" height="80">
                            </a>
                            <span class="tit">
                <a href="/u/3771512/courses?sort=publish" target="_blank">${fff.userName}</a><i class="icon-imooc"></i>
            </span>
                            <span class="job"></span>
                        </div>
                        <div class="course-info-tip">
                            <dl class="first">
                                <dt>课程须知</dt>
                                <dd class="autowrap">${a.courseNeedkonw}</dd>
                            </dl>
                            <dl>
                                <dt>老师告诉你能学到什么？</dt>
                                <dd class="autowrap">${a.courseWilllearn}</dd>
                            </dl>
                        </div>
                    </div>
                    </#list>

                    <div class="js-recom-box"></div>

                </div>        
                </div>
       
        
        </div>
        <div class="clear"></div>

    </div>


</div>

</#list>

<div id="footer" >
    <div class="waper">
    </div>
</div>



<!--script-->
<script src="${path}/static/scripts/ssologin.js"></script>
<script type="text/javascript" src="${path}/static/sea-modules/seajs/seajs/2.1.1/sea.js"></script>
<script type="text/javascript" src="${path}/static/sea_config.js"></script>
<script type="text/javascript">seajs.use("${path}/static/page/" + OP_CONFIG.module + "/" + OP_CONFIG.page);</script>
<script type="text/javascript" src="${path}/static/page/course/learn.js"></script>
<script type="text/javascript" src="${path}/static/css/common/common-less.js"></script>
<script type="text/javascript" src="${path}/static/scripts/h.js"></script>
<script type="text/javascript" src="${path}/static/page/course/common/course_collection.js"></script>
<script type="text/javascript" src="${path}/static/page/course/common/course_common.js"></script>
<script type="text/javascript" src="${path}/static/page/course/course.layout.js"></script>
<script type="text/javascript" src="${path}/static/scripts/h.js"></script>







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
