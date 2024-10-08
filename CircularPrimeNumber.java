import java.util.Scanner;

class CircularPrimeNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int no=sc.nextInt();
		if (isCircularPrimeNo(no)) {
			System.out.println("It is a Circular Prime Number");
		}
		else {
			System.out.println("It is not a Circular Prime Number");
		}
	}

	public static boolean isCircularPrimeNo(int no){
		int ct=count(no);
		int power=Power(10,ct-1);
		while(ct>0){
			if(isPrime(no)){
				int last=no%10;
				no/=10;
				no=last*power+no;
				ct--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int no){
		for (int i=2;i<=no/2 ;i++ ) {
			if (no%i==0) {
				return false;
			}
		}
		return true;
	}

	public static int Power(int base,int pow){
		int power=1;
		while(pow>0){
			power*=base;
			pow--;
		}
		return power;
	}
	
	public static int count(int no){
		int ct=0;
		while(no>0){
			no/=10;
			ct++;
		}
		return ct;
	}

}