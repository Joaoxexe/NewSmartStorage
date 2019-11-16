package org.apache.jsp.Funcionarios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidades.Enderecos;
import entidades.Funcionarios;
import java.util.List;
import servletFuncionarios.ServletSalvarFuncionario;

public final class listarFuncionarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Funcionarios</title>\n");
      out.write("\n");
      out.write("    <link href=\"https://www.fontify.me/wf/822845a211e250d3989a107203e72537\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome-all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/loading.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/table.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"loading\" class=\"background-loader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <div class=\"inner one\"></div>\n");
      out.write("            <div class=\"inner two\"></div>\n");
      out.write("            <div class=\"inner three\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"text-left\">\n");
      out.write("        <a role=\"button\" href=\"../index.html\" class=\"btn btn-info\">\n");
      out.write("            <i class=\"fas fa-chevron-left\"></i> Pagina Inicial\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div defer class=\"container pt-5 pb-2\">\n");
      out.write("\n");
      out.write("        <h1 class=\"pb-3\">Funcionarios</h1>\n");
      out.write("\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("            <button id=\"adicionar\" class=\"btn btn-info mb-3\">Adicionar um novo Funcionario</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"tbl-header\">\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID:</th>\n");
      out.write("                        <th>Acões</th>\n");
      out.write("                        <th>Nome do Funcionario</th>\n");
      out.write("                        <th>CPF</th>\n");
      out.write("                        <th>Data Nascimento</th>\n");
      out.write("                        <th>Login</th>\n");
      out.write("                        <th>Senha</th>\n");
      out.write("                        <th>Telefone</th>\n");
      out.write("                        <th>E-mail</th>\n");
      out.write("                        <th>Sexo</th>\n");
      out.write("                        <th>Nº Endereço</th>\n");
      out.write("                        <th>CEP</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tbl-content\">\n");
      out.write("            <form action=\"../ServletListarFuncionario\" method=\"post\">\n");
      out.write("                ");

                    ServletSalvarFuncionario ssf = new ServletSalvarFuncionario();
                    List<Funcionarios> getList = ssf.listarFuncionarios();
                
      out.write("\n");
      out.write("                    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
                 
                                for(Funcionarios funcionarios : getList ){
                            
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getIdFuncionario());
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                    <td>\n");
      out.write("                                        <a class=\"acao-edit\" target=\"_blank\" rel=\"noopener noreferrer\">\n");
      out.write("                                            <i class=\"fas fa-edit mr-2\"></i>\n");
      out.write("                                        </a>\n");
      out.write("\n");
      out.write("                                        <a class=\"acao-delete\" target=\"_blank\" rel=\"noopener noreferrer\">\n");
      out.write("                                            <i class=\"fas fa-trash\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getNmFuncionario());
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getCpfFuncionario());
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getDtNascimentoFuncionario());
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getLoginFuncionario());
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ••••••••\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getTelefoneFuncionario() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getEmailFuncionario() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getSexoFuncionario() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getNumeroEnderecoFuncionario());
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    \n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(funcionarios.getIdEndereco().getCepEndereco() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Adicionar -->\n");
      out.write("        <div class=\"modal fade\" id=\"AdicionarModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"AdicionarModalTitle\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"AdicionarModalLongTitle\">Adicionar Funcionario</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <form action=\"../ServletSalvarFuncionario\" method=\"post\">\n");
      out.write("                        <div class=\"modal-body row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Nome Funcionario</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"nome\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">CPF</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" maxlength=\"14\" name=\"cpf\" onkeydown=\"javascript: fMasc( this, mCPF );\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Data Nascimento</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"data\" id=\"outra_data\" maxlength=\"10\" onkeypress=\"mascaraData( this, event )\" />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Login</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"login\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Senha</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"password\" name=\"senha\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">E-mail</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"email\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Telefone</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" maxlength=\"14\" name=\"telefone\" onkeydown=\"javascript: fMasc( this, mTel );\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Sexo</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                 <form>\n");
      out.write("                                    <INPUT TYPE=\"RADIO\" NAME=\"sexo\" VALUE=\"1\"> Feminino \n");
      out.write("                                    <INPUT TYPE=\"RADIO\" NAME=\"sexo\" VALUE=\"2\"> Masculino <br>\n");
      out.write("                                    <INPUT TYPE=\"RADIO\" NAME=\"sexo\" VALUE=\"3\"> Outros <br>\n");
      out.write("                                </form>\n");
      out.write("                            </div>        \n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Nº Endereço</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"numeroEnd\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Endereço</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <select name=\"idEnd\">\n");
      out.write("                                    <option selected=\"selected\">Selecione</option>\n");
      out.write("                                    ");

                                                ServletSalvarFuncionario ssf1 = new ServletSalvarFuncionario();
                                                List<Enderecos> listaEnd1 = ssf1.listarEnderecos();

                                                    for(Enderecos enderecos : listaEnd1){                                                   
                                            
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(enderecos.getIdEndereco());
      out.write("\">\n");
      out.write("                                            ");
out.print(enderecos.getTipoLogradouroEndereco() + " " +
                                                        enderecos.getLogradouroEndereco() + ", " +
                                                        enderecos.getBairroEndereco() + ", " +
                                                        enderecos.getCidadeEndereco() + ", " +
                                                        enderecos.getCepEndereco()); 
      out.write("\n");
      out.write("                                        </option>\n");
      out.write("\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary\" value=\"Salvar Funcionario\">                    \n");
      out.write("                                <a href=\"../Enderecos/salvarEndereco.jsp\" class=\"btn btn-primary\">Novo Endereço</a>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Editar -->\n");
      out.write("    <div class=\"modal fade\" id=\"EditarModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"EditarModalTitle\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"EditarModalLongTitle\">Editar Funcionario</h5>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body row\">\n");
      out.write("                    <form action=\"../ServletAlterarFuncionario\" method=\"post\">\n");
      out.write("                        <div class=\"modal-body row\">\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">ID</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"id\" placeholder=\"Entre com um ID Existente\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Nome Funcionario</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"nome\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">CPF</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" maxlength=\"14\" name=\"cpf\" onkeydown=\"javascript: fMasc( this, mCPF );\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Data Nascimento</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"data\" id=\"outra_data\" maxlength=\"10\" onkeypress=\"mascaraData( this, event )\" />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Login</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"login\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Senha</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"password\" name=\"senha\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">E-mail</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"email\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Telefone</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" maxlength=\"14\" name=\"telefone\" onkeydown=\"javascript: fMasc( this, mTel );\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Sexo</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <form>\n");
      out.write("                                    <INPUT TYPE=\"RADIO\" NAME=\"sexo\" VALUE=\"1\"> Feminino \n");
      out.write("                                    <INPUT TYPE=\"RADIO\" NAME=\"sexo\" VALUE=\"2\"> Masculino <br>\n");
      out.write("                                    <INPUT TYPE=\"RADIO\" NAME=\"sexo\" VALUE=\"3\"> Outros <br>\n");
      out.write("                                </form>\n");
      out.write("                            </div>        \n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Nº Endereço</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"numeroEnd\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">Endereço</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <select name=\"idEnd\">\n");
      out.write("                                    <option selected=\"selected\">Selecione</option>\n");
      out.write("                                    ");

                                                ServletSalvarFuncionario ssf2 = new ServletSalvarFuncionario();
                                                List<Enderecos> listaEnd2 = ssf2.listarEnderecos();

                                                    for(Enderecos enderecos : listaEnd2){                                                   
                                            
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(enderecos.getIdEndereco());
      out.write("\">\n");
      out.write("                                            ");
out.print(enderecos.getTipoLogradouroEndereco() + " " +
                                                        enderecos.getLogradouroEndereco() + ", " +
                                                        enderecos.getBairroEndereco() + ", " +
                                                        enderecos.getCidadeEndereco() + ", " +
                                                        enderecos.getCepEndereco()); 
      out.write("\n");
      out.write("                                        </option>\n");
      out.write("\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary\" value=\"Alterar Funcionario\">                    \n");
      out.write("                                <a href=\"../Enderecos/salvarEndereco.jsp\" class=\"btn btn-primary\">Novo Endereço</a>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Excluir -->\n");
      out.write("    <div class=\"modal fade\" id=\"ExcluirModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"ExcluirModalTitle\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"EditarModalLongTitle\">Excluir Funcionario</h5>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body row\">\n");
      out.write("                    <form action=\"../ServletExcluirFuncionario\" method=\"post\">\n");
      out.write("                        <div class=\"modal-body row\">\n");
      out.write("                            <div class=\"col-md-4 text-center\">\n");
      out.write("                                <label for=\"nome mr-2\">ID</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-8 text-center\">\n");
      out.write("                                <input type=\"text\" name=\"id\" placeholder=\"Entre com um ID Existente\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"modal-footer\" class=\"text-right\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary\" value=\"Remover\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\">\n");
      out.write("</script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\">\n");
      out.write("</script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\">\n");
      out.write("</script>\n");
      out.write("<script src=\"css/font-awesome-min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        setTimeout(() => {\n");
      out.write("            $('#loading').remove();\n");
      out.write("        }, 1000);\n");
      out.write("\n");
      out.write("        $(window).on(\"load resize\", function() {\n");
      out.write("            var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();\n");
      out.write("            $('.tbl-header').css({\n");
      out.write("                'padding-right': scrollWidth\n");
      out.write("            });\n");
      out.write("        }).resize();\n");
      out.write("\n");
      out.write("        $(\".acao-edit\").on(\"click\", function(e) {\n");
      out.write("            e.preventDefault();\n");
      out.write("            $('#EditarModal').modal('show');\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\".acao-delete\").on(\"click\", function(e) {\n");
      out.write("            e.preventDefault();\n");
      out.write("            $('#ExcluirModal').modal('show');\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#adicionar\").on(\"click\", function(e) {\n");
      out.write("            e.preventDefault();\n");
      out.write("            $('#AdicionarModal').modal('show');\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
