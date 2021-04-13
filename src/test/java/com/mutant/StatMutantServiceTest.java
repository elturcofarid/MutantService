package com.mutant;

import com.mutant.persistence.repository.MutantRepository;
import com.mutant.services.StatMutantServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StatMutantServiceTest {


    @Mock
     private MutantRepository mutantRepository;


    @InjectMocks
    StatMutantServiceImpl statMutantService;


    @Test
    void validateStat() {

        assertNotNull(statMutantService.stat());
    }


}
