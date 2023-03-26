package com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.dio.collections.list.entidades.ComparatorIdade;
import com.dio.collections.list.entidades.ComparatorNomeCorIdade;
import com.dio.collections.list.entidades.Gato;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Jon", "Preto", 18));
        gatos.add(new Gato("Simba", "Tigrado", 6));
        gatos.add(new Gato("Jon", "Amarelo", 12));

        System.out.println("----\tOrdem de Inserção\t----");
        System.out.println(gatos);
        System.out.println("----\tOrdem Aleatória\t----");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("----\tOrdem Natural\t----");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println("----\tOrdem Idade\t----");
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
        System.out.println("----\tOrdem Nome/Cor/Idade\t----");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }
}
