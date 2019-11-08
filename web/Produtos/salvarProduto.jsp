<%-- 
    Document   : salvarProduto
    Created on : 04/11/2019, 21:45:14
    Author     : João Victor
--%>

<%@page import="entidades.CodigoDeBarras"%>
<%@page import="java.util.List"%>
<%@page import="entidades.Produtos"%>
<%@page import="servletProdutos.ServletSalvarProduto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produto</title>
    </head>
    <body>
        <h1>Cadastro de Produto</h1>
        <form action="../ServletSalvarProduto">
            <table class="table">
                <tr>
                    Nome: <input type="text" name="nome">
                </tr>
                <tr>
                    Codigo de barras:
                    <select name="codigo">
                        <option selected="selected">Selecione</option>
                        <%
                           ServletSalvarProduto ssp = new ServletSalvarProduto();
                           List<CodigoDeBarras> listaBarras = ssp.listarCodBarras();
                           
                               for(CodigoDeBarras codiboBarras : listaBarras){                                                   
                        %>
                        <option value="<%=codiboBarras.getIdBarras()%>"><%out.print(codiboBarras.getCodigo()); %></option>
                              <%}%>                       
                     </select>
                </tr>
                <input type="submit" value="Salvar produto">
                <td><a href="../CodigoBarras/salvarCodigoB.jsp">Cadastrar um novo Código de Barras</a></td>
            </table>
        </form>
    </body>
</html>
