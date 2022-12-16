package util;

public class Bill {
	public char genger;
	public int beer;
	public int barbecue;
	public int softDrink;
	public static final Double EXEMPT_VALUE = 4.0;
	public 	double total;
	

	public double feeding() {
		double feeding = beer * 5.0 + this.softDrink * 3.0 + this.barbecue * 7.0;
		return feeding;

	}
	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		}else {
			return EXEMPT_VALUE;
		}

	}

	public double ticket() {
		if (genger == 'F') {
			return 8.0;
		} else {
			return 10.0;
		}
	}

	public double totalValue() {
	
			total = cover() + feeding() + ticket();

			return total;

		}

	}

