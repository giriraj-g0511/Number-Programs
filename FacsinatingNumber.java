import java.util.Scanner;
public class FacsinatingNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		long no=sc.nextLong();
		if (isFacsinatingNo(no)&&isUnique(no))
				System.out.println(no+" is a Facsinating Number");
			else
				System.out.println(no+" is a not Facsinating Number");
		}

	public static boolean isFacsinatingNo(long no){
		long n1=no*2;
		long n2=(no*3)*Power(no)+no;
		n1=n1*Power(n2)+n2;
		System.out.println(n1+" is a\n");
		if (100000000<n1&&n1<999999999&&isUnique(n1)) {
			return true;	
		}
		else
			return false;		
	}

	public static int Power(long pow){
		long ct=Count(pow);
		int power=1;
		while(ct>0){
			power*=10;
			ct--;
		}
		return power;
	}

	public static int Count(long no){
		int ct=0;
		if(no>0){
			while(no>0){
				ct++;
				no/=10;
			}
		}
		return ct;
	}

	public static boolean isUnique(long n)
	{
		int c=0;
		int ct=Count(n);
		while (n!=0)
		{
			long last=n%10;
			long n1=n/10;

			if (last!=0)
			{
				c++;
				while (n1!=0)
				{
					long last1=n1%10;
					if (last==last1)
					{
						return false;
					}
					else 
						n1=n1/10;
				}
			}

			n=n/10;
		}
		
		if (c==ct)
			return true;
		else 
			return false;
	}

}