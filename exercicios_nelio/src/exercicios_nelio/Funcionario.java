package exercicios_nelio;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int func, horaTrab;
		double valHora, sal;
		
		func = sc.nextInt();
		horaTrab = sc.nextInt();
		
		
		valHora = sc.nextDouble();
		
		sal = horaTrab * valHora;

		System.out.println("Number= " + func);
		System.out.println("Salary= " + sal);
		
		
		
		sc.close();
	}

}
