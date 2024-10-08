import java.util.Scanner;

public class HCFof2Numbers{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter 1st Number");
		int no1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int no2=sc.nextInt();	
		if (no1>0&&no2>0) {
			System.out.println("HCF of "+no1+" and "+no2+" is "+HCFofNo(no1,no2));
		}
		else
			System.out.println("Please enter number greater than 0");
	}
	
	public static int HCFofNo(int no1,int no2) {
		int rem=no1%no2;
		while(rem!=0){
			no1=no2;
			no2=rem;
			rem=no1%no2;
		}
		return no2;
	}
}