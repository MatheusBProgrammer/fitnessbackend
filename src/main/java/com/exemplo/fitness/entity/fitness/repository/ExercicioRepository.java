package com.exemplo.fitness.entity.fitness.repository;

import com.exemplo.fitness.entity.fitness.entity.Exercicio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExercicioRepository extends MongoRepository<Exercicio, String> {
}
