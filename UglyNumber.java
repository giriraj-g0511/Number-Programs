import java.util.Scanner;

class UglyNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		if (isUglyNo(sc.nextInt())) {
			System.out.println("It is an Ugly Number");
		}
		else {
			System.out.println("It is not an Ugly Number");
		}
	}

	public static boolean isUglyNo(int no){
		for (int i=7;i<=no ;i++) {
			if (isPrimeNo(i)&&no%i==0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeNo(int no){
		
		for (int i=2;i<=no/2 ;i++) {
			if (no%i==0) {
				return false;
			}
		}
		return true;
	}

}