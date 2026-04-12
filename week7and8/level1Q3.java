package week7and8;

import java.util.Scanner;

public class level1Q3 {

	public static double calculateRoundsForFiveKm(double side1, double side2, double side3) {
		double perimeter = side1 + side2 + side3;
		double targetDistanceInMeters = 5000;
		return targetDistanceInMeters / perimeter;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter side 1 in meters: ");
		double side1 = scanner.nextDouble();

		System.out.print("Enter side 2 in meters: ");
		double side2 = scanner.nextDouble();

		System.out.print("Enter side 3 in meters: ");
		double side3 = scanner.nextDouble();

		double rounds = calculateRoundsForFiveKm(side1, side2, side3);

		System.out.println("The athlete needs to complete " + rounds + " rounds to finish 5 km.");

		scanner.close();
	}
}
