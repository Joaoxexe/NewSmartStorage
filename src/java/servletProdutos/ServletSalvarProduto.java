/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletProdutos;


import dao.DAOCodigoBarras;
import dao.DAOProdutos;
import entidades.CodigoDeBarras;
import entidades.Produtos;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author João Victor
 */
@WebServlet(name = "ServletSalvarProduto", urlPatterns = {"/ServletSalvarProduto"})
public class ServletSalvarProduto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Produtos p = new Produtos();
        DAOCodigoBarras dc = new DAOCodigoBarras();
        p.setNmProduto(request.getParameter("nome"));
        p.setIdBarras(dc.buscaId(Integer.parseInt(request.getParameter("codigo"))));
        p.setFgAtivoProdutos(Boolean.TRUE);
        DAOProdutos dp = new DAOProdutos();      
        dp.salvar(p);       
        
        response.sendRedirect("Produtos/listarProdutos.jsp");
    }
    // listar codigo de barras
    public List<CodigoDeBarras> listarCodBarras(){
        DAOCodigoBarras dcb = new DAOCodigoBarras();
        return dcb.listar(); // está na DAOcodbarras    
    }
    
    public List<Produtos> listarProdutos(){
        DAOProdutos dp = new DAOProdutos();
        return dp.listar(); // está na DAOcodbarras    
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
