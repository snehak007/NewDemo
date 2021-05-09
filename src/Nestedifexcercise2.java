import java.util.Scanner;

public class Nestedifexcercise2 {

	public static void main(String[] args) {
		// Greatest number using nestedifs
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a\n");
		System.out.print("Enter b\n");
		System.out.print("Enter c\n");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("a is greatest");
			}
		}

		if (b > c) {
			if (b > a) {
				System.out.println("b is greatest");
			}
		}

		if (c > a) {
			if (c > b) {
				System.out.println("c is greatest");
			}
		}

	}

}
