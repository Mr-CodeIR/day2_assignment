package cjavaassgn_1;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		int n;
		float price;
		Scanner sc = new Scanner(System.in);
	         System.out.print("purchased quantity ? :");
	     n = sc.nextInt();
	     price=n*100;
	     if(price>1000) {
	    	 price=(float)0.9*price;
	    	  System.out.println("Total cost for User is "+price+" for "+n+" units.");
	     }
	     else
	     {
	    	 System.out.println("Total cost for User is "+price+" for "+n+" units.");
	     }
	     

	}

}
