<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%><!DOCTYPE html PUBLIC html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>home page</title>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="homestyle.css">
  <link href="css/home.css" type="text/css" rel="stylesheet" />
</head>
</head>
<body>
  <div id="container">
    <div id="head">
      <img  class="title" src="images/title.png" style="margin-top:20px">
    </div>
    <!--新闻展示栏-->
    <div id="banner">
      <div id="slideshow" rel="auto-play">
        <div class="img"> 
          <span>
          <a href="#" target="_blank"><img src="images/field.jpg" alt="左右全屏焦点图" /></a>
          <a href="#" target="_blank"><img src="images/forest.jpg" alt="左右全屏焦点图" /></a>
          <a href="#" target="_blank"><img src="images/frozen-water.jpg" alt="左右全屏焦点图" /></a>
          </span>
          <div class="paging pattern"></div>
          <div class="paging subpattern"></div>
        </div>
      </div>
      <script src="js/jquery-1.7.2.min.js"></script>
      <script src="js/jquery.slider.js"></script>
    </div>

  
    <!--主题部分--> 
    <div id="main"> 
  
      <!-- 代码部分begin -->
      <div class="index-con" style="z-index: 0">
        <ul>
          <li class="in-kct in-course"> 
            <a href="#" title="个人信息">
                <div class="in-block"> 
                <i class="bigger"></i> 
                <span class="ch show" style="display: block;">个人信息</span> 
                <i class="in-none"></i> 
                <span class="in-text" style="display: none;"></span> 
                </div>
            </a>
           </li>
          <li class="in-kct in-quest">
          <a href="#" title="选课">
              <div class="in-block"> 
              <i class=""></i> 
              <span class="ch" style="display: inline;">选课</span>
              <i class="in-none"></i> 
              <span class="in-text" style="display: none; width: 280px; left: 30px"></span> 
              </div>
           </a> 
           </li>
          <li class="in-jbk in-plan"> 
          <a href="#" title="成绩查询">
            <div class="in-block"> 
              <i style="display: block;"></i> 
              <span style="display: inline;">成绩查询</span>
              <i class="in-none toLeft1" style="display: none;"></i> 
              <span class="in-text" style="display: none;"></span> 
            </div>
           </a> 
           </li>
          <li class="in-jbk in-report"> 
          <a href="#" title="选课结果">
            <div class="in-block"> 
            <i style="display: block;"></i> 
            <span style="display: inline;">选课结果</span>
            <i class="in-none toLeft2" style="display: none;"></i> 
            <span class="in-text" style="display: none;"></span> 
            </div>
           </a> 
           </li>

          <li class="in-zxl in-forma"> 
          <a href="#" title="修改信息">
            <div class="in-block"> 
            <i style="display: block;"></i> 
            <span style="display: inline;">修改信息</span> 
            <i class="in-none toLeft0 toLeft4" style="display: none;"></i> 
            <span class="in-text" style="display: none;"></span> 
            </div>
           </a> 
           </li>

          <li class="in-zxl in-means"> 
          <a href="#" title="修改密码">
            <div class="in-block"> <i></i> 
            <span>修改密码</span> 
            <i class="in-none"></i> 
            <span class="in-text"></span> 
            </div>
           </a> 
           </li>

          <li class="in-jbk in-client"> <a href="#" target="_blank" title="查看作业">
            <div class="in-block"> <i></i> <span>查看作业</span> <i class="in-none"></i> <span class="in-text">
              
              </span> </div>
            </a> </li>
        </ul>
      </div>
      <script src="js/core.js" type="text/javascript"></script>
      <script>
          seajs.use('jquery',function($) {
              $(function () {
                   //
                  $(".index-con .in-kct").hover(function() {
                      $(this).find('i:first').addClass('smaller').removeClass('bigger')
                      $(this).find('span:first').fadeOut('')
                      $(this).find('.in-text').show('fast').addClass('show')
                      $(this).find('.ch').removeClass('')
                  }, function() {
                      $(this).find('i:first').removeClass('smaller').addClass('bigger')
                      $(this).find('span:first').fadeIn('')
                      $(this).find('.in-text').hide('').removeClass('fast')
                      $(this).find('.ch').addClass('show')
                  })
                  $(".index-con .in-jbk").hover(function() {
                      $(this).find('i:first').addClass('hide')
                      $(this).find('span:first').hide('')
                      $(this).find('.in-text').show('').addClass('show')
                      var num = $(this).index('.in-jbk') + 1;
                      $(this).find('.in-none').show('').addClass('toLeft' + num).removeClass('toRight' + num)
                      $(this).find('.ch1').removeClass('show')
                  }, function() {
                      $(this).find('i:first').addClass('hide')
                      $(this).find('span:first').fadeIn('')
                      $(this).find('.in-text').hide('').removeClass('show')
                      var num = $(this).index('.in-jbk') + 1;
                      $(this).find('.in-none').show().addClass('toRight' + num).removeClass('toLeft' + num)
                      $(this).find('.ch1').addClass('show')
                  })
                  $(".index-con .in-zxl").hover(function() {
                      $(this).find('i:first').addClass('hide')
                      $(this).find('span:first').hide('')
                      $(this).find('.in-text').show().addClass('show')
                      var nums = $(this).index('.in-zxl') + 1;
                      $(this).find('.in-none').show().addClass('toLeft4').removeClass('toRight4')
                      $(this).find('.ch2').removeClass('show')
                  }, function() {
                      $(this).find('i:first').addClass('hide')
                      $(this).find('span:first').fadeIn('fast')
                      $(this).find('.in-text').hide().removeClass('show')
                      $(this).find('.in-none').show().addClass('toRight4').removeClass('toLeft4')
                      $(this).find('.ch2').addClass('show')
                  });
              });
          })
      </script>
      <!-- 代码部分end -->
    <div id="foot">
      </br>
          <p>copyright by Liu and Yang</p>
    </div>

  </div>
</body>
</html>