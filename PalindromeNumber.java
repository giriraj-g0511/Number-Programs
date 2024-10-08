import java.util.Scanner;

class PalindromeNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		if(isPalindromeNo(sc.next())){
			System.out.println("It is Palindrome Number");
		}
		else {
			System.out.println("It is not a Palindrome Number");
		}
	}

	public static boolean isPalindromeNo(String no){
		for (int i=0,j=no.length()-1;i<=j ;i++,j-- ) {
			if(no.charAt(i)!=no.charAt(j)){
				return false;
			}
		}
		return true;
	}
}