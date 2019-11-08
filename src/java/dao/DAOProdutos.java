/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Produtos;
import java.util.List;

/**
 *
 * @author João Victor
 */
public class DAOProdutos extends DAOControl{
    public List<Produtos> listar(){      
        this.abreConexao();
        List<Produtos> produtos;
        produtos = em.createQuery("select p from Produtos as p").getResultList();
        this.fechaConexao();
        return produtos;      
    }
    
    public Produtos buscaId(int Id){
        this.abreConexao();
        Produtos produtos = em.find(Produtos.class, Id);
        this.fechaConexao();
        return produtos;
    }
    
}
