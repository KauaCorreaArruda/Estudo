package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double salario = 4000.0;
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n" , x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, salario);


	}

}