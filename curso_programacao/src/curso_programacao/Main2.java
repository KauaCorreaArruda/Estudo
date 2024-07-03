package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int i;
		double d;
		
		x = sc.next();
		i = sc.nextInt();
		d = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(i);
		System.out.println(d);
		
		
		
		sc.close();
	}

}
