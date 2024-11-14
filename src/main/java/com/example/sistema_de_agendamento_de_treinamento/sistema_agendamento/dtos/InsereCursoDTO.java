package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsereCursoDTO {
    private Long id;
    private String nome;
    private int cargaHoraria;
    private Integer professorId;
}
