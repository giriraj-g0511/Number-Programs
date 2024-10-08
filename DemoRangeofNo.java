import java.util.Scanner;

public class DemoRangeofNo {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		RangeFrom();
	}

	public static void RangeFrom(){
		
		System.out.println("Enter Start of range:");
		int start=sc.nextInt();
		System.out.println("Enter End of range:");
		int end=sc.nextInt();
		int ct=1;
		if (end>=start) {
			while(start<=end){
				if(isPellNo(start)){
					System.out.println(ct+") "+start);
					ct++;
				}
				start++;
			}
		}
		else
			System.out.println("Please enter proper range\nLet's try again");	
	}

	public static boolean isPellNo(int no){
		int f=0,s=1;
		while(f<no &&no!=f){
			int t=(s*2)+f;
			f=s;
			s=t;
		}
		return f==no;
	}

}