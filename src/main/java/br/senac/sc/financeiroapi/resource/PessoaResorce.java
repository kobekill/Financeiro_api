/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sc.financeiroapi.resource;

import br.senac.sc.financeiroapi.model.Endereco;
import br.senac.sc.financeiroapi.model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bruno
 */

@RestController
public class PessoaResorce {
    
    
    @GetMapping(path="/pessoas", produces = "application/json")
    public List<Pessoa> listar(){
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        Endereco endereco = new Endereco(8L, "Rua Jao", "843", "nada", "Barra do Aririu", "88134225", "palhoca", "SC");
        Endereco endereco1 = new Endereco(655L, "Rua tijucas", "108", "fdfdf", "tapera", "88134226", "Floripa", "SC");
        Endereco endereco2 = new Endereco(16L, "Rua Urursunga", "1016", "nada", "carianos", "88139226", "Floripa", "SC");
        
        pessoas.add(new Pessoa(1L, "bruno", true, endereco));
        pessoas.add(new Pessoa(5L, "Ana", true, endereco1));
        pessoas.add(new Pessoa(16165L, "Aline", true, endereco2));
        
        return pessoas;
    }
    
    
    
}
