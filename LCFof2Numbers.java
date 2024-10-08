import java.util.Scanner;

public class LCFof2Numbers{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter 1st Number");
		int no1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int no2=sc.nextInt();	
		System.out.println("LCF of "+no1+" and "+no2+" is "+LCFofNo(no1,no2));
	}
	
	public static int LCFofNo(int no1,int no2) {
		int pr=no1*no2;
		int rem=no1%no2;
		while(rem!=0){
			no1=no2;
			no2=rem;
			rem=no1%no2;
		}
		return pr/no2;
	}
}