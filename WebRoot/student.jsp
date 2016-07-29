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
    <h1>Student Page</h1>
    <%
    HttpSession se = request.getSession();
    String user = (String)se.getAttribute("username");
    String password = (String)se.getAttribute("password");
    out.println(user+"\n");
    out.println(password);
     %>
    <center>
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
    <hr/>
  </body>
</html>
