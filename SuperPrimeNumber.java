import java.util.Scanner;

public class SuperPrimeNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isSuperPrimeNo(no)) {
			System.out.println(no+" is Super Prime Number");
		}
		else {
			System.out.println(no+" is not a Super Prime Number");
		}
	}
	public static boolean isSuperPrimeNo(int no) {
		if (isPrimeNo(no)&&isPrimeNo(PrimePosition(no))) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrimeNo(int no) {
		if (no<=1) {
			return false;
		}
		for (int i=2;i<=no/2 ;i++ ) {
			if (no%i==0) {
				return false;
			}
		}
		return true;
	}

	public static int PrimePosition(int no) {
		int position=0;
		int num=2;
		while(no>=num){
			if (isPrimeNo(num)) {
				position++;
			}
			num++;
		}
		return position;
	}

}

