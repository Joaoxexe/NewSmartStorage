/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Entradas;
import java.util.List;

/**
 *
 * @author João Victor
 */
public class DAOEntradas extends DAOControl{
    
    public Entradas buscaIdEntrada(int Id){
        this.abreConexao();
        Entradas entradas = em.find(Entradas.class, Id);
        this.fechaConexao();
        return entradas;
    } 
    
    public List<Entradas> listarEntradas(){      
        this.abreConexao();
        List<Entradas> entradas;
        entradas = em.createQuery("select e from Entradas as e").getResultList();
        this.fechaConexao();
        return entradas;      
    }
}
