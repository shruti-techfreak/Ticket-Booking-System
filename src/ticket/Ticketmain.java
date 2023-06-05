package ticket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class Ticketmain extends Frame {
	
	Ticketmain(){
		setSize(800, 700);
		setTitle("Ticket Booking");
		setLayout(null);
		setVisible(true);
		
		final Label lb= new Label();
		lb.setBounds(150,10, 200, 100);
		lb.setText("\t\tFardeeeennn Travels ");
		add(lb);
		
		final Label lb1= new Label();
		lb1.setBounds(10, 90, 100, 30);
		lb1.setText("Welcome!!!");
		add(lb1);
		
		final Label lb2= new Label();
		lb2.setBounds(10, 110, 200, 30);
		lb2.setText("Contact No.: 9876543201");
		add(lb2);
		
		final Label lb3= new Label();
		lb3.setBounds(10, 150, 350, 100);
		lb3.setText("Available Destinations:"+"\n"+"Location\tTime\n1)Pune\t\t6:00am\n2)Nashik\t9:00am\n3)Pune\t\t2:00pm");
		add(lb3);
		
		Button b= new Button();
		b.setBounds(140, 300, 50, 30);
		b.setLabel("OK");
		add(b);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking b1= new Booking();
				b1.billing();
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent s) {
				dispose();
			}
		});
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticketmain f1 = new Ticketmain();
		
      /*System.out.println("\t\t\t\tFardeeeennn Travels");
      System.out.println("Welcome!!!");
      System.out.println("Contact No.: 9876543201");
      
      Booking b1= new Booking();
      b1.billing();*/
	}
}
