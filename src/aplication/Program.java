package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bill = new Bill();
		
		System.out.println("Genger F or M");
		do {
			bill.genger = sc.next().charAt(0);
		} while (!(bill.genger == 'F' || bill.genger == 'M'));

		System.out.print("amount of beers? ");
		bill.beer = sc.nextInt();

		System.out.print("amount of softdrink? ");
		bill.softDrink = sc.nextInt();

		System.out.print("amount of barbecues? ");

		bill.barbecue = sc.nextInt();

		System.out.println();
		System.out.println("Report:");
		System.out.printf("Consumption = %s %.2f%n", "R$ ", bill.feeding());
		System.out.printf("Couvert = %s%.2f%n", "R$ ", bill.cover());
		System.out.printf("Ticked = %s %.2f%n", "R$ ", bill.ticket());
		System.out.println();
		System.out.printf("Amount to pay = %s %.2f", "R$ ", bill.totalValue());

		sc.close();
	}

}
