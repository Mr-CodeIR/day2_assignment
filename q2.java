package cjavaassgn_1;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		float Area,Ci,radius;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius  :");
		
	     radius = sc.nextInt();
	     System.out.println("radius is  :"+radius);
	     Area=(float)Math.PI*radius*radius;
	     Ci=(float)Math.PI*radius*2;
	     System.out.println("Area is  :"+Area);
	     System.out.println("Circumference is  :"+Ci);
	    
	}

}
