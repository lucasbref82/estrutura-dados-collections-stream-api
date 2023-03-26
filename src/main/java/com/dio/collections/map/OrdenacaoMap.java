package com.dio.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.dio.collections.map.entidades.ComparatorNome;
import com.dio.collections.map.entidades.ComparatorPaginas;
import com.dio.collections.map.entidades.Livro;

public class OrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Map<String, Livro> livros = new HashMap<>();
        livros.put("Hawking, Sthepen", new Livro("Uma Breve História do Tempo", 256));
        livros.put("Duhigg, Charles", new Livro("O Poder do Hábito", 409));
        livros.put("Harara, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        for (Map.Entry<String, Livro> livro : livros.entrySet()) {
            System.out.println("Autor: " + livro.getKey() + ", nome: "+livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> livros2 = new LinkedHashMap<>();
        livros2.put("Hawking, Sthepen", new Livro("Uma Breve História do Tempo", 256));
        livros2.put("Duhigg, Charles", new Livro("O Poder do Hábito", 409));
        livros2.put("Harara, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        for (Map.Entry<String, Livro> livro : livros2.entrySet()) {
            System.out.println("Autor: " + livro.getKey() + ", nome: "+livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Nome\t--");
        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNome());
        livros3.addAll(livros.entrySet()); 
        for (Map.Entry<String,Livro> entry : livros3) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Quantidade Páginas\t--");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPaginas());
        livros4.addAll(livros.entrySet());
        for (Map.Entry<String,Livro> entry : livros4) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getPaginas());
        }
    }
}
