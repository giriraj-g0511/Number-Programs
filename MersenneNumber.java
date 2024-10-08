import java.util.Scanner;

class MersenneNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no=sc.nextInt();
		if (no<0) {
			System.out.println("Enter a Number which is greater than or equal to 0");
		}
		else if (isMersenneNo(no)) {
			System.out.println("It is a Mersenne Number");
		}
		else {
			System.out.println("It is not a Mersenne Number");
		}
	}

	public static boolean isMersenneNo(int no){
		int i=0;
		int num=0;
		while(num<=no) {
			num=Power(2,i)-1;
			if (num==no) {
				return true;
			}
			i++;
		}
		return false;
	}
	
	public static int Power(int base,int pow){
		int power=1;
		while(pow>0){
			power*=base;
			pow--;
		}
		return power;
	}

}