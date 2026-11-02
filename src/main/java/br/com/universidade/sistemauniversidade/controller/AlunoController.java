package br.com.universidade.sistemauniversidade.controller;


import br.com.universidade.sistemauniversidade.entity.Aluno;
import br.com.universidade.sistemauniversidade.service.AlunoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService alunoService;

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarTodos();
    }

    @PostMapping
    public Aluno criarAluno(@Valid @RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long id, @Valid @RequestBody Aluno aluno) {
        return alunoService.atualizarAluno(id,aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscarAlunoPorId(@PathVariable Long id) {
        return alunoService.buscarAlunoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunoService.deletarAluno(id);
    }
}
