package week5and6;

import java.util.Scanner;

public class level3Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long number;

		while (true) {
			System.out.print("Enter a number: ");
			String input = scanner.nextLine().trim();
			try {
				number = Long.parseLong(input);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
			}
		}

		long absoluteNumber = Math.abs(number);

		int digitCount;
		if (absoluteNumber == 0) {
			digitCount = 1;
		} else {
			digitCount = 0;
			long temp = absoluteNumber;
			while (temp > 0) {
				digitCount++;
				temp /= 10;
			}
		}

		int[] digits = new int[digitCount];
		long temp = absoluteNumber;

		if (absoluteNumber == 0) {
			digits[0] = 0;
		} else {
			for (int i = digitCount - 1; i >= 0; i--) {
				digits[i] = (int) (temp % 10);
				temp /= 10;
			}
		}

		int[] frequency = new int[10];
		for (int i = 0; i < digits.length; i++) {
			frequency[digits[i]]++;
		}

		System.out.println("Digit frequency:");
		for (int i = 0; i < frequency.length; i++) {
			System.out.println(i + " -> " + frequency[i]);
		}

		scanner.close();
	}
}
