package com.mercado.mercado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercado.mercado.Database.ProdutoRepository;
import com.mercado.mercado.Entity.Produto;

@RestController
@RequestMapping("/produto")
public class ProdutoREST {

    @Autowired
    private ProdutoRepository prodRepository;

    @GetMapping
    public List<Produto> listar(){
        return prodRepository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Produto produto){
        prodRepository.save(produto);
    }

    @PutMapping
    public void alterar(@RequestBody Produto produto){
        if(produto.getId() > 0)
            prodRepository.save(produto);
    }
    
    @DeleteMapping
    public void excluir(@RequestBody Produto produto){
        prodRepository.delete(produto);
    }
}
