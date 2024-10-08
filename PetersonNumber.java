import java.util.Scanner;
//it also called as Strong Number or Krishnamurthy Number
public class PetersonNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isPetersonNo(no)) {
			System.out.println(no+" is a Peterson Number");
		}
		else {
			System.out.println(no+" is Not a Peterson Number");
		}

	}
	
	public static boolean isPetersonNo(int no) {
		int sum=0;
		int n=no;
		while(no>0){
			int last=no%10;
			sum+=factorial(last);
			no/=10;
		}
		return sum==n;
	}

	public static int factorial(int no) {		
		int pr=1;
		while(no>1) {
			pr*=no;
			no--;
		}
		return pr;
	}

}
