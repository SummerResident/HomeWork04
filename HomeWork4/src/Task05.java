import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		int n = 10;
		int[][] mas = new int[3][5];
		Random rnd = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rnd.nextInt(n);

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}

}
