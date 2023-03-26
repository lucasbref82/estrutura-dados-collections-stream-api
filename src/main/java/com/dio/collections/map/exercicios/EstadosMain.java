package com.dio.collections.map.exercicios;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EstadosMain {
    public static void main(String[] args) {
        Map<String, Double> estados = new HashMap<>();
        estados.put("PE", 9616621d);
        estados.put("AL", 3351543d);
        estados.put("CE", 9187103d);
        estados.put("RN", 3534265d);
        System.out.println(estados);
        System.out.println("Substituir população do estado de RN");
        estados.put("RN", 3534165d);
        System.out.println(estados);
        System.out.println("Estado PB existe ? " + estados.containsKey("PB"));

        if (!estados.containsKey("PB"))
            estados.put("PB", 4039277d);
        System.out.println(estados);
        System.out.println("População de Pernambuco: " + estados.get("PB"));
        Map<String, Double> estados2 = new LinkedHashMap<>();
        estados2.put("PE", 9616621d);
        estados2.put("AL", 3351543d);
        estados2.put("CE", 9187103d);
        estados2.put("RN", 3534265d);
        for (Map.Entry<String, Double> entry : estados2.entrySet()) {
            System.out.println("Estado: " + entry.getKey() + ", População: " + entry.getValue());
        }
        Double menorPopulacaoEstado = Collections.min(estados.values());
        Set<Map.Entry<String, Double>> estados3 = estados.entrySet();
        for (Map.Entry<String, Double> entry : estados3) {
            if (entry.getValue().equals(menorPopulacaoEstado)) {
                System.out.println(
                        "Estado de menor população: " + entry.getKey() + ", população total: " + menorPopulacaoEstado);
            }

        }
        Double maiorPopulacaoEstado = Collections.max(estados.values());
        Set<Map.Entry<String, Double>> estados4 = estados.entrySet();
        Double somaEstados = 0d;
        for (Map.Entry<String, Double> entry : estados4) {
            somaEstados += entry.getValue();
            if (entry.getValue().equals(maiorPopulacaoEstado)) {
                System.out.println(
                        "Estado de maior população: " + entry.getKey() + ", população total: " + entry.getValue());
            }
        }
        System.out.println("Soma da população dos estados: " + somaEstados);
        System.out.println("Média da população dos estados: " + somaEstados / estados.values().size());
        Iterator<Double> iterator = estados.values().iterator();
        if(iterator.hasNext()){
            if(iterator.next() < 40000000d){
                iterator.remove();
            }
        }
        System.out.println("Remova todos os estados com a população menor que 4000000: ");
        System.out.println(estados);
        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        estados.clear();
        System.out.println(estados);

        System.out.println("Confira se a lista está vazia: " + estados.isEmpty());


    }
}
