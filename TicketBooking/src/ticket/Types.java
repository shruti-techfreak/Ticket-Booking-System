package ticket;

import java.util.Scanner;

public class Types {
	int y;
	int type() {
	Scanner s= new Scanner(System.in);
	System.out.println("Types of buses:\n1)Normal(Rs0)\n2)AC(Rs200)\n3)Sleeper(Rs500)\nNote: Extra charges are displayed in the brackets");
    System.out.println("Enter your choice: ");
    
    int bus= s.nextInt();
    switch(bus)
    {
    case 1:
  	  y=0;
  	  break;
    case 2:
  	  y=200;
  	  break;
    case 3:
  	  y=500;
  	  break;
    default:
    	System.out.println("Wrong Choice!");
    }
    return y;
}
}
