package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		int[] vectId = new int[n];
		String[] vectNm = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			vectNm[i] = sc.next();
			System.out.print("Idade: ");
			vectId[i] = sc.nextInt();
		}

		int maiorIdade = vectId[0];
		int posMaior = 0;

		for (int i = 1; i < vectId.length; i++) {
			if (vectId[i] > maiorIdade) {
				maiorIdade = vectId[i];
				posMaior = i;
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s\n", vectNm[posMaior]);
		
		sc.close();
	}

}
