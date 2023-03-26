package com.dio.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.dio.collections.set.entidades.ComparatorNomeGeneroTempo;
import com.dio.collections.set.entidades.Serie;


public class ExemploOrdenadacaoSet {
    public static void main(String[] args) {
        Set<Serie> series = new HashSet<>(
            Arrays.asList(
                new Serie("got", "fantasia", 60),
                new Serie("dark", "drama", 60),
                new Serie("flash", "fantasia", 70)
                )
        );

        for (Serie serie : series){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        Set<Serie> series2 = new TreeSet<>(series);
        for (Serie serie : series2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        series3.addAll(series);
        for (Serie serie : series3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        
            
        
    }
}
