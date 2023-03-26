package com.dio.collections.map.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class QuantidadeLancada {
    public static void main(String[] args) {
        int quantidadeDesejada = 100;
        Random random = new Random();
        List<Integer> resultados = new ArrayList<>();
        for(int i = 0; i < quantidadeDesejada; i++){
            // random.nextInt() parâmetro é passado para dizer a quantidade de numeros que quero randomizar.
            resultados.add(random.nextInt(6));
        }

        Map<Integer, Integer> mapaResultados = new HashMap<>();
        for (Integer integer : resultados) {
            if(mapaResultados.containsKey(integer)){
                // Caso já exista o seu valor será acrescentado mais 1.
                mapaResultados.put(integer, mapaResultados.get(integer) + 1);
            }else{
                // Caso não exista no Map, será adicionado e seu valor será 1.
                mapaResultados.put(integer, 1);
            }
        }

        System.out.println(mapaResultados
        );
    }
}
