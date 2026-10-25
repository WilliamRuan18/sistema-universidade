package br.com.universidade.sistemauniversidade.repository;

import br.com.universidade.sistemauniversidade.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
