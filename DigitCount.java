import java.util.Scanner;

public class DigitCount {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
			System.out.println(no+" is a "+countOfDigit(no)+" digit Number");
	}

	public static int countOfDigit(int no){
		int ct=0;
		if(no>0){
			while(no>0){
				ct++;
				no/=10;
			}
		}
		else if(no<0){
			while(no<0){
				ct++;
				no/=10;
			}
		}
		else
			return 0;

		return ct;
	}

}