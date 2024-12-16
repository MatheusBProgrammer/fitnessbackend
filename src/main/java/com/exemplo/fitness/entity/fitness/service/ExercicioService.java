package com.exemplo.fitness.entity.fitness.service;


import com.exemplo.fitness.entity.fitness.entity.Exercicio;
import com.exemplo.fitness.entity.fitness.exception.ResourceNotFoundException;
import com.exemplo.fitness.entity.fitness.repository.ExercicioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercicioService {
    private final ExercicioRepository repository;

    public ExercicioService(ExercicioRepository repository) {
        this.repository = repository;
    }

    public List<Exercicio> listarTodos() {
        return repository.findAll();
    }

    public Exercicio buscarPorId(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Exercício não encontrado"));
    }

    public Exercicio salvar(Exercicio exercicio) {
        return repository.save(exercicio);
    }

    public Exercicio atualizar(String id, Exercicio exercicioAtualizado) {
        Exercicio e = buscarPorId(id);
        e.setNome(exercicioAtualizado.getNome());
        e.setCategoria(exercicioAtualizado.getCategoria());
        e.setDescricao(exercicioAtualizado.getDescricao());
        e.setLinkYoutube(exercicioAtualizado.getLinkYoutube());
        return repository.save(e);
    }

    public void deletar(String id) {
        Exercicio e = buscarPorId(id);
        repository.delete(e);
    }
}
