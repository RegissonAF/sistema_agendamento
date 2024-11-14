package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsereProfessorDTO {
    private Long id;
    private LocalDateTime data;
    private String nome;
}
