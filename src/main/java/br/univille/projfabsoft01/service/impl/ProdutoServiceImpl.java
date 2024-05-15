package br.univille.projfabsoft01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfabsoft01.entity.Produto;
import br.univille.projfabsoft01.repository.ProdutoRepository;
import br.univille.projfabsoft01.service.ProdutoService;

@Service
public class ProdutoServiceImpl 
    implements ProdutoService {
    
    @Autowired
    private ProdutoRepository repository;
    
    @Override
    public void save(Produto produto) {
        repository.save(produto);
    }

    @SuppressWarnings("deprecation")
    @Override
    public Produto getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<Produto> getAll() {
        return repository.findAll();
    }

    @Override
    public Produto delete(long id) {
        var cliente = getById(id);
        repository.deleteById(id);
        return cliente;
    }
    
}
