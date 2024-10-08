import java.util.Scanner;

public class SumOf_N_NaturalNumber{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();	
		System.out.println("Sum of first "+no+" natural Number is "+SumOf_N_NaturalNo(no));
	}
	
	public static int SumOf_N_NaturalNo(int no) {
		//return (no*(no+1))/2;
		int sum=0;
		for (int i=1;i<=no ;i++ ) {
			sum+=i;
		}
		return sum;
	}
}
