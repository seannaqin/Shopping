
public class ShoppingTest {
	public static void main(String[] args) {
		Item item1 = new Item("Toy", 3);
		Item item2 = new Item("Bottle", 5, 5, 20);
		Catalog list = new Catalog("List");
		list.add(item1);
		list.add(item2);
		
		ItemOrder order1 = new ItemOrder(item2, 8);
		ItemOrder order2 = new ItemOrder(item1, 3);
		ItemOrder orderNew = new ItemOrder(item1, 6);
		ShoppingCart cart = new ShoppingCart();
		cart.add(order1);
		cart.add(order2);
		cart.add(orderNew);
		//System.out.println(cart.get(0));
		//System.out.println(cart.get(1));
		
		System.out.println(item1.priceFor(2));
		System.out.println(item2.priceFor(0));
		System.out.println(item2.priceFor(8));
		System.out.println(item1);
		System.out.println(item2);
		System.out.println();
		System.out.println(list.getName() + ": " + list.size() + " " + list.get(0));
		System.out.println(order1.getItem() + " " + order1.getPrice());
	}
}
