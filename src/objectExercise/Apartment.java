package objectExercise;

public class Apartment extends Property {
	private String layout;

	public Apartment(String name, String owner, int price, String layout) {
		super(name, owner, price);
		this.layout = layout;
	}

	public String getLayout() {
		return layout;
	}

	public String toString() {
		return "=============================\n"
				+ "物件名：" + getName() + "\n物件所有者名：" + getOwner() + "\n物件種別：マンション" + "\n物件価格：" + getPrice() + "円" + "\n間取り：" + layout;
	}

}
