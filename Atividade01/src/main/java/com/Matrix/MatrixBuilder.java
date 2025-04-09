package com.Matrix;

public class MatrixBuilder {

    public static char[][] buildMatrix(String myCode) {
        char[][] matrix = new char[5][6]; // 5 linhas e 6 colunas
        int index = 0;

        for (int i = 0; i < 5; i++) {          // linhas
            for (int j = 0; j < 6; j++) {      // colunas
                if (index < myCode.length()) {
                    matrix[i][j] = myCode.charAt(index);
                    index++;
                } else {
                    matrix[i][j] = ' '; // preenche com espaço em branco se sobrar espaço
                }
            }
        }

        return matrix;
    }

    public static String CriptoAnalise(char[][] MyCodCripto) {
        StringBuilder result = new StringBuilder();
    
        // varre coluna por coluna
        for (int j = 0; j < 6; j++) {         // 6 colunas
            for (int i = 0; i < 5; i++) {     // 5 linhas
                result.append(MyCodCripto[i][j]);
            }
        }
    
        return result.toString();
    }
    
}
