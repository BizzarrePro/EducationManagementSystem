<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
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
  <link href="css/style.css" type="text/css" rel="stylesheet" />
  <script type="text/javascript" src="http://libs.baidu.com/jquery/1.8.3/jquery.js">
  </script>
</head>
<body>
  <div id="container">

    <div id="banner">
    <!-- 代码部分begin -->
    <div id="main">
      <ul id="nav">
          <li class="on"><a href="#" class="first">首页</a><div class="second">首页</div></li>
            <li><a href="#">个人信息</a><div class="second">个人信息</div></li>
            <li><a href="#">修改信息</a><div class="second">修改信息</div></li>
            <li><a href="#">上传成绩</a><div class="second">上传成绩</div></li>
            <li><a href="#">查看成绩</a><div class="second">查看成绩</div></li>
            <li><a href="#">上传作业</a><div class="second">上传作业</div></li>
            <li><a href="#">查看学生信息</a><div class="second">查看学生信息</div></li>
            <li><a href="#">修改密码</a><div class="second">修改密码</div></li>
        </ul>
        <div class="dot"><ul><span></span></ul></div>
        <div id="slide"></div>
    </div>
    
    
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
          height:'250px'
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
      </br>
      </br>
          <p>copyright by Liu and Yang</p>
    </div>
  </div>
</body>
</html>
