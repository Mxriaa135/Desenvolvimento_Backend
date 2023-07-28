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
        this.cosmeticos.add (new Cosmetico(1, "Creme facial", 49.99, "https://media.vogue.es/photos/5e298b2fa3b62f00081824e6/master/w_1600%2Cc_limit/kooch.jpg"));
        this.cosmeticos.add (new Cosmetico(2, "Creme corporal", 59.99, "https://up2you.cdn.plataformaneo.com.br/produto/20220912111447_608999392_D.jpg"));
        this.cosmeticos.add (new Cosmetico(3, "Mascára facial", 25.90, "https://tezmb9.vtexassets.com/arquivos/ids/157922/Mascara_Black.jpg?v=637551270759070000"));
    }
    public List<Cosmetico> getAll() {
        return cosmeticos;
    }
    public Cosmetico getById(int id){
        for (Cosmetico cosmetico : cosmeticos){
            if(cosmetico.getId() == id){
                return cosmetico;
            }
        }
        return null;
    }
    public String save(Cosmetico cosmetico){
        for (Cosmetico cosmetico2 : cosmeticos){
            if(cosmetico.getId() == cosmetico2.getId()) {
                return "impossível cadastrar! cosmético já consta no banco";
            }
        }
        cosmeticos.add(cosmetico);
        return "Cosmético " + cosmetico.getNome() + " cadastrado com sucesso!";
    }
    public String delete(int id){
        for (Cosmetico cosmetico : cosmeticos){
            if(cosmetico.getId() == id){
                cosmeticos.remove(cosmetico);
                return "cosmético deletado com sucesso!";
            }
        }
        return "Cosmético inexistente";
    }
}
