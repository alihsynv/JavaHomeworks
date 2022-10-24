package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
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
			mesajVer("Number is available: " + wanted);
		} else {
			mesajVer("Number not available: " + wanted);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
