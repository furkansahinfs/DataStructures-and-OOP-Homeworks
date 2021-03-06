
package G16_CENG112_HW1;

public class Item {
	// I create my variables
	public String name;
	public String type;

	public Item() {

	}

	// I create a constructor which is taken two parameters which are name and type.
	public Item(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String toString() {
		return this.name + " " + this.type;

	}

	public boolean equals(Object obj) {

		// It controls that item and given object is equal to each other or not and it
		// returns true or false.

		Item other = (Item) obj;
		try {
			if (this.name.equals(other.name) && this.type.equals(other.type)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		

	}

}
