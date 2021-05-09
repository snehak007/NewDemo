import java.util.Scanner;

public class ShortHandifs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	System.out.println("Enter the time in military format, i.e, 6pm is 1800");
	int time = input.nextInt();
	
	String result = (time<1800)? "Good day" : "Good evening";
	System.out.println(result);
	}
}
