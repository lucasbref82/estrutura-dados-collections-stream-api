package com.dio.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemplosLambda {
	public static void main(String[] args) {
		List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "6", "9", "9", "9", "5");
		System.out.println("Imprima os elemetos dessa lista de String: ");
//		numeros.stream().forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(r);
//				
//			}
//		});
		numeros.forEach(System.out::println);

		System.out.println("Pegue os 5 primeiros números e coloque detro de um SET");
		numeros.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

		// Não podemos colocar tipagem e map diferentes
		// List<String> numeros1 =
		// numeros.stream().map(Integer::parseInt).collect(Collectors.toList());

		// Desse jeito fuciona mas não usamos mais assim.
//		numeros.spliterator().map(new Function<String, Integer>() {
//			@Override
//			public Integer apply(String t) {
//				return Integer.parseInt(t);
//			}
//			
//		});

		// Convertendo a lista de String em inteiros
		numeros.stream().map(x -> Integer.parseInt(x));

		// Convertendo a lista de String em inteiros e imprimindo com o foreach
		System.out.println("Transformar a lista de string em inteiros");
		numeros
			.stream()
			.map(Integer::parseInt)
			.collect(Collectors.toList())
			.forEach(System.out::println);

		System.out.println("Pegar números pares e maiores que 2 e colocar em uma lista");
		// Instanciando a classe anônima Predicate
//		numeros
//			.stream()
//			.map(Integer::parseInt)
//			.filter(new Predicate<Integer>() {
//				@Override
//				public boolean test(Integer t) {
//					return t % 2 == 0 && t > 2;
//				}
//			})
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
		
		// Com lambda
		numeros
			.stream()
			.map(Integer::parseInt)
			.filter(x -> x % 2 == 0 && x > 2)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("Média dos números: ");
//		numeros
//			.stream()
//			.mapToInt(Integer::parseInt)
//			.average()
//			.ifPresent(new DoubleConsumer() {
//				@Override
//				public void accept(double value) {
//					System.out.println(String.format("%.2f", value));
//				}
//			});
		numeros
			.stream()
			.mapToInt(Integer::parseInt)
			.average()
			.ifPresent(System.out::println);
		
		
		System.out.println("Remova os valores impares: ");
		List<Integer> list = numeros.
				stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		list
			.removeIf(x -> x % 2 != 0);
		System.out.println(list);
	}
}
