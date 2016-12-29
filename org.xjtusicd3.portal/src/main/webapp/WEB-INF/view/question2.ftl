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
    <div class="panel-head"><strong class="icon-reorder"> 回复管理</strong></div>
    <div class="padding border-bottom">
    </div>
    <table class="table table-hover text-center">
      <tr>
        <th width="120">ID</th>
        <th>问题标题</th>       
        <th>回复者</th>
        <th width="25%">回复内容</th>
        <th>是否最佳答案</th>
        <th width="120">回复时间</th>
        <th>操作</th>       
      </tr>
      <#list answerViews as a>      
        <tr>
          <td>${a.answerId}</td>
          <td>${a.questionTitle}</td>
          <td>${a.userName}</td>
          <td>${a.answerName}</td>
          <td><#if a.answerBest==0>否</#if><#if a.answerBest==1>是</#if></td>  
          <td>${a.answerDate}</td>
          <td><div class="button-group"> <a class="button border-red" href="/org.xjtusicd3.portal/deleteanswer.html?a=#{a.answerId}"><span class="icon-trash-o"></span> 删除</a> </div></td>
        </tr>
      </#list>
          
      <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr>
    </table>
  </div>

</body></html>