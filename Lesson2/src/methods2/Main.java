package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is very nice today";
		String newMessage = city();
		System.out.println(newMessage);
		int number = gather(55, 7);
		System.out.println(number);
		int total = gather2(1, 2, 3, 4);
		System.out.println(total);
	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}

	public static int gather(int number1, int number2) {
		return number1 + number2;
	}

	public static int gather2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static String city() {
		return "Baku";
	}

}
