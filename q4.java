package cjavaassgn_1;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		int n,f,l;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number  :");
		
	     n = sc.nextInt();
	     System.out.println("n is  :"+n);
	     f=n/10000;
	     l=n%10;
	     System.out.println("Sum of 1st and last digit of 5 digit number is :"+(f+l));
	     

	}

}
