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
    
    <title>My JSP 'success.jsp' starting page</title>
    
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
    <h1>Hello EveryBody</h1>
    <center>
    	<s:bean name="com.entity.User" var="usr">
    		<s:param name="name" value="'20133'" >
    		</s:param>
    		<s:param name="attribute" value="'13243445345'">
    		</s:param>
    	</s:bean>
    	<s:property value="#usr.name"/> 
    	<s:if test="#usr.attribute == null">
    		SABI
    	</s:if>
    	<s:else>
    		<s:property value="#usr.attribute"/> 
    	</s:else>
       	<br/>
       	<s:property value="#hello.name"/>
    	<br/>
    	<s:property value="%{user1.name}"/><br/>
   	 	<s:property value="#user1.attribute"/><br/> 
   	 	<!-- s:property value="#list.get(0).num"/-->
   	 	<s:iterator value="%{list}" var="p" status="st">
   	 		<s:property/>
   	 		<s:iterator value="#list.get(#st.index)" var="a">
   	 			<s:property value="#a.name"/><br/>
   	 		</s:iterator>
   	 		<br/>
   	 	</s:iterator>
   	 	<!-- s:property> value="#list.get(0).num"/--><br/>	
    </center>
        	<s:if test="#user1.num == 11111">
        		You are administrator.
        	</s:if>
        	<s:else>
        		You are a full guy.
        	</s:else>
    <hr/>
  </body>
</html>
