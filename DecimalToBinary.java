import java.util.Scanner;

public class DecimalToBinary{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number Greater than 0");
		int no=sc.nextInt();
		if (no<0) {
			System.out.println("Please Enter Number Greater than or equal to 0");			
		}
		else{
			System.out.println(DecimalToBinary(no)+" is Binary Number  & "+no+" is Decimal Number");
		}
	}
	
	public static String DecimalToBinary(int no) {
		String bin="";
		
		if (no==0) {
			return "0";
		}
		else {
			while(no>0){
				if(no%2==0){
					bin="0"+bin;
				}
				else
					bin="1"+bin;
				no/=2;
			}
			return bin;
		}
	}
}
