package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.CursoDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.dtos.InsereCursoDTO;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.exceptions.RegraNegocioException;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Curso;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Professor;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.repositories.CursoRepository;
import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.repositories.ProfessorRepository;

@Service
public class CursoServiceImpl implements CursoService {
	private CursoRepository cursoRepository;
	private ProfessorRepository ProfessorRepository;

	public CursoServiceImpl(CursoRepository cursoRepository,
			ProfessorRepository ProfessorRepository) {
		this.cursoRepository = cursoRepository;
		this.ProfessorRepository = ProfessorRepository;
	}

	@Override
	public Curso inserir(InsereCursoDTO curso) {
		Professor prof = ProfessorRepository
				.findById(curso.getProfessorId())
				.orElseThrow(() -> new RegraNegocioException("Categoria não encontrada"));
		Curso cursoObj = new Curso();
		cursoObj.setNome(curso.getNome());
		cursoObj.setCargaHoraria(curso.getCargaHoraria());
		cursoObj.setProfessor(prof);
		return cursoRepository.save(curso);
	}

	@Override
	public List<CursoDTO> listarTodos() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
	}

	@Override
	public CursoDTO buscarPorId(Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
	}
}