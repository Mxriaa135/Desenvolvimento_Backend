package com.programandoseufuturo.exercicio_2.Controller;

import com.programandoseufuturo.exercicio_2.model.Sala;
import com.programandoseufuturo.exercicio_2.repository.BancoDeDados;
import com.programandoseufuturo.exercicio_2.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {
    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> getAll(){
        return salaService.getAll();
    }
    @PutMapping
    public String atualizar(@RequestBody Sala sala){
        return salaService.atualizar(sala);
    }
    @PutMapping("/desalugar")
    public String desalugar(@RequestBody Sala sala){
        return salaService.desalugar(sala);
    }
}
