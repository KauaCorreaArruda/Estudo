package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//Teste git 2
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		//Bloco finally será executado independentemente de haver uma exception a ser tratada.
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed!");
		}

	}

}
