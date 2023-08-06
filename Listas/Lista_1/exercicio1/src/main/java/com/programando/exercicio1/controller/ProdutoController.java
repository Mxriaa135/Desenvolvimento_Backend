package com.programando.exercicio1.controller;
import com.programando.exercicio1.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private List<Produto> produtos = new ArrayList<>();
    public ProdutoController(){
        produtos.add(new Produto (123456789, "Flocos de Aveia fitness", 25.99));
        produtos.add(new Produto (987654321, "Açucar Fit", 9.99));
        produtos.add(new Produto (123987456, "Suco Clight", 1.95));
    }
    @GetMapping
    public List<Produto> getAll(){
        return produtos;
    }
    @GetMapping("/{codigoDeBarras}")
    public Produto getByCodigoDeBarras (@PathVariable int codigoDeBarras){
        for(Produto produto : produtos){
            if(produto.getCodigoDeBarras() == codigoDeBarras){
                return produto;
            }
        }
        return null;
    }
    @PostMapping
    public String save(@RequestBody Produto produto){
        for(Produto verificar : produtos) {
            if (verificar.getCodigoDeBarras() == produto.getCodigoDeBarras()) {
                return "Produto já existente";
            }
            else {
                this.produtos.add(produto);
                return "O Produto " + produto.getNome() + " foi cadastrado com sucesso!";
            }
        }
        return null;
    }
}
