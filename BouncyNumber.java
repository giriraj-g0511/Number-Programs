import java.util.Scanner;

public class BouncyNumber {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a Number:");
		int no=sc.nextInt();
		if(isBouncyNo(no)) {
			System.out.println(no+" is Bouncy Number");
		}
		else {
			System.out.println(no+" is Not Bouncy Number");
		}
	}
	
	public static boolean isBouncyNo(int no) {
		
		boolean inc=false;
		boolean dec=false;
		int last=no%10;
		while(no>9) {
			no/=10;
			int seclast=no%10;
			if(last>seclast) {
				dec=true;
			}
			else if(seclast>last) {
				inc=true;
			}
			
			if(inc==true && dec==true) {
				return true;
			}
			last=seclast;
		}
		return false;
	}
}
