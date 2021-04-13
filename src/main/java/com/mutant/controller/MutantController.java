package com.mutant.controller;

import com.mutant.dto.MutantDto;
import com.mutant.exception.RestException;
import com.mutant.services.MutantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutantController {

    private MutantService service;

    public MutantController(MutantService service) {
        this.service = service;
    }


    @PostMapping(path = "/mutant", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> isMutant(@RequestBody MutantDto input) {

        if (!input.dna.stream().allMatch(s -> s.matches("[(ACGT)+]{6}"))) {
            throw new RestException(HttpStatus.BAD_REQUEST, "Input format violation");
        }

        if (service.isMutant(input)) {
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

}
