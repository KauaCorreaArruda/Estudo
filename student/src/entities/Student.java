package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public void showIfPassedOrFailed(double finalGrade) {

		System.out.printf("FINAL GRADE = %.2f%n", finalGrade);

		if (finalGrade >= 60) {
			System.out.println("PASS");

		} else {
			System.out.println("FAILED");
			System.out.print("MISSING ");
			System.out.printf("%.2f POINTS", (60 - finalGrade));

		}

	}

}
