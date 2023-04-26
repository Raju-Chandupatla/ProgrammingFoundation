
public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//factorial 5! = 5*4*3*2*1
				// 2 kinds of loops 
				//1.entry control loop - first checks condition then executes the code, if condition fails go to the false steps in code eg: for, while
				//2. exit control loop - first execute the code then checks condition  -eg:  do while loop
	int number=5;
	int result =1;
	int counter =number;
	while(counter>=1) {
		result=result*counter;
		counter--;
	}
	System.out.println("factorial of  "+number +" is : "+ result);
	}
	}


