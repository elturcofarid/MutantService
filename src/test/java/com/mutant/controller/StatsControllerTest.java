package com.mutant.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mutant.dto.MutantDto;
import com.mutant.dto.StatDto;
import com.mutant.persistence.repository.MutantRepository;
import com.mutant.services.StatMutantService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StatsController.class)
class StatsControllerTest {

    @Autowired
    private MockMvc mvc;

    @Mock
    private MutantRepository mutantRepository;

    @MockBean
            private StatMutantService statMutantService;

    ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    void stats() throws Exception {
        MutantDto domain = new MutantDto();
        domain.dna = Arrays.asList("ATGCGA", "CTGTGC", "TTATGT", "AGAAGG", "CCGCTA", "TCACTG");

        //when(statMutantService.stat()).thenReturn(StatDto());


        mvc.perform(get("/stats")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


}