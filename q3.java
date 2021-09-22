package cjavaassgn_1;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number  :");
		
	     n = sc.nextInt();
	     System.out.println("n is  :"+n);
      //USING NESTED-IF
	     if(n<=10) {
	    	 if(n>9) {
	    		 System.out.println("other is OTHER");
	    	 }
	    	 if(n<=9) 
		     {
		    	 if(n==9) 
		    	 {
		    		 System.out.println(+n+" is :NINE");
		    	 }
		    	 if(n<=8) 
			     {
			    	 if(n==8) 
			    	 {
			    		 System.out.println(+n+" is :EIGHT");
			    	 }
			    	 if(n<=7) 
				     {
				    	 if(n==7) 
				    	 {
				    		 System.out.println(+n+" is :SEVEN");
				    	 }
				    	 if(n<=6) 
					     {
					    	 if(n==6) 
					    	 {
					    		 System.out.println(+n+" is :SIX");
					    	 }
					    	 if(n<=5) 
						     {
						    	 if(n==5) 
						    	 {
						    		 System.out.println(+n+" is :FIVE");
						    	 }
						    	 if(n<=4) 
							     {
							    	 if(n==4) 
							    	 {
							    		 System.out.println(+n+" is :FOUR");
							    	 }
							    	 if(n<=3) 
								     {
								    	 if(n==3) 
								    	 {
								    		 System.out.println(+n+" is :THREE");
								    	 }
								    	 if(n<=2) 
									     {
									    	 if(n==2) 
									    	 {
									    		 System.out.println(+n+" is :TWO");
									    	 }
									    	 if(n<=1) 
										     {
										    	 if(n==1) 
										    	 {
										    		 System.out.println(+n+" is :ONE");
										    	 }
										     }
									     }
								     }
							     }
						     }
					     }
				     }
			     }
		     }
	     }
	    
	     //USING SWITCH CASE
	     switch(n) 
	     {
	     case 1:
	    	 System.out.println(+n+" is : ONE");
	    	 break;
	     case 2:
	    	 System.out.println(+n+" is : TWO");
	    	 break;
	     case 3:
	    	 System.out.println(+n+" is : THREE");
	    	 break;
	     case 4:
	    	 System.out.println(+n+" is : FOUR");
	    	 break;
	     case 5:
	    	 System.out.println(+n+" is : FIVE");
	    	 break;
	     case 6:
	    	 System.out.println(+n+" is : SIX");
	    	 break;
	     case 7:
	    	 System.out.println(+n+" is : SEVEN");
	    	 break;
	     case 8:
	    	 System.out.println(+n+" is : EIGHT");
	    	 break;
	     case 9:
	    	 System.out.println(+n+" is :NINE");
	    	 break;
	     default:
	    	 System.out.println("other is : OTHER");
	    	 break;
	     }

	}

}
