
/* Seanna Qin P.1
 * Programming Assignment #10, 3/10/23
 * The purpose of this program is to create an object that stores an item and the quantity of it, 
 * and returns the price of x number of the item, or the item itself.
 */

// Create an Item Order
public class ItemOrder {
	private Item item;
	private int quantity;
	
	// Construct item order with the item and quantity
	public ItemOrder(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
		if (quantity < 0) {
			throw new IllegalArgumentException("Number is negative");
		}
	}
	
	// Return the total price of the order
	public double getPrice() {
		return item.priceFor(quantity);
	}
	
	// Return the item in the order
	public Item getItem() {
		return this.item;
	}
}
