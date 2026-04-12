package week7and8;

import java.util.Arrays;
import java.util.Scanner;

public class level3Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int digitCount = NumberChecker.countDigits(number);
		int[] digits = NumberChecker.storeDigits(number);
		boolean isDuck = NumberChecker.isDuckNumber(digits);
		boolean isArmstrong = NumberChecker.isArmstrongNumber(number, digits);
		int[] largestPair = NumberChecker.findLargestAndSecondLargest(digits);
		int[] smallestPair = NumberChecker.findSmallestAndSecondSmallest(digits);

		System.out.println("Digit count: " + digitCount);
		System.out.println("Digits array: " + Arrays.toString(digits));
		System.out.println("Is duck number: " + isDuck);
		System.out.println("Is armstrong number: " + isArmstrong);
		System.out.println("Largest digit: " + largestPair[0]);
		System.out.println("Second largest digit: " + largestPair[1]);
		System.out.println("Smallest digit: " + smallestPair[0]);
		System.out.println("Second smallest digit: " + smallestPair[1]);

		scanner.close();
	}
}

class NumberChecker {

	public static int countDigits(int number) {
		int value = Math.abs(number);
		if (value == 0) {
			return 1;
		}

		int count = 0;
		while (value > 0) {
			count++;
			value /= 10;
		}
		return count;
	}

	public static int[] storeDigits(int number) {
		int value = Math.abs(number);
		int count = countDigits(value);
		int[] digits = new int[count];

		if (value == 0) {
			digits[0] = 0;
			return digits;
		}

		for (int i = count - 1; i >= 0; i--) {
			digits[i] = value % 10;
			value /= 10;
		}
		return digits;
	}

	public static boolean isDuckNumber(int[] digits) {
		if (digits.length == 0 || digits[0] == 0) {
			return false;
		}

		for (int digit : digits) {
			if (digit == 0) {
				return true;
			}
		}
		return false;
	}

	public static boolean isArmstrongNumber(int number, int[] digits) {
		int power = digits.length;
		int sum = 0;

		for (int digit : digits) {
			sum += (int) Math.pow(digit, power);
		}

		return sum == Math.abs(number);
	}

	public static int[] findLargestAndSecondLargest(int[] digits) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int digit : digits) {
			if (digit > largest) {
				secondLargest = largest;
				largest = digit;
			} else if (digit > secondLargest && digit != largest) {
				secondLargest = digit;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			secondLargest = largest;
		}

		return new int[] { largest, secondLargest };
	}

	public static int[] findSmallestAndSecondSmallest(int[] digits) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int digit : digits) {
			if (digit < smallest) {
				secondSmallest = smallest;
				smallest = digit;
			} else if (digit < secondSmallest && digit != smallest) {
				secondSmallest = digit;
			}
		}

		if (secondSmallest == Integer.MAX_VALUE) {
			secondSmallest = smallest;
		}

		return new int[] { smallest, secondSmallest };
	}
}
