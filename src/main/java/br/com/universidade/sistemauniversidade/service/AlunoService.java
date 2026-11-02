package br.com.universidade.sistemauniversidade.service;

import br.com.universidade.sistemauniversidade.entity.Aluno;
import br.com.universidade.sistemauniversidade.exception.AlunoNaoEncontradoException;
import br.com.universidade.sistemauniversidade.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno atualizarAluno(Long id, Aluno alunoAtualizado) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new AlunoNaoEncontradoException("Aluno não encontrado"));

        aluno.setNome(alunoAtualizado.getNome());
        aluno.setSobrenome(alunoAtualizado.getSobrenome());
        aluno.setEmail(alunoAtualizado.getEmail());
        aluno.setDataNascimento(alunoAtualizado.getDataNascimento());
        aluno.setCurso(alunoAtualizado.getCurso());
        aluno.setEndereco(alunoAtualizado.getEndereco());

        return alunoRepository.save(aluno);
    }

    public Aluno buscarAlunoPorId(Long id) {
        return alunoRepository.findById(id).orElseThrow(() -> new AlunoNaoEncontradoException("Aluno não encontrado"));
    }

    public void deletarAluno(Long id) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new AlunoNaoEncontradoException("Aluno não encontrado"));
        alunoRepository.deleteById(aluno.getId());
    }
}
