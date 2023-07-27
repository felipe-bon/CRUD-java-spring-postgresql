package com.mercado.mercado.Database;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mercado.mercado.Entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
