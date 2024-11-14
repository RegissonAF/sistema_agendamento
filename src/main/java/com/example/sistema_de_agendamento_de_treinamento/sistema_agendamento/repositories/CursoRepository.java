package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByNomeLike(String nome);
    List<Curso> findById(long id);
}