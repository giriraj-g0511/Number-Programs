import java.util.Scanner;

public class TriangularNumber {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isTriangularNo(no)) {
			System.out.println(no+" is a Triangular Number");
		}
		else {
			System.out.println(no+" is Not a Triangular Number");
		}	
	}
	
	public static boolean isTriangularNo(int no) {
		
		int sum=0;
		for(int i=1;sum<=no;i++) {
			
			sum+=i;
			if(sum==no) {
				return true;
			}
		}
		return false;
	}
}
