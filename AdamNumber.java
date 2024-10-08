import java.util.Scanner;

public class AdamNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no=sc.nextInt();
		if(isAdamNo(no)){
			System.out.println(no+" is Adam Number");
		}
		else{
			System.out.println(no+" is not a Adam Number");
		}
	}

	public static boolean isAdamNo(int no){
		return no*no==reverse(reverse(no)*reverse(no));
	}

	public static int reverse(int n){
		int rev=0;
		while(n>0){
			int last=n%10;
			n/=10;
			rev=rev*10+last;
		}
		return rev;
	}
}