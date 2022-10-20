package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 25;

		boolean isPrime = true;

		if (number < 1) {
			System.out.println("Gecersiz sayi");
			return;
		}
		if (number == 1) {
			System.out.println("Sayi asal degildir");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Sayi asaldir");
		} else {
			System.out.println("Sayi asal degildir");
		}
	}

}
