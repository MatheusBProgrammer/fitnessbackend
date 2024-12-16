package com.exemplo.fitness.entity.fitness.service;

import com.exemplo.fitness.entity.fitness.entity.Personal;
import com.exemplo.fitness.entity.fitness.exception.ResourceNotFoundException;
import com.exemplo.fitness.entity.fitness.repository.PersonalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalService {

    private final PersonalRepository repository;

    public PersonalService(PersonalRepository repository) {
        this.repository = repository;
    }

    public List<Personal> listarTodos() {
        return repository.findAll();
    }

    public Personal buscarPorId(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Personal não encontrado"));
    }

    public Personal salvar(Personal personal) {
        return repository.save(personal);
    }

    public Personal atualizar(String id, Personal personalAtualizado) {
        Personal p = buscarPorId(id);
        p.setNome(personalAtualizado.getNome());
        p.setHashPassword(personalAtualizado.getHashPassword());
        p.setFotoUrl(personalAtualizado.getFotoUrl());
        return repository.save(p);
    }

    public void deletar(String id) {
        Personal p = buscarPorId(id);
        repository.delete(p);
    }
}