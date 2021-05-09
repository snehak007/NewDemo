import java.util.Scanner;

public class NestedIfs {

	public static void main(String[] args) {

		// Nested if condition

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a\n");
		System.out.print("Enter b\n");
		System.out.print("Enter c\n");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a < b) {
			if (b < c) {

				System.out.println("a is the smallest number");
			}
		}

		if (b < a) {
			if (b < c) {

				System.out.println("b is the smallest number");
			}
		}
		if (c < a) {
			if (c < b) {

				System.out.println("c is the smallest number");
			}
		}
	}

}
