package com.mutant.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mutant.dto.MutantDto;
import com.mutant.services.MutantService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MutantController.class)
class MutantControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private MutantService mutantService;


    ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    void isMutant() throws Exception {
        MutantDto domain = new MutantDto();
        domain.dna = Arrays.asList("ATGCGA", "CTGTGC", "TTATGT", "AGAAGG", "CCGCTA", "TCACTG");

        when(mutantService.isMutant(domain)).thenReturn(Boolean.FALSE);


        mvc.perform(post("/mutant")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(domain)))
                .andExpect(status().isForbidden());
    }


    @Test
    void isNoMutant() throws Exception {
        MutantDto domain = new MutantDto();
        domain.dna = Arrays.asList("GTGCGA", "CTGTGC", "TTATGT", "AGCAGG", "CTGCTA", "TCACTG");

        when(mutantService.isMutant(domain)).thenReturn(Boolean.TRUE);


        mvc.perform(post("/mutant")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(domain)))
                .andExpect(status().isOk());
    }
}