package com.programandoseufuturo.exercicio_1.service;

import com.programandoseufuturo.exercicio_1.model.Cosmetico;
import com.programandoseufuturo.exercicio_1.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CosmeticoService {
    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Cosmetico> getAll() {
        return bancoDeDados.FindAll();
    }
    public Cosmetico getById(int id){
        List<Cosmetico> cosmeticos = bancoDeDados.FindAll();
        for (Cosmetico cosmetico : cosmeticos){
            if(cosmetico.getId() == id){
                return cosmetico;
            }
        }
        return null;
    }
    public String save(Cosmetico cosmetico){
        return bancoDeDados.save(cosmetico);
    }
    public String delete(int id){
        return bancoDeDados.delete(id);
    }
}
