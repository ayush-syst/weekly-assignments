package week7and8;

import java.util.Random;

public class level3Q1 {

	public static int findSum(int[] heights) {
		int sum = 0;
		for (int height : heights) {
			sum += height;
		}
		return sum;
	}

	public static double findMeanHeight(int[] heights) {
		int sum = findSum(heights);
		return (double) sum / heights.length;
	}

	public static int findShortestHeight(int[] heights) {
		int shortest = heights[0];
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] < shortest) {
				shortest = heights[i];
			}
		}
		return shortest;
	}

	public static int findTallestHeight(int[] heights) {
		int tallest = heights[0];
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] > tallest) {
				tallest = heights[i];
			}
		}
		return tallest;
	}

	public static void displayHeights(int[] heights) {
		System.out.print("Player heights (cm): ");
		for (int i = 0; i < heights.length; i++) {
			System.out.print(heights[i]);
			if (i < heights.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] heights = new int[11];
		Random random = new Random();

		for (int i = 0; i < heights.length; i++) {
			heights[i] = random.nextInt(101) + 150;
		}

		int sum = findSum(heights);
		double mean = findMeanHeight(heights);
		int shortest = findShortestHeight(heights);
		int tallest = findTallestHeight(heights);

		displayHeights(heights);
		System.out.println("Sum of heights: " + sum + " cm");
		System.out.println("Mean height: " + mean + " cm");
		System.out.println("Shortest height: " + shortest + " cm");
		System.out.println("Tallest height: " + tallest + " cm");
	}
}
