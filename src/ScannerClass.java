import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		// Step 1: Create the object, you can it "input" or anything of your choice

		Scanner abcinput = new Scanner(System.in);

		// Ask the user to enter a value
		// We will use the print method not println

		System.out.print("Please enter a number\n");

		// Step 2: Create a box/space/buffer to store the value that the user had
		// entered
		int a = abcinput.nextInt();

		System.out.println("You have entered: " + a);

	}

}
