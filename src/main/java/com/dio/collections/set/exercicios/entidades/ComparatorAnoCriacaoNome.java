package com.dio.collections.set.exercicios.entidades;

import java.util.Comparator;

public class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = o1.getDataDeCriacao().compareToIgnoreCase(o2.getDataDeCriacao());
        if(ano != 0) return ano;
        return o1.getNome().compareTo(o2.getNome());
    }
    
}
