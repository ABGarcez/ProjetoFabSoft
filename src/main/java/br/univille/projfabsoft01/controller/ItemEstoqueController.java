package br.univille.projfabsoft01.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projfabsoft01.entity.ItemEstoque;
import br.univille.projfabsoft01.service.ItemEstoqueService;
import br.univille.projfabsoft01.service.ProdutoService;
@Controller
@RequestMapping("/itemEstoque")
public class ItemEstoqueController {
    
    @Autowired
    private ItemEstoqueService service;
    @Autowired
    private ProdutoService produtoservice;
    

    @GetMapping
    public ModelAndView index(){
        var listaItemEstoque = service.getAll();
        return new ModelAndView("itemEstoque/index","listaItemEstoque",listaItemEstoque);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        HashMap <String,Object> dados= new HashMap<>();
        var itemEstoque = new ItemEstoque();
        var listaProduto = produtoservice.getAll();
        
        dados.put("itemEstoque", itemEstoque);
        dados.put("listaProduto", listaProduto);
        return new ModelAndView("itemEstoque/form", dados);
    }

    @PostMapping
    public ModelAndView save(ItemEstoque itemEstoque){
        service.save(itemEstoque);
        return new ModelAndView("redirect:/itemEstoque");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        HashMap <String,Object> dados= new HashMap<>();
        var itemEstoque = service.getById(id);
        dados.put("itemEstoque", itemEstoque);
        
        
        return new ModelAndView("itemEstoque/form",dados);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);      
        return new ModelAndView("redirect:/itemEstoque");
    }

    
}
