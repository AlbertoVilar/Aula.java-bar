package util;

public class Bill {
	char genger;
	public int beer;
	public int barbecue;
	public int softDrink;
	public static final Double EXEMPT_VALUE = 4.0;

	public double ticket() {
		return 10.0;
	}

	public double cover() {

		return EXEMPT_VALUE;

	}

	public double feeding() {
		double feeding = beer * 5.0 + this.softDrink * 3.0 + this.barbecue * 7.00;
		return feeding;

	}

	public double totalValue() {
		double total = 0;
		total = total + cover() + feeding() + ticket();
		if (total > 30.0) {
			total -= cover();
		}
		return total;
		

	}
}
