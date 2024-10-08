import java.util.Scanner;

class AbundantNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		if (isAbundantNo(sc.nextInt())) {
		System.out.println("It is a Abundant Number");
		}
		else {
		System.out.println("It is not a Abundant Number");
		}
	}

	public static boolean isAbundantNo(int no){
		int sum=0;
		for (int i=1;i<=no/2 ;i++ ) {
			if (no%i==0) {
				sum+=i;
			}
		}
		return sum>no;
	}
}