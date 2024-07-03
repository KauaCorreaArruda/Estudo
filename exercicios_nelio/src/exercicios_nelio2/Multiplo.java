package exercicios_nelio2;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int A , B , mod;
		
		System.out.println("Insira dois números.");		
		A = sc.nextInt();
		B = sc.nextInt();
		
		mod = A % B;
		
		if ( mod == 0 ) {
			
			System.out.println("Esses números são múltiplos!");
			
		}  else {
			
			System.out.println("Esses números não são múltiplos!");
			
		}

		sc.close();
	}

}
