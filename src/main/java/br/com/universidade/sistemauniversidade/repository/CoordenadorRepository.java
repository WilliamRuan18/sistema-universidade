package br.com.universidade.sistemauniversidade.repository;

import br.com.universidade.sistemauniversidade.entity.Coordenador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordenadorRepository extends JpaRepository<Coordenador, Long> {
}
