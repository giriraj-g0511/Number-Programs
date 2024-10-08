import java.util.Scanner;

public class FactorsOfNumber{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();	
		if (no<0) {
			System.out.println("Please Enter Number Greater than 0");			
		}
		else{
			System.out.println("Factors of "+no+" are are as follows");
			FactorsOf(no);
			System.out.println(no);
		}	
		
	}
	
	public static void FactorsOf(int no) {
		for (int i=1;i<=no/2 ;i++ ) {
			if (no%i==0) {
				System.out.println(i+", ");
			}
		}
	}
}
