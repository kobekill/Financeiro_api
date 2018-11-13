package br.senac.sc.financeiroapi.resource;

import br.senac.sc.financeiroapi.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/categorias")
@RestController
public class CategoriaResource {
    
    @GetMapping
    public List<Categoria> listar() {
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(new Categoria(1L, "Transporte"));
        categorias.add(new Categoria(2L, "Alimentação"));
        categorias.add(new Categoria(3L, "Educação"));
        return categorias;
    }
    
    
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria salvar(@RequestBody Categoria categoria) {
        // categoriaDao.salvar(categoria);
        categoria.setId(1L);
        
        return categoria;
    }
    
    @GetMapping("/{codigo}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long codigo){
        
        Categoria c = null;
        
        if(c == null){
            return ResponseEntity.notFound().build();
            
        } else {
            return ResponseEntity.ok(c);
        }
        
    }
    
    
    @GetMapping("/{codigo}")
    public categoria alterar(@PathVariable Long codigo, @RequestBody Categoria categoria){
        categoria.setId(codigo);
        return categoria;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    @PostMapping(path = "/categorias")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Categoria salvar(@RequestBody Categoria categoria) {
//        categoria.setId(1L);
//        System.out.println(categoria.getNome());
//        return categoria;
//    }
    
}
