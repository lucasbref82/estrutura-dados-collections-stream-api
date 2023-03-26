package com.dio.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // **** Maneiras de instanciar um set ****

        // Set notas = new HashSet(); Antes do java 5
        // HashSet<Double> notas = new HashSet<>();
        // Set<Double> notas = new HashSet<>();
        // Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        System.out.println("Cria um conjunto e adione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        // System.out.println("Exiba a posição da nota 5: ");
        // System.out.println("Adione na lista a nota 8.0 na posição 4: ");
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        System.out.println("Menor nota do conjunto: " + Collections.min(notas));
        System.out.println("Maior nota do conjunto: " + Collections.max(notas));
        
        //Soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double valor = iterator.next();
            soma += valor;
        }
        System.out.println(String.format("Soma dos valores: %.2f", soma));
        System.out.println("Tamanho da estrutura: " + notas.size());
        notas.remove(0d);
        System.out.println("Removendo a nota 0: " + notas);
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double auxiliarDouble = iterator2.next();
            if(auxiliarDouble < 7) iterator2.remove();
        }
        System.out.println("Removendo notas menores que 7: " + notas);
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Notas em ordem crescente: " + notas3);
        notas.clear();
        System.out.println("Conjunto está vázio ? " + notas.isEmpty());
    }

}
