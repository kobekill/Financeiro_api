/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sc.financeiroapi.dao;

import br.senac.sc.financeiroapi.factory.Dao;
import br.senac.sc.financeiroapi.interfaces.DaoI;
import br.senac.sc.financeiroapi.model.Pessoa;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class PessoaDao extends Dao implements DaoI<Pessoa>{

    @Override
    public boolean salvar(Pessoa obj) {
        
        msql = "INSERT INTO financeiro () VALUES ";
        
        return true;

    }

    @Override
    public boolean atualizar(Pessoa obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Pessoa obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa lerPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
}
