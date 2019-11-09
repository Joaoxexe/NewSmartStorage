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
@WebServlet(name = "ServletListarFornecedores", urlPatterns = {"/ServletListarFornecedores"})
public class ServletListarFornecedores extends HttpServlet {

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
        
        int x = Integer.parseInt(request.getParameter("Id"));
        DAOFornecedores df = new DAOFornecedores();
        Fornecedores fornecedores;
        fornecedores = df.buscaIdFornecedor(x);
        
        DAOEnderecos de = new DAOEnderecos();
        
        request.setAttribute("id", fornecedores.getIdFornecedor());
        request.setAttribute("nome", fornecedores.getNmFornecedor());
        request.setAttribute("fantasia", fornecedores.getNmFantasiaFornecedor());
        request.setAttribute("telefone", fornecedores.getTelefoneFornecedor());
        request.setAttribute("cnpf", fornecedores.getCnpjFornecedor());
        request.setAttribute("email", fornecedores.getEmailFornecedor());
        request.setAttribute("numeroEnd", fornecedores.getNumeroEnderecoFornecedor());
        request.setAttribute("situacao", fornecedores.getFgAtivoFornecedore());
        request.setAttribute("idEndereco", fornecedores.getIdEndereco());
        
        int tipo = Integer.parseInt(request.getParameter("tipo"));
        
        if(tipo == 1){
            request.getRequestDispatcher("/Fornecedores/alterarFornecedor.jsp").forward(request, response);
        }
        else 
            if(tipo == 2){
             request.getRequestDispatcher("/Fornecedores/excluirFornecedor.jsp").forward(request, response);
        }
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
