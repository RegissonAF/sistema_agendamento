package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.InsereProfessorDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.ProfessorDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.services.ProfessorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/curso")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping("{id}")
    public ProfessorDTO getProfessorPorId(@PathVariable Long id) {
        return professorService.buscarPorId(id);
    }

    @GetMapping()
    public List<ProfessorDTO> getProfessors() {
        return professorService.listarTodos();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void postCurso(@Valid @RequestBody InsereProfessorDTO professor) {
        professorService.inserir(professor);
    }
}