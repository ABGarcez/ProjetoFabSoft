package br.univille.projfabsoft01;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import br.univille.projfabsoft01.entity.Cliente;
import br.univille.projfabsoft01.entity.MaterialProduto;
import br.univille.projfabsoft01.service.ClienteService;
import br.univille.projfabsoft01.service.MaterialProdutoService;

@Component
public class Startup {
    @Autowired
    private ClienteService service;
    @Autowired
    private MaterialProdutoService materialProdutoService;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event){
        var cliente1 = new Cliente();
        cliente1.setNome("Zezinho");
        cliente1.setEndereco("Rua lalalalla 100");
        cliente1.setDataNascimento(new Date(2024,04,17));
        service.save(cliente1);
        
        var materialProduto = new MaterialProduto();
        materialProduto.setTipoProduto("Aço");
        materialProdutoService.save(materialProduto);

        var materialProduto2 = new MaterialProduto();
        materialProduto2.setTipoProduto("Plástico pp");
        materialProdutoService.save(materialProduto2);

        var materialProduto3 = new MaterialProduto();
        materialProduto3.setTipoProduto("Plástico pl");
        materialProdutoService.save(materialProduto3);


    }
}
