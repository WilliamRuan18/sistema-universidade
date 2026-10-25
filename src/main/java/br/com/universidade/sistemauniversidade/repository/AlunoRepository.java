package br.com.universidade.sistemauniversidade.repository;

import br.com.universidade.sistemauniversidade.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
