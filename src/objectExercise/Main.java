package objectExercise;

public class Main {

	public static void main(String[] args) {
		
		Apartment apartment = new Apartment(
				"いい感じアパートメント",
				"山田 マンション太郎",
				50000000,
				"3LDK"
				);

		Land land = new Land(
				"いい感じの土地",
				"山田 土地太郎",
				8000000,
				105.2
				);

		System.out.println(apartment);
		System.out.println("=============================");
		System.out.println(land);
		System.out.println("=============================");
	}

}