package com.example;

import java.util.Scanner;
import com.Matrix.MatrixBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para preencher a matriz: ");
        String input = scanner.nextLine(); // lê uma linha do terminal

        // Construir a matriz com o texto original
        char[][] result = MatrixBuilder.buildMatrix(input);

        System.out.println("\nMatriz construída:");
        for (char[] row : result) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        // Criptografar (lendo por colunas)
        String mensagemCriptografada = MatrixBuilder.criptografar(result);
        System.out.println("\nMensagem criptografada: " + mensagemCriptografada);

        // Descriptografar (converter string criptografada de volta à matriz)
        char[][] resultReverse = MatrixBuilder.descriptografar(mensagemCriptografada);

        System.out.println("\nMatriz descriptografada:");
        for (char[] row : resultReverse) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        // Reconstruir a string original da matriz (linha por linha)
        String mensagemOriginal = MatrixBuilder.desBuildMatrix(resultReverse);
        System.out.println("\nMensagem original recuperada: " + mensagemOriginal);

        scanner.close(); // fecha o scanner
    }
}
