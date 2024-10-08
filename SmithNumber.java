import java.util.Scanner;

class SmithNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		if (isSmithNo(sc.nextInt())) {
		System.out.println("It is Smith Number");
		}
		else {
		System.out.println("It is not a Smith Number");
		}
	}

	public static boolean isSmithNo(int no){
		if (no<=1) {
			return false;
		}
			return DigitSum(no)==primeFactorSum(no);
	}

	public static int primeFactorSum(int no){
		int sum=0;
		int i=2;
		int n=no;
		while(no>1) {
			if (i==n) {
				break;
			}
			else if(no%i==0){
				if (isPrime(i)) {
					if (countOfDigit(i)>1) {
						i=DigitSum(i);
					}
					no/=i;
					sum+=i;
				}
				i=2;
			}
			else
			i++;
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

	public static int DigitSum(int no) {
		int sum=0;
		int ct=countOfDigit(no);
		while(no>0){
			int last=no%10;
			sum=sum+last;
			no/=10;
		}
			if (no==0 && countOfDigit(sum)>1) {
					sum=DigitSum(sum);
			}

		return sum;
	}

	public static boolean isPrime(int no){
		for (int i=2;i<=no/2 ;i++ ) {
			if(no%i==0){
				return false;
			}
		}
		return true;
	}
}