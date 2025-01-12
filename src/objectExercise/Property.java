package objectExercise;

public class Property {
	private String name; 
	private String owner; 
	private int price; 

	public Property(String name, String owner, int price) {
		this.name = name;
		this.owner = owner;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "物件名：" + name + "\n物件所有者名：" + owner + "\n物件価格：" + price + "円";
	}

}