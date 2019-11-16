package org.apache.jsp.Movimentacoes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servletSaidas.ServletSalvarSaida;
import servletEntradas.ServletSalvarEntrada;
import java.util.List;
import entidades.Funcionarios;
import entidades.Entradas;
import entidades.Saidas;
import entidades.Fornecedores;
import entidades.Clientes;
import entidades.Movimentacoes;

public final class listarMovimentacoes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Movimentações</title>\n");
      out.write("\n");
      out.write("    <link href=\"https://www.fontify.me/wf/822845a211e250d3989a107203e72537\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/font-awesome-all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/loading.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/table.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"loading\" class=\"background-loader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <div class=\"inner one\"></div>\n");
      out.write("            <div class=\"inner two\"></div>\n");
      out.write("            <div class=\"inner three\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"text-left\">\n");
      out.write("        <a role=\"button\" href=\"../index.html\" class=\"btn btn-info\">\n");
      out.write("            <i class=\"fas fa-chevron-left\"></i> Pagina Inicial\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <div defer class=\"container pt-5 pb-2\">\n");
      out.write("        <h1 class=\"pb-3\">Movimentações De Produtos</h1>\n");
      out.write("        \n");
      out.write("        <div class=\"text-center\">\n");
      out.write("            <a href=\"../Entradas/salvarEntrada.jsp\" class=\"btn btn-primary\">Computar uma nova Entrada</a>\n");
      out.write("            <a href=\"../Saidas/salvarSaida.jsp\" class=\"btn btn-primary\">Computar uma nova Saída</a>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"tbl-header\">\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                <thead>                   \n");
      out.write("                    <tr>\n");
      out.write("                    <br>\n");
      out.write("                    <th><tr><h1 class=\"pb-3\">Entrada De Produtos</h1></tr></th>\n");
      out.write("                        <th>ID da Entrada</th>\n");
      out.write("                        <th>Data da Entrada</th>\n");
      out.write("                        <th>Quantidade que Entrou</th>\n");
      out.write("                        <th>Valor Unitario</th>    \n");
      out.write("                        <th>Fornecedor</th>     \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tbl-content\">\n");
      out.write("                ");

                    ServletSalvarEntrada sse = new ServletSalvarEntrada();
                    List<Entradas> getEntradas = sse.listarEntradas();
                
      out.write("\n");
      out.write("                    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
                 
                                for(Entradas entradas : getEntradas ){
                            
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(entradas.getIdEntrada() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(entradas.getDtEntrada() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(entradas.getQtdEntrada() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(entradas.getValorUnitario() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(entradas.getIdFornecedor().getNmFornecedor() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("        </div>                \n");
      out.write("        <br>\n");
      out.write("        <div class=\"tbl-header\">\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                <thead>                   \n");
      out.write("                    <tr>\n");
      out.write("                    <br>\n");
      out.write("                    <th><tr><h1 class=\"pb-3\">Saída De Produtos</h1></tr></th>\n");
      out.write("                        <th>ID da Saída</th>\n");
      out.write("                        <th>Data da Saída</th>\n");
      out.write("                        <th>Quantidade que Saiu</th>\n");
      out.write("                        <th>Valor Unitario</th>    \n");
      out.write("                        <th>Vendedor</th>\n");
      out.write("                        <th>Cliente</th>   \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tbl-content\">\n");
      out.write("                ");

                    ServletSalvarSaida sss = new ServletSalvarSaida();
                    List<Saidas> getSaidas = sss.listarSadias();
                
      out.write("\n");
      out.write("                    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
                 
                                for(Saidas saidas : getSaidas ){
                            
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(saidas.getIdSaida() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(saidas.getDtSaida() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(saidas.getQtdSaida() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(saidas.getValorUnitario() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(saidas.getIdFuncionario().getNmFuncionario() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(saidas.getIdCliente().getNmCliente() );
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"../js/font-awesome-min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            setTimeout(() => {\n");
      out.write("                $('#loading').remove();\n");
      out.write("            }, 1000);\n");
      out.write("\n");
      out.write("            $(window).on(\"load resize\", function() {\n");
      out.write("                var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();\n");
      out.write("                $('.tbl-header').css({\n");
      out.write("                    'padding-right': scrollWidth\n");
      out.write("                });\n");
      out.write("            }).resize();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</html>\n");
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
