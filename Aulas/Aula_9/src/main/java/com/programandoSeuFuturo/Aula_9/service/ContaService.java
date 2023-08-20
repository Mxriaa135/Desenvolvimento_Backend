package com.programandoSeuFuturo.Aula_9.service;

import com.programandoSeuFuturo.Aula_9.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

}
