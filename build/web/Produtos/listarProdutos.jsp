
<%@page import="java.util.List"%>
<%@page import="entidades.Produtos"%>
<%@page import="servletProdutos.ServletSalvarProduto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produtos Cadastrados</title>
    </head>
    <body>
        
         <form action="../ServletListarProduto" method="post">
         <%
            ServletSalvarProduto ssp = new ServletSalvarProduto();
            List<Produtos> getList = ssp.listarProdutos();
         %>
         <table class="table">
            <thead>
               <tr>
                  <th>Código do produto</th>  
                  <th>Nome do produto</th>
                  <th>Código de barras</th>  
               </tr>
            </thead>
            <tbody>
               <%                 
                  for(Produtos produtos : getList ){
               %>
               <tr> 
                  <td>
                     <%=produtos.getIdProduto()%>
                  </td>
                  <td>
                     <%=produtos.getNmProduto()%>
                  </td>
                  <td>
                     <%=produtos.getIdBarras().getCodigo()%>
                  </td>                   
                  <td>
                     <a href="../ServletListarProduto?IdProduto=<%=produtos.getIdProduto()%>&tipo=1"><img src="../img/atualizar.png" width="35px" height="35px" title="Alterar o produto <%=produtos.getNmProduto()%> "></a>
                  </td>
                  <td>
                     <a href="../ServletListarProduto?IdProduto=<%=produtos.getIdProduto()%>&tipo=2"><img src="../img/excluir.png" width="35px" height="35px" title="Remover produto <%=produtos.getNmProduto()%> "></a>
                  </td>
               </tr>
               <%}%>
            </tbody>
         </table>
      </form>
    </body>
</html>
