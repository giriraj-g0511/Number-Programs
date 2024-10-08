import java.util.Scanner;

class DigitSum{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no=sc.nextInt();
		if (no<0) {
			System.out.println("Please Enter Number Greater than or equal to 0");			
		}
		else{
			System.out.println(DigitSum(no)+" is Sum of Digit");
		}
	}

	public static int DigitSum(int no){
		int sum=0;
		while(no!=0){
			int last=no%10;
			no/=10;
			sum+=last;
		}
		return sum;
	} 
}