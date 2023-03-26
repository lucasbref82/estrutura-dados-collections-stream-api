package com.dio.collections.set.exercicios.entidades;

import java.util.Comparator;

public class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0)
            return nome;
        int ano = o1.getDataDeCriacao().compareTo(o2.getDataDeCriacao());
        if (ano != 0)
            return ano;
        return o1.getIde().compareTo(o2.getIde());

    }

}
