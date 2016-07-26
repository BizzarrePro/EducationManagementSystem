<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>login</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="logintype.css">
	<script type="text/javascript" src="JavaScript/jquery-3.1.0.js"></script>
	<script type="text/javascript" src="./jquery.notesforlightbox.js"></script>
     <script type="text/javascript" src="http://libs.baidu.com/jquery/1.8.3/jquery.min.js"></script>
</head>
<body>
	<div id="container">
	   <!--顶部栏-->
		<div id="top">
			<img src="image/title.png" style="margin-top:20px">
		</div>
		
       <!--左部照片栏-->
   		<div id="left">
   			<div class="content">
                <div class="divPics">
                    <ul>
                        <li><a href="image/p1.jpg" title="第1篇风景图片">
                            <img src="image/p1.jpg" alt="" />
                        </a></li>
                        <li><a href="image/p2.jpg" title="第2篇风景图片">
                            <img src="image/p2.jpg" alt="" />
                        </a></li>
                        <li><a href="image/p3.jpg" title="第3篇风景图片">
                            <img src="image/p3.jpg" alt="" />
                        </a></li>
                    </ul>

                	  <ul>
                        <li><a href="image/p4.jpg" title="第4篇风景图片">
                            <img src="image/p4.jpg" alt="" />
                        </a></li>
                        <li><a href="image/p5.jpg" title="第5篇风景图片">
                            <img src="image/p5.jpg" alt="" />
                        </a></li>
                        <li><a href="image/p6.jpg" title="第6篇风景图片">
                            <img src="image/p6.jpg" alt="" />
                        </a></li>
                    </ul>

                </div>
            </div>
   		</div>
   		 <script type="text/javascript">
            $(function () {
               $('divPics a').lightBox({
                    overlayBgColor: "#666", //图片浏览时的背景色
                    overlayOpacity: 0.5, //背景色的透明度
                    containerResizeSpeed: 600 //图片切换时的速度
                })
            });
        </script>
       <!--登陆部分-->
   		<div id="main">
   		 <div class="title">
   		    </br>
   		 	<p>用户登录</p>
   		 </div>
   			<form action="login" method="post">
   			    
   				<input class="u user" type="text" style="text-indent:6px" name="username" placeholder="&nbsp用户名"></br>
   				<input class="u password" type="password"  style="text-indent:6px" name="password"  placeholder="&nbsp密码">
   				<label><input class="i student" type="radio" name="type" value="学生" checked="checked" >学生</label>
   				<label><input class="i teacher" type="radio" name="type" value="老师" >教师</label>
   				<label><input class="i manager" type="radio" name="type" value="管理员" >管理员</label>
	  			<div class="box">
	  				<input class="button" type="submit" value="登录">
	  		 		<span class="line line-top"></span>
	  		 		<span class="line line-right"></span>
	  		 		<span class="line line-bottom"></span>
	  		 		<span class="line line-left"></span>
	  			</div>
	  			<div class="Re">
	  				<a href="#" class="reset"> 重置</a>
	  			</div>
	  			
   			</form>
   		</div>
 		<!--页底-->
   		<div id="foot">
   		    </br>
   		    </br>
   			<p>copyright by Liu and Yang</p>
   		</div>
	</div>
   
</body>
</html>
