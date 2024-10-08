import java.util.Scanner;

public class FermatPrimeNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isFermatPrimeNo(no)) {
			System.out.println(no+" is a Fermat Prime Number");
		}
		else {
			System.out.println(no+" is Not a Fermat Prime Number");
		}	
	}
	
	public static boolean isFermatPrimeNo(int no) {
		return isFermatNo(no)==isPrime(no);
	}
	
	public static boolean isFermatNo(int no) {
		int f=3;
		for(int i=1;f<no;i++) {
			f=Exponent(2,Exponent(2,i))+1;
		}
		return f==no;
	}
	
	public static int Exponent(int i, int i2) {
		if(i2>0) {
			int p = 1;
			while(i2>=1) {
				p*=2;
				i2--;
			}
			return p;
		}
		return 0;
	}

	public static boolean isPrime(int no) {
		for(int i=2;i<=no/2;i++) {
			if(no%2==0)
				return false;
		}
		return true;
	}
	
	
}

