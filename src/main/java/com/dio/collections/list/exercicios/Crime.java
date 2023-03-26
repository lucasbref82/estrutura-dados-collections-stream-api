package com.dio.collections.list.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>(Arrays.asList(
            "Telefonou para a vítima ?", 
            "Esteve no local do crime ?", 
            "Mora perto da vítima ?", 
            "Devia para a vítima ?", 
            "Já trabalhou com a vítima ?"));
        List<String> respostas = new ArrayList<>();
        for (String string : perguntas) {
            System.out.println(string);
            String resposta = sc.nextLine();
            respostas.add(resposta);
        }
        int count = 0;
        Iterator<String> iterator = respostas.iterator();
        while(iterator.hasNext()){
            String resposta = iterator.next();
            if(resposta.equalsIgnoreCase("sim")) count ++;
        }
        String situacaoJulgado = null;
        switch (count) {
            case 2:
            situacaoJulgado = "Suspeita";
            break;
            case 3:
            case 4:
            situacaoJulgado = "Cúmplice";
            break;
            case 5:
            situacaoJulgado = "Assassina";
            break;
            default:
            situacaoJulgado = "Inocente";
            break;
        }
        System.out.println(situacaoJulgado);
        sc.close();
    }
}
