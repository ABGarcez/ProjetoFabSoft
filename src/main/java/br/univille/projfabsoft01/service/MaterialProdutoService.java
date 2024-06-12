package br.univille.projfabsoft01.service;

import java.util.List;

import br.univille.projfabsoft01.entity.MaterialProduto;

public interface MaterialProdutoService {
    List<MaterialProduto> getAll();
    void save(MaterialProduto materialProduto);

    
}
