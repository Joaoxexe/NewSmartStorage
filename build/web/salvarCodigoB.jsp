<%-- 
    Document   : salvarCodigoB
    Created on : 04/11/2019, 13:45:27
    Author     : João Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ServletSalvarCodigoB" method="post">7
            <table class ="table">
                <tr>
                    Código: <input type="text" name="codigo">
                </tr>
                <tr>
                    <input type="submit" value="Salvar">
                </tr>               
            </table>          
        </form>
    </body>
</html>
