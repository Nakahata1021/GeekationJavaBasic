package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		printResult(add(a, b));
		printResult(subtract(a, b));
		printResult(multiply(a, b));
		printResult(divide(a, b));
	}

	//足し算
	public static int add(int a, int b) {
		return a + b;
	}

	//引き算
	public static int subtract(int a, int b) {
		return a - b;
	}

	//掛け算
	public static int multiply(int a, int b) {
		return a * b;
	}

	//割り算
	public static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return a / b;
	}

	//結果の出力
	public static void printResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
}