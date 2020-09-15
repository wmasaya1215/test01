package test001;

import java.util.Scanner;

public class Contest048_B {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		long answer = between(a, b, x);
		System.out.println(answer);
	}

	public static long between(long a, long b, long x) {
		long count = 0;
		for (; a <= b; a++) {
			if (0 == a % x) {
				count++;
			}
		}
		return count;
	}
}
