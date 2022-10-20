package miniProjectFindNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 3, 5, 7, 9, 0 };
		int wanted = 3;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == wanted) {
				isThere = true;
				break;
			}
		}

		if (isThere) {
			System.out.println("Number is available");
		} else {
			System.out.println("Number not available");
		}

	}

}
