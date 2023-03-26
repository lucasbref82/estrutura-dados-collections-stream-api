package com.dio.estruturasDeDados.pilha;

public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        pilha.push(0);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        System.out.println(pilha);
        System.out.println("--------------");
        System.out.println(pilha.top());
        System.out.println("--------------");
        System.out.println(pilha.pop());
        System.out.println("--------------");
        System.out.println(pilha);
        System.out.println("--------------");
        System.out.println(pilha.index(3));
    }
}
