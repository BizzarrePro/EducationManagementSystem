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
	<link rel="stylesheet" type="text/css" href="css/logintype.css">
  <script type="text/javascript" src="http://libs.baidu.com/jquery/1.8.3/jquery.min.js"></script>
</head>
<body>
	<div id="container">
      <div id="head">
        <img src="images/title.png">
      </div>
   		<div id="main">
   		   <div class="title">
   		    </br>
   		   	<p>用户登录</p>
   		   </div>
   			<form>

   				<input id="user" type="text" style="text-indent:6px" name="user" placeholder="&nbsp用户名"></br>
   				<input id="password" type="password"  style="text-indent:6px" name="password"  placeholder="&nbsp密码">

	  			<div class="box">
            <a href="#" class="button" type="submit">
            <span class="line line-top"></span>
            <span class="line line-right"></span>
            <span class="line line-bottom"></span>
            <span class="line line-left"></span>
            登录
            </a>
	  		 		
	  			</div>
	  			<div class="Re">
	  				<input class="reset" type="reset" name="reset" value="重置">
	  			</div>
	  	
   			</form>
   		</div>
 		<!--页底-->
   		<div id="foot">
        </br>
   			<p>copyright by Liu and Yang</p>
   		</div>
	</div>
   
</body>
</html>
