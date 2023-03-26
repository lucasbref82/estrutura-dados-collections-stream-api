package com.dio.exercicios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class PositivoMedia {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x = 0;
        Math.round(media);
        for (int i = 0; i < 6; i++) {
            double valorDigitado = leitor.nextDouble();
            if (valorDigitado > 0) {
                cont += 1;
                x += valorDigitado;
            }
            
        }

        media = x / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
        leitor.close();
    }
}
