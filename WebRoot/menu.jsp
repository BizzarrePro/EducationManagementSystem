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
  <link href="css/theme.min.css" type="text/css" rel="stylesheet" />
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
          <li class="on"><a href="#" class="first">首页</a><div class="second">1</div></li>
            <li><a href="#">个人信息</a><div class="second">2</div></li>
            <li><a href="#">修改信息</a><div class="second">3</div></li>
            <li><a href="#">选课</a><div class="second">4</div></li>
            <li><a href="#">选课结果</a><div class="second">5</div></li>
            <li><a href="#">查看作业</a><div class="second">6</div></li>
            <li><a href="#">成绩查询</a><div class="second">7</div></li>
            <li><a href="#">修改密码</a><div class="second">8</div></li>
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
      <input id="button" type="button" name="display" value="日期">
      
      <div id ="date">
        <div class="aboluo-w-700">
        <div class="aboluo-leftdiv">
        <div class="aboluo-tools">
        <div class="aboluo-calendar-select-year"></div>
        <div class="aboluo-calendar-month">
        <a class="aboluo-month-a-perv" href="javascript:;">&lt; </a>
        <a class="aboluo-month-a-next" href="javascript:;"> &gt;</a>
        </div>
        <input type="button" class="aboluo-toToday" value="返回今天" />
        </div>
        <div class="aboluo-rilidiv">
        <table class="aboluo-rilitable" cellspacing="0" cellpadding="0" >
        <thead class="aboluo-rilithead">
          <tr>
            <th>一</td>
            <th>二</td>
            <th>三</td>
            <th>四</td>
            <th>五</td>
            <th style="color:red;">六</td>
            <th style="color:red;">日</td>
          </tr>
        </thead>
        </table>
        </div>
        </div>
        <div class="aboluo-rightdiv">
        <p class="aboluo-xssj"><p>
        <p class="aboluo-currday"></p>
        <p class="aboluo-ssjjr"></p>
        <p class="aboluo-xsmx"></p>
        </div>
        </div>
        <script src="js/jquery.js"></script>
        <script src="js/date.js"></script>
        <script type="text/javascript">
          $("#button").click(function(){
            $(this).val("收起");
            $("#date"). toggle(1000);
            $(this).val("日期");
          });
          </script>

        <!-- 代码部分end -->
      </div>




      <div>
        
      </div>
    </div>

    <div id="foot">
      
    </div>
  </div>
</body>
</html>