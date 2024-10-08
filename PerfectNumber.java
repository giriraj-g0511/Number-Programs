import java.util.Scanner;

public class PerfectNumber {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isPerfectNo(no)) {
			System.out.println(no+" is a Perfect Number");
		}
		else {
			System.out.println(no+" is Not a Perfect Number");
		}	
	}
	
	public static boolean isPerfectNo(int no) {
		return no==divisorSum(no);
	}

	public static int divisorSum(int no) {
		int sum=1;
		for(int i=2;i<=no/2;i++) {
			if(no%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

}
