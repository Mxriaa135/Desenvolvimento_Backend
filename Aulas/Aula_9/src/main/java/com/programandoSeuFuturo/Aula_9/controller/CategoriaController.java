package com.programandoSeuFuturo.Aula_9.controller;

import com.programandoSeuFuturo.Aula_9.model.Categoria;
import com.programandoSeuFuturo.Aula_9.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.getAll());
    }

    @PostMapping
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria){
        if (categoriaService.save(categoria).equals(null)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.save(categoria));
    }
}
