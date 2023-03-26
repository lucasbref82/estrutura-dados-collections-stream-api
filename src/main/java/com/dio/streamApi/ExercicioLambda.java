package com.dio.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExercicioLambda {
	public static void main(String[] args) {
		List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "6", "9", "9", "9", "5");
		System.out.println("Ignore os 3 primeiros elementos da lista de imprima o restante");
		numeros
			.stream()
			.map(Integer::parseInt)
			.skip(3)
			.collect(Collectors.toList())
			.forEach(System.out::println);

		System.out.println("Total de números na lista: ");
		Long totalNumerosLista = numeros
				.stream()
				.map(Integer::parseInt)
				.count();
		System.out.println(totalNumerosLista);

		System.out.println("Menor número da lista: ");
		Integer menorNumero = Collections.min(numeros.stream().map(Integer::parseInt).collect(Collectors.toList()));
		System.out.println(menorNumero);

		System.out.println("Maior número da lista: ");
		Integer maiorNumero = Collections.max(numeros.stream().map(Integer::parseInt).collect(Collectors.toList()));
		System.out.println(maiorNumero);

		System.out.println("Soma dos impares: ");
		int somaDosNumerosImpares = 
				numeros
				.stream()
				.mapToInt(Integer::parseInt)
				.filter(x -> x % 2 != 0)
				.sum();
		System.out.println(somaDosNumerosImpares);
		
		// sorted pede um comparator
		System.out.println("Mostrar lista em ordem númerica: ");
		numeros.stream().map(Integer::parseInt).sorted(Comparator.naturalOrder()).collect(Collectors.toList())
				.forEach(System.out::println);
		
		System.out.println("Multiplos de 3 e de 5: ");
		// Colectors.groupingBy retorta um Map<T, List<T>>
		Map<Object, List<Integer>> map = 
					numeros
					.stream()
					.map(Integer::parseInt)
					.collect(Collectors.groupingBy(x -> x % 3 == 0 || x % 5 == 0));
		System.out.println(map);

	}
}
