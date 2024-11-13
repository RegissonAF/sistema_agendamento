package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos;

import java.util.List;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Professor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CursoDTO {

    private Long id;
    private String Nome;
    private int CargaHoraria;
    private List<Professor> Professores;
}
