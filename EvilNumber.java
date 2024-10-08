import java.util.Scanner;

public class EvilNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isEvilNo(no)) {
			System.out.println(no+" is a Evil Number");
		}
		else {
			System.out.println(no+" is Not a Evil Number");
		}

	}
	
	public static boolean isEvilNo(int no) {
		String binary=DecimalToBinary(no);
		int ct=0;
		for (int i=0;i<binary.length();i++ ) {
			if (binary.charAt(i)=='1') {
				ct++;
			}
		}
		return ct%2==0;
	}

	public static String DecimalToBinary(int no) {
		String bin="";
		
		if (no==0) {
			return "0";
		}
		
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
