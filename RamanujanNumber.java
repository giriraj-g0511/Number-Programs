import java.util.Scanner;

public class RamanujanNumber {
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		if(!isRamanujanNo(no)) {
			System.out.println(no+" is Not Ramanujan Number");		
		}
	}

	public static boolean isRamanujanNo(int no) {
		int ram[]=new int[4];
		int n1=1,n2=n1;
		int str=0;
		
		while(cube(n1)<no || cube(n2)<no) {
			
			if(str>4) {
				break;
			}
			if(cube(n1)+cube(n2)==no && str<4) {
				ram[str]=n1;
				ram[str+1]=n2;
				str+=2;
				n1++;
				n2=n1;
			}
			else if(cube(n2)>no) {
				n1++;
				n2=n1;
			}
			n2++;
		}
		
		for(int i=0;i<ram.length;i++) {
			if(ram[i]==0) {
				return false;
			}	
		}
		System.out.println(no+" is Ramanujan Number and it can be expressed as ");
		System.out.println(+no+"	=	"+ram[0]+"^3 + "+ram[1]+"^3"+"	=	"+ram[2]+"^3 + "+ram[3]+"^3");
		return true;
	}

	

	public static int cube(int n) {
		return n*n*n;
	}

}




