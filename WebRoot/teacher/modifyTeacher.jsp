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
            <li><a href="#">选课</a><div class="second">选课</div></li>
            <li><a href="#">选课结果</a><div class="second">选课结果</div></li>
            <li><a href="#">查看作业</a><div class="second">查看作业</div></li>
            <li><a href="#">成绩查询</a><div class="second">成绩查询</div></li>
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
      <!-- 修改老师信息 -->
     	 <center>
	      <form action="update_teacher" method="post">
	      		工号：<input type="text" style="text-indent:6px" name="teaNum"/>
   				姓名：<input type="text"  style="text-indent:6px" name="teaName"/>
   				性别	<input type="text"  style="text-indent:6px" name="teaSex"/></br>
   				年龄：<input type="text"  style="text-indent:6px" name="teaAge"/>
   				生日	<input type="text" name="teaBir" placeholder="yyyy-MM-dd"/><br>
   				民族：<input type="text"  style="text-indent:6px" name="teaMinority"/>
   				学位：<input type="text"  style="text-indent:6px" name="teaDegree"/>
   				职称：<input type="text"  style="text-indent:6px" name="teaProTitle"/>
   				联系方式：<input type="text"  style="text-indent:6px" name="teaContactWay"/></br>
   				密码：<input type="text"  style="text-indent:6px" name="teaPassword"/></br>
   				<label><input type="radio" name="userType" value="管理员" checked="checked" >管理员</label>
   				<label><input type="radio" name="userType" value="教师" >教师</label>
   				<input class="button" type="submit" value="提交"/>
   				<input type="reset" value="重置"/>
	      </form>
     	 </center>
    </div>


    <div id="foot">
      </br>
      </br>
          <p>copyright by Liu and Yang</p>
    </div>
  </div>
</body>
</html>