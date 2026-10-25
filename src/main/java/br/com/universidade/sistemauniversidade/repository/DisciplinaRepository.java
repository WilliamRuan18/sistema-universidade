package br.com.universidade.sistemauniversidade.repository;

import br.com.universidade.sistemauniversidade.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
