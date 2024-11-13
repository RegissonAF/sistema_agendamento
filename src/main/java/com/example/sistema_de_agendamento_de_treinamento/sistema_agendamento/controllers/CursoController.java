package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.controllers;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.CursoDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.InsereCursoDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.services.CursoService;

@RestController
@RequestMapping("/api/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping("{id}")
    public CursoDTO getCursoPorId(@PathVariable Long id) {
        return cursoService.buscarPorId(id);
    }

    @GetMapping()
    public List<CursoDTO> getCursos() {
        return cursoService.listarTodos();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void postCurso(@Valid @RequestBody InsereCursoDTO curso) {
        cursoService.inserir(curso);
    }
}