import java.util.Scanner;

class AmicableNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int no1=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int no2=sc.nextInt();
		if (isAmicableNo(no1,no2)) {
			System.out.println("It is an Amicable Number");
		}
		else {
			System.out.println("It is not an Amicable Number");
		}
	}

	public static boolean isAmicableNo(int no1,int no2){
		if (sumOfFactor(no1)==no2&&sumOfFactor(no2)==no1)
			return true;
		return false;
	}


	public static int sumOfFactor(int no){
		int sum=0;
		for (int i=1;i<=no/2 ;i++ ) {
			if (no%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

}