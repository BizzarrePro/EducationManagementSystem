<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <div id="main">
      <ul id="nav">
          <li class="on"><a href="#" class="first">首页</a><div class="second">首页</div></li>
            <li><a href="#">添加学生信息¯</a><div class="second">æ添加学生信息</div></li>
            <li><a href="#">添加老师信息</a><div class="second">添加老师信息</div></li>
            <li><a href="#">添加课程信息¯</a><div class="second">添加课程信息</div></li>
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
    <!-- ä»£ç é¨åend -->
    </div>

	<!-- 添加学生 -->
    <div id="content">
    	<center>
	      <form action="student" method="post">
	      		学号：<input type="text" style="text-indent:6px" name="stuNum"/>
   				姓名：<input type="text"  style="text-indent:6px" name="stuName"/>
   				性别	<input type="text"  style="text-indent:6px" name="stuSex"/></br>
   				年龄：<input type="text"  style="text-indent:6px" name="stuAge"/>
   				生日	<input type="text" name="stuBir" placeholder="yyyy-MM-dd"/><br>
   				民族：<input type="text"  style="text-indent:6px" name="stuMinority"/>
   				籍贯：<input type="text"  style="text-indent:6px" name="stuRoot"/></br>
   				学院：<input type="text"  style="text-indent:6px" name="stuAcademy"/>
   				专业：<input type="text"  style="text-indent:6px" name="stuMajor"/>
   				班级：<input type="text"  style="text-indent:6px" name="stuClass"/>
   				政治面貌：<input type="text"  style="text-indent:6px" name="stuPoliticalStatus"/></br>
   				入学时间：<input type="text" name="stuEnrollment" placeholder="yyyy-MM-dd"/><br>
   				联系方式：<input type="text"  style="text-indent:6px" name="stuContactWay"/></br>
   				学期：<input type="text"  style="text-indent:6px" name="semester"/>
   				密码：<input type="text"  style="text-indent:6px" name="password"/></br>
   				<input class="button" type="submit" value="提交"/>
	      </form>
     	 </center>
     	 <!-- 添加老师 -->
     	 <center>
	      <form action="teacher" method="post">
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
	      </form>
     	 </center>
     	  <!-- 修改学生信息 -->
     	 <center>
	      <form action="student" method="post">
	      		学号：<input type="text" style="text-indent:6px" name="stuNum"/>
   				姓名：<input type="text"  style="text-indent:6px" name="stuName"/>
   				性别	<input type="text"  style="text-indent:6px" name="stuSex"/></br>
   				年龄：<input type="text"  style="text-indent:6px" name="stuAge"/>
   				生日	<input type="text" name="stuBir" placeholder="yyyy-MM-dd"/><br>
   				民族：<input type="text"  style="text-indent:6px" name="stuMinority"/>
   				籍贯：<input type="text"  style="text-indent:6px" name="stuRoot"/></br>
   				学院：<input type="text"  style="text-indent:6px" name="stuAcademy"/>
   				专业：<input type="text"  style="text-indent:6px" name="stuMajor"/>
   				班级：<input type="text"  style="text-indent:6px" name="stuClass"/>
   				政治面貌：<input type="text"  style="text-indent:6px" name="stuPoliticalStatus"/></br>
   				入学时间：<input type="text" name="stuEnrollment" placeholder="yyyy-MM-dd"/><br>
   				联系方式：<input type="text"  style="text-indent:6px" name="stuContactWay"/></br>
   				学期：<input type="text"  style="text-indent:6px" name="semester"/>
   				密码：<input type="text"  style="text-indent:6px" name="password"/></br>
   				<input class="button" type="submit" value="提交"/>
	      </form>
     	 </center>
     	  <!-- 修改老师信息 -->
     	 <center>
	      <form action="teacher" method="post">
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
