/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletFuncionarios;

import dao.DAOEnderecos;
import dao.DAOFuncionario;
import entidades.Funcionarios;
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
@WebServlet(name = "ServletAlterarFuncionario", urlPatterns = {"/ServletAlterarFuncionario"})
public class ServletAlterarFuncionario extends HttpServlet {

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
        Funcionarios f = new Funcionarios();
        
        f.setCpfFuncionario(request.getParameter("cpf"));
        String data_nasc;
        data_nasc = (request.getParameter("data"));
        Date data = new Date(data_nasc);
        f.setDtNascimentoFuncionario(data);
        f.setEmailFuncionario(request.getParameter("email"));
        f.setNumeroEnderecoFuncionario(Integer.parseInt(request.getParameter("numeroEnd")));
        f.setFgAtivoFuncionario(Boolean.TRUE);
        
        String sexo = request.getParameter("sexo");
        if(sexo == "Masculino"){
            f.setSexoFuncionario('M');
        }
        else if (sexo == "Feminino"){
             f.setSexoFuncionario('F');
        } 
        else{
             f.setSexoFuncionario('O');
        }
        
        DAOEnderecos de = new DAOEnderecos();
        f.setIdEndereco(de.buscaIdEndereco(Integer.parseInt(request.getParameter("idEnd"))));
        
        f.setLoginFuncionario(request.getParameter("login"));
        f.setNmFuncionario(request.getParameter("nome"));
        f.setSenhaFuncionario(request.getParameter("senha"));
       
        f.setTelefoneFuncionario(request.getParameter("telefone"));
        
        DAOFuncionario df = new DAOFuncionario();
        df.alterar(f);
        response.sendRedirect("Funcionarios/listarFuncionarios.jsp");
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
