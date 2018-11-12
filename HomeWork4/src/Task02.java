import java.util.Arrays;
import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		int n = 25;
		int[] mas = new int[n];
		Random rnd = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rnd.nextInt(n + 1);
		}
		System.out.println(Arrays.toString(mas));

		boolean sort = false;

		do {
			sort = true;
			int temp;

			for (int i = 0; i < mas.length - 1; i++) {
				 if (mas[i] > mas[i + 1]) {
					temp = mas[i + 1];
					mas[i + 1] = mas[i];
					mas[i] = temp;
					
					sort = false;
				}

			}
			System.out.println(Arrays.toString(mas));

		} while (!sort);
	}

}
