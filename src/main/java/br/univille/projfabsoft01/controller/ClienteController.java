package br.univille.projfabsoft01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projfabsoft01.entity.Cliente;
import br.univille.projfabsoft01.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ModelAndView index(){
        var listaClientes = service.getAll();
        return new ModelAndView("cliente/index","listaClientes",listaClientes);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var cliente = new Cliente();
        return new ModelAndView("cliente/form", "cliente", cliente);

    }

    @PostMapping
    public ModelAndView save(Cliente cliente){
        service.save(cliente);
        return new ModelAndView("redirect:/clientes");
    }
}