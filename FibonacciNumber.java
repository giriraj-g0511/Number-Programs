import java.util.Scanner;

public class FibonacciNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		
		if(isFibonacciNo(no)) {
			System.out.println(no+" is a Fibonacci Number");
		}
		else {
			System.out.println(no+" is Not a Fibonacci Number");
		}
	}
	
	public static boolean isFibonacciNo(int no) {
		int f=0;
		int s=1;
		while(f<no && f!=no) {
			int t=f+s;
			f=s;
			s=t;
		}
		return f==no;
	}

}
