package br.univille.projfabsoft01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfabsoft01.entity.Cliente;
import br.univille.projfabsoft01.entity.MaterialProduto;
import br.univille.projfabsoft01.repository.MaterialProdutoRepository;
import br.univille.projfabsoft01.service.MaterialProdutoService;

@Service
public class MaterialProdutoServiceImpl implements MaterialProdutoService{
    @Autowired
    private MaterialProdutoRepository repository;
    @Override
    public List<MaterialProduto> getAll() {
        return repository.findAll();
    }
    @Override
    public void save(MaterialProduto materialProduto) {
        repository.save(materialProduto);
    }
}
