package org.apache.jsp.Produtos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidades.CodigoDeBarras;
import java.util.List;
import servletProdutos.ServletSalvarProduto;

public final class excluirProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Exclusão de Produto</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://www.fontify.me/wf/822845a211e250d3989a107203e72537\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome-all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/loading.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/table.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"loading\" class=\"background-loader\">\r\n");
      out.write("        <div class=\"loader\">\r\n");
      out.write("            <div class=\"inner one\"></div>\r\n");
      out.write("            <div class=\"inner two\"></div>\r\n");
      out.write("            <div class=\"inner three\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div defer class=\"container pt-5 pb-2\">\r\n");
      out.write("        <h1 class=\"pb-3\">Exclusão de Produto</h1>\r\n");
      out.write("        <div class=\"tbl-header\">\r\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>ID do produto</th>\r\n");
      out.write("                        <th>Nome do produto</th>\r\n");
      out.write("                        <th>Código de barras</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tbl-content\">\r\n");
      out.write("            <form action=\"ServletExcluirProduto\">\r\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            ID:\r\n");
      out.write("                            <input type=\"text\" name=\"id\" value=\"");
out.print(request.getAttribute("id")); 
      out.write("\" readonly=\"true\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            Nome:\r\n");
      out.write("                            <input type=\"text\" name=\"nome\" value=\"");
out.print(request.getAttribute("nome")); 
      out.write("\" readonly=\"true\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>                   \r\n");
      out.write("                            Codigo de barras: \r\n");
      out.write("                            <select name=\"codigo\">\r\n");
      out.write("                                <option selected=\"selected\" value=\"\">");
out.print(request.getAttribute("codigo")); 
      out.write("</option>\r\n");
      out.write("                                ");

                                    ServletSalvarProduto ssp = new ServletSalvarProduto();
                                    List<CodigoDeBarras> listaBarras = ssp.listarCodBarras();

                                        for(CodigoDeBarras codiboBarras : listaBarras){                                                   
                                
      out.write("\r\n");
      out.write("                                <option value=\"");
      out.print(codiboBarras.getIdBarras());
      out.write('"');
      out.write('>');
out.print(codiboBarras.getCodigo()); 
      out.write("</option>\r\n");
      out.write("                                       ");
}
      out.write("                       \r\n");
      out.write("                            </select>           \r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"submit\" value=\"Excluir produto\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"./js/font-awesome-min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            setTimeout(() => {\r\n");
      out.write("                $('#loading').remove();\r\n");
      out.write("            }, 1000);\r\n");
      out.write("\r\n");
      out.write("            $(window).on(\"load resize\", function() {\r\n");
      out.write("                var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();\r\n");
      out.write("                $('.tbl-header').css({\r\n");
      out.write("                    'padding-right': scrollWidth\r\n");
      out.write("                });\r\n");
      out.write("            }).resize();\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
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
