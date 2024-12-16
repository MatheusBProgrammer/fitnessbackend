package com.exemplo.fitness.entity.fitness.repository;

import com.exemplo.fitness.entity.fitness.entity.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlunoRepository extends MongoRepository<Aluno, String> {
}
