<%-- 
    Document   : listarFuncionarios
    Created on : 15/11/2019, 01:47:49
    Author     : João Victor
--%>

<%@page import="entidades.Enderecos"%>
<%@page import="entidades.Funcionarios"%>
<%@page import="java.util.List"%>
<%@page import="servletFuncionarios.ServletSalvarFuncionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Funcionarios</title>

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

        <h1 class="pb-3">Funcionarios</h1>

        <div class="text-center">
            <button id="adicionar" class="btn btn-info mb-3">Adicionar um novo Funcionario</button>
        </div>

        <div class="tbl-header">
            <table cellpadding="0" cellspacing="0" border="0">
                <thead>
                    <tr>
                        <th>ID:</th>
                        <th>Acões</th>
                        <th>Nome do Funcionario</th>
                        <th>CPF</th>
                        <th>Data Nascimento</th>
                        <th>Login</th>
                        <th>Senha</th>
                        <th>Telefone</th>
                        <th>E-mail</th>
                        <th>Sexo</th>
                        <th>Nº Endereço</th>
                        <th>CEP</th>
                    </tr>
                </thead>
            </table>
        </div>
        <div class="tbl-content">
            <form action="../ServletListarFuncionario" method="post">
                <%
                    ServletSalvarFuncionario ssf = new ServletSalvarFuncionario();
                    List<Funcionarios> getList = ssf.listarFuncionarios();
                %>
                    <table cellpadding="0" cellspacing="0" border="0">
                        <tbody>
                            <%                 
                                for(Funcionarios funcionarios : getList ){
                            %>
                                <tr>
                                    <td>
                                        <%=funcionarios.getIdFuncionario()%>
                                    </td>

                                    <td>
                                        <a class="acao-edit" target="_blank" rel="noopener noreferrer">
                                            <i class="fas fa-edit mr-2"></i>
                                        </a>

                                        <a class="acao-delete" target="_blank" rel="noopener noreferrer">
                                            <i class="fas fa-trash"></i>
                                        </a>
                                    </td>
                                    <td>
                                        <%=funcionarios.getNmFuncionario()%>
                                    </td>
                                    <td>
                                        <%=funcionarios.getCpfFuncionario()%>
                                    </td>
                                    <td>
                                        <%=funcionarios.getDtNascimentoFuncionario()%>
                                    </td>
                                    <td>
                                        <%=funcionarios.getLoginFuncionario()%>
                                    </td>
                                    <td>
                                        ••••••••
                                    </td>
                                    <td>
                                        <%=funcionarios.getTelefoneFuncionario() %>
                                    </td>
                                    <td>
                                        <%=funcionarios.getEmailFuncionario() %>
                                    </td>
                                    <td>
                                        <%=funcionarios.getSexoFuncionario() %>
                                    </td>
                                    <td>
                                        <%=funcionarios.getNumeroEnderecoFuncionario()%>
                                    </td>
                                    
                                    <td>
                                        <%=funcionarios.getIdEndereco().getCepEndereco() %>
                                    </td>
                                </tr>
                                <%}%>
                        </tbody>
                    </table>
            </form>
        </div>

        <!-- Adicionar -->
        <div class="modal fade" id="AdicionarModal" tabindex="-1" role="dialog" aria-labelledby="AdicionarModalTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="AdicionarModalLongTitle">Adicionar Funcionario</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>

                    <form action="../ServletSalvarFuncionario" method="post">
                        <div class="modal-body row">

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Nome Funcionario</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="nome">
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">CPF</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" maxlength="14" name="cpf" onkeydown="javascript: fMasc( this, mCPF );">
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Data Nascimento</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="data" id="outra_data" maxlength="10" onkeypress="mascaraData( this, event )" />
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Login</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="login">
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Senha</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="password" name="senha">
                            </div>
                            
                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">E-mail</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="email">
                            </div>
                            
                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Telefone</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" maxlength="14" name="telefone" onkeydown="javascript: fMasc( this, mTel );">
                            </div>
                            
                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Sexo</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="sexo">
                            </div>        

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Nº Endereço</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="numeroEnd">
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Endereço</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <select name="idEnd">
                                    <option selected="selected">Selecione</option>
                                    <%
                                                ServletSalvarFuncionario ssf1 = new ServletSalvarFuncionario();
                                                List<Enderecos> listaEnd1 = ssf1.listarEnderecos();

                                                    for(Enderecos enderecos : listaEnd1){                                                   
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
                            </div>
                            <div class="modal-footer">
                                <input type="submit" class="btn btn-primary" value="Salvar Funcionario">                    
                                <a href="../Enderecos/salvarEndereco.jsp" class="btn btn-primary">Novo Endereço</a>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    

    <!-- Editar -->
    <div class="modal fade" id="EditarModal" tabindex="-1" role="dialog" aria-labelledby="EditarModalTitle" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="EditarModalLongTitle">Editar Funcionario</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body row">
                    <form action="../ServletAlterarFuncionario" method="post">
                        <div class="modal-body row">
                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">ID</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="id">
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Nome Funcionario</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="nome">
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">CPF</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" maxlength="14" name="cpf" onkeydown="javascript: fMasc( this, mCPF );">
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Data Nascimento</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="data" id="outra_data" maxlength="10" onkeypress="mascaraData( this, event )" />
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Login</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="login">
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Senha</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="password" name="senha">
                            </div>
                            
                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">E-mail</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="email">
                            </div>
                            
                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Telefone</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" maxlength="14" name="telefone" onkeydown="javascript: fMasc( this, mTel );">
                            </div>
                            
                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Sexo</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="sexo">
                            </div>        

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Nº Endereço</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="numeroEnd">
                            </div>

                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">Endereço</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <select name="idEnd">
                                    <option selected="selected">Selecione</option>
                                    <%
                                                ServletSalvarFuncionario ssf2 = new ServletSalvarFuncionario();
                                                List<Enderecos> listaEnd2 = ssf2.listarEnderecos();

                                                    for(Enderecos enderecos : listaEnd2){                                                   
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
                            </div>
                            <div class="modal-footer">
                                <input type="submit" class="btn btn-primary" value="Alterar Funcionario">                    
                                <a href="../Enderecos/salvarEndereco.jsp" class="btn btn-primary">Novo Endereço</a>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
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
                    <h5 class="modal-title" id="EditarModalLongTitle">Excluir Funcionario</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body row">
                    <form action="../ServletExcluirFuncionario" method="post">
                        <div class="modal-body row">
                            <div class="col-md-4 text-center">
                                <label for="nome mr-2">ID</label>
                            </div>
                            <div class="col-md-8 text-center">
                                <input type="text" name="id" value="Insira um id existente">
                            </div>

                            <input type="submit" class="btn btn-primary" value="Remover">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                </div>
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
</html>