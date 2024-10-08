import java.util.Scanner;

public class NeonNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isNeonNo(no)) {
			System.out.println(no+" is a Neon Number");
		}
		else {
			System.out.println(no+" is Not a Neon Number");
		}

	}
	
	public static boolean isNeonNo(int no) {
		int sum=0;
		int n=no*no;
		while(n>0){
			int last=n%10;
			sum+=last;
			n/=10;
		}
		return sum==no;
	}

}
