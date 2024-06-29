package br.univille.projfabsoft01.service;

import java.util.List;

import br.univille.projfabsoft01.entity.ItemEstoque;
import br.univille.projfabsoft01.entity.Produto;

public interface ItemEstoqueService {
    void save(ItemEstoque itemEstoque);
    ItemEstoque getById(long id);
    ItemEstoque getItemEstoqueByProduto(Produto produto);
    List<ItemEstoque> getAll();
    ItemEstoque delete(long id);
}
