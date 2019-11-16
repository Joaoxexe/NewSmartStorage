<%-- 
    Document   : salvarSaida
    Created on : 15/11/2019, 18:04:27
    Author     : João Victor
--%>

<%@page import="entidades.Produtos"%>
<%@page import="servletProdutos.ServletSalvarProduto"%>
<%@page import="entidades.Clientes"%>
<%@page import="servletClientes.ServletSalvarCliente"%>
<%@page import="servletFuncionarios.ServletSalvarFuncionario"%>
<%@page import="entidades.Funcionarios"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cadastro de Saidas</title>

    <link href="https://www.fontify.me/wf/822845a211e250d3989a107203e72537" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/font-awesome-all.min.css">
    <link rel="stylesheet" href="../css/loading.css">
    <link rel="stylesheet" href="../css/table.css">
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

    <div class="text-left">
        <a role="button" href="../index.html" class="btn btn-info">
            <i class="fas fa-chevron-left"></i> Pagina Inicial
        </a>
    </div>
    <div defer class="container pt-5 pb-2">
        <h1 class="pb-3">Cadastro de Saidas</h1>
        <div class="tbl-header">
            <table cellpadding="0" cellspacing="0" border="0">
                <thead>
                    <tr>
                        <th>Data da Saida</th>
                        <th>Quantidade</th>
                        <th>Valor Unitario</th>
                        <th>Funcionario</th>
                        <th>Cliente</th>
                    </tr>
                </thead>
            </table>
        </div>
        <div class="tbl-content">
            <form action="../ServletSalvarSaida">
                <table cellpadding="0" cellspacing="0" border="0">
                    <tr>
                        <td>
                            Data da saida:
                            <input type="text" name="data" id="outra_data" maxlength="10" onkeypress="mascaraData( this, event )" />
                        </td>
                        <td>
                            Quantidade:
                            <input type="text" name="qtde">
                        </td>
                        <td>
                            Valor Unitário:
                            <input type="text" name="valor">
                        </td>
                        <td>
                            Selecione o Funcionario:
                            <select name="idFuncionario">
                                <option selected="selected">Selecione</option>
                                <%
                                                ServletSalvarFuncionario ssf = new ServletSalvarFuncionario();
                                                List<Funcionarios> getFuncs = ssf.listarFuncionarios();

                                                    for(Funcionarios funcionarios : getFuncs){ 
                                            %>
                                    <option value="<%=funcionarios.getIdFuncionario() %>">
                                        <%out.print(funcionarios.getNmFuncionario()); %>
                                    </option>
                                    <%}%>
                            </select>
                        </td>
                        <td>
                            Selecione o Cliente:
                            <select name="idCliente">
                                <option selected="selected">Selecione</option>
                                            <%
                                                ServletSalvarCliente ssc = new ServletSalvarCliente();
                                                List<Clientes> getCli = ssc.listarClientes();

                                                    for(Clientes clientes : getCli){ 
                                            %>
                                    <option value="<%=clientes.getIdCliente()%>">
                                        <%out.print(clientes.getNmCliente()); %>
                                    </option>
                                    <%}%>
                            </select>
                        </td>
                        <td>
                            Selecione o Produto:
                            <select name="idProduto">
                                <option selected="selected">Selecione</option>
                                            <%
                                                ServletSalvarProduto ssp = new ServletSalvarProduto();
                                                List<Produtos> getProds = ssp.listarProdutos();

                                                    for(Produtos produtos : getProds){ 
                                            %>
                                    <option value="<%=produtos.getIdProduto()%>">
                                        <%out.print(produtos.getNmProduto()); %>
                                    </option>
                                    <%}%>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" class="btn btn-primary" value="Confirmar Saida">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="../js/font-awesome-min.js"></script>
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