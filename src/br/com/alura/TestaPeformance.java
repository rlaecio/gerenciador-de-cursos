package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPeformance {

	public static void main(String[] args) {
		System.out.println("------------------------------- com ArrayList");
		
		Collection<Integer> numeros = new ArrayList<Integer>();
		long inicio = System.currentTimeMillis();
		for (int i = 1; i < 100000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();		
		long tempoDeExecucao = fim - inicio;		
		System.out.println("Tempo gasto : " + tempoDeExecucao + " milissegundos");
		
		
		
		
		System.out.println("------------------------------- com Hash");
		
		Collection<Integer> numeros2 = new HashSet<Integer>();
		long inicio_hash = System.currentTimeMillis();
		for (int i = 1; i < 100000; i++) {
			numeros2.add(i);
		}
		
		for (Integer numero2 : numeros2) {
			numeros2.contains(numero2);
		}
		
		long fim_hash = System.currentTimeMillis();
		long tempoDeExecucao2 = fim_hash - inicio_hash;
		System.out.println("Tempo gasto : " + tempoDeExecucao2 + " milissegundos");
	}

}
