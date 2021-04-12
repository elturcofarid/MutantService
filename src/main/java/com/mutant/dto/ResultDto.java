package com.mutant.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ResultDto {

        @Id
        public int id;

        public String dna;

        public long total;


}
