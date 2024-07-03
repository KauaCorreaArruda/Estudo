package exercicios_nelio2;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um número inteiro.");
		num = sc.nextInt();
		
		if (num > 0) {
			
			System.out.println("Esse número é positivo!");
			
		} else {
			System.out.println("Esse número é negativo!");
		}
		
		
		
		sc.close();
	}

}
