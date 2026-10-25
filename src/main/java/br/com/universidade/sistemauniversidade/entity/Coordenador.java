package br.com.universidade.sistemauniversidade.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coordenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;
    private String email;
    private LocalDate dataNascimento;

    @OneToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

}
