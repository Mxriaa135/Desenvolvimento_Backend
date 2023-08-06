package com.programandoseufuturo.exercicio_1.Controller;

import com.programandoseufuturo.exercicio_1.model.Cosmetico;
import com.programandoseufuturo.exercicio_1.service.CosmeticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmeticos")
@CrossOrigin("http://localhost:4200")
public class CosmeticoController {
    @Autowired
    private CosmeticoService cosmeticoService;
    @GetMapping
    public ResponseEntity<List<Cosmetico>>getAll(){
        List<Cosmetico> cosmeticos = cosmeticoService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(cosmeticos);
    }
    @GetMapping("/{id}")
    public Cosmetico getById(@PathVariable int id){
        return cosmeticoService.getById(id);
    }
    @PostMapping()
    public String save(@RequestBody Cosmetico cosmetico){
        return cosmeticoService.save(cosmetico);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return cosmeticoService.delete(id);
    }
}
