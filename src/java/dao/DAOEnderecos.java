/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Enderecos;
import java.util.List;

/**
 *
 * @author João Victor
 */
public class DAOEnderecos extends DAOControl{
    public List<Enderecos> listarEnderecos(){      
        this.abreConexao();
        List<Enderecos> enderecos;
        enderecos = em.createQuery("select e from Enderecos as e").getResultList();
        this.fechaConexao();
        return enderecos;      
    }
    
    public Enderecos buscaIdEndereco(int Id){
        this.abreConexao();
        Enderecos enderecos = em.find(Enderecos.class, Id);
        this.fechaConexao();
        return enderecos;
    }      
}
