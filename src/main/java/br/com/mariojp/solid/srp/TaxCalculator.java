package br.com.mariojp.solid.srp;
public class TaxCalculator {
	 public double calculate(double subtotal) {
	        String taxRateProperty = System.getProperty("tax.rate");
	        double taxRate;
	       
	        if (taxRateProperty != null) {
	            taxRate = Double.parseDouble(taxRateProperty);
	        } else {
	            taxRate = 0.10; // Default de 10%	        }
	       
	        return subtotal * taxRate;
	    }
	}