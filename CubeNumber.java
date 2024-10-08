import java.util.Scanner;

public class CubeNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		
		if(!isCubeNo(no)) {
			System.out.println(no+" is Not a Cube Number");
		}
	}
	
	public static boolean isCubeNo(int no) {
		
		for(int i=1;i*i*i<=no;i++) {
			if(i*i*i==no) {
				System.out.println(no+" is a Cube Number and it is cube of "+i);
				return true;
			}
		}
		return false;
	}

}
