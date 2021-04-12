package com.mutant;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mutant.persistence.repository.MutantRepository;
import com.mutant.services.StatMutantService;
import com.mutant.services.StatMutantServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StatMutantServiceTest {


    @Mock
    MutantRepository mutantRepository;



    @InjectMocks
    StatMutantServiceImpl statMutantService;




    @Test
    void validateStat() {

        assertNotNull(statMutantService.stat());
    }


}
