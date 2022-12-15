package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		char genger;
		double ticket = 0;
		
		System.out.println("Genger F or M");
		do {
			genger = sc.next().charAt(0);
		} while (!(genger == 'F' || genger == 'M'));
		
	
		System.out.print("amount of beers? ");
		bill.beer= sc.nextInt();
		
		System.out.print("amount of softdrink? ");
	    bill.softDrink = sc.nextInt();
		
		System.out.print("amount of barbecues? ");
		bill.barbecue = sc.nextInt();
		if (genger == 'f' || genger == 'F') {
			ticket = bill.ticket()- 2.0;
		}else if (genger == 'm' || genger == 'M') {
			ticket = bill.ticket();
		}
				
		System.out.println();
		System.out.println("Report:");
		System.out.printf("Consumption = %s %.2f%n", "R$ ", bill.feeding() );
		System.out.printf("Couvert = %s%.2f%n", "R$ ", bill.cover());
		System.out.printf("Ticked = %s %.2f%n", "R$ ", ticket);
		System.out.println();
		System.out.printf("Amount to pay = %s %.2f", "R$ ", bill.totalValue());
		
		
	}

}
