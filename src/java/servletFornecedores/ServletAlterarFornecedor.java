/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletFornecedores;

import dao.DAOEnderecos;
import dao.DAOFornecedores;
import entidades.Fornecedores;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author João Victor
 */
@WebServlet(name = "ServletAlterarFornecedor", urlPatterns = {"/ServletAlterarFornecedor"})
public class ServletAlterarFornecedor extends HttpServlet {

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
        
        Fornecedores f = new Fornecedores();
        DAOEnderecos de = new DAOEnderecos();
        f.setIdFornecedor(Integer.parseInt(request.getParameter("id")));
        f.setNmFornecedor(request.getParameter("nome"));
        f.setNmFantasiaFornecedor(request.getParameter("fantasia"));
        f.setTelefoneFornecedor(request.getParameter("telefone"));
        f.setCnpjFornecedor(request.getParameter("cnpj"));
        f.setEmailFornecedor(request.getParameter("email"));
        f.setNumeroEnderecoFornecedor(Integer.parseInt(request.getParameter("numeroEnd")));
        f.setFgAtivoFornecedore(Boolean.TRUE);
        f.setIdEndereco(de.buscaIdEndereco(Integer.parseInt(request.getParameter("idEnd"))));       
        
        DAOFornecedores df = new DAOFornecedores();      
        df.alterar(f);       
        
        response.sendRedirect("Fornecedores/listarFornecedores.jsp");
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
