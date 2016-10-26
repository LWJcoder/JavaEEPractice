<%-- 
    Document   : zhuce
    Created on : 2016-4-5, 8:58:32
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>注册页面</title>
        <style>
            .info{
                margin:3% 43%;
            }            
        </style>
    </head>
    <body>
        <h1 style="text-align: center">欢迎注册</h1>
        
<form method="post" action="zhuce">
	<div class="info">
		<label for="username">用户名:</label>
		<input type="text" id="username" name="username" class="required" />
	</div>

	<div class="info">
		<label for="personinfo">密码:</label>
		<input type="password" id="password" name="password"  class="required" />
	</div>
    
    	<div class="info">
		<label for="email">邮箱:</label>
		<input type="text" id="email" name="email" />
	</div>
	<div class="info">
            <input type="submit" value="提交" id="send" name="Submit2"/>
                <input type="reset" id="res"/>
	</div>
</form>
    </body>
</html>
