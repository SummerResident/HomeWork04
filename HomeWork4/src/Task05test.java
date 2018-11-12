import java.util.Random;

public class Task05test {

	public static void main(String[] args) {
		int[][] mas = new int[6][4];
		int sumOfSecondString = 0;
		Random rnd = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rnd.nextInt(30);

				System.out.print(mas[i][j] + " ");
				if (i == 1) {
					sumOfSecondString += mas[i][j];
				}
			}

			System.out.println();

		}
		System.out.println("sum" + sumOfSecondString);
	}

}
