package com.programandoseufuturo.exercicio_2.repository;

import com.programandoseufuturo.exercicio_2.model.Sala;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Sala> salas = new ArrayList<>();

    public BancoDeDados (){
        this.salas.add(new Sala(1, false, ""));
        this.salas.add(new Sala(2, false, ""));
        this.salas.add(new Sala(3, false, ""));
        this.salas.add(new Sala(4, false, ""));
        this.salas.add(new Sala(5, false, ""));
        this.salas.add(new Sala(6, true, "Rogério Almeida"));
        this.salas.add(new Sala(7, false, ""));
        this.salas.add(new Sala(8, false, ""));
    }
    public List<Sala> findAll(){
        return salas;
    }
    public String atualizar(Sala sala) {
        for (Sala salaDaLista : salas){
            if(sala.getId() == salaDaLista.getId()){
                if(!salaDaLista.getEstaAlugada()){
                    salaDaLista.setEstaAlugada(true);
                    salaDaLista.setNomeLocatario(sala.getNomeLocatario());
                    return "Sala alugada com sucesso!";
                }
                else if(salaDaLista.getEstaAlugada()){
                    return "Sala já alugada";
                }
            }
        }
            return null;
    }
    public String desalugar(Sala sala){
        for (Sala salaDaLista : salas){
            if(sala.getId() == salaDaLista.getId()){
                if(salaDaLista.getEstaAlugada()){
                    salaDaLista.setEstaAlugada(false);
                    salaDaLista.setNomeLocatario("");
                    return "Sala desalugada com sucesso!";
                }
                else if(!salaDaLista.getEstaAlugada()){
                    return "Esta sala já está desalugada!";
                }
            }
        }
        return null;
    }
}