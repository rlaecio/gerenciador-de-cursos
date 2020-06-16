package br.com.alura;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de lista";
		String aula2 = "Modelando a lista de aulas";
		String aula3 = "Trabalhando com cursos e sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é : " + primeiraAula);
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula : " + aulas.get(i));
		}

		aulas.forEach(aula -> {
			System.out.println("percorrendo: ");
			System.out.println(aula);
		});
	}

}
