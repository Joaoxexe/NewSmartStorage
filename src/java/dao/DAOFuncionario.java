/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Funcionarios;
import java.util.List;

/**
 *
 * @author João Victor
 */
public class DAOFuncionario extends DAOControl{
    
    public List<Funcionarios> listarFuncionarios(){      
        this.abreConexao();
        List<Funcionarios> funcionarios;
        funcionarios = em.createQuery("select f from Funcionarios as f").getResultList();
        this.fechaConexao();
        return funcionarios;      
    }
    
    public Funcionarios buscaIdFuncionario(int Id){
        this.abreConexao();
        Funcionarios funcionarios = em.find(Funcionarios.class, Id);
        this.fechaConexao();
        return funcionarios;
    }      
    
}
