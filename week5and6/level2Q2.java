package week5and6;

import java.util.Scanner;

public class level2Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] names = {"Amar", "Akbar", "Anthony"};
		double[] ages = new double[3];
		double[] heights = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter details for " + names[i] + ":");

			while (true) {
				System.out.print("Age: ");
				String ageInput = scanner.nextLine().trim();
				try {
					double age = Double.parseDouble(ageInput);
					if (age < 0) {
						System.out.println("Age cannot be negative. Enter again.");
					} else {
						ages[i] = age;
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid age. Please enter a valid number.");
				}
			}

			while (true) {
				System.out.print("Height: ");
				String heightInput = scanner.nextLine().trim();
				try {
					double height = Double.parseDouble(heightInput);
					if (height < 0) {
						System.out.println("Height cannot be negative. Enter again.");
					} else {
						heights[i] = height;
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid height. Please enter a valid number.");
				}
			}

			System.out.println();
		}

		int youngestIndex = 0;
		int tallestIndex = 0;

		for (int i = 1; i < 3; i++) {
			if (ages[i] < ages[youngestIndex]) {
				youngestIndex = i;
			}
			if (heights[i] > heights[tallestIndex]) {
				tallestIndex = i;
			}
		}

		System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
		System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");

		scanner.close();
	}
}
