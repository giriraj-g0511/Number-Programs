import java.util.Scanner;

class ReverseNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		System.out.println(ReverseNo(sc.nextInt()));
	}

	public static int ReverseNo(int no){
		int rev=0;
		while(no!=0){
			int last=no%10;
			no/=10;
			rev=last+rev*10;
		}
		return rev;
	}
}