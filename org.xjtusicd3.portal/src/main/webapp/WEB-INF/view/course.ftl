<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>  
    <link rel="stylesheet" href="/org.xjtusicd3.portal/css/pintuer.css">
    <link rel="stylesheet" href="/org.xjtusicd3.portal/css/admin.css">
    <script src="/org.xjtusicd3.portal/js/jquery.js"></script>
    <script src="/org.xjtusicd3.portal/js/pintuer.js"></script>  
</head>
<body>
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 课程管理</strong></div>
    <div class="padding border-bottom">
      <ul class="search">
        <li>
          <button type="button" onclick="javascrtpt:window.location.href='waitcourse.html'"  class="button border-green"><span class="icon-trash-o"></span> 待审核</button>
          <button type="button" onclick="javascrtpt:window.location.href='passcourse.html'"  class="button border-red"><span class="icon-trash-o"></span> 已通过</button>
        </li>
      </ul>
    </div>
    <table class="table table-hover text-center">
      <tr>
        <th width="120">ID</th>
        <th>课程名称</th> 
        <th>课程图片</th>
        <th>分类</th>
        <th>作者姓名</th>
        <th width="25%">简介</th>
        <th width="120">申请时间</th>
        <th>操作</th>       
      </tr> 
      <#list courseViews as a>   
        <tr>
          <td>${a.courseId}</td>
          <td><a href="/org.xjtusicd3.partner/course/course2.html?b=${a.courseTitleId}">${a.courseTitle}</a></td>
          <td><img src="${a.courseImage}" alt="" width="120" height="50" /></td> 
          <td>${a.classifyName}</td>
          <td>${a.userTrueName}</td>  
          <td>${a.courseIntroduce}</td>
          <td>${a.courseDate}</td>
          <td><div class="button-group"> <a class="button border-red" href="/org.xjtusicd3.portal/successcourse.html?c=#{a.courseId}"><span class="icon-trash-o"></span> 通过</a> </div></td>
        </tr>
      </#list>
        

      <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr>
    </table>
  </div>

</body></html>