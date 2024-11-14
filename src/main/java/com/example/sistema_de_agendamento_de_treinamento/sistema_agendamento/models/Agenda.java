package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agenda {
    @Column(length = 200, nullable = false)
    private String nome;
    @Column(nullable = false)
    private LocalDateTime data;
    @Column(nullable = false)
    private LocalDateTime dataFim;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String uf;
    @Column(nullable = false)
    private int cep;
    @Column(nullable = true)
    private String descricao;
    @Column(nullable = false)
    private String professor;
}
