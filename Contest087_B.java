package test001;

import java.util.Scanner;

public class Contest087_B {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();

		int coins = coins(a, b, c, x);

		System.out.println(coins);
	}

	public static int coins(int a, int b, int c, int x) {
		int pattern = 0;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				for (int k = 0; k <= c; k++) {
					if (i * 500 + j * 100 + k * 50 == x) {

						pattern++;
					}
				}
			}
		}
		return pattern;
	}
}
