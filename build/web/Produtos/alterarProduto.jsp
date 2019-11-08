<%-- 
    Document   : alterarProduto
    Created on : 07/11/2019, 13:44:40
    Author     : João Victor
--%>

<%@page import="entidades.CodigoDeBarras"%>
<%@page import="java.util.List"%>
<%@page import="servletProdutos.ServletSalvarProduto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Alteração de Produto</h1>
        <form action="../ServletAlterarProduto">
            <table class="table">
                <tr>
                    ID: <input type="text" name="id" value="<%out.print(request.getAttribute("id")); %>" readonly="true">
                </tr>
                <tr>
                    Nome: <input type="text" name="nome" value="<%out.print(request.getAttribute("nome")); %>">
                </tr>
                <tr>
                    Codigo de barras: 
                        <select name="codigo">
                        <option selected="selected" value=""><%out.print(request.getAttribute("codigo")); %></option>
                        <%
                           ServletSalvarProduto ssp = new ServletSalvarProduto();
                           List<CodigoDeBarras> listaBarras = ssp.listarCodBarras();
                           
                               for(CodigoDeBarras codiboBarras : listaBarras){                                                   
                        %>
                        <option value="<%=codiboBarras.getIdBarras()%>"><%out.print(codiboBarras.getCodigo()); %></option>
                              <%}%>                       
                     </select>
                </tr>
                <tr>
                    <input type="submit" value="Alterar Produto">
                </tr>
            </table>
        </form>
    </body>
</html>
