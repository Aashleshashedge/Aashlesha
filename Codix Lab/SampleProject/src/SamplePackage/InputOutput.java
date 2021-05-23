package SamplePackage;

import java.util.Scanner;

public class InputOutput {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
	System.out.println("Give me 1st number as input:");
		float firstNo = scanner.nextFloat();
		System.out.println("Number: " + firstNo);

		System.out.println("Give me 2nd number as input:");
		float secondNo = scanner.nextFloat();
		System.out.println("Number: " + secondNo);

		float c = add(firstNo, secondNo);
		System.out.println("Total: " + c);
	}

	static float add(float a, float b) {
		return a + b;
	}

}
