/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletSaidas;

import dao.DAOClientes;
import dao.DAOFuncionario;
import dao.DAOMovimentacoes;
import dao.DAOProdutos;
import dao.DAOSaidas;
import entidades.Movimentacoes;
import entidades.Saidas;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
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
@WebServlet(name = "ServletSalvarSaida", urlPatterns = {"/ServletSalvarSaida"})
public class ServletSalvarSaida extends HttpServlet {

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
        Saidas s = new Saidas();
        
        String data_nasc;
        data_nasc = (request.getParameter("data"));
        Date data = new Date(data_nasc);
        s.setDtSaida(data);
        
        DAOClientes dc = new DAOClientes();
        s.setIdCliente(dc.buscaIdCliente(Integer.parseInt(request.getParameter("idCliente"))));
        
        DAOFuncionario df = new DAOFuncionario();
        s.setIdFuncionario(df.buscaIdFuncionario(Integer.parseInt(request.getParameter("idFuncionario"))));
        
        s.setQtdSaida(Integer.parseInt(request.getParameter("qtde")));
        
        String big;
        big = (request.getParameter("valor")); 
        BigInteger bigInteger = new BigInteger(big);  
        s.setValorUnitario(bigInteger);
        
        DAOSaidas ds = new DAOSaidas();
        
        ds.salvar(s);
        DAOProdutos dp = new DAOProdutos();

        Movimentacoes movi = new Movimentacoes();
        movi.setIdSaida(ds.buscaIdSaida(s.getIdSaida()));
        movi.setIdProduto(dp.buscaId(Integer.parseInt(request.getParameter("idProduto"))));
        DAOMovimentacoes dm = new DAOMovimentacoes();
        
        dm.salvar(movi);
   
        response.sendRedirect("Movimentacoes/listarMovimentacoes.jsp");     
    
    }
    
    public List<Saidas> listarSadias(){
        DAOSaidas ds = new DAOSaidas();
        return ds.listarSaidas();
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
