package com.dio.exercicios;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 0;
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i <= N - 1; i++) {
            if (i < 2) {

                System.out.print(i + " ");

            } else {
                n1 = n1 + n2;
                n2 = n1 - n2;
                System.out.print(n1 + " ");
            }
        }
        leitor.close();
    }
}
