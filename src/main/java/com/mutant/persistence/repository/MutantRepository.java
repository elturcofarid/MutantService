package com.mutant.persistence.repository;

import com.mutant.persistence.MutantEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MutantRepository extends MongoRepository<MutantEntity, String> {
    Long countByIsMutant(boolean b);
}
