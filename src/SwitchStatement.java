import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// Take an input (1-7) from the user and print the day of the week(Mon-Sun)

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day of the Week");
		int day = input.nextInt();

		switch (day) {

		case 1:
			System.out.println("The number " + day + " " + "means, it is a Monday");
			break;

		case 2:
			System.out.println("The number " + day + " " + "means, it is a Tuesday");
			break;

		case 3:
			System.out.println("The number " + day + " " + "means, it is a Wednesday");
			break;

		case 4:
			System.out.println("The number " + day + " " + "means, it is a Thursday");
			break;

		case 5:
			System.out.println("The number " + day + " " + "means, it is a Friday");
			break;

		case 6:
			System.out.println("The number " + day + " " + "means, it is a Saturday");
			break;

		case 7:
			System.out.println("The number " + day + " " + "means, it is a Sunday");
			break;

		default:
			System.out.println("The number " + day + " " + "is not a valid number");

		}

	}

}
