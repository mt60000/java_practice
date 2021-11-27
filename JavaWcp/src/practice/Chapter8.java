package practice;

public class Chapter8 {
	public static void main(String[] args) {
		int num = 1;
		while(num < 5) {
			System.out.println(num * num);
			num++;
		}
		int[] array1 = { 1, 30, 50, 444};
		for (int count = 0; count < array1.length; count++) {
			System.out.println(array1[count]);
		}
		
		for (int val : array1) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
