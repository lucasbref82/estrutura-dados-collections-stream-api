package com.dio.exercicios;

import java.util.Scanner;

public class ContaEspacosVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strSplit = str.split(" ");
        int espacosEmBranco = strSplit.length - 1;
        int quantVogais = 0;
        for (String item : strSplit) {
            String lower = item.toLowerCase();
            for(int i = 0; i < lower.length(); i++){
                char c = lower.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    quantVogais++;
                    continue;
                }
            }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
        scanner.close();
    }
}
