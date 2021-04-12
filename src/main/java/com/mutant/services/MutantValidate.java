package com.mutant.services;

import java.util.List;

public class MutantValidate {

	public boolean validateDNA(List<String> dna) {
		int row =0;
		int column  = 0;
		int lengthH = dna.size();
		int lengthV = dna.get(0).length();

		int countMutant = 0;
		char[][] matrix = createMatrix(dna);

		// hasta aqui llenado
		for (row = 0; row < lengthH; row++) {
			for (column = 0; column < lengthV; column++) {
				// verifico si hay tres objectos mas en la Columna

					if ((column + 3 < lengthV) && ((matrix[row][column] == matrix[row][column + 1]) && (matrix[row][column + 1] == matrix[row][column + 2])
							&& (matrix[row][column + 2] == matrix[row][column + 3])))
						countMutant++;

				if (countMutant < 2) {// verifico si hay tres objectos mas en la Fila

					if ((row + 3 < lengthH) && ((matrix[row][column] == matrix[row + 1][column]) && (matrix[row + 1][column] == matrix[row + 2][column])
							&& (matrix[row + 2][column] == matrix[row + 3][column])))
						countMutant++;

					if (countMutant < 2) {// verifico si hay tres objectos mas en la Diagonal

						if ((row + 3 < lengthH && column + 3 < lengthV) && ((matrix[row][column] == matrix[row + 1][column + 1]) && (matrix[row + 1][column + 1] == matrix[row + 2][column + 2])
								&& (matrix[row + 2][column + 2] == matrix[row + 3][column + 3])))
							countMutant++;

						if (countMutant < 2) {
							continue;
						}
						return Boolean.TRUE;
					} else {
						return Boolean.TRUE;
					}
				} else {
					return Boolean.TRUE;
				}
			}
		}
			return Boolean.FALSE;
	}

	private char[][] createMatrix(List<String> dnas) {
		int lengthH = dnas.size();
		int lengthV = dnas.get(0).length();
		int row = 0;
		int column = 0;
		char[][] matrix = new char[lengthH][lengthV];
		for (String _dna : dnas) {
			for (char ch : _dna.toCharArray()) {
				matrix[row][column] = ch;
				column++;
			}
			column = 0;
			row++;
		}
		return matrix;
	}
}
