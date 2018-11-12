
import java.util.Arrays;
import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		int n = 30;
		int[] mas = new int[n];
		int evenElementSum = 0;
		int oddElementSum = 0;
		Random rnd = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rnd.nextInt(n + 1);
			if (mas[i] % 2 == 0) {
				evenElementSum += mas[i];
			} else {
				oddElementSum += mas[i];
			}
		}
		System.out.println(Arrays.toString(mas));
		System.out.println("Summ of even elements = " + evenElementSum);
		System.out.println("Summ of odd elements = " + oddElementSum);
	}

}
