package com.mutant.services;

import java.util.List;

public class MutantValidate {

	boolean validateDNA(List<String> dna) {
		int m, n ,M ,N = 0;
		M = dna.size();
		N = dna.get(0).length();

		int countMutant = 0;
		char[][] matrix = createMatrix(dna);

		// hasta aqui llenado
		for (m = 0; m < M; m++) {
			n = 0;
			for (n = 0; n < N; n++) {
				// verifico si hay tres objectos mas en la Columna
				if (n + 3 < N) {
					if ((matrix[m][n] == matrix[m][n + 1]) && (matrix[m][n + 1] == matrix[m][n + 2])
							&& (matrix[m][n + 2] == matrix[m][n + 3]))
						countMutant++;
				}
				if (countMutant >=2) return Boolean.TRUE;
				// verifico si hay tres objectos mas en la Fila
				if (m + 3 < M) {
					if ((matrix[m][n] == matrix[m + 1][n]) && (matrix[m + 1][n] == matrix[m + 2][n])
							&& (matrix[m + 2][n] == matrix[m + 3][n]))
						countMutant++;
				}
				if (countMutant >=2) return Boolean.TRUE;
				// verifico si hay tres objectos mas en la Diagonal
				if (m + 3 < M && n + 3 < N) {
					if ((matrix[m][n] == matrix[m + 1][n + 1]) && (matrix[m + 1][n + 1] == matrix[m + 2][n + 2])
							&& (matrix[m + 2][n + 2] == matrix[m + 3][n + 3]))
						countMutant++;
				}
				if (countMutant >=2) return Boolean.TRUE;
			}
		}
			return Boolean.FALSE;
	}

	private char[][] createMatrix(List<String> dnas) {
		int M = dnas.size();
		int N = dnas.get(0).length();
		int m = 0, n = 0;
		char[][] _matrix = new char[M][N];
		for (String _dna : dnas) {
			for (char ch : _dna.toCharArray()) {
				_matrix[m][n] = ch;
				n++;
			}
			n = 0;
			m++;
		}
		return _matrix;
	}
}
