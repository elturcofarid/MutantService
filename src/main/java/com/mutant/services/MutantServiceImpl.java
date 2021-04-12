package com.mutant.services;

import com.mutant.dto.MutantDto;
import com.mutant.persistence.MutantEntity;
import com.mutant.persistence.repository.MutantRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MutantServiceImpl extends MutantValidate implements MutantService {

    private final MutantRepository mutantRepository;

    public MutantServiceImpl(MutantRepository mutantRepository) {
        this.mutantRepository = mutantRepository;
    }

    public boolean isMutant(MutantDto input) {

        Optional<MutantEntity> mutantEntityOptional = mutantRepository.findById(input.dna.stream().collect(Collectors.joining()));
        if (mutantEntityOptional.isPresent()) {
            return mutantEntityOptional.get().isMutant;
        }

        return this.validateDNA(input.dna);
    }

}
