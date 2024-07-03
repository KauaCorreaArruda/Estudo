package entities;

public class Rectangle {

	public double width;
	public double height;

	public double calculateArea() {

		return width * height;
	}

	public double calculatePerimeter() {

		return (width + height) * 2;
	}

	public double calculateDiagonal() {

		return Math.sqrt(width * width + height * height);

	}

}
