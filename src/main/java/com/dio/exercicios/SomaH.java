package com.dio.exercicios;

import java.util.Scanner;

public class SomaH {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
   
        for (int i = 1; i <= n; i++) {
           h += 1.0 / i;
         }
        System.out.println(String.format("%.0f",h));
        sc.close();
      }
}
