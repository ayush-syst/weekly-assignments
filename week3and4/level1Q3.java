package week3and4;

import java.util.Scanner;

public class level1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter a number 3: ");
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
        scanner.close();
    }
}