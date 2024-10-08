import java.util.Scanner;

public class FermatNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isFermatNo(no)) {
			System.out.println(no+" is a Fermat Number");
		}
		else {
			System.out.println(no+" is Not a Fermat Number");
		}	
	}
	
	public static boolean isFermatNo(int no) {
		int f=3;
		for(int i=1;f<no;i++) {
			f=Exponent(2,Exponent(2,i))+1;
		}
		return f==no;
	}
	
	public static int Exponent(int i, int i2) {
		int p = 1;
		while(i2>=1) {
			p*=2;
			i2--;
		}
		return p;
	}
	
}
