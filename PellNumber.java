import java.util.Scanner;

class PellNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		if(isPellNo(sc.nextInt())){
			System.out.println("It is Pell Number");
		}
		else {
			System.out.println("It is not a Pell Number");
		}
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