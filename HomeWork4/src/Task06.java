import java.util.Arrays;
import java.util.Random;

public class Task06 {

	public static void main(String[] args) {

		int n = 25;
		int[] mas = new int[n];
		
		Random rnd = new Random();
		

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rnd.nextInt(n + 1);
		}
		System.out.println(Arrays.toString(mas));

		int min = mas[0];

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i + 1] < min) {
				min = mas[i + 1];
			}

		}
		System.out.println("Min number " + min);

		int max = MaxX(mas);
		
		for (int i = 0; i < mas.length; i++) {
			if (min == mas[i]) {
				mas[i] = max;
				continue;
			}
			if (max == mas[i]) {
				mas[i] = min;
			}
		}
		System.out.println(Arrays.toString(mas));
	}
	
	public static int MaxX(int[] mas)
	{
	int max = mas[0];

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i + 1] > max) {
				max = mas[i + 1];
			}
		}
		
		System.out.println("Max number Task06 " + max);
		
		return max;
	}
	
}
