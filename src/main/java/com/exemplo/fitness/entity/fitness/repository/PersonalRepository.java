package com.exemplo.fitness.entity.fitness.repository;

import com.exemplo.fitness.entity.fitness.entity.Personal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonalRepository extends MongoRepository<Personal,String> {

}
