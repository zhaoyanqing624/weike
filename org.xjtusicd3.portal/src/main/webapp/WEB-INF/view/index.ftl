<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>后台管理中心</title>  
    <link rel="stylesheet" href="/org.xjtusicd3.portal/css/pintuer.css">
    <link rel="stylesheet" href="/org.xjtusicd3.portal/css/admin.css">
    <script src="/org.xjtusicd3.portal/js/jquery.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />后台管理中心</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green" href="/org.xjtusicd3.partner/index.html" target="_blank"><span class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;
  <a class="button button-little bg-red" href="loginout1.html"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  <h2><span class="icon-user"></span>基本设置</h2>
  <ul style="display:block">
    <li><a href="/org.xjtusicd3.portal/searchVisiual.html" target="right"><span class="icon-caret-right"></span>网站设置</a></li>
    <li><a href="pass.html" target="right"><span class="icon-caret-right"></span>修改密码</a></li>
    <li><a href="teacher.html" target="right"><span class="icon-caret-right"></span>教师管理</a></li>
    <li><a href="course.html" target="right"><span class="icon-caret-right"></span>课程管理</a></li>   
    <li><a href="question.html" target="right"><span class="icon-caret-right"></span>问题管理</a></li>
    <li><a href="comment.html" target="right"><span class="icon-caret-right"></span>留言管理</a></li>   
  </ul>   
  <h2><span class="icon-pencil-square-o"></span>栏目管理</h2>
  <ul>
  	<li><a href="adv.html" target="right"><span class="icon-caret-right"></span>首页轮播</a></li> 
    <li><a href="list.html" target="right"><span class="icon-caret-right"></span>内容管理</a></li>
    <li><a href="add.html" target="right"><span class="icon-caret-right"></span>添加内容</a></li>
    <li><a href="cate.html" target="right"><span class="icon-caret-right"></span>分类管理</a></li>        
  </ul>  
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
<ul class="bread">
  <li><a href="info.html" target="right" class="icon-home"> 首页</a></li>
  <li><a  id="a_leader_txt">网站信息</a></li>
  
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="info.html" name="right" width="100%" height="100%"></iframe>
</div>

</body>
</html>