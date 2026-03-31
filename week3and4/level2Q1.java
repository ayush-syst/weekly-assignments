package week3and4;
import java.util.Scanner;

public class level2Q1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        scanner.close();
        System.out.println("Even numbers from 1 to " + num1 + ":");
        for (int i = 2; i <= num1; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("Odd numbers from 1 to " + num1 + ":");
        for (int i = 1; i <= num1; i += 2) {
            System.out.print(i + " ");
        }
    }
}