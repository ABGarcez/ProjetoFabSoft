package br.univille.projfabsoft01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projfabsoft01.entity.Produto;

@Repository
public interface ProdutoRepository 
        extends JpaRepository<Produto,Long>{
    
}
