/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletEnderecos;

import dao.DAOEnderecos;
import entidades.Enderecos;
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
@WebServlet(name = "ServletSalvarEndereco", urlPatterns = {"/ServletSalvarEndereco"})
public class ServletSalvarEndereco extends HttpServlet {

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
        
        
        Enderecos endereco = new Enderecos();
        
        endereco.setBairroEndereco(request.getParameter("bairro"));
        endereco.setCepEndereco(request.getParameter("cep"));
        endereco.setCidadeEndereco(request.getParameter("cidade"));
        endereco.setLogradouroEndereco(request.getParameter("logradouro"));
        endereco.setPaisEndereco(request.getParameter("pais"));
        endereco.setTipoLogradouroEndereco(request.getParameter("tipoLog"));
        endereco.setUfEndereco(request.getParameter("uf"));
        
        DAOEnderecos de = new DAOEnderecos();
        de.salvar(endereco);
        
        request.setAttribute("mensagem", "Endereço cadastrado com sucesso!");
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("Enderecos/salvarEndereco.jsp");
        rd.forward(request, response);
        
        response.sendRedirect("Enderecos/salvarEndereco.jsp");
    }
    
    public List<Enderecos> listarEnderecos(){
        DAOEnderecos de = new DAOEnderecos();
        return de.listarEnderecos();    
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
