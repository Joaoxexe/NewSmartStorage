package org.apache.jsp.Fornecedores;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidades.Enderecos;
import entidades.Fornecedores;
import java.util.List;
import servletFornecedores.ServletSalvarFornecedor;

public final class listarFornecedores_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Fornecedores</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://www.fontify.me/wf/822845a211e250d3989a107203e72537\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome-all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/loading.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/table.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"loading\" class=\"background-loader\">\r\n");
      out.write("        <div class=\"loader\">\r\n");
      out.write("            <div class=\"inner one\"></div>\r\n");
      out.write("            <div class=\"inner two\"></div>\r\n");
      out.write("            <div class=\"inner three\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"text-left\">\r\n");
      out.write("        <a role=\"button\" href=\"../index.html\" class=\"btn btn-info\">\r\n");
      out.write("            <i class=\"fas fa-chevron-left\"></i> Pagina Inicial\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div defer class=\"container pt-5 pb-2\">\r\n");
      out.write("\r\n");
      out.write("        <h1 class=\"pb-3\">Fornecedores</h1>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"text-center\">\r\n");
      out.write("            <button id=\"adicionar\" class=\"btn btn-info mb-3\">Adicionar um novo Fornecedor</button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"tbl-header\">\r\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>ID:</th>\r\n");
      out.write("                        <th>Acões</th>\r\n");
      out.write("                        <th>Nome do Fornecedor</th>\r\n");
      out.write("                        <th>Nome Fantasia</th>\r\n");
      out.write("                        <th>Telefone</th>\r\n");
      out.write("                        <th>CNPJ</th>\r\n");
      out.write("                        <th>E-mail</th>\r\n");
      out.write("                        <th>Cidade</th>\r\n");
      out.write("                        <th>CEP</th>\r\n");
      out.write("                        <th>Estado</th>\r\n");
      out.write("                        <th>Nº Endereço</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tbl-content\">\r\n");
      out.write("            <form action=\"../ServletListarFornecedor\" method=\"post\">\r\n");
      out.write("                ");

                    ServletSalvarFornecedor ssf = new ServletSalvarFornecedor();
                    List<Fornecedores> getList = ssf.listarFornecedores();
                
      out.write("\r\n");
      out.write("                    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
                 
                                for(Fornecedores fornecedores : getList ){
                            
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getIdFornecedor());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <a class=\"acao-edit\" href=\"../ServletListarFornecedores?Id=");
      out.print(fornecedores.getIdFornecedor());
      out.write("&tipo=1\" target=\"_blank\" rel=\"noopener noreferrer\">\r\n");
      out.write("                                            <i class=\"fas fa-edit mr-2\"></i>\r\n");
      out.write("                                        </a>\r\n");
      out.write("\r\n");
      out.write("                                        <a class=\"acao-delete\" href=\"../ServletListarFornecedores?Id=");
      out.print(fornecedores.getIdFornecedor());
      out.write("&tipo=2\" target=\"_blank\" rel=\"noopener noreferrer\">\r\n");
      out.write("                                            <i class=\"fas fa-trash\"></i>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getNmFornecedor());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getNmFantasiaFornecedor());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getTelefoneFornecedor());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getCnpjFornecedor());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getEmailFornecedor());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getIdEndereco().getCidadeEndereco());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getIdEndereco().getCepEndereco());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getIdEndereco().getUfEndereco());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        ");
      out.print(fornecedores.getNumeroEnderecoFornecedor());
      out.write("\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Adicionar -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"AdicionarModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"AdicionarModalTitle\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\" id=\"AdicionarModalLongTitle\">Adicionar Fornecedor</h5>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <form action=\"../ServletSalvarFornecedor\" method=\"post\">\r\n");
      out.write("                        <div class=\"modal-body row\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Nome Fornecedor</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"nome\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Nome Fantasia</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"fantasia\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Telefone</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" maxlength=\"14\" name=\"telefone\" onkeydown=\"javascript: fMasc( this, mTel );\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">CNPJ</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" maxlength=\"18\" name=\"cnpj\" onkeydown=\"javascript: fMasc( this, mCNPJ);\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">E-mail</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Nº Endereço</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"numeroEnd\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Endereço</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <select name=\"idEnd\">\r\n");
      out.write("                                    <option selected=\"selected\">Selecione</option>\r\n");
      out.write("                                            ");

                                                ServletSalvarFornecedor ssf1 = new ServletSalvarFornecedor();
                                                List<Enderecos> listaEnd1 = ssf1.listarEnderecos();

                                                    for(Enderecos enderecos : listaEnd1){                                                   
                                            
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print(enderecos.getIdEndereco());
      out.write("\">\r\n");
      out.write("                                            ");
out.print(enderecos.getTipoLogradouroEndereco() + " " +
                                                        enderecos.getLogradouroEndereco() + ", " +
                                                        enderecos.getBairroEndereco() + ", " +
                                                        enderecos.getCidadeEndereco() + ", " +
                                                        enderecos.getCepEndereco()); 
      out.write("\r\n");
      out.write("                                        </option>\r\n");
      out.write("\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary\" value=\"Salvar Fornecedor\">\r\n");
      out.write("                                <a href=\"../Enderecos/salvarEndereco.jsp\" class=\"btn btn-primary\">Novo Endereço</a>\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Editar -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"EditarModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"EditarModalTitle\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"EditarModalLongTitle\">Editar Fornecedor</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body row\">\r\n");
      out.write("                    <form action=\"../ServletAlterarFornecedor\" method=\"post\">\r\n");
      out.write("                        <div class=\"modal-body row\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">ID</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"id\" placeholder=\"Entre com um ID Existente\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Nome Fornecedor</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"nome\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Nome Fantasia</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"fantasia\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Telefone</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"telefone\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">CNPJ</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" maxlength=\"18\" name=\"cnpj\" onkeydown=\"javascript: fMasc( this, mCNPJ);\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">E-mail</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Nº Endereço</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"numeroEnd\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">Endereço</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <select name=\"idEnd\">\r\n");
      out.write("                                    <option selected=\"selected\">Selecione</option>\r\n");
      out.write("                                            ");

                                                ServletSalvarFornecedor ssf2 = new ServletSalvarFornecedor();
                                                List<Enderecos> listaEnd2 = ssf2.listarEnderecos();

                                                    for(Enderecos enderecos : listaEnd2){                                                   
                                            
      out.write("\r\n");
      out.write("                                        <option value=\"");
      out.print(enderecos.getIdEndereco());
      out.write("\">\r\n");
      out.write("                                            ");
out.print(enderecos.getTipoLogradouroEndereco() + " " +
                                                        enderecos.getLogradouroEndereco() + ", " +
                                                        enderecos.getBairroEndereco() + ", " +
                                                        enderecos.getCidadeEndereco() + ", " +
                                                        enderecos.getCepEndereco()); 
      out.write("\r\n");
      out.write("                                        </option>\r\n");
      out.write("\r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary\" value=\"Alterar Fornecedor\">\r\n");
      out.write("                                <a href=\"../Enderecos/salvarEndereco.jsp\" class=\"btn btn-primary\">Novo Endereço</a>\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Excluir -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"ExcluirModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"ExcluirModalTitle\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"EditarModalLongTitle\">Excluir Fornecedor</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body row\">\r\n");
      out.write("                    <form action=\"../ServletExcluirFornecedor\" method=\"post\">\r\n");
      out.write("                        <div class=\"modal-body row\">\r\n");
      out.write("                            <div class=\"col-md-4 text-center\">\r\n");
      out.write("                                <label for=\"nome mr-2\">ID</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 text-center\">\r\n");
      out.write("                                <input type=\"text\" name=\"id\" placeholder=\"Entre com um ID Existente\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary\" value=\"Excluir Fornecedor\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\">\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\">\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\">\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"css/font-awesome-min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        setTimeout(() => {\r\n");
      out.write("            $('#loading').remove();\r\n");
      out.write("        }, 1000);\r\n");
      out.write("\r\n");
      out.write("        $(window).on(\"load resize\", function() {\r\n");
      out.write("            var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();\r\n");
      out.write("            $('.tbl-header').css({\r\n");
      out.write("                'padding-right': scrollWidth\r\n");
      out.write("            });\r\n");
      out.write("        }).resize();\r\n");
      out.write("\r\n");
      out.write("        $(\".acao-edit\").on(\"click\", function(e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            $('#EditarModal').modal('show');\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\".acao-delete\").on(\"click\", function(e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            $('#ExcluirModal').modal('show');\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"#adicionar\").on(\"click\", function(e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            $('#AdicionarModal').modal('show');\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>");
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
