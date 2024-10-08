import java.util.Scanner;

public class BinaryToDecimal{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		String no=sc.next();
		int dec=BinaryToDecimal(no);	
		if (dec!=-1) {
			System.out.println(dec+" is Decimal Number  & "+no+" is Binary Number");
		}
	}
	
	public static int BinaryToDecimal(String no) {
		int dec=0;
		int i=0;
		int l=no.length()-1;
		while(l>=0) {
			int num;
			if (no.charAt(l)=='0') {
				num=0;
			}
			else if (no.charAt(l)=='1') {
				num=1;
			}
			else{
				System.out.println("Wrong Input Please try again");
				return -1;
			}
			dec=Power(i)*num+dec;
			l--;
			i++;
		}
		return dec;
	}

	public static int Power(int pow){
		int power=1;
		while(pow>0){
			power*=2;
			pow--;
		}
		return power;
	}

}
