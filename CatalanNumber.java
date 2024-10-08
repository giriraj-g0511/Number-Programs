import java.util.Scanner;

public class CatalanNumber{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();	
		if (isCatalanNo(no)) {
			System.out.println(no+" is a Catalan Number");
		}
		else
			System.out.println(no+" is not a Catalan Number");
	}
	
	public static int FactorialOf(int no) {
		int factorial=1;
		while(no>1){
			factorial*=no;
			no--;
		}
		return factorial;
	}

	public static boolean isCatalanNo(int no) {
		int n=1;
		int c0=1;
		float c1=1;
		while(no>=c0){
			int num=FactorialOf(n*2);
			int din=FactorialOf(n+1)*FactorialOf(n);
			c0=num/din;
			c1=num/din;
			if (c0==c1&&c0==no) {
				return true;
			}
			n++;
		}
		return false;
	}
}