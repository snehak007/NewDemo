import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// for loop
		
		Scanner input = new Scanner(System.in);
System.out.print("Enter a number");
		
		int num=4;
		for(int i=1; i<=6; ++i) {
			System.out.println(num + "x" + i + "=" + (num*i));
		}
	}

}
