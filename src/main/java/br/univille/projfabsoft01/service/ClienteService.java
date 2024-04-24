package br.univille.projfabsoft01.service;

import java.util.List;
import br.univille.projfabsoft01.entity.Cliente;

public interface ClienteService {
    void save(Cliente cliente);
    Cliente getById(long id);
    List<Cliente> getAll();
}
