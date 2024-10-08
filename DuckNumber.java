import java.util.Scanner;

class DuckNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number which is greater than 0");
		int no=sc.nextInt();
		if (no>0) {
			if (isDuckNo(no)){
				System.out.println("It is a Duck Number");
			}
			else {
				System.out.println("It is not a Duck Number");
			}
		}
		else
			System.out.println("Enter number greater than 0");	
	}

	public static boolean isDuckNo(int no){
		
		while(no>0){
			int last=no%10;
			if (last==0) {
				return true;
			}
			no/=10;
		}
		return false;
	}
}