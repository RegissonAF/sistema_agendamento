package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.services;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Professor;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.InsereProfessorDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.ProfessorDTO;
import java.util.List;

public interface ProfessorService {
    Professor inserir(InsereProfessorDTO professor);

    List<ProfessorDTO> listarTodos();

    ProfessorDTO buscarPorId(Long id);
}