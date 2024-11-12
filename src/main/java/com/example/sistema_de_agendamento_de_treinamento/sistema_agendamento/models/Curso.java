package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models;

import java.util.ArrayList;

public class Curso {
    private String Nome;
    private int CargaHoraria;
    private ArrayList<Professor> Professores;

    public Curso() {
    }

    public Curso(String nome, int cargaHoraria, ArrayList<Professor> professores) {
        Nome = nome;
        CargaHoraria = cargaHoraria;
        Professores = professores;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    public ArrayList<Professor> getProfessores() {
        return Professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        Professores = professores;
    }

}
