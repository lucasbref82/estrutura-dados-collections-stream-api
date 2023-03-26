package com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Formas de Instanciar uma lista
        // ArrayList<Double> notas = new ArrayList<>();
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d));
        // List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d); Não pode adicionar ou remover dados.
        // List<Double> notas = List.of(7d, 8.5, 9.3, 5d); Não pode adicionar ou remover dados (Lista imutável).
        List<Double> notas = new ArrayList<>();
        notas.add(0d);
        notas.add(3d);
        notas.add(4d);
        notas.add(5.5);
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        System.out.println(notas);
        // Buscando posição de um Objeto
        System.out.println("Posição da nota 5: "  + notas.indexOf(5d));
        notas.add(3, 8d);
        System.out.println(notas);
        // Substituindo elemento na posição desejada
        notas.set(4, 6d);
        System.out.println(notas);
        // Verificando se um objeto existe na lista
        boolean contains = notas.contains(5d);
        System.out.println(contains);
        // Exibindo todas notas da maneira que foram informadas
        // for (Double nota : notas) {
        //     System.out.println(nota);
        // }
        // Exibindo a terceira nota adicionada
        Double notaSelecionada = notas.get(3);
        System.out.println(notaSelecionada);
        // Exibindo menor nota (O tipo da nossa lista deve implementar comparable)
        System.out.println("Menor nota: " + Collections.min(notas));
        // Exibindo maior nota (O tipo da nossa lista deve implementar comparable)
        System.out.println("Maior nota: " + Collections.max(notas));
        // Soma com iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double proximo = iterator.next();
            soma += proximo;
        }
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + soma / notas.size());
        System.out.println("Removendo a nota 0: ");
        notas.remove(0d);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double proximoElemento = iterator1.next();
            if(proximoElemento < 7) iterator1.remove();
        }
        System.out.println("Notas menores que 7: " + notas);

        // Limpando lista e verificando se está vazia
        notas.clear();
        boolean isEmpty = notas.isEmpty();
        System.out.println(isEmpty);
    }
}
