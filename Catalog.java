
/* Seanna Qin P.1
 * Programming Assignment #10, 3/10/23
 * The purpose of this program is to create a catalog that stores all the created items, returning
 * the catalog's name, size, and item at a specific index, along with adding items to the catalog
 */

import java.util.*;

public class Catalog {
   private String name;
   private ArrayList<Item> list = new ArrayList<Item>();
    
   public Catalog(String name) {
	   this.name = name;
   }

// Add item to catalog
   public void add(Item item) {
	   list.add(item);
   }
   
   // Return size of catalog
   public int size() {
	   return list.size();
   }
   
   // Return item in catalog at specific index
   public Item get(int index) {
	   return list.get(index);
   }
   
   // Return name of catalog
   public String getName() {
	   return this.name;
   }
}
