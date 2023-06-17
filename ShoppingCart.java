
/* Seanna Qin P.1
 * Programming Assignment #10, 3/10/23
 * The purpose of this program is to create a shopping cart to store all the item orders,
 * and to produce the total cost of all the orders if called
 */

import java.util.*;

public class ShoppingCart {
	private ArrayList<ItemOrder> list = new ArrayList<ItemOrder>();
	private boolean discount = false;
	
	// Create new cart list
	public ShoppingCart() {
		this.list = new ArrayList<ItemOrder>();
	}
	
	// Add orders to the cart
	public void add(ItemOrder order) {
		for (int i = 0; i < list.size(); i++) {
			// Replace the item order if it has appeared and changed
			if (list.get(i).getItem().equals(order.getItem())) {
				list.remove(i);
			}
		}
		list.add(order);
	}
	
	/*public String get(int index) {
		return this.list.get(index).getItem() + " " + this.list.get(index).getPrice();
	}
	*/
	
	// Determine if there is a discount
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}
	
	// Calculate the total cost in the shopping cart
	public double getTotal() {
		double total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getPrice();
		}
		
		if (discount) {
			total = total*0.9;
		}
		
		return total;
	}
}
