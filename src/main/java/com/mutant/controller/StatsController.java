package com.mutant.controller;

import com.mutant.dto.StatDto;
import com.mutant.services.StatMutantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {

    private final StatMutantService statMutantService;

    StatsController(StatMutantService statMutantService) {
        this.statMutantService = statMutantService;
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<StatDto> stats() {
        return ResponseEntity.ok().body(statMutantService.stat());
    }
}
