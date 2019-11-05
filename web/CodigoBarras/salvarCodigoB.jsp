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
        <title>Cadastro de Código de Barras</title>
    </head>
    <body>
        <h1>Cadastro de Código de Barras</h1>
        <form action="../ServletSalvarCodigoB" method="post">
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
