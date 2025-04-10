package com.Matrix;

public class MatrixBuilder {

    // Monta a matriz 5x6 a partir da string (por linhas)
    public static char[][] buildMatrix(String myCode) {
        char[][] matrix = new char[5][6];
        int index = 0;

        for (int i = 0; i < 5; i++) {          
            for (int j = 0; j < 6; j++) {      
                if (index < myCode.length()) {
                    matrix[i][j] = myCode.charAt(index++);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        return matrix;
    }

    // Desfaz a matriz criptografada (por colunas)
    public static String desBuildMatrix(char[][] matrix) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 5; i++) {         
            for (int j = 0; j < 6; j++) {     
                result.append(matrix[i][j]);
            }
        }

        return result.toString();
    }

    // Criptografa lendo por colunas
    public static String criptografar(char[][] matrix) {
        StringBuilder result = new StringBuilder();

        for (int j = 0; j < 6; j++) {         
            for (int i = 0; i < 5; i++) {     
                result.append(matrix[i][j]);
            }
        }

        return result.toString();
    }

    // Descriptografa uma string que foi criptografada por colunas
    public static char[][] descriptografar(String criptografado) {
        char[][] matrix = new char[5][6];
        int index = 0;

        for (int j = 0; j < 6; j++) {         
            for (int i = 0; i < 5; i++) {     
                if (index < criptografado.length()) {
                    matrix[i][j] = criptografado.charAt(index++);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        return matrix;
    }
}
