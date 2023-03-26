package com.dio.collections.set.entidades;

import java.util.Comparator;

public class ComparatorNomeGeneroTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        int tempoEpisodio = o1.getTempoEpisodio().compareTo(o2.getTempoEpisodio());
        if (tempoEpisodio != 0)
            return tempoEpisodio;
        int genero = o1.getGenero().compareTo(o2.getGenero());
        if (genero != 0)
            return genero;
        return o1.getNome().compareTo(o2.getNome());

    }

}
