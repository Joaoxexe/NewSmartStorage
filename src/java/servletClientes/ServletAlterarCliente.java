/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletClientes;

import dao.DAOClientes;
import dao.DAOEnderecos;
import entidades.Clientes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author João Victor
 */
@WebServlet(name = "ServletAlterarCliente", urlPatterns = {"/ServletAlterarCliente"})
public class ServletAlterarCliente extends HttpServlet {

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
        Clientes c = new Clientes();
        DAOClientes dc = new DAOClientes();
        c.setIdCliente(Integer.parseInt(request.getParameter("id")));
        c.setNmCliente(request.getParameter("nome"));
        c.setTelefoneCliente(request.getParameter("telefone"));
              
        String data_nasc;
        data_nasc = (request.getParameter("data"));
        Date data = new Date(data_nasc);
        c.setDtNascimentoCliente(data);
        
        Clientes c1 = new Clientes();  
        String sexo = request.getParameter("sexo");
        
        
        if(sexo == "Masculino"){
            c.setSexoCliente('M');
        }
        else if (sexo == "Feminino"){
            c.setSexoCliente('F');
        } 
        else{
            c.setSexoCliente('O');
        }
        
        c.setCpfCliente(request.getParameter("cpf"));
        
        c.setNumeroEnderecoCliente(Integer.parseInt(request.getParameter("numeroEnd")));
        c.setFgAtivoCliente(Boolean.TRUE);
        
        DAOEnderecos de = new DAOEnderecos();
        c.setIdEndereco(de.buscaIdEndereco(Integer.parseInt(request.getParameter("idEnd"))));       
        
        dc.alterar(c); 
        response.sendRedirect("Clientes/listarClientes.jsp");
              
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
