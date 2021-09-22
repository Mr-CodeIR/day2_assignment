package cjavaassgn_1;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		int sum=0,x,y,z,n,m;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n  :");
		
	     n = sc.nextInt();
	     System.out.println("n is  :"+n);
	    
	    if(n<10)
	    {
	    	sum=n;
	    	System.out.println("Sum is :"+sum);
	    }
	    if(n>9 && n<100)
	    {
	    	x=n%10;
	    	y=n/10;
	    	sum=x+y;
	    	System.out.println("Sum is :"+sum);
	    }
	    if(n>99 && n<1000)
	    {
	    	x=n%10;
	    	y=n/10;
	    	m=y%10;
	    	z=n/100;
	    	sum=x+m+z;
	    	System.out.println("Sum is :"+sum);
	    }


	}

}
