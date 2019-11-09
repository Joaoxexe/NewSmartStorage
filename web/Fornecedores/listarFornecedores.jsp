<%-- 
    Document   : listarFornecedores
    Created on : 08/11/2019, 13:48:15
    Author     : João Victor
--%>

<%@page import="entidades.Fornecedores"%>
<%@page import="java.util.List"%>
<%@page import="servletFornecedores.ServletSalvarFornecedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fornecedores</title>

    <link href="https://www.fontify.me/wf/822845a211e250d3989a107203e72537" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="css/font-awesome-all.min.css">
    <link rel="stylesheet" href="css/loading.css">
    <link rel="stylesheet" href="css/table.css">
</head>
<body>
    <div id="loading" class="background-loader">
        <div class="loader">
            <div class="inner one"></div>
            <div class="inner two"></div>
            <div class="inner three"></div>
        </div>
    </div>
    <div defer class="container pt-5 pb-2">
        <h1 class="pb-3">Fornecedores</h1>
        <td><a href="../Fornecedores/salvarFornecedor.jsp"> Novo Fornecedor</a></td>          
        <div class="tbl-header">
            <table cellpadding="0" cellspacing="0" border="0">
                <thead>
                    <tr>
                        <th>ID:</th>
                        <th>Acões</th>
                        <th>Nome do Fornecedor</th>
                        <th>Nome Fantasia</th>
                        <th>Telefone</th>
                        <th>CNPJ</th>
                        <th>E-mail</th>              
                        <th>Cidade</th> 
                        <th>CEP</th>                      
                        <th>Estado</th>
                        <th>Nº Endereço</th>                      
                    </tr>
                </thead>
            </table>
        </div>
        <div class="tbl-content">
            <form action="../ServletListarFornecedor" method="post">
                <%
                    ServletSalvarFornecedor ssf = new ServletSalvarFornecedor();
                    List<Fornecedores> getList = ssf.listarFornecedores();
                %>
                    <table cellpadding="0" cellspacing="0" border="0">
                        <tbody>
                            <%                 
                                for(Fornecedores fornecedores : getList ){
                            %>
                                <tr>
                                    <td>
                                        <%=fornecedores.getIdFornecedor()%>
                                    </td>

                                    <td>
                                        <a class="acao-edit" href="../ServletListarFornecedores?Id=<%=fornecedores.getIdFornecedor()%>&tipo=1" target="_blank" rel="noopener noreferrer">
                                            <i class="fas fa-edit mr-2"></i>
                                        </a>

                                        <a class="acao-delete" href="../ServletListarFornecedores?Id=<%=fornecedores.getIdFornecedor()%>&tipo=2" target="_blank" rel="noopener noreferrer">
                                            <i class="fas fa-trash"></i>
                                        </a>
                                    </td>
                                    <td>
                                        <%=fornecedores.getNmFornecedor()%>
                                    </td>
                                    <td>
                                        <%=fornecedores.getNmFantasiaFornecedor()%>
                                    </td>   
                                    <td>
                                        <%=fornecedores.getTelefoneFornecedor()%>
                                    </td>     
                                    <td>
                                        <%=fornecedores.getCnpjFornecedor()%>
                                    </td> 
                                    <td>
                                        <%=fornecedores.getEmailFornecedor()%>
                                    </td> 
                                    <td>
                                        <%=fornecedores.getIdEndereco().getCidadeEndereco()%>
                                    </td>
                                    <td>
                                        <%=fornecedores.getIdEndereco().getCepEndereco()%>
                                    </td>                                   
                                    <td>
                                        <%=fornecedores.getIdEndereco().getUfEndereco()%>
                                    </td> 
                                     <td>
                                        <%=fornecedores.getNumeroEnderecoFornecedor()%>
                                    </td>                             
                                </tr>
                                <%}%>                                
                        </tbody>
                    </table>
            </form>
        </div>        
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="css/font-awesome-min.js"></script>
    <script>
        $(document).ready(function() {
            setTimeout(() => {
                $('#loading').remove();
            }, 1000);

            $(window).on("load resize", function() {
                var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();
                $('.tbl-header').css({
                    'padding-right': scrollWidth
                });
            }).resize();

        });
    </script>
</html>
