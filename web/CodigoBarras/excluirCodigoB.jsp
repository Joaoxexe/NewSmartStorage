<%-- 
    Document   : excluirCodigoB
    Created on : 07/11/2019, 12:59:38
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
        <h1>Exclusão de Código de Barras</h1>
        <form action="../ServletExcluirCodigoB" method="post">
            <table class ="table">
                <tr>
                    ID: <input type="text" name="id" value="<%out.print(request.getAttribute("id")); %>">
                </tr>
                <tr>
                    Código: <input type="text" name="codigo" value="<%out.print(request.getAttribute("codigo")); %>">
                </tr>
                <tr>
                    <input type="submit" value="Excluir Código">
                </tr>               
            </table>          
        </form>
    </body>
</html>
