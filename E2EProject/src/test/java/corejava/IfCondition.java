package corejava;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {

		int a;// = 187;
		int b;// = 187;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter A nad B values as Numaric.....: ");
		a = s.nextInt();
		b = s.nextInt();
	

		// Validation commands
		if (a > b) {
			System.out.println("a is greater than b");

		} else if (a < b) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a equal to b");
		}
		s.close();
	}
}
