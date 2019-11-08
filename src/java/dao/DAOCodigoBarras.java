/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.CodigoDeBarras;
import java.util.List;

/**
 *
 * @author João Victor
 */
public class DAOCodigoBarras extends DAOControl{
    public List<CodigoDeBarras> listar(){      
        this.abreConexao();
        List<CodigoDeBarras> codigoDeBarras;
        codigoDeBarras = em.createQuery("select c from CodigoDeBarras as c").getResultList();
        this.fechaConexao();
        return codigoDeBarras;      
    }
    
    public CodigoDeBarras buscaId(int Id){
        this.abreConexao();
        CodigoDeBarras codigoBarras = em.find(CodigoDeBarras.class, Id);
        this.fechaConexao();
        return codigoBarras;
    }
}
