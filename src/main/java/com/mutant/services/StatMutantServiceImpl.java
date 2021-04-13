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


        return StatDto.builder().countMutantDna(isMutant)
                .countHumanDna(isNotMutant)
                .ratio(isNotMutant != 0 ? (float)isMutant / (float)isNotMutant : 0.0f).build();
    }
}
