
public class ArmstrongNumber {
//153: {1(3)+3(3)+5(3)

	public static void main(String[] args) {
		boolean result = isArmstrong(153);
		System.out.println(result);
	}

	public static boolean isArmstrong(int number) {
		int digit;
		int temp = number;
		int sum = 0;
		while (number > 0) {
			digit = number % 10;
			sum = sum + digit * digit * digit;
			number = number / 10;

		}
		if (temp == sum) {
			return true;
		}
		return false;
	}

}
