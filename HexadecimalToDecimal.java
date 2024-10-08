import java.util.Scanner;

public class HexadecimalToDecimal{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		String no=sc.next();
		System.out.println(HexadecimalToDecimal(no)+" is Decimal Number  & "+no+" is Hexa-Decimal Number");
	}
	
	public static int HexadecimalToDecimal(String no) {
		int dec=0;
		int i=0;
		int l=no.length()-1;
		while(l>=0){
			int num=-1;
			int ch=no.charAt(l);
			if (48<=ch&&ch<=57) {

				num=ch-48;
			}
			else if (65<=ch&&ch<=70) {
				num=ch-55;
			}
			else if (97<=ch&&ch<=102) {
				num=ch-87;
			}
			else{
				System.out.println("Wrong Input Please try again");
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
			power*=16;
			pow--;
		}
		return power;
	}
}
