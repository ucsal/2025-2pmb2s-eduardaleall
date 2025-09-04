package br.com.mariojp.solid.srp;
public class TaxCalculator {
	 public static double calculate(double subtotal) {

		double tax = Double.parseDouble(System.getProperty("tax.rate"));
		return subtotal * tax;

	    }

	public static double calculator(double subtotal) {
		// TODO Auto-generated method stub
		return 0;
	}
	}