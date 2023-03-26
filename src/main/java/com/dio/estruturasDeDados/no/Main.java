package com.dio.estruturasDeDados.no;
public class Main {
    public static void main(String[] args) {
        No<Integer> no1 = new No<>(1);
        No<Integer> no2 = new No<>(2);
        no1.setProximoNo(no2);
        No<Integer> no3 = new No<>(3);
        no2.setProximoNo(no3);
        No<Integer> no4 = new No<>(4);
        no3.setProximoNo(no4);
        // no1 -> no2 -> no3 -> no4 -> null
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());
        System.out.println(no4.getProximoNo());

    }
}
