package com.dio.exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Animal {

    private static final String CARNIVORO = "carnivoro";
    private static final String ONIVORO = "onivoro";
    private static final String HERBIVORO = "herbivoro";
    private static final String HEMATOFAGO = "hematofago";
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String animal1 = sc.nextLine();
        String animal2 = sc.nextLine();
        String animal3 = sc.nextLine();
        System.out.println(retornaAnimal(animal1, animal2, animal3));
        sc.close();
    }

    public static String retornaAnimal(String animal1, String animal2, String animal3){
        String animal = null;
        if(animal1.equalsIgnoreCase("vertebrado")){
            if(animal2.equalsIgnoreCase("ave")){
                if(animal3.equalsIgnoreCase(CARNIVORO)){
                    animal = "aguia";
                }else {
                    animal = "pomba";
                }
            }else {
                if(animal3.equalsIgnoreCase(ONIVORO)){
                    animal = "homem";
                }else {
                    animal = "pomba";
                }
            }
        }else if(animal1.equalsIgnoreCase("invertebrado")){
            if(animal2.equalsIgnoreCase("inseto")){
                if(animal3.equalsIgnoreCase(HERBIVORO)){
                    animal =  "lagarta";
                }else {
                    animal =  "pulga";
                }
            }else{
                if(animal3.equalsIgnoreCase(HEMATOFAGO)){
                    animal = "sanguesuga";
                }else {
                    animal =  "minhoca";
                }
            }
        }
        return animal;
    }
}
