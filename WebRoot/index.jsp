<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
