<%-- 
    Author     : João Victor
--%>

<%@page import="java.util.List"%>
<%@page import="entidades.Enderecos"%>
<%@page import="servletFornecedores.ServletSalvarFornecedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
                        <!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cadastro de Fornecedor</title>

    <link href="https://www.fontify.me/wf/822845a211e250d3989a107203e72537" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="css/font-awesome-all.min.css">
    <link rel="stylesheet" href="css/loading.css">
    <link rel="stylesheet" href="css/table.css">
    <link href="https://fonts.googleapis.com/css?family=Teko|Orbitron|Turret+Road&display=swap" rel="stylesheet">   
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
        <h1 class="pb-3">Cadastro de Fornecedor</h1>
        <div class="tbl-header">
            <table cellpadding="0" cellspacing="0" border="0">
                <thead>
                    <tr>                                          
                        <th>Nome do Fornecedor</th>
                        <th>Nome Fantasia</th>
                        <th>Telefone</th>
                        <th>CNPJ</th>
                        <th>E-mail</th>              
                        <th>Código Endereço</th> 
                        <th>Nº Endereço</th>
                    </tr>
                </thead>
            </table>
        </div>
        <div class="tbl-content">
            <form action="../ServletSalvarFornecedor" method="post">
                <table cellpadding="0" cellspacing="0" border="0">
                    <tr>
                        <td>
                            Nome do Fornecedor:<input type="text" name="nome">
                        </td>
                        <td>
                            Nome Fantasia:<input type="text" name="fantasia">
                        </td>
                        <td>
                            Telefone:<input type="text" name="telefone">
                        </td>
                        <td>
                            CNPJ:<input type="text" name="cnpj">
                        </td>
                        <td>
                            E-mail:<input type="text" name="email">
                        </td>                     
                        <td>
                            Endereço:
                            <select name="idEnd">
                                <option selected="selected">Selecione</option>
                                <%
                                    ServletSalvarFornecedor ssf = new ServletSalvarFornecedor();
                                    List<Enderecos> listaEnd = ssf.listarEnderecos();

                                        for(Enderecos enderecos : listaEnd){                                                   
                                %>
                                    <option value="<%=enderecos.getIdEndereco()%>">
                                            <%out.print(enderecos.getTipoLogradouroEndereco() + " " +
                                                        enderecos.getLogradouroEndereco() + ", " +
                                                        enderecos.getBairroEndereco() + ", " +
                                                        enderecos.getCidadeEndereco() + ", " +
                                                        enderecos.getCepEndereco()); %>
                                    </option>
                                    
                                      <%}%>    
                            </select>                    
                        </td>
                        <td>
                            Nº Endereço:<input type="text" name="numeroEnd">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Salvar Fornecedor">
                        </td>
                    </tr>
                    <td><a href="../Enderecos/salvarEndereco.jsp">Novo Endereço</a></td>                  
                </table>
            </form>
        </div>
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="./js/font-awesome-min.js"></script>
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