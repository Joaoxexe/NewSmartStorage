<%@page import="entidades.CodigoDeBarras"%>
<%@page import="java.util.List"%>
<%@page import="servletProdutos.ServletSalvarProduto"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Exclusão de Produto</title>

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
        <h1 class="pb-3">Exclusão de Produto</h1>
        <div class="tbl-header">
            <table cellpadding="0" cellspacing="0" border="0">
                <thead>
                    <tr>
                        <th>ID do produto</th>
                        <th>Nome do produto</th>
                        <th>Código de barras</th>
                    </tr>
                </thead>
            </table>
        </div>
        <div class="tbl-content">
            <form action="ServletExcluirProduto">
                <table cellpadding="0" cellspacing="0" border="0">
                    <tr>
                        <td>
                            ID:
                            <input type="text" name="id" value="<%out.print(request.getAttribute("id")); %>" readonly="true">
                        </td>
                        <td>
                            Nome:
                            <input type="text" name="nome" value="<%out.print(request.getAttribute("nome")); %>" readonly="true">
                        </td>
                        <td>                   
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
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Excluir produto">
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