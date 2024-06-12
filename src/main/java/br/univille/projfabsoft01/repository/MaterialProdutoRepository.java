package br.univille.projfabsoft01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projfabsoft01.entity.MaterialProduto;

@Repository
public interface MaterialProdutoRepository extends JpaRepository<MaterialProduto,Long>{

}
