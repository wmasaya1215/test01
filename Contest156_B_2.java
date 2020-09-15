package test001;

import java.util.Scanner;

public class Contest156_B_2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int c = digits(n, k);
		System.out.println(c);
	}

	public static int digits(int n, int k) {
		int count = 1;

		while (n >= k) {
			n /= k;
			count++;
		}
		return count;
	}
}
