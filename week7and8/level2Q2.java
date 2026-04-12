package week7and8;

import java.util.Scanner;

public class level2Q2 
{
	public static long sumUsingRecursion(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sumUsingRecursion(n - 1);
	}

	public static long sumUsingFormula(int n) {
		return (long) n * (n + 1) / 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a natural number: ");
		int n = scanner.nextInt();

		if (n <= 0) {
			System.out.println("Please enter a valid natural number greater than 0.");
			scanner.close();
			return;
		}

		long recursiveSum = sumUsingRecursion(n);
		long formulaSum = sumUsingFormula(n);

		System.out.println("Sum using recursion: " + recursiveSum);
		System.out.println("Sum using formula: " + formulaSum);

		if (recursiveSum == formulaSum) {
			System.out.println("Both computations are correct and give the same result.");
		} else {
			System.out.println("The results do not match.");
		}

		scanner.close();
	}
}
