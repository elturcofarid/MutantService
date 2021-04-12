package com.mutant.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatDto {

    private long countMutantDna;

    private long countHumanDna;

    private float ratio;
}
