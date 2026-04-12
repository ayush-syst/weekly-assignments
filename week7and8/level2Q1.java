package week7and8;

import java.util.Scanner;

public class level2Q1 {

	public static int[] findFactors(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		int[] factors = new int[count];
		int index = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors[index] = i;
				index++;
			}
		}

		return factors;
	}

	public static int findSum(int[] factors) {
		int sum = 0;
		for (int factor : factors) {
			sum += factor;
		}
		return sum;
	}

	public static long findProduct(int[] factors) {
		long product = 1;
		for (int factor : factors) {
			product *= factor;
		}
		return product;
	}

	public static double findSumOfSquares(int[] factors) {
		double sumOfSquares = 0;
		for (int factor : factors) {
			sumOfSquares += Math.pow(factor, 2);
		}
		return sumOfSquares;
	}

	public static void displayFactors(int[] factors) {
		System.out.print("Factors: ");
		for (int i = 0; i < factors.length; i++) {
			System.out.print(factors[i]);
			if (i < factors.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int[] factors = findFactors(number);
		int sum = findSum(factors);
		long product = findProduct(factors);
		double sumOfSquares = findSumOfSquares(factors);

		displayFactors(factors);
		System.out.println("Sum of factors: " + sum);
		System.out.println("Product of factors: " + product);
		System.out.println("Sum of squares of factors: " + sumOfSquares);

		scanner.close();
	}
}
