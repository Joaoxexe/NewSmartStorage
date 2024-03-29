<%@page import="entidades.CodigoDeBarras"%>
<%@page import="java.util.List"%>
<%@page import="entidades.Produtos"%>
<%@page import="servletProdutos.ServletSalvarProduto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Produtos</title>

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

    <div class="text-left">
        <a role="button" href="../index.html" class="btn btn-info">
            <i class="fas fa-chevron-left"></i> Pagina Inicial
        </a>
    </div>

    <div defer class="container pt-5 pb-2">

        <h1 class="pb-3">Produtos</h1>

        <div class="text-center">
            <button id="adicionar" class="btn btn-info mb-3">Adicionar um novo Produto</button>
        </div>

        <div class="tbl-header">
            <table cellpadding="0" cellspacing="0" border="0">
                <thead>
                    <tr>
                        <th>Código do produto</th>
                        <th>Ações</th>
                        <th>Nome do produto</th>
                        <th>Código de barras</th>
                        <th>Situação</th>
                    </tr>
                </thead>
            </table>
        </div>
        <div class="tbl-content">
            <form action="../ServletListarProduto" method="post">
                <%
                    ServletSalvarProduto ssp = new ServletSalvarProduto();
                    List<Produtos> getList = ssp.listarProdutos();
                %>
                    <table cellpadding="0" cellspacing="0" border="0">
                        <tbody>
                            <%                 
                                for(Produtos produtos : getList ){
                            %>
                                <tr>
                                    <td>
                                        <%=produtos.getIdProduto()%>
                                    </td>

                                    <td>
                                        <a class="acao-edit" href="../ServletListarProduto?IdProduto=<%=produtos.getIdProduto()%>&tipo=1" target="_blank" rel="noopener noreferrer">
                                            <i class="fas fa-edit mr-2"></i>
                                        </a>

                                        <a class="acao-delete" href="../ServletListarProduto?IdProduto=<%=produtos.getIdProduto()%>&tipo=2" target="_blank" rel="noopener noreferrer">
                                            <i class="fas fa-trash"></i>
                                        </a>
                                    </td>
                                    <td>
                                        <%=produtos.getNmProduto()%>
                                    </td>
                                    <td>
                                        <%=produtos.getIdBarras().getCodigo()%>
                                    </td>
                                    <td>
                                        <%=produtos.getFgAtivoProdutos()%>
                                    </td>
                                </tr>
                                <%}%>
                        </tbody>
                    </table>
            </form>

            <!-- Adicionar -->
            <div class="modal fade" id="AdicionarModal" tabindex="-1" role="dialog" aria-labelledby="AdicionarModalTitle" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="AdicionarModalLongTitle">Adicionar Produto</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body row">
                            <form action="../ServletSalvarProduto" method="post">
                                <div class="modal-body row">

                                    <div class="col-md-4 text-center">
                                        <label for="nome mr-2">Nome</label>
                                    </div>
                                    <div class="col-md-8 text-center">
                                        <input type="text" name="nome">
                                    </div>

                                    <div class="col-md-4 text-center">
                                        <label for="telefone mr-2">Codigo de barras:</label>
                                    </div>
                                    <div class="col-md-8 text-center">
                                        <select name="codigo">
                                            <option selected="selected">Selecione</option>
                                            <%
                                                ServletSalvarProduto ssp1 = new ServletSalvarProduto();
                                                List<CodigoDeBarras> listaBarras = ssp1.listarCodBarras();

                                                    for(CodigoDeBarras codiboBarras : listaBarras){                                                   
                                            %>

                                                <option value="<%=codiboBarras.getIdBarras()%>">
                                                    <%out.print(codiboBarras.getCodigo()); %>
                                                </option>

                                                <%}%>
                                        </select>

                                        <br>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                        <input type="submit" class="btn btn-primary" value="Salvar Produto">
                                        <a href="../CodigoBarras/salvarCodigoB.jsp" class="btn btn-primary">Novo Código de Barras</a>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Editar -->
            <div class="modal fade" id="EditarModal" tabindex="-1" role="dialog" aria-labelledby="EditarModalTitle" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="EditarModalLongTitle">Editar Produto</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body row">
                            <form action="../ServletAlterarProduto" method="post">
                                <div class="modal-body row">
                                    <div class="col-md-4 text-center">
                                        <label for="nome mr-2">ID</label>
                                    </div>
                                    <div class="col-md-8 text-center">
                                        <input type="text" name="id" placeholder="Entre com um ID Existente">
                                    </div>

                                    <div class="col-md-4 text-center">
                                        <label for="nome mr-2">Nome</label>
                                    </div>
                                    <div class="col-md-8 text-center">
                                        <input type="text" name="nome">
                                    </div>

                                    <div class="col-md-4 text-center">
                                        <label for="telefone mr-2">Codigo de barras:</label>
                                    </div>
                                    <div class="col-md-8 text-center">
                                        <select name="codigo">
                                            <option selected="selected">Selecione</option>
                                            <%
                                                ServletSalvarProduto ssp2 = new ServletSalvarProduto();
                                                List<CodigoDeBarras> listaBarras2 = ssp2.listarCodBarras();

                                                    for(CodigoDeBarras codiboBarras : listaBarras2){                                                   
                                            %>
                                                <option selected="selected" value="<%=codiboBarras.getIdBarras()%>">
                                                    <%out.print(codiboBarras.getCodigo()); %>
                                                </option>
                                                <option value="<%=codiboBarras.getIdBarras()%>">
                                                    <%out.print(codiboBarras.getCodigo()); %>
                                                </option>

                                                <%}%>
                                        </select>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                        <input type="submit" class="btn btn-primary" value="Alterar Produto">
                                        <a href="../CodigoBarras/salvarCodigoB.jsp" class="btn btn-primary">Novo Código de Barras</a>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Excluir -->
            <div class="modal fade" id="ExcluirModal" tabindex="-1" role="dialog" aria-labelledby="ExcluirModalTitle" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="EditarModalLongTitle">Excluir Produto</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body row">
                            <form action="../ServletExcluirProduto" method="post">
                                <div class="modal-body row">
                                    <div class="col-md-4 text-center">
                                        <label for="nome mr-2">ID</label>
                                    </div>
                                    <div class="col-md-8 text-center">
                                        <input type="text" name="id" placeholder="Entre com um ID Existente">
                                    </div>

                                    <div class="modal-footer">
                                        <input type="submit" class="btn btn-primary" value="Excluir Produto">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                    </div>

                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
</script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
</script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
</script>
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

        $(".acao-edit").on("click", function(e) {
            e.preventDefault();
            $('#EditarModal').modal('show');
        });

        $(".acao-delete").on("click", function(e) {
            e.preventDefault();
            $('#ExcluirModal').modal('show');
        });

        $("#adicionar").on("click", function(e) {
            e.preventDefault();
            $('#AdicionarModal').modal('show');
        });
    });
</script>