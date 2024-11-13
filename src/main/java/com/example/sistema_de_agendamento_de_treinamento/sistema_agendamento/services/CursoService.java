package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.services;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Curso;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.CursoDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.InsereCursoDTO;

import java.util.List;

public interface CursoService {
    Curso inserir(InsereCursoDTO curso);

    List<CursoDTO> listarTodos();

    CursoDTO buscarPorId(Long id);
}