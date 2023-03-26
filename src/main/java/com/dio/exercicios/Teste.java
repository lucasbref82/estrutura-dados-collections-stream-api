package com.dio.exercicios;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Teste{
	
	public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
        double soma;
		boolean triangulo = false;
        if (A < B + C && B < A + C && C < A + B){
            triangulo = true;
        }
        if(triangulo){
            soma = A + B + C;
            System.out.printf("Perimetro = %.1f", soma);
        }else {
            soma = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f", soma);
        }
        leitor.close();
	}
	
}
