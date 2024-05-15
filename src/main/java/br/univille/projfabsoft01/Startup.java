package br.univille.projfabsoft01;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import br.univille.projfabsoft01.entity.Cliente;
import br.univille.projfabsoft01.service.ClienteService;

@Component
public class Startup {
    @Autowired
    private ClienteService service;

    @SuppressWarnings("deprecation")
    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event){
        var cliente1 = new Cliente();
        cliente1.setNome("Zezinho");
        cliente1.setEndereco("Rua lalalalla 100");
        cliente1.setDataNascimento(new Date(2024,04,17));
        service.save(cliente1);
    }
   
}
