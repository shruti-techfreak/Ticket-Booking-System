package ticket;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Destination extends Frame {
	int x;
	String a;
	int funct() {
	Scanner s= new Scanner(System.in);
	System.out.println("Available Destinations:\nLocation\tTime\n1)Pune\t\t6:00am\n2)Nashik\t9:00am\n3)Pune\t\t2:00pm");
    System.out.println("Enter your choice: ");
    
    /*final Label lb3= new Label();
	lb3.setBounds(10, 150, 350, 100);
	lb3.setText("\"Available Destinations:\\nLocation\\tTime\\n1)Pune\\t\\t6:00am\\n2)Nashik\\t9:00am\\n3)Pune\\t\\t2:00pm\"");
	add(lb3);*/
    
    int des= s.nextInt();
    switch(des)
    {
    case 1:
  	  x=900;
  	  a= "Pune\tTime:6:00am";
  	  break;
  	  
    case 2:
  	  x=700;
  	  a= "Nashik";
  	  break;
    case 3:
  	  x=900;
  	  a= "Pune";
  	  break;
  	default:
  		System.out.println("Wrong Choice!");
  	  
    }
    return x;
	}
}