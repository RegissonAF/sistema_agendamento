package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agenda {
    @Column(length = 200, nullable = false)
    private String Nome;
    @Column(nullable = false)
    private LocalDateTime Data;
    @Column(nullable = false)
    private LocalDateTime DataFim;
    @Column(nullable = false)
    private String Cidade;
    @Column(nullable = false)
    private String UF;
    @Column(nullable = false)
    private int CEP;
    @Column(nullable = true)
    private String Descricao;
    @Column(nullable = false)
    private String Professor;
}
