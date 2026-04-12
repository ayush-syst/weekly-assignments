package week7and8;

import java.util.Scanner;

public class level1Q2 {

	public static long calculateHandshakes(int numberOfStudents) {
		return (long) numberOfStudents * (numberOfStudents - 1) / 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numberOfStudents = scanner.nextInt();

		long handshakes = calculateHandshakes(numberOfStudents);

		System.out.println("The number of possible handshakes is " + handshakes);

		scanner.close();
	}
}
