import java.util.Scanner;

public class DecimalToHexadecimal{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number Greater than 0");
		int no=sc.nextInt();
		if (no<0) {
			System.out.println("Please Enter Number Greater than or equal to 0");			
		}
		else{
			System.out.println(DecimalToHexadecimal(no)+" is Hexa-Decimal Number  & "+no+" is Decimal Number");
		}
	}
	
	public static String DecimalToHexadecimal(int no) {
		String bin="";
		
		if (no==0) {
			return "0";
		}
		
		while(no>0){
			char num;
			int n=no%16;
			if (10<=n&&n<=15) {

				num=(char)(n+55);
			}
			else {
				num=(char)(n+48);
			}
			bin=num+bin;
			no/=16;
		}
		return bin;
	}
}
