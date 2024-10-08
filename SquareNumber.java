import java.util.Scanner;

public class SquareNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		
		if(isSquareNo(no)) {
			System.out.println(no+" is a Square Number");
		}
		else {
			System.out.println(no+" is Not a Square Number");
		}
	}
	
	public static boolean isSquareNo(int no) {
		
		for(int i=1;i*i<=no;i++) {
			if(i*i==no) {
				return true;
			}
		}
		return false;
	}

}
