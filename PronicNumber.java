import java.util.Scanner;

public class PronicNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isPronicNo(no)) {
			System.out.println(no+" is a Pronic Number");
		}
		else {
			System.out.println(no+" is Not a Pronic Number");
		}

	}
	
	public static boolean isPronicNo(int no) {
		for (int i=0;i<=no ;i++ ) {
			if (i*(i+1)==no) {
				return true;
			}
		}
		return false;
	}

}
