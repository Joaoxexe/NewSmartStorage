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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Produtos Cadastrados</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <form action=\"../ServletListarProduto\" method=\"post\">\n");
      out.write("         ");

            ServletSalvarProduto ssp = new ServletSalvarProduto();
            List<Produtos> getList = ssp.listarProdutos();
         
      out.write("\n");
      out.write("         <table class=\"table\">\n");
      out.write("            <thead>\n");
      out.write("               <tr>\n");
      out.write("                  <th>Código do produto</th>  \n");
      out.write("                  <th>Nome do produto</th>\n");
      out.write("                  <th>Código de barras</th>  \n");
      out.write("               </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("               ");
                 
                  for(Produtos produtos : getList ){
               
      out.write("\n");
      out.write("               <tr> \n");
      out.write("                  <td>\n");
      out.write("                     ");
      out.print(produtos.getIdProduto());
      out.write("\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                     ");
      out.print(produtos.getNmProduto());
      out.write("\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                     ");
      out.print(produtos.getIdBarras().getCodigo());
      out.write("\n");
      out.write("                  </td>                   \n");
      out.write("                  <td>\n");
      out.write("                     <a href=\"../ServletListarProduto?IdProduto=");
      out.print(produtos.getIdProduto());
      out.write("&tipo=1\"><img src=\"../img/atualizar.png\" width=\"35px\" height=\"35px\" title=\"Alterar o produto ");
      out.print(produtos.getNmProduto());
      out.write(" \"></a>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                     <a href=\"../ServletListarProduto?IdProduto=");
      out.print(produtos.getIdProduto());
      out.write("&tipo=2\"><img src=\"../img/excluir.png\" width=\"35px\" height=\"35px\" title=\"Remover produto ");
      out.print(produtos.getNmProduto());
      out.write(" \"></a>\n");
      out.write("                  </td>\n");
      out.write("               </tr>\n");
      out.write("               ");
}
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("         </table>\n");
      out.write("      </form>\n");
      out.write("    </body>\n");
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
