package com.mutant;

import com.mutant.dto.MutantDto;
import com.mutant.services.MutantServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MutantServiceTest {

    @Autowired
    MutantServiceImpl mutantService;

    @Test
    void validateDNANoMutant() {
        MutantDto domain = new MutantDto();
        domain.dna = Arrays.asList("ATGCGA", "CTGTGC", "TTATGT", "AGAAGG", "CCGCTA", "TCACTG");

        assertEquals(Boolean.FALSE, mutantService.isMutant(domain));
    }

    @Test
    void validateDNAMutant() {
        MutantDto domain = new MutantDto();
        domain.dna = Arrays.asList("ATGCGA", "CTGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG");

        assertEquals(Boolean.TRUE, mutantService.isMutant(domain));
    }
}
