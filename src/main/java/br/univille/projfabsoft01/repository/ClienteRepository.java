package br.univille.projfabsoft01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projfabsoft01.entity.Cliente;

@Repository
public interface ClienteRepository 
        extends JpaRepository<Cliente,Long>{
    
}
