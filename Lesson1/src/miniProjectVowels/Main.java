package miniProjectVowels;

public class Main {

	public static void main(String[] args) {
		char vowel = 'A';

		switch (vowel) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Bold vowel");
				break;
	
			default:
				System.out.println("Thin vowel");
		}

	}

}
