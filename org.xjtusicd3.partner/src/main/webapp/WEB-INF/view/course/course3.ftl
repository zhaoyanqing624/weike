<#assign path="${rc.contextPath}">
<!DOCTYPE html>
<html>
<head>

<#list videoURL as a>
<meta charset="utf-8">
<meta property="qc:admins" content="77103107776553571676375">
<meta property="wb:webmaster" content="c4f857219bfae3cb">
<meta http-equiv="Access-Control-Allow-Origin" content="*">
<meta name="Keywords" content="">

<title>${a.videoName}-微课网</title>


<link href="${path}/ico/zyq.ico" type="image/x-icon" rel="shortcut icon">
<link rel="stylesheet" href="${path}/static/lib/layer/1.6.0/skin/layer.css">

<link rel="stylesheet" href="${path}/static/moco/v1.0/dist/css/moco.min.css" type="text/css">
<script type="text/javascript">
  var OP_CONFIG={"module":"course","page":"video","userInfo":{"uid":3674640}};
  var tplDef={
	"url_space_u":"/space/u",
	"url_space_index":"/space/index",
    "url_space_course":"/space/course",
    "myclub_rule":"/about/faq?t=3",
    "url_course_qadetail":"/qadetail",
    "media_id":"12597"
  }
  var seajsTimestamp="";
  var courseName="CSS深入理解之padding";
    var isLogin = ;
  </script>






<link rel="stylesheet" href="${path}/static/css/zhao/zhao-course3.css" type="text/css">
<link href="http://vjs.zencdn.net/5.8.8/video-js.css" rel="stylesheet">

  <!-- If you'd like to support IE8 -->
  <script src="http://vjs.zencdn.net/ie8/1.1.2/videojs-ie8.min.js"></script>
  </#list>
</head>

<body >


<div id="header" class="course-detail-header">
<#list videoURL as a>
      <div class="cd-inner clearfix">
      <#list videoname3 as b>
      <ul class="l">
        <li class="nv nv-goback"><a href="${path}/course/course2.html?b=${b.courseTitleId}" class="revert l"><i class="icon icon-left"></i></a></li>
        <li class="nv nv-menu">
          <a href="javascript:;" class="chaptername J-chaptername"  data-id="10710" style="cursor:text;"><span>${b.courseTitle}</span><em>${a.videoName}</em></a>
        </li>
      </ul>
      </#list>

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

</#list>

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

<#list videoURL as a>
<div style="background-color:#000000">
		  <video id="my-video" class="video-js" controls preload="auto" width="840" height="364" style="margin:0 auto"  poster="MY_VIDEO_POSTER.jpg" data-setup="{}">
    <source src="${a.videoURL}" type='video/mp4'>
    <source src="MY_VIDEO.webm" type='video/webm'>
    <p class="vjs-no-js">
      To view this video please enable JavaScript, and consider upgrading to a web browser that
      <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
    </p>
  </video>
  </div>
  </#list>
  <script src="http://vjs.zencdn.net/5.8.8/video.js"></script>

		
		
		
		
        
        </div></div>

    
</div>

 
<div class="course-subcontainer clearfix">
    <div class="course-left">
        <ul class="course-menu course-video-menu clearfix js-course-menu" data-ower="all" data-sort="last">
            <li class="course-menu-item"><a class="active" href="#" id="plMenu">评论</a></li>
            
        </ul>
        <div id="disArea" class="lists-container list-wrap">
        
        <form  method="POST"  action="addComment.html"> 
            <div id="pl-content" class="list-tab-con">
                <div class="publish clearfix" id="discus-publish">
            <div class="publish-wrap publish-wrap-pl">
                <div class="pl-input-wrap clearfix">
                    <a href="/u/3674640" class="user-head l">
                        <img src="${session_userImage}" alt="${session_userName}">
                    </a>
                    <div id="js-pl-input-fake" class="pl-input-inner l">
                       <textarea id="js-pl-textarea" class="js-placeholder" name="commentName" placeholder="扯淡、吐槽、表扬、鼓励……想说啥就说啥！"></textarea>
                    </div>
                    <div class="pl-input-btm input-btm clearfix">
                        <div class="verify-code l"></div>
                        <button  class="r course-btn" >发表评论</button>
                    </div>
                </div>
            </div>
        			</div>
                </div>
         </form>
                
                
 <div id="plLoadListData">
    <div class="pl-container">
        <ul>
        <#list commentViews as w>
        <#list w.userViews as r>
            <li class="pl-list clearfix">
                <div class="pl-list-avator"><a href="/u/3301399/courses" target="_blank"><img width="40" height="40"  src="${r.userImage}" ></a></div>
                <div class="pl-list-main">
                    <div class="pl-list-nick"><a href="/u/3301399/courses" target="_blank">${r.userName}</a></div>
                    <div class="pl-list-content">${w.commentName}</div>
                    <div class="pl-list-btm clearfix"><span class="pl-list-time l">时间: ${w.commentDate}</span></div>
                </div>
            </li>
       </#list>
       </#list>
            
           
        </ul>
    </div>
    <div class="page pl-list-page"><span class="disabled_page">首页</span><span class="disabled_page">上一页</span><a
            href="javascript:void(0)" data-page="1" class="active text-page-tag">1</a><a href="javascript:void(0)"
                                                                                         data-page="2"
                                                                                         class="text-page-tag">2</a><a
            href="javascript:void(0)" data-page="3" class="text-page-tag">3</a><a href="javascript:void(0)"
                                                                                  data-page="4"
                                                                                  class="text-page-tag">4</a><a
            href="javascript:void(0)" data-page="5" class="text-page-tag">5</a><a href="javascript:void(0)"
                                                                                  data-page="2">下一页</a><a
            href="javascript:void(0)" data-page="5">尾页</a></div>
</div>



            </div>
            <div id="qa-content" class="list-tab-con" style="display:none">
                <div id="qaLoadListData"></div>
            </div>
            <div id="note-content" class="list-tab-con" style="display:none">
                <div id="noteLoadListData">
                </div>
            </div>
            <div id="wiki-content" class="list-tab-con" style="display:none;">
                <div id="wikiLoadListData">
                </div>
            </div>
            <div id="mate-content" class="list-tab-con" style="display:none;">
                <div id="mateLoadListData">
                </div>
            </div>

        </div>
    </div>
    <div class="course-right clearfix">

        <div class="js-recom-box"></div>
        <div class="wendalist js-right-wenda">
            <div class="course-right-title">
                <h3>猿问推荐</h3>
                <a href="/wenda/?block_id=tuijian_yw" target="_blank" class="more">更多</a>
            </div>

            <ul>
            </ul>
        </div>
         </div>
</div>



<div id="footer" >
    <div class="waper">
    </div>
</div>



<script type="text/javascript" charset="utf-8" src="${path}/static/lib/ueditor/ueditor.final.min.js"></script>

<!--script-->
<script src="${path}/static/scripts/ssologin.js"></script>
<script type="text/javascript" src="${path}/static/sea-modules/seajs/seajs/2.1.1/sea.js"></script>
<script type="text/javascript" src="${path}/static/sea_config.js"></script>
<script type="text/javascript">seajs.use("${path}/static/page/" + OP_CONFIG.module + "/" + OP_CONFIG.page);</script>





<div style="display: none">
    <script type="text/javascript">
        var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Ff0cfcccd7b1393990c78efdeebff3968' type='text/javascript'%3E%3C/script%3E"));
    </script>
</div>






<div id="video_mark" class="video_mark" style="display:none;"></div>
<!--<div class="fixed-video js-fixed-video">-->
<!--<h3>点击按住该条进行拖动</h3>-->
<!--<div class="fixed-video-con"></div>-->
<!--</div>-->
<!--
//此处结构在js里插入
<div class="animate-mp" style="left:50%;top:50%">-->
<!--<p class="mp"><i>+</i><span class="num">8</span>MP</p>-->
<!--<p class="desc">haha</p>-->
<!--</div>-->

</body>
</html>
