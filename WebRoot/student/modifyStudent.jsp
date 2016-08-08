<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>功能导航</title>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="../css/menustyle.css">
  <link rel="stylesheet" type="text/css" href="../css/table.css">
  <link type="text/css" rel="stylesheet" href="../css/style.css" />
  <link type="text/css" rel="stylesheet" href="../css/nav.css" />
  <script type="text/javascript" src="../js/nav.js"></script>
  <script type="text/javascript" src="http://libs.baidu.com/jquery/1.8.3/jquery.js">
  </script>
  <style type="text/css">
    .middle{
      float: right;
      width: 1000px;
      height: 600px;
      text-align: center;
      margin-top: -570px;
      overflow:auto;
    }
    input{
      margin-top: 5px;
      border: 1px solid black;
      border-radius:5px;
      -moz-border-radius: 5px;
      -webkit-border-radius: 5px;
    
    }
  </style>
</head>
<body>
  <div id="container">

    <div id="banner">
  
    <script type="text/javascript">
  function dropMenu(obj){
  $(obj).each(function(){
    var theSpan = $(this);
    var theMenu = theSpan.find(".submenu");
    var tarHeight = theMenu.height();
    theMenu.css({height:0,opacity:0});
    theSpan.hover(
      function(){
        $(this).addClass("selected");
        theMenu.stop().show().animate({height:tarHeight,opacity:1},400);
      },
      function(){
        $(this).removeClass("selected");
        theMenu.stop().animate({height:0,opacity:0},400,function(){
          $(this).css({display:"none"});
        });
      }
    );
  });
}

$(document).ready(function(){
  
  dropMenu(".drop-menu-effect");

});
</script>
<div class="navbox">
  <div class="nav">
    <ul class="clearfix">
      <li><a class="drop-menu-effect" target="_self" href="homepage_teacher.jsp"><span>首页</span></a></li>
      <li class="drop-menu-effect"> <a target="_self" href="#"><span>添加信息</span></a>
        <ul class="submenu">
          <li><a href="viewteacher.jsp">查看学生信息</a></li>
          <li><a href="modifyteacher.jsp">添加学生信息</a></li>
           <li><a href="viewTeacher.jsp">查看教师信息</a></li>
          <li><a href="modifyTeacher.jsp">添加教师信息</a></li>
        </ul>
      </li>
      <li class="drop-menu-effect"> <a target="_self" href="#"><span>添加课程</span></a>
        <ul class="submenu">
         <li><a href="viewCourses.jsp">查看课程信息</a></li>
          <li><a href="modifyCourses.jsp">添加课程信息</a></li>
        </ul>
      </li>
      <li class="drop-menu-effect"> <a target="_self" href="#"><span>查看成绩</span></a>
        <ul class="submenu">
          <li><a href="viewGrade.jsp">查看学生成绩</a></li>
          <li><a href="viewGrade.jsp">上传成绩</a></li>
          <li><a href="modifyGrade.jsp">修改成绩</a></li>
        </ul>
      </li>
      <li class="drop-menu-effect"> <a target="_self" href="#"><span>考试安排</span></a>
        <ul class="submenu">
          <li><a href="#">考试管理规定</a></li>
          <li><a href="viewExam.jsp">录入考试安排</a></li>
        </ul>
      </li>
      <li><a class="drop-menu-effect" target="_self" href="#"><span>修改密码</span></a></li>
    </ul>
  </div>

</div>
    </div>


    <div id="content">
      
      
      <div class="left">
        <a href="http://kczx.hnu.cn/" class="t a"><img src="../images/课程中心.jpg"> </a>
        <label>课程中心</label><br/><br/>
        <a href="http://hdjw1.hnu.cn/" class="t b"><img src="../images/教务系统.jpg"></a>
        <label>教务系统</label><br/><br/>
        <a href="http://lib.hnu.cn/" class="t c"><img src="../images/图书馆.jpg"></a>
        <label>图书馆</label><br/><br/>
      </div>

    <div class="middle">

     <center>
    <h1>湖南大学学生管理系统</h1>
    <s:form action="ModifyStudent" method="post" theme="simple">
      <s:hidden name="student.id"></s:hidden>
      <p>
        学号：
        <s:textfield name="student.stuNum"></s:textfield>
      <p>
        姓名：
        <s:textfield name="student.tuName"></s:textfield>
      <p>
        专业：
        <s:textfield name="student.stuMajor"></s:textfield>
      <p>
        <s:submit value="确定"></s:submit>
        <s:reset value="重改"></s:reset>
      <p>
        <s:fielderror></s:fielderror>
    </s:form>
      <a href="ViewStudent.action">显示学生信息</a>
    </p>
  </center>

   
      </div>
      
    </div>

    

    <div id="foot">
      </br>
          <p>copyright by Liu and Yang</p>
    </div>
  </div>
</body>
</html>