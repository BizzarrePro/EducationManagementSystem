<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>login</title>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="css/login.css">
  <script>
    function check(){
      if(document.login.username.value==""){
        alert("用户名不能为空！");
        document.login.username.focus();
        return false;
      }
      else if(document.login.password.value==""){
        alert("密码不能为空！");
        document.login.password.focus();
        return false
      }
      return true;
  }
  </script>
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
        <form name="login" action="user" method="post" onsubmit="return check()">
          <input class="button" type="text" style="text-indent:6px" name="username" placeholder="&nbsp用户名"></br>
          <input class="button"type="password"  style="text-indent:6px" name="password"  placeholder="&nbsp密码"></br></br>
          <label><input  type="radio" name="type" value="学生" checked="checked" >学生</label>
          <label><input  type="radio" name="type" value="老师" >教师</label>
          <label><input  type="radio" name="type" value="管理员" >管理员</label>
          <div class="box">
          <input class="button" type="submit" value="登录">
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
