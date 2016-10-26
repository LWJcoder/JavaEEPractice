<%-- 
    Document   : LOGIN
    Created on : 2016-4-5, 9:30:15
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               
<form method="post" action="login">
	<div class="info">
		<label for="username">用户名:</label>
		<input type="text" id="username" name="username" class="required" />
	</div>

	<div class="info">
		<label for="personinfo">密码:</label>
		<input type="password" id="password" name="password"  class="required" />
	</div>
    
    	
	<div class="info">
            <input type="submit" value="登录" id="login" name="login1"/>
                <input type="reset" id="res"/>
	</div>
</form>
    </body>
</html>
