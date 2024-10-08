import java.util.Scanner;

public class DeficientNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isDeficientNo(no)) {
			System.out.println(no+" is a Deficient Number");
		}
		else {
			System.out.println(no+" is Not a Deficient Number");
		}	
	}
	
	public static boolean isDeficientNo(int no) {
		
		int sum=0;
		for(int i=1;i<=no/2;i++) {
			if(no%i==0) {
				sum+=i;
			}
		}
		return sum<no;
	}


}
