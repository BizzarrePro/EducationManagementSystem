<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>EAS of Hunan University </title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <h1 style="color:#4F9D9D;background-color:#613030;font-size:25px">个人门户登录</h1>
    	<s:form action="user">
    		<s:textfield label="工号/学号" name="name" cssStyle="width:265px" /><br/>
    		<s:password label="密 码" name="attribute" cssStyle="width:265px" /><br/>
    		<s:bean name="com.entity.User" var="hello">
    			<s:param name="name" value="'qian baobao'"/>
    			<s:param name="attribute" value="'hello'"/>
    		</s:bean>
    		<s:submit value="登录"/>
    	</s:form>  
    </body>
  </html>
<head>
	<title>login</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="logintype.css">
	<script type="text/javascript" src="./JavaScript/jquery-3.1.0.js"></script>
	<script type="text/javascript" src="./jquery.notesforlightbox.js"></script>
     <script type="text/javascript" src="http://libs.baidu.com/jquery/1.8.3/jquery.min.js"></script>
</head>
<body>
	<div id="container">
	   <!--顶部栏-->
		<div id="top">
			<img src="./image/title.png" style="margin-top:20px">
		</div>
		
       <!--左部照片栏-->
   		<div id="left">
   			<div class="content">
                <div class="divPics">
                    <ul>
                        <li><a href="./image/p1.jpg" title="第1篇风景图片">
                            <img src="./image/p1.jpg" alt="" />
                        </a></li>
                        <li><a href="./image/p2.jpg" title="第2篇风景图片">
                            <img src="./image/p2.jpg" alt="" />
                        </a></li>
                        <li><a href="./image/p3.jpg" title="第3篇风景图片">
                            <img src="./image/p3.jpg" alt="" />
                        </a></li>
                    </ul>

                	  <ul>
                        <li><a href="./image/p4.jpg" title="第4篇风景图片">
                            <img src="./image/p4.jpg" alt="" />
                        </a></li>
                        <li><a href="./image/p5.jpg" title="第5篇风景图片">
                            <img src="./image/p5.jpg" alt="" />
                        </a></li>
                        <li><a href="./image/p6.jpg" title="第6篇风景图片">
                            <img src="./image/p6.jpg" alt="" />
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
   			<form>

   				<input type="text" style="text-indent:6px" name="user" placeholder="&nbsp用户名"></br>
   				<input type="password"  style="text-indent:6px" name="password"  placeholder="&nbsp密码">

	  			<div class="box">
	  				<a href="#" class="button" >
	  		 		<span class="line line-top"></span>
	  		 		<span class="line line-right"></span>
	  		 		<span class="line line-bottom"></span>
	  		 		<span class="line line-left"></span>
	  		 		登录
	  			 	</a>
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
