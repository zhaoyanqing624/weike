<#assign path="${rc.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>问答平台_微客网</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="renderer" content="webkit">
    <meta property="qc:admins" content="77103107776157736375" />
    <meta property="wb:webmaster" content="c4f857219bfae3cb" />
    <meta http-equiv="Access-Control-Allow-Origin" content="*" />
    <meta http-equiv="Cache-Control" content="no-transform " />

    <meta name="viewport" content="width=device-width,target-densitydpi=high-dpi,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=yes"/>



    <link href="${path}/ico/zyq.ico" type="image/x-icon" rel="shortcut icon">
    <link rel="stylesheet" href="${path}/static/moco/v1.0/dist/css/moco.min.css" type="text/css" />

    <script type="text/javascript">

        eval(function(p,a,c,k,e,d){e=function(c){return(c<a?"":e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)d[e(c)]=k[c]||e(c);k=[function(e){return d[e]}];e=function(){return'\\w+'};c=1;};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p;}('!4(){3 6=a;3 l=4(){3 b,e=9 y("(^| )"+"c=([^;]*)(;|$)");j(b=h.g.z(e)){k w(b[2])}x{k a}};3 8=4(t){3 f=l();3 7=9 o();7.A(7.d()+B*i*i*r);h.g="c="+t+";s="+7.M()+";N=/;L=O.m";j(t&&t!=f){Q.P.G()}};3 5=9 E();5.H=4(){K(6);6=a;8(0)};5.J=4(){8(1)};6=I(4(){5.n="";8(1)},F);5.n=\'R://p.u.m/p/v/q/D.C?t=\'+9 o().d()}()',54,54,'|||var|function|imgobj|timer|exp|setcookie|new|null|arr|IMCDNS|getTime|reg|_0|cookie|document|60|if|return|getcookie|com|src|Date|static|common|1000|expires||mukewang|img|unescape|else|RegExp|match|setTime|24|png|logo|Image|3000|reload|onload|setTimeout|onerror|clearTimeout|domain|toGMTString|path|imooc|location|window|http'.split('|'),0,{}))

    </script>


    <script type="text/javascript">

        var OP_CONFIG={"module":"wenda","page":"index"};
        var isLogin = 0;
        var is_choice = "0";
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
        <link rel="stylesheet" href="${path}/static/css/zhao/zhao-question.css" type="text/css"/>
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
                <a href="" target="_self">实战</a>
            </li>
            <li><a href=""  target="_self">路径</a></li>
            <li><a href="${path}/selectQuestion.html"  target="_self">猿问</a></li>

        </ul>
        <div id="login-area">
            <ul class="header-unlogin clearfix">
                <li class="header-app">
                    <a >
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


    <div class="wenda clearfix">

        <div class="js-layout-change">
            <div class="l wenda-main">
                <div class="wd-top-slogan">
                    <span>程序员自己的问答社区</span>
                    <a class="js-quiz" href="${path}/addquestion.html">我要提问</a>
                </div>
                <div class="nav">
                    <a href="${path}/selectQuestion.html" class="active">最新</a>
                    <a href="#" >等待回答</a>
                </div><!--.nav end-->

                <!--推荐位-->
                <ul class="recommend">
                    <li><i class="icon-flag2"></i><a href="http://www.imooc.com/wenda/detail/332610" data-ast="yuanwenindex_1_639" target="_blank" title="【积分换门票】免费送2016苹果开发者大会门票">【积分换门票】免费送2016苹果开发者大会门票</a></li>
                    <li><i class="icon-flag2"></i><a href="http://www.imooc.com/wenda/detail/329082" data-ast="yuanwenindex_1_401" target="_blank" title="实力派-linux大棚来了，更有linux图书免费送">实力派-linux大棚来了，更有linux图书免费送</a></li>
                </ul><!--recommend end-->
                <!--左侧列表内容-->
                <div class="wenda-list">
                    
                   
                    
                    
                    <#list questionViews as a>
                    <div class="ques-answer no-answer">
                        
                        <#if a.classifyId==8>
                        <div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/html.jpg" >
                            </a>
                        </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Html/CSS</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	
                    	<#if a.classifyId==9>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/javascript.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">JavaScript</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==10>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/html5.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Html5</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==11>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/CSS3.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">CSS3</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==12>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/jquery.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">jQuery</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==13>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/nodejs.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Node.js</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==14>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/angularjs.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">AngularJS</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==15>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/bootstrap.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Bootstrap</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==16>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/Reactjs.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">React.JS</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==17>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/vuejs.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Vue.js</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==18>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/sassless.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Sass/Less</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==19>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/webapp.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">WebApp</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==20>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/fetool.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">前端工具</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==21>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/php.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">PHP</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==22>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/java.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Java</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==23>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/python.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Python</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==24>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/C.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">C</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==25>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/C2.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">C++</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==26>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/Go.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Go</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==27>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/C3.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">C#</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==28>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/android.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Android</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==29>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/ios.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">iOS</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==30>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/Unity3D.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Unity3D</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==31>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/Cocos2dx.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Cocos2d-x</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==32>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/mysql.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">MySQL</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==33>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/mongodb.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">MongoDB</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==34>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/Oracle.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Oracle</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==35>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/SQLServer.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">SQLServer</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==36>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/bigdata.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">大数据</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==37>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/cloudcomputing.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">云计算</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==38>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/test.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">测试</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==39>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/linux.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Linux</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==40>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/photoshop.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Photoshop</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==41>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/maya.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Maya</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==42>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/premiere.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">Premiere</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	<#if a.classifyId==43>
                    	<div class="tag-img">
                            <a  target="_blank">
                                <img src="${path}/static/image/1/ZBrush.jpg" >
                            </a>
                            </div><!--.tag-img end-->
                        <div class="from-tag">        来自
                            <a  target="_blank">ZBrush</a>
                        </div><!--.from-tag end-->
                    	</#if>
                    	
                    	
                    	
                    	
                    	<#if a.questionBestAnswer==0>
                        <div class="ques-con">
                            <a href="${path}/selectAnswer.html?q=${a.questionId}"  class="ques-con-content" target="_blank" >${a.questionTitle}</a>
                        </div><!--.ques-con end-->
                        <#list a.questionNumberContent as b>
                        <div class="info-bar clearfix">
                            <a href="${path}/selectAnswer.html?q=${a.questionId}" class="to-answer">撰写答案${c.userName}</a>
                            <p class="integral-info"><a href="/about/faq?t=3" target="_blank">回答问题最高可获<span>3积分</span>哦！</a></p>
                            <a  class="answer-num">${b.questionNumber}个回答</a>
                        </div><!--.info-bar end-->
                        </#list>
                        </#if>
                        
                        
                        
                        
                        <#if a.questionBestAnswer==1>
                        <#list a.questionUserContent as d>
                        <#list a.questionNumberContent as b>
                         <div class="ques-con">
                            <a href="${path}/selectAnswer.html?q=${a.questionId}"  class="ques-con-content" target="_blank" >${a.questionTitle}</a>
                        </div><!--.ques-con end-->
                        <div class="answer-con first" data-answer-id="217545" id="answer-con">
                        <div class="user">
                        <a href="${path}/listuser.html?u=${d.userId}" target="_blank">${d.userName}</a><span class="signature">回答：</span>
                        </div>
                        <div class="answer-content">${d.answerName}</div>
                        <div class="ctrl-bar clearfix">
                        <span class="agree-with " data-ques-id="338299" data-answer-id="217545" data-hasop=""><b>赞同</b><em></em></span>
                        </div><!--.ctrl-bar end-->
                        </div>
                        </#list>
                        </#list>
                        
                        
                        
                       
                        </#if>
                    </div><!--.ques-answer end-->
                    </#list>
                    

 
                    
                    <div class="page"><span class="disabled_page">首页</span><span class="disabled_page">上一页</span><a href="javascript:void(0)" class="active text-page-tag">1</a><a class="text-page-tag" href="/wenda/recommend/2">2</a><a class="text-page-tag" href="/wenda/recommend/3">3</a><a class="text-page-tag" href="/wenda/recommend/4">4</a><a class="text-page-tag" href="/wenda/recommend/5">5</a><a class="text-page-tag" href="/wenda/recommend/6">6</a><a class="text-page-tag" href="/wenda/recommend/7">7</a><a href="/wenda/recommend/2">下一页</a><a href="/wenda/recommend/1057">尾页</a></div>


                </div>
            </div>
            <div class="r wenda-slider">
				
				<div class="user-about">
    	<div class="user-info">
        <div class="user-pic">
            <a href="${path}/user/personal.html">
                <img src="${session_userImage}" >
            </a>
        </div>
        <div class="user-name">
            <a href="${path}/user/personal.html">${session_userName}</a>
                                </div>
        <div class="integral-info clearifx">
            <a  class="integral">积分：${session_userAccount}</a>
        </div>
    </div><!--.user-info end-->
    <div class="user-action">
        <span class="ques"><a href="${path}/addquestion.html">提问</a><!-- <i></i>--></span>
        <span class="reply"><a href="">回答</a></span>
    </div><!--.user-action end-->
	</div>
				
				
				
                <div class="advertisement">
                    <a href="http://www.imooc.com/wenda/detail/329082" data-ast="yuanwenindexright_1_189" target="_blank">
                        <img src="http://img.mukewang.com/57dfa24c0001b40d02800100.jpg" alt="linux问答"/>
                    </a>
                </div><!--.advertisement end-->
                <div class="hot-ques">
                    <h3 class="title">热门问题</h3>
                    <ul>
                        <li>
                            <p class="content"><a target="_blank" href="/wenda/detail/328864">本人13岁，现在学还来得及吗？</a></p>
                            <div class="info-bar clearfix">
                                <a target="_blank" href="/wenda/detail/328864" class="answer-num">109 回答</a>
                                <a target="_blank" href="/wenda/detail/328864" class="follow-num">3 关注</a>
                                <a target="_blank" href="/wenda/2" class="from">来自 PHP</a>
                            </div>
                        </li>
                       
                        
                        
                    </ul><!--ul end-->
                </div><!--.hot-ques end-->

                <div class="leifeng-sort">
                    <h3 class="title clearfix">
                        <span>回答雷锋榜</span>
                        <span class='leifeng-tab js-leifeng-tab' data-type='week'>一周</span>
                        <span class='leifeng-tab js-leifeng-tab active' data-type='day'>今日</span>
                    </h3>

                    <div class='leifeng-tab-box leifeng-day js-leifeng-tab-box' data-type='day'>
                        <ul class='leifeng-tab-box-min'>
                            <li>
                                <div class="ranking first">1</div>
                                <div class="user-pic">
                                    <a target="_blank" href="/u/3706457/bbs">
                                        <img src="http://img.mukewang.com/5791cc180001053f01000100-100-100.jpg" title="qq_fftu_03706457"/>
                                    </a>
                                </div><!--.user-pic end-->
                                <div class="user-name">
                                    <a target="_blank" href="/u/3706457/bbs">qq_fftu_03706457</a>
                                </div><!--.user-name end-->
                                <div class="user-info clearfix">
                                    <span class="role"></span>
                                    <span class="answer-num">15回答</span>
                                </div><!--.user-info end-->
                            </li>
                           
                        </ul>
                    </div>

                    
                </div><!--.leifeng-sort end-->

            </div>
        </div>
    </div>

    <div class="tag-pop" id="tag-pop">
        <div class="shade"></div>
        <div class="tag-main">
            <h3><span>关注我喜欢或专注的猿问分类</span> <i class="icon-close2 js-close"></i></h3>
            <ul class="tag-list clearfix">
                <li data-tag-id="12" >
                    <img src="http://img.mukewang.com/563aff7e0001c8c700900090.jpg" alt=""/>
                    <span>Android</span>
                </li>
                <li data-tag-id="22" >
                    <img src="http://img.mukewang.com/563afef30001025000900090.jpg" alt=""/>
                    <span>AngularJS</span>
                </li>
                <li data-tag-id="24" >
                    <img src="http://img.mukewang.com/563afee70001ccbe00900090.jpg" alt=""/>
                    <span>Bootstrap</span>
                </li>
                <li data-tag-id="28" >
                    <img src="http://img.mukewang.com/563afeb5000149c000900090.jpg" alt=""/>
                    <span>C</span>
                </li>
                <li data-tag-id="38" >
                    <img src="http://img.mukewang.com/563afd4600014d7e00900090.jpg" alt=""/>
                    <span>C#</span>
                </li>
                <li data-tag-id="30" >
                    <img src="http://img.mukewang.com/563afe97000178c200900090.jpg" alt=""/>
                    <span>C++</span>
                </li>
                <li data-tag-id="34" >
                    <img src="http://img.mukewang.com/563afdfb000167f300900090.jpg" alt=""/>
                    <span>Cocos2d-x</span>
                </li>
                <li data-tag-id="25" >
                    <img src="http://img.mukewang.com/563afed80001928100900090.jpg" alt=""/>
                    <span>CSS3</span>
                </li>
                <li data-tag-id="31" >
                    <img src="http://img.mukewang.com/563afe8400019fbc00900090.jpg" alt=""/>
                    <span>Go</span>
                </li>
                <li data-tag-id="5" >
                    <img src="http://img.mukewang.com/563affe40001680c00900090.jpg" alt=""/>
                    <span>Html/CSS</span>
                </li>
                <li data-tag-id="14" >
                    <img src="http://img.mukewang.com/563aff620001ec7600900090.jpg" alt=""/>
                    <span>Html5</span>
                </li>
                <li data-tag-id="19" >
                    <img src="http://img.mukewang.com/563aff2000019d0700900090.jpg" alt=""/>
                    <span>iOS</span>
                </li>
                <li data-tag-id="3" >
                    <img src="http://img.mukewang.com/563afff200010a9f00900090.jpg" alt=""/>
                    <span>JAVA</span>
                </li>
                <li data-tag-id="17" >
                    <img src="http://img.mukewang.com/563aff440001e80700900090.jpg" alt=""/>
                    <span>JavaScript</span>
                </li>
                <li data-tag-id="15" >
                    <img src="http://img.mukewang.com/563aff530001428b00900090.jpg" alt=""/>
                    <span>JQuery</span>
                </li>
                <li data-tag-id="20" >
                    <img src="http://img.mukewang.com/563aff130001c76f00900090.jpg" alt=""/>
                    <span>Linux</span>
                </li>
                <li data-tag-id="7" >
                    <img src="http://img.mukewang.com/563affd00001cc8a00900090.jpg" alt=""/>
                    <span>Maya</span>
                </li>
                <li data-tag-id="8" >
                    <img src="http://img.mukewang.com/563affc20001ce1000900090.jpg" alt=""/>
                    <span>MongoDB</span>
                </li>
                <li data-tag-id="11" >
                    <img src="http://img.mukewang.com/563aff910001771f00900090.jpg" alt=""/>
                    <span>Mysql</span>
                </li>
                <li data-tag-id="13" >
                    <img src="http://img.mukewang.com/563aff700001005200900090.jpg" alt=""/>
                    <span>Node.js</span>
                </li>
                <li data-tag-id="29" >
                    <img src="http://img.mukewang.com/563afea70001be2b00900090.jpg" alt=""/>
                    <span>Oracle</span>
                </li>
                <li data-tag-id="10" >
                    <img src="http://img.mukewang.com/563affa10001301000900090.jpg" alt=""/>
                    <span>Photoshop</span>
                </li>
                <li data-tag-id="2" >
                    <img src="http://img.mukewang.com/563afd9d0001d30a00900090.jpg" alt=""/>
                    <span>PHP</span>
                </li>
                <li data-tag-id="9" >
                    <img src="http://img.mukewang.com/563affb10001bbc500900090.jpg" alt=""/>
                    <span>Premiere</span>
                </li>
                <li data-tag-id="18" >
                    <img src="http://img.mukewang.com/563aff300001f47400900090.jpg" alt=""/>
                    <span>Python</span>
                </li>
                <li data-tag-id="50" >
                    <img src="http://img.mukewang.com/579f2f59000130cc02400240.jpg" alt=""/>
                    <span>React.JS</span>
                </li>
                <li data-tag-id="53" >
                    <img src="http://img.mukewang.com/57b4497d0001223302400240.jpg" alt=""/>
                    <span>Sass/Less</span>
                </li>
                <li data-tag-id="36" >
                    <img src="http://img.mukewang.com/563afdc60001f1a900900090.jpg" alt=""/>
                    <span>SQL Server</span>
                </li>
                <li data-tag-id="33" >
                    <img src="http://img.mukewang.com/563afe730001883800900090.jpg" alt=""/>
                    <span>Unity 3D</span>
                </li>
                <li data-tag-id="52" >
                    <img src="http://img.mukewang.com/57b2d150000136e702400240.jpg" alt=""/>
                    <span>Vue.js</span>
                </li>
                <li data-tag-id="27" >
                    <img src="http://img.mukewang.com/563afec200019e2400900090.jpg" alt=""/>
                    <span>WebApp</span>
                </li>
                <li data-tag-id="40" >
                    <img src="http://img.mukewang.com/564045270001d8dc00900090.jpg" alt=""/>
                    <span>ZBrush</span>
                </li>
                <li data-tag-id="21" >
                    <img src="http://img.mukewang.com/563aff040001d14100900090.jpg" alt=""/>
                    <span>云计算</span>
                </li>
                <li data-tag-id="26" >
                    <img src="http://img.mukewang.com/563b0af800018db300900090.jpg" alt=""/>
                    <span>前端工具</span>
                </li>
                <li data-tag-id="35" >
                    <img src="http://img.mukewang.com/563afdd50001d4a400900090.jpg" alt=""/>
                    <span>大数据</span>
                </li>
                <li data-tag-id="39" >
                    <img src="http://img.mukewang.com/563b04ef00014a4b00900090.jpg" alt=""/>
                    <span>数据结构</span>
                </li>
                <li data-tag-id="51" >
                    <img src="http://img.mukewang.com/57aad4170001397802400240.jpg" alt=""/>
                    <span>测试</span>
                </li>
            </ul>
            <div class="save-btn">保存</div>
        </div><!--.tag-main end-->
    </div><!--.tag-pop end-->


</div>



<div id="footer" >
    <div class="waper">
    </div>
</div>




<!--script-->
<script src="/passport/static/scripts/ssologin.js?v=2.0"></script>
<script type="text/javascript" src="/static/sea-modules/seajs/seajs/2.1.1/sea.js"></script>
<script type="text/javascript" src="/static/sea_config.js?v=201610172229"></script>
<script type="text/javascript">seajs.use("/static/page/"+OP_CONFIG.module+"/"+OP_CONFIG.page);</script>






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
