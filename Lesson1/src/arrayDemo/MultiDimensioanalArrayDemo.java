package arrayDemo;

public class MultiDimensioanalArrayDemo {

	public static void main(String[] args) {
		String[][] cities = new String[3][3];

		cities[0][0] = "Baku";
		cities[0][1] = "Sumgayit";
		cities[0][2] = "Absheron";
		cities[1][0] = "Quba";
		cities[1][1] = "Qusar";
		cities[1][2] = "Xachmaz";
		cities[2][0] = "Shusha";
		cities[2][1] = "Lachin";
		cities[2][2] = "Aghdam";

		for (int i = 0; i <= 2; i++) {
			System.out.println("------------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(cities[i][j]);
			}
		}

	}

}
