package com.programandoseufuturo.exercicio_1.repository;

import com.programandoseufuturo.exercicio_1.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Cosmetico> cosmeticos = new ArrayList<>();

    public BancoDeDados (){
        this.cosmeticos.add (new Cosmetico(1, "Creme facial", new BigDecimal(49)));
        this.cosmeticos.add (new Cosmetico(2, "Creme corporal", new BigDecimal(59)));
        this.cosmeticos.add (new Cosmetico(3, "Mascára facial", new BigDecimal(25)));
    }
    public List<Cosmetico> FindAll() {
        return cosmeticos;
    }
    public String save(Cosmetico cosmetico){
        for (Cosmetico cosmetico2 : cosmeticos){
            if(cosmetico.getId() == cosmetico2.getId()){
                return "impossível cadastrar! cosmético já consta no banco";
            }
            else{
                cosmeticos.add(cosmetico);
                return "Cosmético " + cosmetico.getNome() + " cadastrado com sucesso!";
            }
        }
        return null;
    }
    public String delete(int id){
        for (Cosmetico cosmetico : cosmeticos){
            if(cosmetico.getId() == id){
                cosmeticos.remove(cosmetico);
                return "cosmético deletado com sucesso!";
            }
            else{
                return "Cosmético inexistente";
            }
        }
        return null;
    }
}
