
public class VariablesClass {

	public static void main(String[] args) {

		// Purpose of the program: Print "Sneha"
		// Here "Sneha" is a string, and strings need to be in "double quotes" all the
		// time

		String a = "Sneha";

		System.out.println(a);

		DeclareInt();
		DeclareFloat();
		DeclareChar();
		DeclareBoolean();
	}

	// This is a new method called Integers
	public static void DeclareInt() {

		// Purpose of the program: Print the number 2021
		// Here 2021 is a whole number

		int a = 2021;

		System.out.println(a);

	}

	// This is a new method called Float
	public static void DeclareFloat() {

		// Purpose of the program: Print the number 2021.12
		// Here 2021 is a decibel or float number

		float a = (float) 2021.12;

		System.out.println(a);
	}

	// This is a new method called Character
	public static void DeclareChar() {

		// Purpose of the program: Print a character 'S'
		// Here S is a single character

		char a = 'S';

		System.out.println(a);
	}

	// This is a new method called Boolean
	public static void DeclareBoolean() {

		// Purpose of the program: Print a Boolean
		// Booleans are TRUE or FALSE

		boolean a = true;
		System.out.println(a);
		boolean b = false;
		System.out.println(b);
	}
}
