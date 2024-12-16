package com.exemplo.fitness.entity.fitness.service;


import com.exemplo.fitness.entity.fitness.entity.Aluno;
import com.exemplo.fitness.entity.fitness.exception.ResourceNotFoundException;
import com.exemplo.fitness.entity.fitness.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    public Aluno buscarPorId(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Aluno não encontrado"));
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public Aluno atualizar(String id, Aluno alunoAtualizado) {
        Aluno a = buscarPorId(id);
        a.setNome(alunoAtualizado.getNome());
        a.setDataInicio(alunoAtualizado.getDataInicio());
        a.setDados(alunoAtualizado.getDados());
        return repository.save(a);
    }

    public void deletar(String id) {
        Aluno a = buscarPorId(id);
        repository.delete(a);
    }
}
