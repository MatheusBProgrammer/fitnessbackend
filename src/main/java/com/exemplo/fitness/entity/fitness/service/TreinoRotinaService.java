package com.exemplo.fitness.entity.fitness.service;


import com.exemplo.fitness.entity.fitness.entity.TreinoRotina;
import com.exemplo.fitness.entity.fitness.exception.ResourceNotFoundException;
import com.exemplo.fitness.entity.fitness.repository.TreinoRotinaRepository;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;
import java.util.List;

@Service
public class TreinoRotinaService {
    private final TreinoRotinaRepository repository;

    public TreinoRotinaService(TreinoRotinaRepository repository) {
        this.repository = repository;
    }

    public List<TreinoRotina> listarTodos() {
        return repository.findAll();
    }

    public TreinoRotina buscarPorId(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("TreinoRotina não encontrado"));
    }

    public TreinoRotina salvar(TreinoRotina rotina) {
        return repository.save(rotina);
    }

    public TreinoRotina atualizar(String id, TreinoRotina rotinaAtualizada) {
        TreinoRotina r = buscarPorId(id);
        r.setTreinoId(rotinaAtualizada.getTreinoId());
        r.setExercicioId(rotinaAtualizada.getExercicioId());
        r.setRepeticoes(rotinaAtualizada.getRepeticoes());
        r.setSeries(rotinaAtualizada.getSeries());
        r.setCarga(rotinaAtualizada.getCarga());
        r.setDescanso(rotinaAtualizada.getDescanso());
        r.setOrdem(rotinaAtualizada.getOrdem());
        return repository.save(r);
    }

    public void deletar(String id) {
        TreinoRotina r = buscarPorId(id);
        repository.delete(r);
    }
}