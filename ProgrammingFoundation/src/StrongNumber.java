
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//145: 1!+4! +5!
		//leetcode.com for the examples of code and also you can execute them
	isStrongNumber(145);
	}
	public static int calculateFact(int number) {
		int result =1;
		int counter=number;
		while(counter>=1) {
			result=result*counter;
			counter--;
			
		}
		return result;
		
	}
public static boolean isStrongNumber(int number) {
	// return type is boolean
	//if methond is going to return boolean value than method name should start with boolean
	//will seperate digit
	//then it will calculate factorial
	int digit=0;
	int sum=0;
	int temp=number;
	while (number>0) {
		digit = number%10;
		sum=sum+ calculateFact(digit);
		System.out.println(digit);
		number= number/10;
	}
		System.out.println(sum);
		System.out.println(number);
		if (temp==sum) {
			return true;
		}
		else 
	return false;
	
}	

}
