package br.univille.projfabsoft01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfabsoft01.entity.ItemEstoque;
import br.univille.projfabsoft01.entity.Produto;
import br.univille.projfabsoft01.repository.ItemEstoqueRepository;
import br.univille.projfabsoft01.service.ItemEstoqueService;
@Service
public class ItemEstoqueServiceImpl implements ItemEstoqueService{
     @Autowired
    private ItemEstoqueRepository repository;
    
    @Override
    public void save(ItemEstoque itemEstoque) {
        Produto produto = itemEstoque.getProduto();
        ItemEstoque itemNvo = getItemEstoqueByProduto(produto);

        if(itemNvo == null){

            repository.save(itemEstoque);

        }else{
            itemNvo.setQuantidade(itemEstoque.getQuantidade() + itemNvo.getQuantidade());
            repository.save(itemNvo);

        }
    }

    @Override
    public ItemEstoque getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<ItemEstoque> getAll() {
        return repository.findAll();
    }

    @Override
    public ItemEstoque delete(long id) {
        var itemEstoque = getById(id);
        repository.deleteById(id);
        return itemEstoque;
    }

    @Override
    public ItemEstoque getItemEstoqueByProduto(Produto produto) {
        return repository.getItemEstoqueByProduto(produto);
    }
    
}
