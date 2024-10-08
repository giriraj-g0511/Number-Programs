import java.util.Scanner;

public class TwistedPrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int no=sc.nextInt();
		isTwistedPrimeNo(no);
		}

	public static void isTwistedPrimeNo(int no){
		if (isPrimeNo(no)) {
			int n=reverseNo(no);
			if (isPrimeNo(n))
				System.out.println(no+" and "+n+" are a Twisted Prime Number");
			else
				System.out.println(no+" is a Prime Number but not Twisted Prime");
		}
		else
		System.out.println(no+" is not a Prime Number");
	}

	public static boolean isPrimeNo(int no)
	{
		for (int i=2;i<=no/2 ;i++ )
		{
			if (no%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static int reverseNo(int no)
	{
		int rev=0;
		for (int j=no;j!=0 ;j=j/10 )
		{
			int last=j%10;
			rev=rev*10+last;
		}
		return rev;
	}
}