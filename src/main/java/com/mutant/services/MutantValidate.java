package com.mutant.services;

import java.util.List;

public class MutantValidate {

	public boolean validateDNA(List<String> dna) {
		int row =0;
		int column  = 0;
		int lengthMatrix = dna.size();

		int countMutant = 0;
		char[][] matrix = createMatrix(dna);

		for (row = 0; row < lengthMatrix; row++) {
			for (column = 0; column < lengthMatrix; column++) {

					if ((column + 3 < lengthMatrix) && ((matrix[row][column] == matrix[row][column + 1]) && (matrix[row][column + 1] == matrix[row][column + 2])
							&& (matrix[row][column + 2] == matrix[row][column + 3])))
						countMutant++;

				if (countMutant < 2) {// verifico si hay tres objectos mas en la Fila

					if ((row + 3 < lengthMatrix) && ((matrix[row][column] == matrix[row + 1][column]) && (matrix[row + 1][column] == matrix[row + 2][column])
							&& (matrix[row + 2][column] == matrix[row + 3][column])))
						countMutant++;

					if (countMutant < 2) {// verifico si hay tres objectos mas en la Diagonal

						if ((row + 3 < lengthMatrix && column + 3 < lengthMatrix) && ((matrix[row][column] == matrix[row + 1][column + 1]) && (matrix[row + 1][column + 1] == matrix[row + 2][column + 2])
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
		int lengthMatrix = dnas.size();
		int row = 0;
		int column = 0;
		char[][] matrix = new char[lengthMatrix][lengthMatrix];
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
