/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletMovimentacoes;

import dao.DAOClientes;
import dao.DAOEnderecos;
import dao.DAOEntradas;
import dao.DAOFornecedores;
import dao.DAOFuncionario;
import dao.DAOMovimentacoes;
import dao.DAOProdutos;
import dao.DAOSaidas;
import entidades.Clientes;
import entidades.Entradas;
import entidades.Fornecedores;
import entidades.Funcionarios;
import entidades.Movimentacoes;
import entidades.Produtos;
import entidades.Saidas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author João Victor
 */
@WebServlet(name = "ServletMovimentacoes", urlPatterns = {"/ServletMovimentacoes"})
public class ServletMovimentacoes extends HttpServlet {

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
       
        
    }
    public List<Movimentacoes> listarMovimentacoes(){
        DAOMovimentacoes dm = new DAOMovimentacoes();
        return dm.listarMovi();
    }
    
    public List <Entradas> listarEntradas(){
        DAOEntradas de = new DAOEntradas();
        return de.listarEntradas();
    }
    
    public List <Saidas> listarSadias(){
        DAOSaidas ds = new DAOSaidas();
        return ds.listarSaidas();
    }
    
    public List<Produtos> listarProdutos(){
        DAOProdutos dp = new DAOProdutos();
        return dp.listar(); // está na DAOcodbarras    
    }
    
    public List<Funcionarios> listarFuncionarios(){
        DAOFuncionario dfun = new DAOFuncionario();
        return dfun.listarFuncionarios(); // está na DAOcodbarras    
    }
    
    public List<Clientes> listarClientes(){
        DAOClientes dc = new DAOClientes();
        return dc.listarClientes(); // está na DAOcodbarras    
    }
    public List<Fornecedores> listarFornecedores(){
        DAOFornecedores dfor = new DAOFornecedores();
        return dfor.listarForenecedores(); // está na DAOcodbarras    
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
