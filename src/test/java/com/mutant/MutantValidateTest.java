package com.mutant;

import com.mutant.services.MutantValidate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MutantValidateTest {

    private final MutantValidate mutantValidate = new MutantValidate();


    @Test
    void validateDNA() {
        String[] dna = {"ATGCGA", "CTGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
        assertEquals(Boolean.TRUE, mutantValidate.validateDNA(Arrays.asList(dna)));
    }

    @Test
    void validateDnaIsHuman() {
        String[] dna = {"GTGCGA", "CTGTGC", "TTATGT", "AGACGG", "CCTCTA", "TCACTG"};
        assertEquals(Boolean.FALSE, mutantValidate.validateDNA(Arrays.asList(dna)));
    }
}
