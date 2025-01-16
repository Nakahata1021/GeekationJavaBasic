package objectExercise;

public class Land extends Property {
	private double area;

	public Land(String name, String owner, int price, double area) {
		super(name, owner, price);
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public String toString() {
		return "=============================\n"
				+ "物件名：" + getName() + "\n物件所有者名：" + getOwner() + "\n物件種別：土地" + "\n物件価格：" + getPrice() + "円" + "\n広さ：" + area + "㎡";
	}

}