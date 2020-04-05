package shopping;

import java.util.HashMap;
import java.util.Iterator;

public class Cart extends HashMap<String, Integer> {
	public Cart() {
		super();
		System.out.println("New Cart");
	}

	public int addItem(String id, int quantity) {
		System.out.println(String.format("Adding %d %s", quantity, id));

		if (containsKey(id)) {
			System.out.println("contains");
			int oldQuantity = get(id);
			put (id, oldQuantity+quantity);
			return oldQuantity+quantity;

		} else {
			System.out.println("new insert");
			put(id, quantity);
			return quantity;
		}
	}
	
	public Iterator<String> getIds() {
		return keySet().iterator();
	}

	public int getQuantity(String id) {
		return get(id);
	}
}