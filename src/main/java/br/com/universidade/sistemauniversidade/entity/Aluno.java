package br.com.universidade.sistemauniversidade.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;
    private String email;
    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
    private String endereco;

}
