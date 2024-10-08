import java.util.Scanner;

public class SumOfDigitOfNumber{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();	
		System.out.println("Sum of all digit of "+no+" is "+SumOfDigitOfNumber(no));
	}
	
	public static int SumOfDigitOfNumber(int no) {
		int sum=0;
		while(no>0) {
			int last=no%10;
			no/=10;
			sum+=last;
		}
		return sum;
	}
}
