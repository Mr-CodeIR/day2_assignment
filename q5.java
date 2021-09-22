package cjavaassgn_1;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		
		int n1,n2,choice;
		do{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers  :");
		
	     n1 = sc.nextInt();
	     n2 = sc.nextInt();
	     System.out.println("numbers are :"+n1+" and"+n2);
	     System.out.println("Choose operation to perform  :");
	     System.out.println("1:Add");
	     System.out.println("2:Subtract");
	     System.out.println("3:Multiply");
	     System.out.println("4:Divide");
	     System.out.print("choice :");
	     choice = sc.nextInt();
	    
	    	 switch(choice)
	    	 {
	    	 case 1:
	    		 System.out.println("Addition is:"+(n1+n2));
	    		 System.out.println();
	    		 break;
	    	 case 2:
	    		 System.out.println("Substraction is:"+(n1-n2));
	    		 System.out.println();
	    		 break;
	    	 case 3:
	    		 System.out.println("Multipication is:"+(n1*n2));
	    		 System.out.println();
	    		 break;
	    	 case 4:
	    		 System.out.println("Division is:"+(n1/n2));
	    		 System.out.println();
	    		 break;
	    	
	    	 }
		}while(choice!=0);
	    	 
	}

}
