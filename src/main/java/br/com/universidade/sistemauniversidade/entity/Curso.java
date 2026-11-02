package br.com.universidade.sistemauniversidade.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;
    private String descricao;

    @JsonIgnore
    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos;

    @OneToOne(mappedBy = "curso")
    private Coordenador coordenador;

    @OneToMany(mappedBy = "curso")
    private List<Disciplina> disciplinas;

}
