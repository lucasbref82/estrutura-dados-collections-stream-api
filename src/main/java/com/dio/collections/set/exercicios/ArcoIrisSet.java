package com.dio.collections.set.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIrisSet {
    public static void main(String[] args) {

        Set<String> cores = new HashSet<>(
                Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        System.out.println("Exiba todas as cores uma abaixo da outra: ");
        for (String string : cores) {
            System.out.println(string);
        }
        System.out.println("Quantidade de cores no arco-íris: " + cores.size());
        Set<String> cores2 = new TreeSet<>();
        cores2.addAll(cores);
        System.out.println("Cores em ordem alfabética: ");
        for (String string : cores2) {
            System.out.println(string);
        }
        System.out.println("Exiba todas as cores na ordem inversa: ");
        Set<String> coresRevertidas = new LinkedHashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        List<String> coresInvertidas = new ArrayList<>(coresRevertidas);
        Collections.reverse(coresInvertidas);
        for (String string : coresInvertidas) {
            System.out.println(string);
        }
        System.out.println("Exiba todas as cores que comçam com a letra v: ");
        Iterator<String> iterator = cores.iterator();
        while(iterator.hasNext()){
            String string = iterator.next();
            if(string.charAt(0) == 'v'){
                System.out.println(string);
            }
        }
        System.out.println("Remova todas as cores que não começam com a letra v: ");
        Iterator<String> iterator2 = cores.iterator();
        while(iterator2.hasNext()){
            String cor = iterator2.next();
            if(cor.charAt(0) == 'v'){
                iterator2.remove();
            }
        }
        System.out.println(cores);
        cores.clear();
        System.out.println("O conjunto está vázio? " + cores.isEmpty());
    }

}
