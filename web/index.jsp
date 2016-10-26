<%-- 
    Document   : index
    Created on : 2016-4-5, 21:20:46
    Author     : Joh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
         <script type="text/javascript">
           
                var login = document.getElementById('login');
                var zhuce = document.getElementById('zhuce');
              
                
                function sign(){
                    window.location = "zhuce.jsp";
                }
                
                 function login(){
                    window.location = "login.jsp";
                }

    </script>
        <ul>
            <li><button name="zhuce" id="zhuce" onclick=" function(){
                    window.location = 'zhuce.jsp'}">注册</button></li>
             <li><button name="login" id="login" onclick="login()">登录</button></li>
           
        </ul>
        
      
    </body>
</html>
