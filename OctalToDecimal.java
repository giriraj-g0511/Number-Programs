import java.util.Scanner;

public class OctalToDecimal{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();	
		int dec=OctalToDecimal(no);
		if (no<0) {
			System.out.println("Enter a number which is greater than or equal to 0");
		}
		else if(dec!=-1) {		
			System.out.println(dec+" is Decimal Number  & "+no+" is Octal Number");
		}
	}
	
	public static int OctalToDecimal(int no) {
		int dec=0;
		int i=0;
		while(no>0) {
			int last=no%10;
			if (last>7) {
				System.out.println("Wrong Input Please try again");
				return -1;
			}
			no/=10;
			dec=Power(i)*last+dec;
			i++;
		}
		return dec;
	}

	public static int Power(int pow){
		int power=1;
		while(pow>0){
			power*=8;
			pow--;
		}
		return power;
	}

}
