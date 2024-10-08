import java.util.Scanner;

class AmstrongNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		if (isAmstrongNo(sc.nextInt())) {
			System.out.println("It is an Amstrong Number");
		}
		else {
			System.out.println("It is not an Amstrong Number");
		}
	}

	public static boolean isAmstrongNo(int no){
		int sum=0;
		int num=no;
		int ct=count(no);
		while(no!=0){
			int last=no%10;
			no/=10;
			int pow=1;
			for (int i=ct;i!=0 ;i-- ) {
				pow=pow*last;
			}
			sum+=pow;
		}

		return sum==num;
	}

	public static int count(int no){
		int ct=0;
		while(no>0){
			no/=10;
			ct++;
		}
		return ct;
	}
}