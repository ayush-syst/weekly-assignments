package week5and6;

import java.util.Scanner;

public class level2Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] salaries = new double[10];
		double[] yearsOfService = new double[10];
		double[] bonusAmounts = new double[10];
		double[] newSalaries = new double[10];

		double totalBonus = 0;
		double totalOldSalary = 0;
		double totalNewSalary = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter details for Employee " + (i + 1) + ":");

			System.out.print("Old Salary: ");
			String salaryInput = scanner.nextLine().trim();

			System.out.print("Years of Service: ");
			String yearsInput = scanner.nextLine().trim();

			try {
				double salary = Double.parseDouble(salaryInput);
				double years = Double.parseDouble(yearsInput);

				if (salary < 0 || years < 0) {
					System.out.println("Invalid input. Salary and years of service must be non-negative. Enter again.\n");
					i--;
					continue;
				}

				salaries[i] = salary;
				yearsOfService[i] = years;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number entered. Please enter again.\n");
				i--;
			}
		}

		for (int i = 0; i < 10; i++) {
			double bonusRate = yearsOfService[i] > 5 ? 0.05 : 0.02;
			bonusAmounts[i] = salaries[i] * bonusRate;
			newSalaries[i] = salaries[i] + bonusAmounts[i];

			totalBonus += bonusAmounts[i];
			totalOldSalary += salaries[i];
			totalNewSalary += newSalaries[i];
		}

		System.out.println("\nEmployee Bonus Details:");
		for (int i = 0; i < 10; i++) {
			System.out.printf(
					"Employee %d -> Old Salary: %.2f, Years: %.2f, Bonus: %.2f, New Salary: %.2f%n",
					(i + 1), salaries[i], yearsOfService[i], bonusAmounts[i], newSalaries[i]);
		}

		System.out.println("\nCompany Summary (Zara):");
		System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
		System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
		System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

		scanner.close();
	}
}
