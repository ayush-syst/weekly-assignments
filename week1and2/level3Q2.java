package week1and2;
import java.util.Scanner;
public class level3Q2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsiusResult);
        scanner.close();
    }
}
