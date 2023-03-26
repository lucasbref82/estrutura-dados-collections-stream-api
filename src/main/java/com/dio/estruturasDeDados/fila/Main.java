package com.dio.estruturasDeDados.fila;

public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();
        fila.enqueue("teste 1");
        fila.enqueue("teste 2");
        fila.enqueue("teste 3");
        fila.enqueue("teste 4");
        fila.enqueue("teste 5");
        System.out.println(fila);
        fila.dequeue();
        System.out.println(fila);
        System.out.println(fila.first());
    }
}
