package com.mutant.persistence.repository;

import com.mutant.persistence.MutantEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MutantRepository extends MongoRepository<MutantEntity, String> {
    Long countByIsMutant(boolean b);
}
