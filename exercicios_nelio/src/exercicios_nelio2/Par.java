package exercicios_nelio2;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num, e;
		
		System.out.println("Insira um número.");
		num = sc.nextInt();
		
	    e = num % 2;
	    
	    if ( e == 0 ) {
	    	
	    	System.out.println("Esse número é par!");
	    	
	    } else {
	    	
	    	System.out.println("Esse número é ímpar.");
	    	
	    }
		
		sc.close();
	}

}
