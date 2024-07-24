package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];

		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		double soma = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			soma+= vect[i].getAltura();
		}
		
		double media = soma / vect.length;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		
		sc.close();
	}

}
