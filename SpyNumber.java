import java.util.Scanner;

public class SpyNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isSpyNo(no)) {
			System.out.println(no+" is a Spy Number");
		}
		else {
			System.out.println(no+" is Not a Spy Number");
		}

	}
	
	public static boolean isSpyNo(int no) {
		int sum=0;
		int pr=1;

		while(no>0){
			int last=no%10;
			sum+=last;
			pr*=last;
			no/=10;
		}


		return sum==pr;
	}

}
