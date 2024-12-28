package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		
		//1.FizzBuzz問題
		for (int num = 1; num <= 100; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(num);
			}
		}
		
			//2.条件で繰り返し処理を行って、条件によって処理をわける
			String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
				for (String language : languages) {
					if (language == "Java" ) {
						System.out.println("現在学習中の言語はJavaです。");
						continue;
					}

					if (language == "HTML" ) {
						System.out.println("HTMLはプログラミング言語ではありません。");
						break;
					}

					System.out.println(language);
				}
		
	}
}