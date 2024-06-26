package br.univille.projfabsoft01.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projfabsoft01.entity.Produto;
import br.univille.projfabsoft01.entity.MaterialProduto;
import br.univille.projfabsoft01.service.MaterialProdutoService;
import br.univille.projfabsoft01.service.ProdutoService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService service;
    @Autowired
    private MaterialProdutoService materialProdutoService;

    @GetMapping
    public ModelAndView index(){
        var listaProdutos = service.getAll();
        return new ModelAndView("produtos/index","listaProdutos",listaProdutos);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        HashMap <String,Object> dados= new HashMap<>();
        var produto = new Produto();
        var listaMaterialProduto = materialProdutoService.getAll();
        dados.put("produto", produto);
        dados.put("listaMaterialProduto", listaMaterialProduto);


        return new ModelAndView("produtos/form", dados);
    }

    @PostMapping
    public ModelAndView save(Produto produto){
        service.save(produto);
        return new ModelAndView("redirect:/produtos");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        HashMap <String,Object> dados= new HashMap<>();
        var produto = service.getById(id);
        var listaMaterialProduto = materialProdutoService.getAll();
        dados.put("produto", produto);
        dados.put("listaMaterialProduto", listaMaterialProduto);
        
        return new ModelAndView("produtos/form",dados);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);      
        return new ModelAndView("redirect:/produtos");
    }


}
