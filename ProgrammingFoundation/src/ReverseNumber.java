
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=isReverseNumber(15000);
		System.out.println("reverse of number: "+result);
	}

	public static int isReverseNumber(int number) {
		int reversenumber = 0;
		int digit=0;
		while(number>0) {
			digit = number%10;
			reversenumber=reversenumber*10+digit;
			number= number/10;
		}
		return reversenumber;
	}
	
}
