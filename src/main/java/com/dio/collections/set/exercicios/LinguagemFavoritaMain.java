package com.dio.collections.set.exercicios;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.dio.collections.set.exercicios.entidades.ComparatorIde;
import com.dio.collections.set.exercicios.entidades.ComparatorNomeAnoCriacaoIde;
import com.dio.collections.set.exercicios.entidades.LinguagemFavorita;

import com.dio.collections.set.exercicios.entidades.ComparatorAnoCriacaoNome;

public class LinguagemFavoritaMain {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagemFavorita = new LinkedHashSet<>();
        linguagemFavorita.add(new LinguagemFavorita("Java", "1999", "VSCode"));
        linguagemFavorita.add(new LinguagemFavorita(".NET", "2002", "Rider"));
        linguagemFavorita.add(new LinguagemFavorita("Python", "1999", "Pycharm"));
        System.out.println("Ordem de inserção: ");
        for (LinguagemFavorita linguagemFavorita2 : linguagemFavorita) {
            System.out.println(linguagemFavorita2);
        }
        System.out.println("Order Natural Nome: ");
        Set<LinguagemFavorita> linguagemFavoritas = new TreeSet<>();
        linguagemFavoritas.addAll(linguagemFavorita);
        for (LinguagemFavorita linguagemFavorita2 : linguagemFavoritas) {
            System.out.println(linguagemFavorita2);
        }
        System.out.println("Ordem IDE: ");
        Set<LinguagemFavorita> ordenadaIde = new TreeSet<>(new ComparatorIde());
        ordenadaIde.addAll(linguagemFavorita);
        for (LinguagemFavorita linguagemFavorita2 : ordenadaIde) {
            System.out.println(linguagemFavorita2);
        }

        System.out.println("Ordem Ano e Nome: ");
        Set<LinguagemFavorita> nomeAno = new TreeSet<>(new ComparatorAnoCriacaoNome());
        nomeAno.addAll(linguagemFavorita);
        for (LinguagemFavorita linguagemFavorita2 : nomeAno) {
            System.out.println(linguagemFavorita2);
        }

        System.out.println("Order nome, ano de criação e IDE");
        Set<LinguagemFavorita> nomeAnoIde = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        nomeAnoIde.addAll(linguagemFavorita);
        for (LinguagemFavorita linguagemFavorita2 : nomeAnoIde) {
            System.out.println(linguagemFavorita2);
        }

 
    }
}
