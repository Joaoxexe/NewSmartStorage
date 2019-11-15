/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Movimentacoes;
import java.util.List;

/**
 *
 * @author João Victor
 */
public class DAOMovimentacoes extends DAOControl{
    public List<Movimentacoes> listarMovi(){      
        this.abreConexao();
        List<Movimentacoes> movi;
        movi = em.createQuery("select m from Movimentacoes as m").getResultList();
        this.fechaConexao();
        return movi;      
    }
    
    public Movimentacoes buscaIdMovi(int Id){
        this.abreConexao();
        Movimentacoes movi = em.find(Movimentacoes.class, Id);
        this.fechaConexao();
        return movi;
    }
    
}
