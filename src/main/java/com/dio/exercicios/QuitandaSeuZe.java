package com.dio.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class QuitandaSeuZe {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer morangos = sc.nextInt();
        Integer macas = sc.nextInt();
        Double precoMorangos = Double.valueOf(0);
        Double precoMacas = Double.valueOf(0);
        Double precoTotal = Double.valueOf(0);
        if (morangos > 5) {
            precoMorangos = 2.20;
        } else {
            precoMorangos = 2.50;
        }
        if (macas > 5) {
            precoMacas = 1.50;
        } else {
            precoMacas = 1.80;
        }
        if ((morangos + macas) > 8 || (morangos * precoMorangos) + (macas * precoMacas) > 25) {
            precoTotal = ((morangos * precoMorangos) + (macas * precoMacas));
            precoTotal -= precoTotal * 0.10;
        } else {
            precoTotal = (morangos * precoMorangos) + (macas * precoMacas);
        }
        String refatoracaoPrecoTotal = precoTotal.toString();
        if(refatoracaoPrecoTotal.length() == 4 || refatoracaoPrecoTotal.length() == 3){
            System.out.println(String.format("%.1f", Double.parseDouble(refatoracaoPrecoTotal)));
        }else{
            System.out.println(String.format("%.2f", Double.parseDouble(refatoracaoPrecoTotal)));
        }
        
        sc.close();
    }
}
