import java.util.Scanner;

public class DecimalToOctal{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number Greater than 0");
		int no=sc.nextInt();
		if (no<0) {
			System.out.println("Please Enter Number Greater than or equal to 0");			
		}
		else{
			System.out.println(DecimalToOctal(no)+" is Octal Number  & "+no+" is Decimal Number");
		}
	}
	
	public static String DecimalToOctal(int no) {
		String bin="";
		
		if (no==0) {
			return "0";
		}
		
		while(no>0){
			bin=(no%8)+bin;
			no/=8;
		}
		return bin;
	}
}
