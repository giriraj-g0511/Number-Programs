import java.util.Scanner;

public class KaprekarNumber {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		if(isKaprekarNo(no)) {
			System.out.println(no+" is Kaprekar Number");
		}
		else {
			System.out.println(no+" is Not Kaprekar Number");
		}
	}
	public static boolean isKaprekarNo(int no) {
		if (no==1) {
			return true;
		}
		else if(count(square(no))%2!=0) {
			return false;
		}
		else if(splitAdd(count(square(no)),square(no)) == no) {
			return true;
		}
		else {	
			return false;			
		}
	}
	public static int splitAdd(int count, int square) {
		int den=base(count/2);
		int no=(square/den)+(square%den);
		return no;		
	}
	public static int base(int count) {
		int base=1;
		while(count>0) {
			base*=10;
			count--;
		}
		return base;
	}
	public static int count(int square) {
		int ct=0;
		while(square>0) {
			ct++;
			square/=10;
		}
		return ct;
	}
	public static int square(int no) {
		return no*no;
	}

}
