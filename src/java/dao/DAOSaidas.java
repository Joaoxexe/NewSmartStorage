/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Saidas;
import java.util.List;

/**
 *
 * @author João Victor
 */
public class DAOSaidas extends DAOControl{
    
    public Saidas buscaIdSaida(int Id){
        this.abreConexao();
        Saidas saidas = em.find(Saidas.class, Id);
        this.fechaConexao();
        return saidas;
    }
    
    public List<Saidas> listarSaidas(){      
        this.abreConexao();
        List<Saidas> saidas;
        saidas = em.createQuery("select s from Saidas as s").getResultList();
        this.fechaConexao();
        return saidas;      
    }
}
