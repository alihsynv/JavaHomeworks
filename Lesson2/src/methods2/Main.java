package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is very nice today";
		String newMessage = city();
		System.out.println(newMessage);
		int number = gather(55, 7);
		System.out.println(number);
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

	public static String city() {
		return "Baku";
	}

}
