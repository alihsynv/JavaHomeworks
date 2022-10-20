package miniProjectPerfectNumber;

public class Main {

	public static void main(String[] args) {
		int number = 496;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}

		if (total == number) {
			System.out.println("Is the perfect number");
		} else {
			System.out.println("It's not a perfect number");
		}

	}

}
