package com.programandoseufuturo.exercicio_2.service;

import com.programandoseufuturo.exercicio_2.model.Sala;
import com.programandoseufuturo.exercicio_2.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Component
public class SalaService {
    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Sala> getAll(){
        return bancoDeDados.findAll();
    }
    public String atualizar(Sala sala){
        return bancoDeDados.atualizar(sala);
    }
    public String desalugar(Sala sala){
        return bancoDeDados.desalugar(sala);
    }
}
