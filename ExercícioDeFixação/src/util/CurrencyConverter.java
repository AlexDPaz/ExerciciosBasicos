package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarTatal (double quantity, double dollarValue ) {
		return quantity * dollarValue * ( 1.0 + IOF );
	}

}
