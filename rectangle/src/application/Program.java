package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
	
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n" , rectangle.calculateArea());
		System.out.printf("PERIMETER = %.2f%n" , rectangle.calculatePerimeter());
		System.out.printf("DIAGONAL = %.2f%n" , rectangle.calculateDiagonal());
		
		sc.close();
	}

}