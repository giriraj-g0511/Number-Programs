import java.util.Scanner;

class MersennePrimeNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int no=sc.nextInt();
		if (no<0) {
			System.out.println("Enter a Number which is greater than or equal to 0");
		}
		else if (isMersennePrimeNo(no)) {
			System.out.println("It is a Mersenne Prime Number");
		}
		else {
			System.out.println("It is not a Mersenne Prime Number");
		}
	}

	public static boolean isMersennePrimeNo(int no){
		return isPrimeNo(no)&&isMersenneNo(no);
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

	public static boolean isMersenneNo(int no){
		int i=0;
		int num=0;
		while(num<=no) {
			num=Power(2,i)-1;
			if (num==no) {
				return true;
			}
			i++;
		}
		return false;
	}
	
	public static int Power(int base,int pow){
		int power=1;
		while(pow>0){
			power*=base;
			pow--;
		}
		return power;
	}

}