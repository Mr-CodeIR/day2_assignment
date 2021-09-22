package cjavaassgn_1;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("INPUT  :");
		
	     n = sc.nextInt();
	     
	     if(n>0)
	     {
	    	 System.out.println("OUTPUT :"+n);
	     }
	     else
	     {
	    	 System.out.println("OUTPUT :"+(n*(-1)));
	     }
	}

}
