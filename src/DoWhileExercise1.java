import java.util.Scanner;

public class DoWhileExercise1 {

	public static void main(String[] args) {

// Write a program that generates a random number and asks the user to guess what the number is
// If the user guess is higher than the random number, the program should display "Too high, try again"
// If the user guess is lower than the random number, the program should display "Too low, try again"
// The program should use a Do-While loop that repeats until the user correctly guesses the random number

		Scanner input = new Scanner(System.in);

		int num = 5;
		
		System.out.print("Guess the number\n");
		int x = input.nextInt();

		do {
			if (x == num) {
				System.out.println("You guessed a right number");
			}
			
			else if (x < num) {
				System.out.println("Too low, try again");
			} 
			else {
				System.out.println("Too high, try again");
			}
		} 
		while (x != num);
	}
}
