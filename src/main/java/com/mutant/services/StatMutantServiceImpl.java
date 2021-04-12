package com.mutant.services;

import com.mutant.dto.StatDto;
import com.mutant.persistence.repository.MutantRepository;
import org.springframework.stereotype.Service;

@Service
public class StatMutantServiceImpl implements StatMutantService {

    private final MutantRepository mutantRepository;

    public StatMutantServiceImpl(MutantRepository mutantRepository) {
        this.mutantRepository = mutantRepository;
    }

    public StatDto stat() {
        Long isMutant = mutantRepository.countByIsMutant(true);
        Long isNotMutant = mutantRepository.countByIsMutant(false);


        return StatDto.builder().count_mutant_dna(isMutant)
                .count_human_dna(isNotMutant)
                .ratio(isNotMutant != 0 ? isMutant / isNotMutant : 0).build();
    }
}
