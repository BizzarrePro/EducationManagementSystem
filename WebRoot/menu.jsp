<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>功能导航</title>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="css/menustyle.css">
</head>
<body>
  <div id="container">

    <div id="banner">
    <!-- 代码部分begin -->
    <div id="main">
      <ul id="nav">
          <li class="on"><a href="#" class="first">个人信息</a><div class="second">1</div></li>
            <li><a href="#">成绩查询</a><div class="second">2</div></li>
            <li><a href="#">时间日期</a><div class="second">3</div></li>
            <li><a href="#">选课</a><div class="second">4</div></li>
            <li><a href="#">选课结果</a><div class="second">5</div></li>
            <li><a href="#">jquery特效</a><div class="second">6</div></li>
            <li><a href="#">在线客服</a><div class="second">7</div></li>
            <li><a href="#">图片特效</a><div class="second">8</div></li>
        </ul>
        <div class="dot"><ul><span></span></ul></div>
        <div id="slide"></div>
    </div>
    <script type="text/javascript" src="http://libs.baidu.com/jquery/1.8.3/
    jquery.js"></script>
    
    <script>
    $(function(){
      var liWidth = $('#main #nav li').width();
      var secondWidth = $('#main #nav2 .second').width(); 
      $('#main #nav li').hover(function(){
        var index = $(this).index();
        $('#main .dot span').stop().animate({
          left:liWidth*index+'px'
        },200);
        $(this).addClass('on').siblings().removeClass('on');
        $(this).find('.second').fadeIn(600);
        $('#main #slide').stop().animate({
          height:'150px'
        },400);
      },function(){
        $(this).find('.second').fadeOut(600);
        $('#main #slide').stop().animate({
          height:'0'
        },400);
      });
    });
    </script>
    <!-- 代码部分end -->
    </div>


    <div id="content">
      
    </div>

    <div id="foot">
      
    </div>
  </div>
</body>
</html>