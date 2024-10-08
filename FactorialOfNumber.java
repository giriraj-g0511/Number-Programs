import java.util.Scanner;

public class FactorialOfNumber{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();	
		if (no<0) {
			System.out.println("Please Enter Number Greater than 0");			
		}
		else{
			System.out.println("Factorial of "+no+" is "+FactorialOf(no));
		}
	}
	
	public static int FactorialOf(int no) {
		int factorial=1;
		while(no>1){
			factorial*=no;
			no--;
		}
		return factorial;
	}
}
