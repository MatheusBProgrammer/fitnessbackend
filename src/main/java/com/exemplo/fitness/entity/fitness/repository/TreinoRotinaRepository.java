package com.exemplo.fitness.entity.fitness.repository;

import com.exemplo.fitness.entity.fitness.entity.TreinoRotina;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TreinoRotinaRepository extends MongoRepository<TreinoRotina, String> {
    List<TreinoRotina> findByTreinoId(String treinoId);
}