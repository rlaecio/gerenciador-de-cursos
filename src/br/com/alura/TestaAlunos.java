package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turinei");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppar");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Ariche");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);
	}

}
