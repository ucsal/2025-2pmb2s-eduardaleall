
package br.com.mariojp.solid.srp;


public class ReceiptFormatter {
   
    public String format(Order order, double subtotal, double tax, double total) {
       StringBuilder sb = new StringBuilder();
       sb.append("=== RECIBO ===\n");
    
       for (Item item : order.getItems()) {
           double itemTotal = item.getUnitPrice() * item.getQuantity();
           sb.append(item.getName())
             .append(" x")
             .append(item.getQuantity())
             .append(" = ")
             .append(itemTotal)
             .append("\n");
       }


       sb.append("Subtotal: ").append(subtotal).append("\n");
       sb.append("Tax: ").append(tax).append("\n");
       sb.append("Total: ").append(total).append("\n");
       return sb.toString();
   }
}
