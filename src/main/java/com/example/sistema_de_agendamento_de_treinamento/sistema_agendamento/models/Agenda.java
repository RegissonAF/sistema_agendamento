package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models;

import java.time.LocalDateTime;

public class Agenda {
    private String Nome;
    private LocalDateTime Data;
    private LocalDateTime DataFim;
    private String Cidade;
    private String UF;
    private int CEP;
    private String Descricao;
    private String Professor;

    public Agenda() {
    }

    public Agenda(String nome, LocalDateTime data, LocalDateTime dataFim, String cidade, String uf, int cep,
            String descricao, String professor) {
        Nome = nome;
        Data = data;
        DataFim = dataFim;
        Cidade = cidade;
        UF = uf;
        CEP = cep;
        Descricao = descricao;
        Professor = professor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public LocalDateTime getData() {
        return Data;
    }

    public void setData(LocalDateTime data) {
        Data = data;
    }

    public LocalDateTime getDataFim() {
        return DataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        DataFim = dataFim;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uf) {
        UF = uf;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int cep) {
        CEP = cep;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getProfessor() {
        return Professor;
    }

    public void setProfessor(String professor) {
        Professor = professor;
    }

}
