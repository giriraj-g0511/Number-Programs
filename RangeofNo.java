
/*===============	Program Usage Guidelines	================*/

/*
 * While using these programs, ensure that all required methods and variables are present in the same class.
 * If you have a good understanding of methods and their workings, you can easily modify the code.
 * Please pay attention to the naming of methods and how they are called.
 * For demonstration purposes, I have provided the "DemoRangeofNo.java" file, which lists Pell numbers 
 * within a range specified by the user (start and end).
 * Before applying the code, please review the "DemoRangeofNo.java" file.
 */

/*----------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class RangeofNo {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		RangeFrom();
	}

	public static void RangeFrom(){
		
		System.out.println("Enter Start of range:");
		int start=sc.nextInt();
		System.out.println("Enter End of range:");
		int end=sc.nextInt();
		int ct=1;
		if (end>=start) {
			while(start<=end){
				if(/*enter here method call statement and pass start as argument for that method*/){
					System.out.println(ct+") "+start);
					ct++;
				}
				start++;
			}
		}
		else
				System.out.println("Please enter proper range\nLet's try again");	
	}
}