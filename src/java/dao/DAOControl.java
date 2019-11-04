/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author João Victor
 */
public class DAOControl {
    private static EntityManagerFactory emf;
    public static  EntityManager em;
    
    public void abreConexao(){
        emf = Persistence.createEntityManagerFactory("NewSmartStoragePU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
    public void fechaConexao(){
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    public void salvar (Object o){
        this.abreConexao();
        em.persist(o);
        this.fechaConexao();
    }
    
    public void alterar(Object o){
        this.abreConexao();
        em.merge(o);
        this.fechaConexao();        
    }
    
    public void remover(Object o){
        this.abreConexao();
        em.remove(em.merge(o));
        this.fechaConexao();
    }   
}

