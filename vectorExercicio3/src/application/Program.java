package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int n = 0;
		double soma = 0.0;
		double media = 0.0;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.print("VALORES = ");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		System.out.printf("SOMA = %.2f%n", soma);

		media = soma / vect.length;
		
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}

}
