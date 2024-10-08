import java.util.Scanner;

public class DisariumNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isDisariumNo(no)) {
			System.out.println(no+" is a Disarium Number");
		}
		else {
			System.out.println(no+" is Not a Disarium Number");
		}

	}
	
	public static boolean isDisariumNo(int no) {
		int sum=0;
		int n=no;
		int ct=countOfDigit(no);
		while(n>0&&ct>0){
			int last=n%10;
			sum+=Power(last,ct);
			n/=10;
			ct--;
		}
		return sum==no;
	}

	public static int countOfDigit(int no){
		int ct=0;
		while(no>0){
			ct++;
			no/=10;
		}
		return ct;
	}

	public static int Power(int no,int pow){
		int power=1;
		while(pow>0){
			power*=no;
			pow--;
		}
		return power;
	}

}
