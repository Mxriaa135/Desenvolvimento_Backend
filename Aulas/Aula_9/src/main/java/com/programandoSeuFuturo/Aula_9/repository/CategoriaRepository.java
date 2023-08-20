package com.programandoSeuFuturo.Aula_9.repository;

import com.programandoSeuFuturo.Aula_9.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
