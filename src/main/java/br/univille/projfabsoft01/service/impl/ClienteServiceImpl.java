package br.univille.projfabsoft01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projfabsoft01.entity.Cliente;
import br.univille.projfabsoft01.repository.ClienteRepository;
import br.univille.projfabsoft01.service.ClienteService;

@Service
public class ClienteServiceImpl 
    implements ClienteService {
    
    @Autowired
    private ClienteRepository repository;
    
    @Override
    public void save(Cliente cliente) {
        repository.save(cliente);
    }

    @SuppressWarnings("deprecation")
    @Override
    public Cliente getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @Override
    public Cliente delete(long id) {
        var cliente = getById(id);
        repository.deleteById(id);
        return cliente;
    }
    
}
