package com.dio.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class TaxaImposto {

    private static Double IMPOSTO_8_POR_CENTO = 0.08;
    private static Double IMPOSTO_18_POR_CENTO = 0.18;
    private static Double IMPOSTO_28_POR_CENTO = 0.28;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double renda = sc.nextDouble();
        Double imposto = 0d;
        if(renda <= 2000.00){
            System.out.println("Isento");
        }else{
            imposto = calculaImposto(renda);
            System.out.println(String.format("R$ %.2f", imposto));
        }
        sc.close();
        
    }

    public static Double calculaImposto(Double renda){
        if(renda > 2000.00 && renda <= 3000.00){
            renda = (renda - 2000.00) * IMPOSTO_8_POR_CENTO;
        }else if(renda > 3000.00 && renda <= 4500.00){
            renda = (renda - 3000) * IMPOSTO_18_POR_CENTO + 1000 * IMPOSTO_8_POR_CENTO;
        }else if(renda > 4500.00){
            renda = (renda - 4500) * IMPOSTO_28_POR_CENTO + 1500.00 * IMPOSTO_18_POR_CENTO + 1000.00 * IMPOSTO_8_POR_CENTO;
        }
        return renda;
    }
}
