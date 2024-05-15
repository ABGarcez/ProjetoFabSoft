package br.univille.projfabsoft01.service;

import java.util.List;
import br.univille.projfabsoft01.entity.Produto;

public interface ProdutoService {
    void save(Produto produto);
    Produto getById(long id);
    List<Produto> getAll();
    Produto delete(long id);
}