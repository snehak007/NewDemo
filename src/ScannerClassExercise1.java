import java.util.Scanner;

public class ScannerClassExercise1 {

	public static void main(String[] args) {

		// Write a program to test three values to find out and print the greatest value using Scanner Class
		// If the condition A is true, print "x is the greatest"
		// If the condition B is true, print "y is the greatest"
		// Else print "z is greatest"

		Scanner value = new Scanner(System.in);

		System.out.print("Enter a value for x\n");
		System.out.print("Enter a value for y\n");
		System.out.print("Enter a value for z\n");

		int x = value.nextInt();
		int y = value.nextInt();
		int z = value.nextInt();

		if (x > y) {

			System.out.println("x is greatest");
		}

		else if (y > z) {
			System.out.println("y is greatest");
		} else {
			System.out.println("z is greatest");
		}
	}

}
