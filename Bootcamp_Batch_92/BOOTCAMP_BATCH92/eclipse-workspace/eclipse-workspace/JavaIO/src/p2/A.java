package p2;

import java.util.Scanner;

class A {
	public static void main(String args[]) {
		int marks[] = new int[5];
		int i;
		float total = 0, avg;
		Scanner scanner = new Scanner(System.in);

		for (i = 0; i < 5; i++) {
			System.out.print("Enter Marks of Subject" + (i + 1) + ":");
			marks[i] = scanner.nextInt();
			total = total + marks[i];
		}
		scanner.close();
		// Calculating average here

		double average = (total / 5.0);
		double percentage = (total / 500.0) * 100;

		/* Print all results */
		System.out.println("Total marks =" + total);
		System.out.println("Average marks = " + average);
		System.out.println("Percentage = " + percentage);

		double avg1 = total / 5;
		System.out.print("The student is: ");
		if (avg1 >= 60) {
			System.out.print("first");
		} else if (avg1 >= 40 && avg1 < 60) {
			System.out.print("second");
		} else if (avg1 >= 33 && avg1 < 40) {
			System.out.print("third");
		} else {
			System.out.print("fail");
		}
	}
}