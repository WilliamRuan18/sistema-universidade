package br.com.universidade.sistemauniversidade.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

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

    @Size(min = 3, max = 100)
    @NotBlank
    private String nome;

    @NotBlank
    private String sobrenome;

    @NotBlank
    @Email
    private String email;

    @NotNull
    @Past
    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    @NotNull
    private Curso curso;

    @NotBlank
    private String endereco;

}
