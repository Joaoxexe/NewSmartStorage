package org.apache.jsp.Produtos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entidades.Produtos;
import servletProdutos.ServletSalvarProduto;

public final class listarProdutos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("        \n");
      out.write("            \n");
      out.write("\n");
      out.write("                <!DOCTYPE html>\n");
      out.write("                <html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("                <head>\n");
      out.write("                    <meta charset=\"UTF-8\">\n");
      out.write("                    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("                    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("                    <title>Listar Produtos</title>\n");
      out.write("\n");
      out.write("                    <link href=\"https://www.fontify.me/wf/822845a211e250d3989a107203e72537\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("                    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("                    <link rel=\"stylesheet\" href=\"../css/font-awesome-all.min.css\">\n");
      out.write("                    <link rel=\"stylesheet\" href=\"../css/loading.css\">\n");
      out.write("                    <link rel=\"stylesheet\" href=\"../css/table.css\">\n");
      out.write("                </head>\n");
      out.write("\n");
      out.write("                <body>\n");
      out.write("                    <div id=\"loading\" class=\"background-loader\">\n");
      out.write("                        <div class=\"loader\">\n");
      out.write("                            <div class=\"inner one\"></div>\n");
      out.write("                            <div class=\"inner two\"></div>\n");
      out.write("                            <div class=\"inner three\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div defer class=\"container pt-5 pb-2\">\n");
      out.write("                        <h1 class=\"pb-3\">Produtos</h1>\n");
      out.write("                        <div class=\"tbl-header\">\n");
      out.write("                            <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Código do produto</th>\n");
      out.write("                                        <th>Ações</th>\n");
      out.write("                                        <th>Nome do produto</th>\n");
      out.write("                                        <th>Código de barras</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tbl-content\">\n");
      out.write("                            <form action=\"../ServletListarProduto\" method=\"post\">\n");
      out.write("                                ");

                                    ServletSalvarProduto ssp = new ServletSalvarProduto();
                                    List<Produtos> getList = ssp.listarProdutos();
                                
      out.write("\n");
      out.write("                                    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                                        <tbody>\n");
      out.write("                                        ");
                 
                                            for(Produtos produtos : getList ){
                                        
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>\n");
      out.write("                                                    ");
      out.print(produtos.getIdProduto());
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("\n");
      out.write("                                                <td>\n");
      out.write("                                                    <a class=\"acao-edit\" href=\"../ServletListarProduto?IdProduto=");
      out.print(produtos.getIdProduto());
      out.write("&tipo=1\" target=\"_blank\" rel=\"noopener noreferrer\">\n");
      out.write("                                                        <i class=\"fas fa-edit mr-2\"></i>\n");
      out.write("                                                    </a>\n");
      out.write("\n");
      out.write("                                                    <a class=\"acao-delete\" href=\"../ServletListarProduto?IdProduto=");
      out.print(produtos.getIdProduto());
      out.write("&tipo=2\" target=\"_blank\" rel=\"noopener noreferrer\">\n");
      out.write("                                                        <i class=\"fas fa-trash\"></i>\n");
      out.write("                                                    </a>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    ");
      out.print(produtos.getNmProduto());
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    ");
      out.print(produtos.getIdBarras().getCodigo());
      out.write("\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </body>\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("                <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("                <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("                <script src=\"./js/font-awesome-min.js\"></script>\n");
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    $(document).ready(function() {\n");
      out.write("                        setTimeout(() => {\n");
      out.write("                            $('#loading').remove();\n");
      out.write("                        }, 1000);\n");
      out.write("\n");
      out.write("                        $(window).on(\"load resize\", function() {\n");
      out.write("                            var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();\n");
      out.write("                            $('.tbl-header').css({\n");
      out.write("                                'padding-right': scrollWidth\n");
      out.write("                            });\n");
      out.write("                        }).resize();\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("                </script>\n");
      out.write("                </html>");
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
