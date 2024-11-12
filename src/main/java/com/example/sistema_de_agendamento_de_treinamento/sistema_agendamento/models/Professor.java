package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Professor {
    private int id;
    private LocalDateTime Data;
    private String Nome;
    private ArrayList<Curso> Curso;

    public Professor() {
    }

    public Professor(int id, LocalDateTime data, String nome,
            ArrayList<com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Curso> curso) {
        this.id = id;
        Data = data;
        Nome = nome;
        Curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return Data;
    }

    public void setData(LocalDateTime data) {
        Data = data;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public ArrayList<Curso> getCurso() {
        return Curso;
    }

    public void setCurso(ArrayList<Curso> curso) {
        Curso = curso;
    }

}
