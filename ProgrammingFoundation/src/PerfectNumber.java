
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//28-->14-->1 all the numbers from 1 to 14 and will apply the complete div(remainder0)==>1,2,4,7,14
boolean result= isPerfectNumber(28);
System.out.println("perfectnumber: "+result);
}

	public static boolean isPerfectNumber(int number){
		int half=number/2;
		int remainder=0;
		int sum =0;
		int counter=1;
		while(counter<=half){
			remainder = number%counter;
			if(remainder==0){
				sum =sum+counter;
				System.out.println(sum);
			}
			counter++;
				
		}
		System.out.println(sum);
		if (number==sum) {
			return true;
		}
		else
			return false;
		
	}
}
