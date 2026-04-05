package week5and6;

import java.util.Scanner;

public class level1Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		int[] multiplicationTable = new int[10];

		for (int i = 1; i <= 10; i++) {
			multiplicationTable[i - 1] = number * i;
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
		}

		input.close();
	}
}
