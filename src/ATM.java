import java.util.*;
public class ATM {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);	
		
		Integer accNum;
		Integer PIN;
		
		System.out.println("*************************");
		System.out.println("         WELCOME		 ");
		System.out.println("*************************");
		System.out.println("          ENTER          ");
		System.out.println("     ACCOUNT NUMBER	     ");
		
		
	outterLoop: do {	
		// Getting account number
			while (!SC.hasNextInt()) {
		        System.out.println("Enter Vaild 8 Digit Account Number");
		        SC.next(); 
		   	}
			    accNum = SC.nextInt();
			
	        // validating accNum
	       if(accNum.toString().length() == 8) {
	    	   
	    	// Get PIN
	   		System.out.println("          ENTER          ");
	   		System.out.println("           PIN	     ");
	   		
	   		do {
	   				while (!SC.hasNextInt()) {
	   				        System.out.println("Enter Vaild PIN");
	   				        SC.next(); 
	   				}
	   				
	   					PIN = SC.nextInt();
	   				    
	   					//validating PIN length
	   				     if(PIN.toString().length() == 4) {
	   				    	 System.out.println(PIN +"\n" +accNum);
	   				    	 break outterLoop;
	   				     }
	   				  	  
	   			 System.out.println("Your PIN Was Not 4 Digits:");
	   	  
	       } while(PIN.toString().length() != 3);
	      
	      }
	       
	       System.out.println("Your Account Number Was Not 8 Digits:");
	      
		}while(accNum.toString().length() != 7);
	
		System.out.print("It broke out the loop...");
		
		SC.close();
	}
  }

