package br.com.universidade.sistemauniversidade.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "professor_titular_id")
    private Professor professorTitular;

    @ManyToOne
    @JoinColumn(name = "professor_substituto_id")
    private Professor professorSubstituto;

    @ManyToMany
    @JoinTable(
            name = "disciplina_aluno",
            joinColumns = @JoinColumn(name = "disciplina_id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    private List<Aluno> alunos;
}
