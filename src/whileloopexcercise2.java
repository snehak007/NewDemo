import java.util.Scanner;

public class whileloopexcercise2 {

	public static void main(String[] args) {
		// 10*1 = 10
		// 10*2 = 20

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the multiplication number you want");

		int x = input.nextInt();
		int y = 1;

		while (y <= 10) {
			System.out.println(x + "x" + y + "=" + (x*y));
			y++;
		}
	}

}
