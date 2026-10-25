package br.com.universidade.sistemauniversidade.repository;

import br.com.universidade.sistemauniversidade.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
