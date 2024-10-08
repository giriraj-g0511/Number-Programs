import java.util.Scanner;

public class AutomorphicNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isAutomorphicNo(no)) {
			System.out.println(no+" is Automorphic Number");
		}
		else {
			System.out.println(no+" is not a Automorphic Number");
		}
	}
	public static boolean isAutomorphicNo(int no) {
		return (no==last(no,square(no)));
	}
	
	public static int last(int no, int square) {
		return square%(base(no));
	}
	
	public static int base(int count) {
		int b=1;
		while(count!=0) {
			b*=10;
			count/=10;
		}
		return b;
	}
	
	public static int square(int no) {
		return no*no;
	}

}
