package com.mutant.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MutantEntity {

	@Id
	public String dna;

	public boolean isMutant;

}
