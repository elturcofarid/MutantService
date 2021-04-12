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

    public long count_mutant_dna;

    public long count_human_dna;

    public float ratio;
}
