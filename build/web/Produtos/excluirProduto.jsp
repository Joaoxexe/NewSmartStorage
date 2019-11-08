<%-- 
    Document   : excluirProduto
    Created on : 07/11/2019, 13:16:35
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
         <h1>Exclusão de Produto</h1>
        <form action="../ServletExcluirProduto">
            <table class="table">
                <tr>
                    ID: <input type="text" name="id" value="<%out.print(request.getAttribute("id")); %>" readonly="true">
                </tr>
                <tr>
                    Nome: <input type="text" name="nome" value="<%out.print(request.getAttribute("nome")); %>" readonly="true">
                </tr>
                <tr>
                    Codigo de barras: <input type="text" name="codigo" value="<%out.print(request.getAttribute("codigo")); %>" readonly="true">
                </tr>
                <tr>
                    <input type="submit" value="Excluir produto">
                </tr>
            </table>
        </form>
    </body>
</html>
