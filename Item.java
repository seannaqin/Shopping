
/* Seanna Qin P.1
 * Programming Assignment #10, 3/10/23
 * The purpose of this program is to create a class that creates an item, including the name and price(s),
 * and can return all variables attributed to the item.
 */

import java.text.*;

// Create an item
public class Item {
	private String name;
	private double price;
	private int bulkQ;
	private double bulkP;
	
	// Constructor without bulk
	public Item(String name, double price) throws IllegalArgumentException {
		this.name = name;
		this.price = price;
		if (price < 0) {
			throw new IllegalArgumentException("Number is negative");
		}
	}
	
	// Constructor with bulk
	public Item(String name, double price, int bulkQ, double bulkP) {
		this.name = name;
		this.price = price;
		this.bulkQ = bulkQ;
		this.bulkP = bulkP;
		
		if (price < 0 || bulkP < 0 || bulkQ < 0) {
			throw new IllegalArgumentException("Number is negative");
		}
	}
	
	// Return price for given quantity of items
	public double priceFor(int quantity) {
		double cost = 0.0;
		if (quantity < 0) {
			throw new IllegalArgumentException("Number is negative");
		}
		// If bulk is applicable
		else if (bulkQ != 0 && quantity >= bulkQ) {
			cost += bulkP* (int) (quantity/bulkQ);
			quantity -= (int) (quantity/bulkQ)*bulkQ;
		}
		
		return cost += price * quantity;
	}
	
	// Convert item to String
	public String toString() {
		// $ before price
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		if (bulkQ != 0) {
			return this.name + ", " + nf.format(this.price) + " (" + this.bulkQ + " for " + nf.format(this.bulkP) + ")";
		}
		return this.name + ", " + nf.format(this.price);
	}
}
