package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
		}

		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}

		double media = soma / vect.length;

		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);

		int cont = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				cont++;
			}
		}
		double perc = (double) cont / vect.length * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", perc);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}

		sc.close();
	}

}
