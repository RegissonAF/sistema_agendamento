package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.CursoDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.InsereCursoDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.exceptions.RegraNegocioException;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Curso;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Professor;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.repositories.CursoRepository;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.repositories.ProfessorRepository;

@Service
public class AgendaService implements CursoService {
	private CursoRepository cursoRepository;
	private ProfessorRepository professorRepository;

	public AgendaService(CursoRepository cursoRepository,
			ProfessorRepository professorRepository) {
		this.cursoRepository = cursoRepository;
		this.professorRepository = professorRepository;
	}

	@Override
	public Curso inserir(InsereCursoDTO curso) {
		Professor prof = professorRepository.findById(curso.getProfessorId());
		Curso cursoObj = new Curso();
		cursoObj.setNome(curso.getNome());
		cursoObj.setCargaHoraria(curso.getCargaHoraria());
		cursoObj.setProfessor(prof);
		
		return cursoRepository.save(cursoObj);
	}

	@Override
	public List<CursoDTO> listarTodos() {
		List<Curso> cursos = cursoRepository.findAll();

		return cursos.stream().map((Curso c) -> CursoDTO.builder()
				.id(c.getId())
				.nome(c.getNome())
				.cargaHoraria(c.getCargaHoraria())
				.build()).collect(Collectors.toList());
	}

	@Override
	public CursoDTO buscarPorId(Long id) {
		Curso curso = cursoRepository.findById(id)
				.orElseThrow(() -> new RegraNegocioException("Curso não encontrado"));
		
		return CursoDTO.builder()
				.id(curso.getId())
				.nome(curso.getNome())
				.cargaHoraria(curso.getCargaHoraria())
				.build();
	}
}