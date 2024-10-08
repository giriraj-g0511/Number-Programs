import java.util.Scanner;

public class Power {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a base Number");
		int base=sc.nextInt();
		System.out.println("Enter a raise/power Number");
		int pow=sc.nextInt();
		if (pow>=0) {
			System.out.println(base+"^"+pow+" ="+PowerP(base,pow));				
		}
		else if (pow<0) {
			System.out.println(base+" is base and "+pow+" is exponential or power and the answer is "+PowerN(base,pow));
		}
	}

	public static int PowerP(int base,int pow){
		int power=1;
		while(pow>0){
			power*=base;
			pow--;
		}
		return power;
	}

	public static double PowerN(int base,int pow){
		double num=1;
		double din=PowerP(base,-pow);
		double expo=num/din; 
		return expo;
	}

}