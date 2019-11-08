/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAOControl.em;
import entidades.Clientes;
import java.util.List;

/**
 *
 * @author João Victor
 */
public class DAOClientes extends DAOControl{
    public List<Clientes> listar(){      
        this.abreConexao();
        List<Clientes> clientes;
        clientes = em.createQuery("select c from Clientes as c").getResultList();
        this.fechaConexao();
        return clientes;      
    }
    
    public Clientes buscaId(int Id){
        this.abreConexao();
        Clientes clientes = em.find(Clientes.class, Id);
        this.fechaConexao();
        return clientes;
    }    
}
