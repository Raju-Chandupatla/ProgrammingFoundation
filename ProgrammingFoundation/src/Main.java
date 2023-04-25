import java.util.Scanner;
//I am going to use a calss scanner class which is available in java.util package
// to use those functions we import the package above the mail method

public class Main {
	
public static float add (float a, float b) {
	return a+b;
}
public static float sub (float a, float b) {
	return a-b;
}
public static float mul (float a, float b) {
	return a*b;
}
public static float div (float a, float b) {
	return a/b;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inputs
		float numberA = 10.4f;// 10.4 is a float value.
		float numberB = 14.2f;
		// process
		// addition of 2 numbers, result variable will hold the addition result
		double result1 = numberA + numberB;
		System.out.println("sum of the 2 numbers = " + result1);
		
		
		//scanner class: scanner designed to accept the input the user
		// scanned class is designed by java from version 1.5
		// it has built in functions/methods to accept specific type values
		// to accept the integer: nextInt(), to accept float --> nextFloat()
		//scanned class is available in java.utils package.
		//package : location where class/ interface are available
		Scanner scanner = new Scanner(System.in);
		//ctrl+space gives the existing java functions/keywords
		// switch case use for according to user input
		
		while(true) {
			System.out.println("Enter the calculation based on choice" + "\n 1.Add \n 2.Sub \n 3.div \n 4.mul \n 5.exit");
		
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("addition case");
			System.out.println("enter the number you want to do addition: ");
			float number1 = scanner.nextFloat();
			float number2 = scanner.nextFloat();
			float result = add(number1, number2);
			
			System.out.println("add result: " +result);
			
				}
		break;
		case 2: {
			System.out.println("subtraction case");
			System.out.println("enter the number you want to do subtraction: ");
			float number1 = scanner.nextFloat();
			float number2 = scanner.nextFloat();
			float result = sub(number1, number2);
			
			System.out.println("sub result: " +result);
				}
		break;
		case 3: {
			System.out.println("division case");
			System.out.println("enter the number you want to do division: ");
			float number1 = scanner.nextFloat();
			float number2 = scanner.nextFloat();
			float result = div(number1, number2);
			
			System.out.println("div result: " +result);
				}
		break;
		case 4: {
			System.out.println("multiplication case");
			System.out.println("enter the number you want to do multiplication: ");
			float number1 = scanner.nextFloat();
			float number2 = scanner.nextFloat();
			float result = mul(number1, number2);
			
			System.out.println("mul result: " +result);
				}
		break;
		case 5: {
			System.out.println("exiting the calculation");
			System.exit(0);
				}
		break;
		default: {
			System.out.println("enter only choices from 1 to 5");
				}
		}
		}
	}

}
