
package week3and4;
import java.util.Scanner;
public class level3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year >=1582:");
        int year = sc.nextInt();
        sc.close();
        if (year < 1582) {
            System.out.println("Invalid input. Year must be >= 1582.");
        } else {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");  
    }
}
    }}