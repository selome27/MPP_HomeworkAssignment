package lesson5.prob4;

public class Item {
	String name;
	private Item(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
	 static Item newItem(String name){
		return new Item(name);
	}


}
