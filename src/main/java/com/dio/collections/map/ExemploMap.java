package com.dio.collections.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Map<String, Double> carros = new HashMap<>();
        carros.put("Gol", 14.4);
        carros.put("Uno", 15.6);
        carros.put("Mobi", 16.1);
        carros.put("Hb20", 14.5);
        carros.put("Kwid", 15.6);
        System.out.println(carros);
        System.out.println();
        System.out.println("Substitua o consumo do gol por 15.2 km/l: ");
        carros.put("Gol", 14.2);
        System.out.println(carros);
        System.out.println();
        System.out.println("Confira se o modelo tucson está no dicionário: " + carros.containsKey("tucson"));
        System.out.println();
        System.out.println("Exiba o consumo do UNO: ");
        System.out.println(carros.get("Uno"));
        System.out.println();
        System.out.println("Exiba os modelos dos carros: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);
        System.out.println();
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);
        System.out.println();
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEconomico = Collections.min(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEconomico = "";
        for (Map.Entry<String,Double> entry : entries) {
            if(entry.getValue() == consumoMaisEconomico){
                modeloMaisEconomico = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEconomico + ", consumo: " + consumoMaisEconomico);
            }
        }
        System.out.println();
        Double consumoMenosEficiente = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries2 = carros.entrySet();
        String carroMenosEficiente = "";
        for (Map.Entry<String,Double> entry : entries2) {
            if(entry.getValue() == consumoMenosEficiente){
                carroMenosEficiente = entry.getKey();
            }
        }
        System.out.println();
        System.out.println("Modelo menos eficiente: " + carroMenosEficiente + ", consumo: " + consumoMenosEficiente);
        Iterator<Double> iterator = carros.values().iterator();
        Double somaConsumos = 0d;
        while(iterator.hasNext()){
            somaConsumos += iterator.next();
        }
        System.out.println();
        System.out.println("Soma dos consumos: " + somaConsumos);
        System.out.println();
        System.out.println("Média dos consumos: " + somaConsumos / carros.values().size());
        System.out.println();

        Iterator<Double> iterator1 = carros.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() == 15.6) iterator1.remove();
        }
        System.out.println("Remova os modelos com consumo igual a 15.6 km/l: ");
        System.out.println(carros);
        System.out.println();

        Map<String, Double> carros2 = new LinkedHashMap<>();
        carros2.put("Gol", 14.4);
        carros2.put("Uno", 15.6);
        carros2.put("Mobi", 16.1);
        carros2.put("Hb20", 14.5);
        carros2.put("Kwid", 15.6);
        System.out.println();
        System.out.println("Exiba o dicionário pela ordem de inserção");
        System.out.println(carros2);
        System.out.println();
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carros3 = new TreeMap<>(carros2);
        System.out.println(carros3);
        System.out.println();
        System.out.println("Apague os dicionarios de carros: ");
        carros.clear();
        System.out.println();
        System.out.println("Confira se o dicionário está vazio: " + carros.isEmpty());

         



    }
}
