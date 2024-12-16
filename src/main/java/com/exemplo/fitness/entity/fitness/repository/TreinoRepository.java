package com.exemplo.fitness.entity.fitness.repository;

import com.exemplo.fitness.entity.fitness.entity.Treino;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TreinoRepository extends MongoRepository<Treino, String> {
    List<Treino> findByPersonalId(String personalId);
    List<Treino> findByAlunoId(String alunoId);
}