package com.exemplo.fitness.entity.fitness.service;



import com.exemplo.fitness.entity.fitness.entity.Treino;
import com.exemplo.fitness.entity.fitness.exception.ResourceNotFoundException;
import com.exemplo.fitness.entity.fitness.repository.TreinoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinoService {
    private final TreinoRepository repository;

    public TreinoService(TreinoRepository repository) {
        this.repository = repository;
    }

    public List<Treino> listarTodos() {
        return repository.findAll();
    }

    public Treino buscarPorId(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Treino não encontrado"));
    }

    public Treino salvar(Treino treino) {
        return repository.save(treino);
    }

    public Treino atualizar(String id, Treino treinoAtualizado) {
        Treino t = buscarPorId(id);
        // Ajustar campos conforme necessidade
        t.setPersonalId(treinoAtualizado.getPersonalId());
        t.setAlunoId(treinoAtualizado.getAlunoId());
        t.setRotinasIds(treinoAtualizado.getRotinasIds());
        return repository.save(t);
    }

    public void deletar(String id) {
        Treino t = buscarPorId(id);
        repository.delete(t);
    }
}