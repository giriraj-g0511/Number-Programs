import java.util.Scanner;

public class PrimeNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		if(isPrimeNo(no)) {
			System.out.println(no+" is Prime Number");
		}
		else {
			System.out.println(no+" is Not Prime Number");
		}
	}
	public static boolean isPrimeNo(int no) {
		if(no<=1){
		    return false;
		}
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0) 
			{
				return false;
			}
		}
		return true;
	}

}
