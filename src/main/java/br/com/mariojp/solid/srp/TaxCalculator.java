package br.com.mariojp.solid.srp;
public class TaxCalculator {
	 public double calculate(double subtotal) {

		double tax = Double.parseDouble(System.getProperty("tax.rate"));
		return subtotal * tax;

	    }
	}