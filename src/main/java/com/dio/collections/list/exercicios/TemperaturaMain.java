package com.dio.collections.list.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TemperaturaMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        System.out.println("Digite a temperatura dos primeiros 6 meses: ");
        Double media = 0d;
        for(int i = 1; i <= 6; i ++){
            Double valor = sc.nextDouble();
            media += valor;
            temperaturas.add(valor);
        }
        media = media /6;
        List<String> meses = new ArrayList<>();
        int count = 1;
        List<Double> temperaturaAcimaMedia = new ArrayList<>();
        for (Double temperatura : temperaturas) {
            if(temperatura > media){
                temperaturaAcimaMedia.add(temperatura);
                switch (count) {
                    case 1:
                    meses.add("1 - Janeiro");
                    break;
                    case 2:
                    meses.add("2 - Fevereiro");
                    break;
                    case 3:
                    meses.add("3 - Março");
                    break;
                    case 4:
                    meses.add("4 - Abril");
                    break;
                    case 5:
                    meses.add("5 - Maio");
                    break;
                    case 6:
                    meses.add("6 - Junho");
                    break;
                }
            }
            count ++;
        }
        System.out.println("Temperaturas acima da média: " + temperaturaAcimaMedia);
        System.out.println("Meses: ");
        for (String mes : meses) {
            System.out.println(mes);
        }
        sc.close();
    }
}
