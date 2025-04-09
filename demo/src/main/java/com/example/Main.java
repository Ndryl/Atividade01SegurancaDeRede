package com.example;

import java.util.Scanner;
import com.Matrix.MatrixBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para preencher a matriz: ");
        String input = scanner.nextLine(); // lê uma linha do terminal

        char[][] result = MatrixBuilder.buildMatrix(input);

        for (char[] row : result) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
    }
    String mensgemCriptografada = MatrixBuilder.CriptoAnalise(result);
    System.err.println(mensgemCriptografada);
        scanner.close(); // fecha o scanner
    }
}
