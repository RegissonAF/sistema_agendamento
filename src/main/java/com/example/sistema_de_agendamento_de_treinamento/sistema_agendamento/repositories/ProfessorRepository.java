
package com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.sistema_de_agendamento_de_treinamento.sistema_agendamento.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    @Query("select cc from Professor cc left join fetch cc.Cursos c where cc.id = :id ")
        Professor findProfessorFetchCursos(@Param("id") Long id);
    
    Professor findById(long id);
}
