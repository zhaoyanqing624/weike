<#assign path="${rc.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>${userName}的动态</title>
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

var OP_CONFIG={"module":"u","page":"index","userInfo":{"uid":"3674640","nickname":"\u9694\u58c1\u73ed\u7684zhao\u53d4\u65703674640","head":"http:\/\/img.mukewang.com\/user\/578a158a0001c17512391242-80-80.jpg","usertype":"1","roleid":0}};
var isLogin = 1;
var is_choice = "";
var seajsTimestamp="v=201611222232";

var ownName=""
</script>





    
    <link rel="stylesheet" href="${path}/static/lib/layer/1.6.0/skin/layer.css" type="text/css" />
    <link rel="stylesheet" href="${path}/static/css/zhao/zhao-personal.css" type="text/css" />

</head>

<body>

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
            <li><a href="${path}/question.html"  target="_self">猿问</a></li>

        </ul>
        <div id="login-area">
            <ul class="header-unlogin clearfix">
                <li class="header-app">
                    <a href="/mobile/app" >
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

    <div class="bg-other user-head-info">
        <div class="user-info">
            <h3 class="user-name clearfix">
                <span>${userName}</span>


            </h3>
            <!--25-->
            <p class="about-info">
<#if userJob==0>无</#if>
                                        <#if userJob==13>学生</#if>
                                        <#if userJob==1>页面重构设计</#if>
                                        <#if userJob==6>Web前端工程师</#if>
                                        <#if userJob==5>JS工程师</#if>
                                        <#if userJob==8>PHP开发工程师</#if>
                                        <#if userJob==11>JAVA开发工程师</#if>
                                        <#if userJob==7>移动开发工程师</#if>
                                        <#if userJob==9>软件测试工程师</#if>
                                        <#if userJob==10>Linux系统工程师</#if>
                                        <#if userJob==2>交互设计师</#if>
                                        <#if userJob==3>产品经理</#if>
                                        <#if userJob==15>数据库工程师</#if>
                                        <#if userJob==4>UI设计师</#if>
                                        <#if userJob==17>CG影视动画师</#if>
                                        <#if userJob==16>全栈工程师</#if>

               
                <span class='u-info-credit'>

                            <a >积分<em>${userAccount}</em></a>

        </span>


            </p>
            <p class="user-desc"><#if (userSignature==null)>这位同学很懒，木有签名的说～</#if>
            
                                 <#if (userSignature!=null)>${userSignature}</#if></p>

            
        </div><!-- .user-info end -->
    </div><!-- .big-pic end -->
    <div class="wrap">

        <div class="slider" style="position:absolute">
            <div class="user-pic" data-is-fans="" data-is-follows="">
                <div class="user-pic-bg"></div><!--user-pic-big end-->
                <img class='img' src="${userImage}" alt=""/>

                <div class="set-btn"><a href="${path}/user/myinfo.html"><i class="icon-set"></i></a></div>


            </div>

            <ul>



                <li>
                    <a href="${path}/user/personal.html" class="active">
                        <i class="icon-home"></i><span>主页</span><b class="icon-drop_right"></b>
                    </a>
                </li>

            </ul>
        </div><!-- .slider end -->    <div class="u-container">




        <div class=' page-home js-usercard-box' id="notices">
            
            
            
            
         <div class="c-tab clearfix">
	        <div class="tool-left l">
       
                 <a href="${path}/course/course_personal.html" class="sort-item active">课程动态</a>
        
        

        
           </div>
    
        </div>


			<#list userViews as a>
			<#if userName!=a.userId>
            <div class="item newcourse">
               <a  class="fl" href="${path}/listuser.html?u=${a.userId}" target="_blank">
                    <img src="${a.userImage}" class="userHead  js-usercard-dialog " width="40" height="40" data-userid=10000>
                </a>
                
                <div class="content fr">
                    <div class="head">
                        <div class="name">
                            <a class=" "  date-userid=3674640  href="${path}/listuser.html?u=${a.userId}" target="_blank">
                               ${a.userName}
                            </a>
                        </div>
                        <div class="time">
                            ${a.recordDate}
                        </div>
                        <div class="title">
                                                                                                       学习了课程
                        </div>
                    </div>
                    <div class="body pr h135">
                        
                            <img  class="fl" src="${a.courseImage}" width="240" height="135"/>
                            <div class="content w636 fr">
                                
                                <div class="subtitle">
                                    <a href="${path}/course/course2.html?b=${a.courseTitleId}"><span >${a.courseTitle}</span></a>
                                </div>
                                <div class="detail">
								<a href="${path}/course/course3.html?c=${a.videoId}">${a.videoName}</a>
                                </div>
                            </div>
                        
                    </div>
                    <div class="cb"></div>
                </div>
                <div class="cb"></div>
            </div>
            </#if>
            <#if userName!=a.userId>
            <div class="item newcourse">
               <a  class="fl" href="${path}/listuser.html?u=${a.userId}" target="_blank">
                    <img src="${a.userImage}" class="userHead  js-usercard-dialog " width="40" height="40" data-userid=10000>
                </a>
                
                <div class="content fr">
                    <div class="head">
                        <div class="name">
                            <a class=" "  date-userid=3674640  href="${path}/listuser.html?u=${a.userId}" target="_blank">
                               ${a.userName}
                            </a>
                        </div>
                        <div class="time">
                            ${a.recordDate}
                        </div>
                        <div class="title">
                                                                                                       发布了课程
                        </div>
                    </div>
                    <div class="body pr h135">
                        
                            <img  class="fl" src="${a.courseImage}" width="240" height="135"/>
                            <div class="content w636 fr">
                                <div class="subtitle">
                                    <a href="${path}/course/course2.html?b=${a.courseTitleId}"><span >${a.courseTitle}</span></a>
                                </div>
                                <div class="describe">
                                    <span >课程简介：${a.courseShortIntroduce}</span>
                                </div>
                                
                            </div>
                       
                    </div>
                    <div class="cb"></div>
                </div>
                <div class="cb"></div>
            </div>
            </#if>
			</#list>


           


            
            


            

            
            <div class="setup-coverLayer"></div>

        </div>

        <p class="   dynamicLoad js-dynamicLoadwrap">
            <span class="js-dynamicLoad ">
                下拉显示更多
            </span>
        </p>






    </div><!-- .container end -->
    </div><!-- .wrap end-->

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

<script type="text/javascript">

<script type="text/javascript" src="${path}/static/component/logic/common/common.js"></script>
<script type="text/javascript" src="${path}/static/lib/jquery/1.9.1/jquery.js"></script>
<script type="text/javascript" src="${path}/static/api/js/base/tangram.js"></script>
<script type="text/javascript" src="${path}/static/scripts/h.js"></script>
</script>




<script>
    var user = {
        uid : "3674640",
    }

    var space_user = {
        uid : "3674640",
        username : "隔壁班的zhao叔数3674640",

    }

</script>




<script type="text/javascript">

    (function(){
        var imgPic = 'http://img.mukewang.com/static/img/common/logo.png',
                text = '我正在参加@慕课网 的一门课程，很不错哦！快来一起学习吧！', //节名称
                url = 'http://www.mukewang.com' + window.location.pathname;

        window._bd_share_config = {
            "common": {
                "bdUrl": url,
                "bdSnsKey": {
                    'tsina':'2788596354'
                },
                "bdText": text,
                "bdMini": "2",
                "bdMiniList": false,
                "bdPic": imgPic,
                "bdStyle": "0",
                "bdSize": "16",
            },
            "share": {}
        };
        with(document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion=' + ~(-new Date() / 36e5)];
    })();
</script>




<script src="//moco.imooc.com/static/webide/1.0/mocoide.user.js"></script>
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
