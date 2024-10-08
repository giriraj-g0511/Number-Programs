import java.util.Scanner;

public class MagicNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isMagicNo(no)==1) {
			System.out.println(no+" is a Magic Number");
		}
		else {
			System.out.println(no+" is Not a Magic Number");
		}

	}
	
	public static int isMagicNo(int no) {
		int sum=0;
		int ct=countOfDigit(no);
		while(no>0){
			int last=no%10;
			sum=sum+last;
			no/=10;
		}
			if (no==0 && countOfDigit(sum)>1) {
					sum=isMagicNo(sum);
			}
		return sum;
	}

	public static int countOfDigit(int no){
		int ct=0;
		if(no>0){
			while(no>0){
				ct++;
				no/=10;
			}
		}
		return ct;
	}

}
