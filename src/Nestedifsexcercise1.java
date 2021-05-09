import java.util.Scanner;

public class Nestedifsexcercise1 {

	public static void main(String[] args) {

		// Nested if condition

		Scanner input = new Scanner(System.in);

		System.out.println("Do you want a Sandwich(S) or a juice(J)?\n");
		String choice1 = input.next();

		if (choice1.equals("S")) {
			System.out.print("Do you want a Tuna (T) or a Panini (P)?\n");
			String choice2 = input.next();

			if (choice2.equals("T")) {
				System.out.print("Tuna sandwich - $10");
			} else {
				System.out.print("Panini Sandwich - $12");
			}
		}

		if (choice1.equals("J")) {
			System.out.println("Do you want a Organic Juice(O) or a Regular juice(R)?\n");
			String choice3 = input.next();
			if (choice3.equals("O")) {
				System.out.print("Organic juice - $10");
			}

			else {
				System.out.print("Regular juice - $5");
			}
		}
	}
}
