package com.programandoSeuFuturo.Aula_9.repository;

import com.programandoSeuFuturo.Aula_9.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
}
