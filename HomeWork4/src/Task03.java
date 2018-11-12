import java.util.Arrays;
import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		int n = 20;
		int[] mas = new int[n];
		int sum = 0;
		double average = 0D;
		Random rnd = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rnd.nextInt(n + 1);
			sum += mas[i];
		}
		System.out.println(Arrays.toString(mas));

		System.out.println(sum);

		average = (double) sum / n;
		System.out.println(average);
	}
}
