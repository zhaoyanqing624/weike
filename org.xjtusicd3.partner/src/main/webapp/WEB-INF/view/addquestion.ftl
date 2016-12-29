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

var OP_CONFIG={"module":"wenda","page":"save","userInfo":{"uid":"3674640","nickname":"\u9694\u58c1\u73ed\u7684zhao\u53d4\u65703674640","head":"http:\/\/img.mukewang.com\/user\/578a158a0001c17512391242-80-80.jpg","usertype":"1","roleid":0}};
var isLogin = 1;
var is_choice = "";
var seajsTimestamp="v=201612071925";

var ownName="77528570@qq.com"
</script>







<link rel="stylesheet" href="${path}/static/css/zhao/zhao-addquestion.css" type="text/css" />
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
                    <a target="_blank" href=''>
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
					<#if lastcourseTitleId==0> 
					<div class="card-history">                            
					<span class="history-item">
					<span class="tit text-ellipsis"></span>                                
					<span class="media-name text-ellipsis"></span>
					</div>  
					<#else>
					 <div class="card-history">                            
					<span class="history-item">
					<span class="tit text-ellipsis">${lastcourseTitle}</span>                                
					<span class="media-name text-ellipsis">${lastvideoName}</span>                                
					<i class="icon-clock"></i><a href="${path}/course/course3.html?c=${lastvideoId}" class="continue">继续</a></span>
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

<div class="container clearfix">
    <div class="l wenda-main">
    <form id="profile" action="addQuestion.html" method="post">
      <div class="sucesspage">
        <h2 class="new-save-title">提问</h2>
        <div id="js-inputques" class="inputques">
               <div class="quesdetail clearfix">
                  <span class="ques-label first-label">*</span>
                  <div class="question-area">
                    <input type="text"  id="ques-title" class="ipt autocomplete" maxlength="255" name="questionTitle" placeholder="请一句话说明你的问题，以问号结尾"/>
                    <p class="errortip" ></p>
                    <dl class="send-area-result">
                    </dl>
                  </div>
               </div>
               <div class="quesdetail clearfix">
                  <span class="ques-label first-label">*</span>
                  <div class="question-area">
                    <textarea type="text"  id="ques-title2" class="ipt2 autocomplete" maxlength="255" name="questionText" placeholder="问题描述"></textarea>
                    <style>textarea{ resize:none;}</style>
                    <p class="errortip" ></p>
                    <dl class="send-area-result">
                    </dl>
                  </div>
               </div>
               <div class="quesdetail clearfix">
               					<span class="ques-label first-label">*</span>
								<div class="rlf-group">
								<select id="first-menu" class="moco-form-control2 rlf-select"   onchange="selectSecondChild()" ></select>
								<select id="second-menu" class="moco-form-control2 rlf-select"  name="classifyName"></select>
								<p class="rlf-tip-wrap errorHint color-red" ></p>
							</div>	
  				</div>
  				
  				
                <div class="quesdetail mbottom">
                  <span class="ques-label">&nbsp;</span>
                  <div id="editor-wrap" class="editor clearfix" >
                    <div class="" id="ques-editor">
                    </div>
                    <p class="errortip"></p>
                  </div>
                </div>
                
        </div>
       
        <div class="saveques-bottom">
          <button id="profile-submit"  hidefocus="true"  aria-role="button" class="btn btn-red link-btn publishbtn" >发布(Ctrl+Enter)</button>
          <p class="global-errortip js-global-error"></p>
        </div>
      </div>
      
      </form>
     </div>
    <div class="r wenda-slider">
      <div class="panel bbs-sendques">
        <div class="panel-body">
          <h1>提问注意事项</h1>
          <dl>
            <dd>1、大家每天可以免费提出两个问题，从第三个问题起，每个问题扣除2点积分，请知晓哦；</dd>
            <dd>2、您是来解决问题？请先搜索是否已经有同类问题吧。这样您就省心少打字。</dd>
            <dd>3、没找到是么？就在发问题时精确描述你的问题，不要写与问题无关的内容哟；</dd>
            <dd>4、微课讨论更热衷于解达您想要的答案。能引起思考和讨论的知识性问题；</dd>
            <dt>问答禁止这些提问</dt>
            <dd>1、禁止发布求职、交易、推广、广告类与问答无关信息将一律清理。</dd>
            <dd>2、尽可能详细描述您的问题，如标题与内容不符，或与问答无关的信息将被删除扣分。</dd>
            <dd>3、问答刷屏用户一律冻结帐号</dd>
          </dl>
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

<script type="text/javascript" src="/static/sea-modules/seajs/seajs/2.1.1/sea.js"></script>
<script type="text/javascript" src="/static/sea_config.js?v=201612071925"></script>
<script type="text/javascript" charset="utf-8" src="/static/lib/ueditor1.4.3.1/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/static/lib/ueditor1.4.3.1/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/static/lib/ueditor1.4.3.1/lang/zh-cn/zh-cn.js"></script>

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

<!--<script type="text/javascript" charset="utf-8" src="/static/lib/ueditor/ueditor.final.min.js"></script>-->

<script type="text/javascript">seajs.use("/static/page/"+OP_CONFIG.module+"/"+OP_CONFIG.page);</script>

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
