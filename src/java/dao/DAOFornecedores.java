/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAOControl.em;
import entidades.Enderecos;
import entidades.Fornecedores;
import java.util.List;

/**
 *
 * @author João Victor
 */
public class DAOFornecedores extends DAOControl{
    
    public List<Fornecedores> listarForenecedores(){      
        this.abreConexao();
        List<Fornecedores> fornecedores;
        fornecedores = em.createQuery("select f from Fornecedores as f").getResultList();
        this.fechaConexao();
        return fornecedores;      
    }
    
    public Fornecedores buscaIdFornecedor(int Id){
        this.abreConexao();
        Fornecedores fornecedores = em.find(Fornecedores.class, Id);
        this.fechaConexao();
        return fornecedores;
    }      
    
}
