import java.util.Scanner;

public class LucasNumber {
		
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Enter a Number");
			int no=sc.nextInt();
			if(isLucasNo(no)) {
				System.out.println(no+" is a Lucas Number");
			}
			else {
				System.out.println(no+" is Not a Lucas Number");
			}	
		}
		public static boolean isLucasNo(int no) {
			if (no==1) {
				return true;
			}
			int f=2;
			int s=1;
			while(f<=no) {
				if(f==no) {
					return true;
				}
				int t=f+s;
				f=s;
				s=t;
			}
			return f==no;
		}

}
