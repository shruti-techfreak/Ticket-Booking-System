package ticket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Booking{
	public void billing() {
		int amt;
		Scanner s= new Scanner(System.in);
		Destination d1= new Destination();
		      d1.funct();
		      Types t1= new Types();
		      t1.type();
		      amt= d1.x+ t1.y;
		      System.out.println("The total cost of your destination is: "+ amt);
		      System.out.println("Enter 1 to book your bus or enter 0 to exit ");      
		      int bk= s.nextInt();
		      if (bk==1){
		    	  System.out.println("\n-----------------------------------------------------------------");
		          System.out.println("\t\t\tFardeeeennn Travels");
		    	  System.out.println("\nHappy Journey!");
		    	  System.out.println("-----------------------------");
		    	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");  
		    	  LocalDateTime now = LocalDateTime.now();  
		    	  System.out.println(dtf.format(now));
		    	  
		    	  System.out.println("\nYour amount is " + amt);
		    	  System.out.println("Thankyou!");
		      }
		      else 
		      {
		    	  System.out.println("Thankyou!");
		      }
	}
}