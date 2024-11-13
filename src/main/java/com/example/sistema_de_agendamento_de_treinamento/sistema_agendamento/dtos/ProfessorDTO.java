package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Curso;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfessorDTO {
    @Id
    private Long id;
    private LocalDateTime Data;
    private String Nome;
    private ArrayList<Curso> Curso;
}