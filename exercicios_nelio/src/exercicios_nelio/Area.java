package exercicios_nelio;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi, raio, area;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A= %.4f%n", area);
		
		sc.close();
	}

}
