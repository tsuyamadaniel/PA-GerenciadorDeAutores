package com.exerciciospa.gerenciadorautores.repository;

import com.exerciciospa.gerenciadorautores.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}