package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourTransactions fourTransactions = new FourTransactions();
		System.out.println(fourTransactions.Gather(5, 9));
		fourTransactions.Gather(2, 3, 5);
	}

}
