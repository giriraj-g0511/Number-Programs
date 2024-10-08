import java.util.Scanner;

public class TrimorphicNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isTrimorphicNo(no)) {
			System.out.println(no+" is a Trimorphic Number");
		}
		else {
			System.out.println(no+" is Not a Trimorphic Number");
		}

	}
	
	public static boolean isTrimorphicNo(int no) {
		int ct=DigitCount(no);
		int n=no*no*no;
		int din=1;
		while(ct>0){
			din*=10;
			ct--;
		}

		return n%din==no;
	}

	public static int DigitCount(int no){
		int ct=0;
		while(no>0){
			ct++;
			no/=10;
		}
		return ct;
	}

}
