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
        <link rel="stylesheet" href="${path}/static/css/zhao/zhao-question2.css" type="text/css"/>
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
                <a  target="_self">实战</a>
            </li>
            <li><a   target="_self">路径</a></li>
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
    <div class="l wenda-main">
		<div class="qa-content" data-qid="338164">
                <div class="qa-content-inner ">
                    <div id="js-content-main">
                        <div class="detail-q-title clearfix">
                            <h1 class="js-qa-wenda-title detail-wenda-title l" >${questionTitle}</h1>
                            <!-- 编辑 -->

                        </div>
                       <div style="width:810px;height:220px">
                       <textarea style="width:810px;height:220px" class="ipt2" readonly="readonly">${questionText}</textarea>
                       <style>textarea{ resize:none;}</style>
					   </div>
                        <div class="qa-header detail-user-tips">
						</div>
                        <!-- 个人信息 -->
                        <div class="detail-user">
                            <span class="detail-provider">提问者</span>
                            <a  target="_blank" class="qa-author">${questionuserName}</a>
                        </div>
                        
                    </div>
                </div>

             </div>
             
             <form id="profile" action="addAnswer.html" method="POST">
       <div id="js-qa-comment-input" style="height:200px" class="detail-comment-input js-msg-context clearfix">
                <div id="avator-wrap" class="detail-ci-avator">
                                        <img src="${session_userImage}"  alt="">
                    <div class="detail-r clearfix">
                        <span class="detail-name">${session_userName}</span>
                        <p class="detail-signal"></p>
                    </div>
                                    </div>
                
                <div id="add-answer" class="detail-ci-avator">
                    <h3 class="answer-add-tip">添加回答</h3>
                    <textarea  style="width:780px;height:100px" name="answerName"></textarea>
                </div>
                
                
                <div id="js-qa-ci-footer" class="qa-ci-footer clearfix">
                        <span class="qa-tips l"></span>
                        <div class="qa-ci-footright">
                            <button  class="btn btn-red detail-ans " id="profile-submit">回答</button>
                        </div>
                </div>
                
                

       </div>
       </form>
       		
       		
       		
            <!-- 回答数 -->
            
            
               <div class="ans_num">${number}个回答</div>
              	<!-- 回答回复 start -->
              	
              	
              	
              	<#if questionBestAnswer==1>
              	<#list answerPersistences as e>
              			<div class="ques-answer">
                    <div class="answer-con first" id="id_207658">
                    	<#list e.userViews as f>
                        <div class="user-pic l">
                            <a href="${path}/listuser.html?u=${e.userId}" target="_blank">
                                <img src="${f.userImage}" width="40" height="40" alt="?" />
                            </a>
                        </div><!--.user end-->
                        <div class="detail-r">
                            <span class="time">${e.answerDate}</span>
                           <a class="detail-name" href="${path}/listuser.html?u=${e.userId}" target="_blank">${f.userName}</a>
                             <p class="detail-signal">${f.userSignature}</p>
                        </div>
                        </#list>
                        <div class="answer-content rich-text imgPreview"><p>${e.answerName}<br /></p></div>
                           <div class="ctrl-bar js-msg-context clearfix js-reply-tool hide">
                            <div class="detail-editor-btns r">
                                <span class="qa-tips"></span>
                                <button class="btn btn-normal js-reply-cancel">取消</button>
                                <button class="btn btn-red js-reply-submit" data-id="207658">保存</button>
                            </div>
                        </div>
                        <#list e.goodsViews as g>
                        <div class="ctrl-bar clearfix js-wenda-tool">
                          <span class="had-solve" >已被提问者采纳</span>
                          <span class="agree-with"  data-hasop=""><a href="${path}/addGoods.html?a=${e.answerId}"><b>赞同</b><em>${g.goodsNumber}</em></a></span>
                        </div><!--.ctrl-bar end-->
						</#list>
                        
                        </div>
                        </div>
                    </#list>
                        
                        
                        
                        
                        <#list answerPersistences2 as ee>
              			<div class="ques-answer">
                    <div class="answer-con first" id="id_207658">
                    	<#list ee.userViews as ff>
                        <div class="user-pic l">
                            <a href="${path}/listuser.html?u=${ee.userId}" target="_blank">
                                <img src="${ff.userImage}" width="40" height="40" alt="?" />
                            </a>
                        </div><!--.user end-->
                        <div class="detail-r">
                            <span class="time">${ee.answerDate}</span>
                           <a class="detail-name" href="${path}/listuser.html?u=${ee.userId}" target="_blank">${ff.userName}</a>
                             <p class="detail-signal">${f.userSignature}</p>
                        </div>
                         </#list>
                        <div class="answer-content rich-text imgPreview"><p>${ee.answerName}<br /></p></div>
                           <div class="ctrl-bar js-msg-context clearfix js-reply-tool hide">
                            <div class="detail-editor-btns r">
                                <span class="qa-tips"></span>
                                <button class="btn btn-normal js-reply-cancel">取消</button>
                                <button class="btn btn-red js-reply-submit" data-id="207658">保存</button>
                            </div>
                        </div>
                        <#list ee.goodsViews as gg>
                        <div class="ctrl-bar clearfix js-wenda-tool">
                          <span class="agree-with "  data-hasop=""><a href="${path}/addGoods.html?a=${ee.answerId}"><b>赞同</b><em>${gg.goodsNumber}</em></a></span>
                        </div><!--.ctrl-bar end-->
						</#list>
                       
                    </div><!--.answer-con end-->
                </div>
              	</#list>
              	</#if>
              	
              	<#if questionBestAnswer==0>
              	<#list answerViews as a>
                  <div class="ques-answer">
                    <div class="answer-con first" id="id_207658">
                    	<#list a.userViews as b>
                        <div class="user-pic l">
                            <a href="${path}/listuser.html?u=${a.userId}" target="_blank">
                                <img src="${b.userImage}" width="40" height="40" alt="?" />
                            </a>
                        </div><!--.user end-->
                        <div class="detail-r">
                            <span class="time">${a.answerDate}</span>
                           <a class="detail-name" href="${path}/listuser.html?u=${a.userId}" target="_blank">${b.userName}</a>
                             <p class="detail-signal">${b.userSignature}</p>
                        </div>
                        
                        <div class="answer-content rich-text imgPreview"><p>${a.answerName}<br /></p></div>
                           <div class="ctrl-bar js-msg-context clearfix js-reply-tool hide">
                            <div class="detail-editor-btns r">
                                <span class="qa-tips"></span>
                                <button class="btn btn-normal js-reply-cancel">取消</button>
                                <button class="btn btn-red js-reply-submit" data-id="207658">保存</button>
                            </div>
                        </div>
                        <#if session_userName==questionuserName>
                        <#list a.goodsViews as e>
                        <div class="ctrl-bar clearfix js-wenda-tool">
                          <#if b.userName!=questionuserName>
                          <span class="solved " ><a  href="${path}/bestAnswer.html?a=${a.answerId}">采纳此回答</a></span>
                          </#if>
                          <span class="agree-with "  data-hasop=""><a href="${path}/addGoods.html?a=${a.answerId}"><b>赞同</b><em>${e.goodsNumber}</em></a></span>
                        </div><!--.ctrl-bar end-->
                        </#list>
           
						<#else>
						<#list a.goodsViews as e>
						<div class="ctrl-bar clearfix js-wenda-tool">
                          <span class="agree-with "  data-hasop=""><a href="${path}/addGoods.html?a=${a.answerId}"><b>赞同</b><em>${e.goodsNumber}</em></a></span>
                        </div><!--.ctrl-bar end-->
                        </#list>
                        </#if>
                       </#list> 
                    </div><!--.answer-con end-->
                </div>
                </#list>
                </#if>
                            
            
            <!-- 回答回复 end -->
            <div class="qa-comment-page">
          </div>

    </div>
    

        <div class="wenda-slider r">
            <div class="quiz"><a href="${path}/addquestion.html" class="js-quiz">我要提问</a></div>
            <!-- 相关问题 -->
                          <div class="panel about-ques">
                <div class="panel-heading">
                  <h2 class="panel-title">相关问题</h2>
                </div>
                <div class="panel-body clearfix">
                            <div class="mkhotlist padtop">
                            <a class="relwenda" href="/wenda/detail/334250" target="_blank">求大神！无法导入javax.swing.JFrame包</a><i class="answer-num">2 回答</i>
                            </div>
                                           
                                            
                </div>
            </div>
                        <!-- 广告 -->
                <div class="advertisement">
                    <a href="http://www.imooc.com/wenda/detail/323379" data-ast="yuanwendetailright_1_192" target="_blank">
                        <img src="http://img.mukewang.com/5791b42900016c5402800100.jpg" title=" 私密有料之后端开发，面试被问过哪些技"/>
                    </a>
                </div><!--.advertisement end-->
                                                                        
                            
        </div>

</div>



<div class="pop-tips-layer"></div>
</div>


<div id="footer" >
    <div class="waper">
    </div>
</div>




<script type="text/javascript" charset="utf-8" src="/static/lib/ueditor/ueditor.final.min.js"></script>

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
