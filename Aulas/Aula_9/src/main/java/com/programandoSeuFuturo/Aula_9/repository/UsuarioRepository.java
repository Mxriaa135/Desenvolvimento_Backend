package com.programandoSeuFuturo.Aula_9.repository;

import com.programandoSeuFuturo.Aula_9.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
