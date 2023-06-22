package com.programando.exercicio2.controller;

import com.programando.exercicio2.model.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/jogos")
public class JogoController {
    private List<Jogo> jogos = new ArrayList<>();
    public JogoController (){
        jogos.add(new Jogo(1, "Gran Turismo Sport", 199.90));
        jogos.add(new Jogo(2, "GTA", 250.0));
        jogos.add(new Jogo(3, "Fortnite", 0.0));
    }
    @GetMapping
    public List<Jogo> getAll (){
        return jogos;
    }
    @GetMapping("/{id}")
    public Jogo getById(@PathVariable int id){
        for(Jogo jogo : jogos){
            if(jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }
    @GetMapping("/menor-preco")
    public Jogo getByMenorPreco(){
        Double menorPreco = jogos.get(0).getPreco();
        int index = 0;
        for(int i =0; i < jogos.size(); i++){
            if(jogos.get(i).getPreco() < menorPreco){
                menorPreco = jogos.get(i).getPreco();
                index = i;
            }
        }
        return jogos.get(index);
    }
    @PostMapping
    public String save(@RequestBody Jogo jogo){
        for(Jogo verificar : jogos){
            if(verificar.getId() == jogo.getId()){
                return "Jogo já existente";
            }
            else{
                jogos.add(jogo);
                return "O jogo " + jogo.getNome() + " foi adicionado com sucesso!";
            }
        }
        return null;
    }
}
