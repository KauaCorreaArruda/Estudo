package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int nPares = 0;
		int somaPares = 0;
		double mediaPares;
		
		int[] vect = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somaPares += vect[i];
				nPares++;
			}
		}
		
		if (nPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediaPares = somaPares / nPares;
			System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
		}
		
		
		
		
		
		
		sc.close();
	}

}
