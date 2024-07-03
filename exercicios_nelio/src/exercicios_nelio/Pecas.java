package exercicios_nelio;

import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		double val1, val2, total;
		
		sc.nextInt();
		num1 = sc.nextInt();
		val1= sc.nextDouble();
		
		sc.nextInt();
		num2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		total = (val1 * num1) + (val2 * num2);
		
		System.out.printf("Valor a pagar: R$%.2f%n", total );
		
		
		
		
		
		sc.close();
	}

}
