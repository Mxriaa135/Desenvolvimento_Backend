package com.programando.exercicio_1.controllers;

import com.programando.exercicio_1.models.Endereco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
     @GetMapping("/{cep}")
     public Endereco obterEnderecoPorCep(@PathVariable String cep) {
          String url = "https://viacep.com.br/ws/" + cep + "/json/";

          RestTemplate restTemplate = new RestTemplate();
          Endereco endereco = restTemplate.getForObject(url, Endereco.class);
          return endereco;
     }
}